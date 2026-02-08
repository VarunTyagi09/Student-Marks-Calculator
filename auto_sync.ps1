Write-Host "GitHub Auto Sync Started..."

$RepoBranch = "main"
$RetryDelay = 5
$WatchPath = Get-Location

$watcher = New-Object System.IO.FileSystemWatcher
$watcher.Path = $WatchPath
$watcher.Filter = "*"
$watcher.IncludeSubdirectories = $false
$watcher.EnableRaisingEvents = $true

$global:syncRunning = $false

function Sync-Git {

    if ($global:syncRunning) { return }
    $global:syncRunning = $true

    Write-Host "Change detected..."

    git add .

    $changes = git status --porcelain
    if (-not $changes) {
        Write-Host "No changes."
        $global:syncRunning = $false
        return
    }

    git commit -m "Auto update"

    while ($true) {
        git push origin $RepoBranch 2>$null

        if ($LASTEXITCODE -eq 0) {
            Write-Host "Synced successfully."
            break
        } else {
            Write-Host "Push failed. Retrying..."
            Start-Sleep $RetryDelay
        }
    }

    $global:syncRunning = $false
}

# ---- WATCH EVENTS ----
Register-ObjectEvent $watcher Changed -Action { Sync-Git } | Out-Null
Register-ObjectEvent $watcher Created -Action { Sync-Git } | Out-Null
Register-ObjectEvent $watcher Deleted -Action { Sync-Git } | Out-Null
Register-ObjectEvent $watcher Renamed -Action { Sync-Git } | Out-Null

Write-Host "Watching folder: $WatchPath"

while ($true) { Start-Sleep 2 }
