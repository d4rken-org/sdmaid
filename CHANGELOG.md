# Changelog

- Latest production version: v4.1.1(4101), Unlocker v4.0.3(4003)
- Latest beta version: ~

This changelog is for SD Maid v4. For older logs: [v3](changelogV3.txt), [v2](changelogV2.txt), [v1](changelogV1.txt).

## SD Maid [4.1.2] - TBD (RC)
### Core
- Added: Another easteregg.

## SD Maid [4.1.1] - 31.03.2016 (RC)
### Core
- Improved: Translations.
- Improved: Busybox setup logging output.
- Improved: Added don't show option to kitkat sdcard issue explanation.
- Fixed: Crash during SAF setup.
- Fixed: A few UI crashes in details views due to raceconditions between finishing action and closing UI.

## SD Maid [4.1.0] - 30.03.2016 (RC)
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: If all tabs are hidden (accident?) auto show the navdrawer to reduce confusion.
- Fixed: Bug that prevented the improved sdcard access granting (added in 4.0.11) via SAF to fail (#231 #330).

### QuickAccess
- Fixed: Link to sdmaid.darken.eu/help not working.

## SD Maid [4.0.11] - 28.03.2016 (BETA)
### Core
- Improved: Translations
- Improved: Busybox error screen now shows more debugging information that might help me, help you.
- Improved: Busybox setup now cycles through other architecture canidates if the first one fails.
- Improved: Issues while granting uri access no longer take down the app (Improves upon #336 Ty Vagelis1608).
- Improved: Granting sdcard access via SAF uri should no longer fail on most LG devices (Improves upon #231).
- Improved: Notification progress results are more accurate if it's only one task finishing.
- Improved: Navdrawer headcard layouting on <5.0.
- Fixed: Write-access test for java.io.File accessible storage (e.g. secondary storage + sdcardfix) (#330 Ty gaich).
- Fixed: Crash on 4.4 devices where a hacky file deletion method for sdcards fails.

### Overview
- Improved: Text layouting being cut off early on some languages (#331 Ty jpzex).
- Fixed: Storage location "Read only" tag is now based on a the global routine that all tools use (previously it had a simplified check that could yield different results).

### AppControl
- Improved: Added progress results via snackbar in details view.
- Fixed: Receiver state not updating correctly after toggeling it.
- Fixed: 0.00 byte apk size on <4.3 devices.

### AppCleaner
- Improved: Manually selecting all apps to clean will no longer make SD Maid additionally use the native cache clearing routine, while using the clean all button will (Allows to manually only delete public caches on unrooted devices).

## SD Maid [4.0.10] - 18.03.2016 (BETA)
### Core
- Added: Support for adopted storage (6.x).
- Added: Support for portable storage (6.x).
- Added: USB-OTG support if device supported (4.x-5.x).
- Improved: Translations.
- Improved: Clutter database.
- Improved: Updated all libraries.
- Improved: Minimized file size of used png images.
- Improved: Removed unused text, layout and image resources.
- Improved: Determining how something is read and writeable for SD Maid.
- Improved: If possible, the systems storage access framework activity will directly launch in advanced mode (no longer requiering to toggle "Show SD card").
- Improved: Added caching mechanisms for read/write lookup (speed improvements when dealing with the same files again).
- Improved: Made code more resiliant at some locations, though some of those crashes could theoretically only happen if people screw around with the APK...
- Fixed: Dialogs in settings not having the correct app theme.
- Fixed: StorageAccessFramework (SAF) based access on Android N (https://code.google.com/p/android/issues/detail?id=204119).
- Fixed: Batch deletion failing if items had different types of write accesstype.
- Fixed: SD Maid not asking for secondary storage (Android 5.X) permission despite needing it.
- Fixed: Potential crash within tool details when removing the last item.
- Fixed: Concurrency crash when multiple threads tried to instantiate a worker.
- Fixed: Crash when canceling I/O operations via shells at just the right moment (after starting one, but just before it begins).
- Removed: Label lookup for mounts, due to failing consistently on newer ROMs and serving no useful purpose.

### QuickAccess
- Fixed: Subsequent delete attempts in single-pass mode only scanning and not deleting (#329 Ty Geocfu).
- Fixed: Layout issues (#328 Ty Geocfu)

### Explorer
- Fixed: Crash on opening the Explorer due to a racecondition where the UI initialised too fast and got bad values.

### AppControl
- Fixed: Crash due to app having no data dir (Android N).
- Changed: Apps system pages are reachable again through a tap on the icon instead of long press.

### CorpseFinder
- Added: Preliminary support for /data/user_de (Android N).

### AppCleaner
- Fixed: Crash due to app having no data dir (Android N).
- Added: Option to show inaccessible items that would require manual action.
- Changed: Private cache sizes on 6.0 without root are no longer shown, instead a button with further details will be made visible.

### Duplicates
- Added: Default inclusion of portable storage within search paths.

### Databases
- Removed: Total database sizes from scan task result (gives no useful information but is missleading).

## SD Maid [4.0.9] - 10.03.2016 (BETA)
### Core
- Added: Default exclusion matching "com.android.systemui" for Databases, AppCleaner and SystemCleaner.
- Fixed: Crash when canceling root operations (#323 Ty Geocfu).

### QuickAccess
- Improved: Progressbar and message behavior, especiall yon rotation.
- Fixed: Inconsistent confirmation dialogs in single-pass mode.
- Fixed: Jumping textboxes (#314 Ty Geocfu).
- Fixed: Cut off titles on small displays (as good as possible) (#318 Ty Geocfu).
- Fixed: ButtonBar not correctly switching states in single-pass mode (#322 Ty Geocfu).

### AppControl
- Fixed: Possible crash when using the search field and rotating the device.

### SystemCleaner
- Improved: Empty folders that are mountpoints are now ignored by the Empty directories filter.

### AppCleaner
- Added: Option to skip running apps, which is OFF by default.
- Changed: Apps will no longer be forcefully killed.

### Duplicates
- Fixed: Possible crash when using the search field and rotating the device.

### Databases
- Added: Option to skip running apps, which is ON by default.
- Changed: If running apps are not skipped, SD Maid will suspend (SIGSTOP) them before working on their database (root only) instead of killing them (Fixes #325).
- Improved: Result now indicates successful, skipped and failed operations.

## SD Maid [4.0.8] - 06.03.2015 (BETA)
### Core
- Added: Progress indicator for stats being processed at the end of a task.
- Improved: Various small layout issues.
- Improved: Clutter database.
- Improved: Translations.
- Improved: Tool events that result in an UI action other than the results being populated (showing a snackbar etc) could have dropped these theoretically before, this should now no longer happen.
- Improved: Minor text issues i.e. 'show' vs 'open'.
- Improved: Busybox check on rooted devices (#313 Ty elhennig@github).
- Improved: Within settings that use the path picker screen, directory creation is now disabled where it doesn't make sense (i.e. import stuff).
- Improved: Overall memory footprint, during parallel operation of multiple tools as well as after finishing operations SD Maids memory usage should further drop.
- Fixed: Race condition UI crash when a tool starts working and SD maids updates the navigation drawer UI.
- Changed: Workers no longer display individual notifications, instead a single notification is displayed. The notification displays the active worker count and when all tasks are finished it will show how many ran OK and how many failed. This fixes notification spam, some tools might get specific notification functionality, if necessary, at a later point.
- Changed: Disabled coffee drinking animation on <API18 devices.

### Explorer
- Added: Size and item count information as a list header.
- Added: Information about determined access type and location (Debug/Experimental).
- Improved: Detection whether a location is writeable and readable, which fixes what action are available.
- Fixed: Case where too simple storage detection led to wrong permission and assumptions and thus failing operations.

### Searcher
- Added: Option to allow for case sensitive search (#230 Ty mcl21014).

### AppControl
- Added: Option to share information about your installed apps to text (other apps or text file). Currently includes: Name, package-name, version, version-code, Google-Play download link. The shared text is markdown formatted, but that's up for discussion :) (#249 #255 Ty cloud_strife84).
- Added: Action to 'Force stop' applications(requires root). Note that a force-stopped application will not run until the user explicitly opens it.
- Added: Force-stopped apps (e.g. apps with state stopped=true) now show a 'Stopped' tag by which you can also filter.
- Improved: UI updating and progress feedback when executing tasks from the details view.
- Improved: Killing an app will use root if available.
- Improved: When killing and root is available all pids matching the packagename will be killed instead of only the first one.
- Changed: Replaced permanent SearchBar with collapsible one in the toolbar, more screen-estate yay!
- Fixed: Double check for frozen apps always coming up empty due to reading wrong xml tag.

### SystemCleaner
- Removed: Setting entry, because we currently have no settings (#315 Ty SuperSandro2000).

### AppCleaner
- Added: If an app is running and can't be killed, it will be skipped.
- Improved: SD Maid will now also try to use root to kill an app before working on it.

### Duplicates
- Changed: Replaced permanent SearchBar with collapsible one in the toolbar, more screen-estate yay!
- Fixed: Possible racecondition crash when deleting items while viewing details.

### Biggest
- Added: Option to delete items, via info dialog and multi selection (#149).
- Changed: Long press now triggers multiselection, dialog has a show option that open the Explorer.

### Databases
- Added: If an app is running and can't be killed, it's database will be skipped.
- Improved: Databases from official database folders that are sql databases are now also found (#182 Ty h4ku).
- Improved: Only valid sql databases are now shown. 
- Improved: SD Maid will now also try to use root to kill an app before working on it's database.
- Fixed: Crash when vacuum results are processed and some databases were not accessible.
- Fixed: SD Maid being killed when running vacuum from the background (scheduler/widget).

### QuickAccess
- Improved: Marked the area where you can press the row entry to trigger its action.
- Improved: Widget events, it's a lot more responsive but may glitch, working on that.
- Changed: Button bar to FAB again (see poll).
- Fixed: Wrong icon for Databases action (#316 Ty DO97).
- Fixed: VACUUM action not showing in the toolbar.

### Statistics
- Added: Settings now allow negative numbers. Chronic or statistics limit at 0 will remove any limits, setting it to < 0 will disable it.
- Improved: Rotation handling regarding search field.
- Improved: Entering nonsense values will now reset it to default instead of crashing.
- Improved: Layouting and removed duplicate code, the chronic is now just rehoused in a full activity if the user chooses to expand it.
- Fixed: Chart on-click behavior, replaced snackbar with actual chart-marker (#311 Ty Geocfu1@XDA).
- Fixed: Potential crash when closing or changing rotation.

## SD Maid [4.0.7] - 2016-02-24 (BETA)
### Core
- Added: Support for /data/app-private
- Added: There is now an advanced setting that allows you to restore the unlocker icon.
- Improved: Mechanics for shell creation. This brings no noticeable change but the code is a lot clean now which makes the developer happy.
- Improved: Task & Result system to prepare for better statistics.
- Improved: Clutter database (#299).
- Improved: Translations.
- Improved: UI behavior in regard to canceling.
- Changed: Some settings reordering.
- Changed: Further reduced analytics, because I got all I needed from it.
- Fixed: Rare racecondition crash when su binary version is obtained, but the shell blocks and timeouts.
- Fixed: Crash if a deletion using root failed due to the shell timing out.
- Fixed: Crash when enabling or disabling previews and returning from the settings to the main app.
- Fixed: Failure to copy or move files if the source was located outside of the public storage but still readable.
- Fixed: Crash when disabling pages in settings and returning to the main view.
- Fixed: Racecondition crash when entering/exiting details.
- Fixed: Menu icons reshowing in details after rotation.
- Fixed: After failing to grant SD Maid permission, the overflow menu now correctly makes the option "Don't show again" visible.
- Fixed: 3 cases of canceling to hang endlessly (#302 Ty Geocfu).
- Fixed: Fixed location being UNKNOWN for some subdirectories of /data.
 
### QuickAccess
- Changed: When in singlepass mode, confirmations are no longer shown (#305 Ty Geocfu).

### Explorer
- Improved: When creating a new bookmark, the name is now prepopulated with the current directory name.
- Fixed: File previews not loading anything for /data/app-asec.

### AppControl
- Added: Support for enabling/disabling any type of receiver and categorization for all default Android receiver types.
- Added: Support for enabling/disabling multiple receiver at once.
- Fixed: Export results showing wrong success counter.
- Fixed: Export failing without root, due to SD Maid not correctly determining access.
- Fixed: Showing size -1 if the item had a size of 0.

### SystemCleaner
- Added: A second default thumbnail filter.
- Improved: Scan speed (depending on active filters).

### AppCleaner
- Fixed: Showing size -1 if the item had a size of 0.

### Databases
- Improved: Result detection, previously failed VACUUM attempts were not correctly displayed.

### Scheduler
- Improved: If no schedule is active, the SchedulerWard that checks if restoring is necessary after a reboot, will no longer start.

### Statistics
- Added: Data and charts for space gained values per individual tool.
- Added: Searchable chronic that details SD Maids last actions.
- Added: Settings to configure size stats timespan and setting to limit chronic size.
- Fixed: Toolbar navigation button.

## SD Maid [4.0.6] - 2016-02-08 (BETA)
### Core
- Improved: Updated G+ icon.
- Improved: Translations.

### AppControl
- Fixed: Crash double checking of frozen apps is enabled.
- Fixed: Rare crash when exiting app details.
- Fixed: Possible crash when entering app details.

### SystemCleaner
- Improved: User filter loading, account for permission issues and fail gracefully while logging the error.

### Exclusions
- Fixed: Crash when entering the exclusion manager.

## Unlocker [4.0.1] - 2016-02-07 (BETA)
### Core
- Improved: Translations.

## SD Maid [4.0.5] - 2016-02-07 (BETA)
### Core
- Added: Fast scrolling to most lists.
- Improved: Settings organization and icons.
- Improved: Translations.
- Improved: Clutter database.
- Improved: Hidden cache database.
- Fixed: Opening SD Maid after updating the unlocker should now correctly update and remove all update indicators.
- Fixed: Rare crash when entering settings because menu actions failed to load.
- Fixed: Popup for unlocker update not showing despite being set (what an unexpected source of agony).
- Fixed: Rare crash when exiting a details activity.
- Fixed: Rare crash when doing quickly exiting the permission setup.
- Fixed: ActionMode not restoring correctly after device orientation change in details activities.
- Fixed: Possible hang on outputs not ending with a new line.
- Changed: Code related loading the coffee animation in an attempt to address glide#928.

### Explorer
- Fixed: Progress result when making files/directories.
- Fixed: Progress result when renaming items.
- Fixed: Progress result when path dumping.
- Fixed: Progress result when calculating item size.

### AppControl
- Improved: XML based freezing method, smarter logic instead of hardcoded values.
- Fixed: Secondary freezing methods on 4.2+ ROMs.
- Fixed: Detailed size display in app details.
- Fixed: App reset causing apps to no longer start.
- Changed: Added "Autostarts" label to function "Receiver Manager", lessen the confusion.
- Removed: Outdated app uninstall mechanisms related to <4.0 Android.

### SystemCleaner
- Improved: Scan performance by parallelizing read operations and filtering.

### Biggest
- Improved: Scan performance by parallelizing read operations and file tree creation.

### Duplicates
- Improved: Scan performance by parallelizing read operations and first filtering pass (size-based).
- Improved: Scan performance by improving the order in which criteria are checked that sort files out (most common first).

### Databases
- Removed: Unnecessary progress information.

### Scheduler
- Fixed: Scheduler not triggering from skip notifications.

### QuickAccess
- Fixed: Crash when entering and immediately exiting the UI.
- Fixed: Widget crashing when saving configuration.

## SD Maid [4.0.4] - 2016-01-27 (BETA)
### Core
- Added: SD Maid Pro now displays a SnackBar if the unlocker not have a minimum version (currently 4000).
- Added: Reenabled coffee easteregg.
- Added: Experimental support for injecting busybox & sqlite binary into the systemless root area. This should help on devices where SD Maid other would have to inject into /system to work with root.
- Improved: Strings and translations.
- Improved: ToolBar navigation icon behavior in tablet layout.
- Improved: Debugging for storage access related issues (i.e. SD Maid not recognizing permissions for external sdcards).
- Improved: Slightly better performance when reading files.
- Improved: UI updating when doing actions within the details views. Especially rotation should now be handled better.
- Changed: Removed most analytics of events, if the information isn't useful, we dont't need to track it :), and it wasn't really helping me :(. Added a few analytics for widget usage.
- Fixed: Not being able to select two dirs that share part of their name within the picker.
- Fixed: Picker content now refreshes after creating a file/dir (#290).
- Fixed: Old pro version icon being visible in the BuyPro dialog.
- Fixed: Thread synchronization when reading files, rare hanging cases and a few crashes related to canceling are fixed now.
- Fixed: Progress indicators in the navigation drawer being shown for wrong items.
- Fixed: Entering and exiting item details should no longer cause memory leaks.
- Fixed: Crash when entering and exiting the details view and then deleting an item through the tools main page.
- Changed: Task error handling, previously some errors might just have been ignored instead of crashing the app, preventing me from finding out about them and fixing it

### Explorer:
- Improved: UX by disabling the new file/dir add button if no text is entered (#282).
- Changed: Visual distinction between user and default bookmarks (#284).
- Fixed: ActionMode staying active despite leaving the main activity.
- Fixed: After permission changes not scrolling to the right item.
- Fixed: Crash when trying to add a bookmark on an unloaded Explorer (#286).
- Fixed: Fixed FAB button showing with sidebar open (#285).

### Searcher
- Fixed: Root search checkbox being weird (#287).

### CorpseFinder
- Improved: The UninstallWatcher now only returns results that can be attributed to the uninstalled app.
- Improved: SDCard filter scanning speed.
- Changed: Trying new icon. Ghosty :)
- Fixed: Corpse filter not acting according to their default settings value.

### AppControl
- Improved: Cross check items that are to be removed on uninstall if they are shared with another app.
- Fixed: APK export failing when exporting to external sdcards on 5.0+ (#271 & #270).
- Fixed: Crash on apps that either don't have an apk file or they have one but SD Maid can't find it.
- Fixed: Not being able to enter app details again after uninstalling an app.

### AppCleaner
- Fixed: Exclusions are no longer applied if we can't enforce them (e.g. non-root private caches) (#246).

### Duplicates
- Fixed: Being able to press/longpress the header when viewing details which lead to a crash.

### Scheduler
- Fixed: Rewritten the external task system, which is now what both scheduler and widgets use to trigger actions indirectly (fixes #277).
- Fixed: Scheduler failing because setup was not done by enforcing the setup to happen before setting a schedule (fixes #278).

### QuickAccess
- Improved: Dialog messages in single-pass mode (#279).
- Fixed: BuyPro Dialog not showing when necessary.

## SD Maid [4.0.3] - 2016-01-02 (BETA)
### Core
- Improved: Translations.
- Improved: Log output and crashtracking.
- Fixed: SDCard not being detected on multi-user devices without SuperSU.
- Fixed: Possible crash when changing fragments at certain moments.
- Fixed: Possible crash when navigating settings.
- Fixed: Crash when no mount size information could be obtained via StatsFS.
- Fixed: Possible crash when switching to a specific page in SD Maid through widgets or notifications.
- Fixed: Crash when checking Venom SuperUser su binary.
- Fixed: Possible crash when opening or close SD Maid when a task finishes.
- Fixed: Possible crash tasks start/finish in quick succession.
- Fixed: Possible crash when doing list item multiselection.
- Improved: SD Maid will no longer crash if the VIBRATE permission has been revoked.

### QuickAccess
- Fixed: Crash when the UI was shown before SD Maid was ready and the user clicked an action.

### Explorer:
- Fixed: Crash if the user press back before the Explorer UI is completely loaded (no default path is available).

### AppControl
- Fixed: Crash when an action was started from the details activity and the activity was closed before the action finished.
- Fixed: Crash when an app with no APK was scanned.

### CorpseFinder
- Fixed: A crash when canceling the scan at certain moments.
- Fixed: Deleting from details erroneously required the pro version.
- Improved: The sdcard filter should cancel quicker now.

### SystemCleaner
- Fixed: Deleting from details erroneously required the pro version.

### Exclusions
- Fixed: Crash upon entering the exclusion manager (#274).

### Scheduler
- Fixed: Fixed random crash when entering/leaving the scheduler page.

## SD Maid [4.0.2] - 2015-12-31 (BETA)
### Core
- Added: If the busybox setup fails, the final explanation screen will now show an actual error message with details.
- Added: Exclusion for SD Maid from the databases tool.
- Added: SD Maids install ID is now shown in overview for debug purposes and can be copied by tapping it.
- Added: Creating a file or directory called "sdm_force_debug_run" on the sdcard will trigger a debug run on SD Maids next launch.
- Improved: New Clutter database entries.
- Improved: Recognition of specific su binaries and apps.
- Improved: Logging output and tagging.
- Improved: Compatibility check of native busybox binaries. Now ensuring the mount command delivers usable output.
- Changed: Changing the worker count in advanced settings now automatically restarts SD Maid.
- Changed: The changelog is no longer an in app screen but shown from http://sdmaid.darken.eu/changelog .
- Fixed: Crash when granting SD Maid storage access/permission and the setup activity was recreated.
- Fixed: Rare crash during rootcheck on not correctly rooted devices.
- Fixed: Warnings during reading the changelog.
- Fixed: Possible crash on network issues during update check.
- Fixed: Debug run not correctly elevating the debug level.
- Fixed: Build fingerprint not being included in debug run logs.
- Fixed: Possible UI crash when resuming the UI and an action just finishes.
- Fixed: Crash when trying to determine ownership of a system app without source dir.
- Fixed: Crash caused by file forensics failing on files stored in secondary storage if that storage was mounted within the primary storage (e.g. /mnt/sdcard/external_sd).
- Removed: Some tracking because pirates are too dumb to download the correct apks and I'm getting spammed with dumb error reports.

### Overview
- Added: Buildtime to SD Maids info.
- Fixed: Crashed caused by running Overview simultaneously with other tools.

### CorpseFinder
- Improved: Canceling behavior. Canceling happens quicker now.
- Improved: Progress feedback. Filter progress should now show which filter is active and in what state.
- Improved: UX of deleting items from the details view.
- Improved: Performance of the sdcard scan, should be much faster now and we still get to keep the accuracy improvements, \o/.
- Changed: Filter choice settings have ben reset.
- Changed: The app data filter has been split into 3 individual filter (/Android/data/,/data/data/ and the sdcard root excluding the Android/data folder).

### AppControl
- Fixed: Crash when quickly opening and closing app details.
- Fixed: Rotation crash in receiver manager (#263).
- Improved: Improved receiver manager layouting (#266).

### SystemCleaner
- Improved: Improved UX of deleting items from the details view.
- Changed: Restricted MacOS files filter to (root of) SDCARD.
- Fixed: Fixed filter on/off settings not working.

### AppCleaner
- Improved: Improved UX of deleting items from the details view.
- Fixed: Deletion being possible without having the pro version.

### Duplicates
- Improved: Improved UX of deleting items from the details view.
- Fixed: Deletion being possible without having the pro version.

### Exclusions
- Improved: Replaced extra searchbar with built in searchview.
- Fixed: Fixed exclusions being cut off.

## SD Maid [4.0.1] - 2015-12-19 (BETA)
### Core
- Fixed: Timeout during root check not working leading to endless waiting.
- Fixed: Crash due missing update data.
- Fixed: Crash when determining the ownership of a system app related file and the system has an app installed without source folder.
- Fixed: Crash due to rotation when running a setup task.
- Fixed: Crash due CrashTracking crashing :') due to a race condition on app initialisation.
- Fixed: Crash on orientation change related to race conditions between UI callbacks.
- Fixed: Possible crash when resuming SD Maid on a tool that is working state.
- Fixed: Crash due to race condition when entering/leaving SD Maids UI while a new thread is being launched.
- Fixed: Crash due to quickly resuming, pausing, resuming SD Maids main app, a callback would trigger while the UI was no longer visible.
- Fixed: Crash when doing an update check and the server didn't know the version.
- Fixed: Crash during storage detection because the system returned a NULL path.
- Fixed: Crash during storage detection because the sdcard was not mounted or available.
- Fixed: Crashes caused by file forensics failing to match items on /data/app if SD Maid was moved to the sdcard (TY +Ray Hollingsworth, his log provided the solution).
- Changed: If no activity for OPEN_DOCUMENT_TREE is found when playing in the advanced settings, we show a warning instead of crashing.
- Improved: Changes to crash tracking and logouput to help me identify specific issues.
- Improved: Disabled crashtracking if SD Maids assets have been modified and the app crashes because it can no longer support that device (good job /s).
- Improved: Updated translations.

### Explorer
- Fixed: Crash due to trying to create a bookmark for a not mounted sdcard.

### SystemCleaner
- Fixed: Dataloss due to DefaultFilter instantiation with incomplete filter criteria. If this is detected a debug report will be send and the filter will be skipped (TY +Salman Khan SK, his log provided the solution).

### Duplicates
- Fixed: Crash when entering settings.

### Databases
- Fixed: Crash when entering settings.

### LastModified
- Fixed: Crash when entering settings.

## SD Maid [4.0.0] - 2015-12-18 (BETA)
### Core
- Added: Support for API23 permission system.
- Added: Advanced option to work around Kingo Root's faulty su binary behavior.
- Added: Previews now support videos.
- Added: Exclusions now support regular expressions. There is currently no UI for it, prepend "regex:" during creation.
- Added: Exclusions can now be imported &amp; exported.
- Added: Ownership detection for /system/app, /system/priv-app and /sdcard/Android/media.
- Improved: Design!
- Improved: UI performance by fixing duplicate/overlapping update calls.
- Improved: Switching activities no longer requires reloading of preview picture.
- Improved: Settings now have a nicer picker window to choose paths.
- Improved: Settings now have a tablet mode.
- Improved: Updated BusyBox, now build from 1.23.2 with buildroot 2015.08.1 (default config)
- Improved: Update check now also includes the unlocker.
- Improved: Robustness of uri based external storage access via StorageAccessFramework.
- Fixed: Threading issue when canceling workers through the ActionProgressBar.
- Fixed: Previews sometimes not loading when scrolling like a maniac.
- Changed: Settings structure has been rearranged and are now accessible from the bottom of the navigation drawer.
- Changed: Bugreporting now uses bugsnag.com instead of ACRA (I needed a better backend to organise crash reports).
- Changed: Bugreporting email has been reset.
- Changed: Bugreporting preference has been reset.
- Removed: Removed &lt; API16 binaries.
- Removed: Support for Android &lt; 4.0 (minSdkVersion 16).

### QuickAccess
- Added: Button to see a small explanation.
- Added: A widget that can run QuickAccess actions in one pass.
- Changed: Entries now show full progress feedback.
- Changed: Tapping the title now takes you to the full view.
- Changed: The FAB button will return to it's initial SCAN state even if items are left.

### Overview
- Changed: Consolidated SD Maids version and state details into a single entry.
- Removed: Full display of all mounts (just wasn't that useful and very badly supported).
- Removed: References that could be construed SD Maid only works with ROOT. It just has the bonus that if you have root it can utilize it. Only very early versions of SD Maid needed root.

### Explorer
- Added: Bookmarks for storage locations (right-side drawer).
- Added: Added user bookmarks.
- Added: Copy support on 5.0+ external storage.
- Added: Move support on 5.0+ external storage.
- Added: "Pathdump" it writes the contents of a folder recursively into a textfile.
- Improved: Copied/cut items are now visibly represented by a Snackbar at the bottom, offering details and allowing to clear SD Maids clipboard.
- Removed: Individual setting for preview loading, this is now a general setting.
- Changed: Creating a SystemCleaner filter from the context menu is now an option that has to be enabled.
- Changed: Changing permissions is now an option that has to be enabled.
- Changed: Doing a forced media scan is now an option that has to be enabled.

### Searcher
- Improved: Simplified search options.
- Added: Added SHOW button to entry details.
- Changed: Clicking a search result now open it in the Explorer if there is no app to open it.
- Removed: Individual setting for preview loading, this is now a general setting.

### AppControl
- Added: Support for managing receivers of type: HEADSET_PLUG.
- Added: Support for managing receivers of type: ACTION_POWER_CONNECTED.
- Added: Support for managing receivers of type: ACTION_POWER_DISCONNECTED.
- Added: Color coded action by their overall impact risk.
- Improved: Size accuracy and displayed details.
- Improved: Scan performance, especially on subsequent refreshs.
- Fixed: Dalvik-cache file size not being determined on Lollipop.
- Changed: Removed tag "No APK" from list display. Rare occurrence and not really useful at that stage.
- Changed: The expandable actions and the app details have been moved into a new activity.
- Changed: Autostart related entries have been renamed to BOOT or ON_BOOT to combat misconceptions.
- Changed: 'Toggle autostart' Dialog has been replaced by the 'Receiver Manager' Activity.

### CorpseFinder
- Added: Swipeable fullscreen view for comfortable one-handed viewing of corpse details while drinking coffee.
- Added: Possibility to delete and exclude items from within the details view.
- Improved: All filters now support extension through the clutter database.
- Changed: The asec filter now no longer only looks at .asec files.
- Changed: The "Remove keepers" setting has been reversed and renamed to fit the equivalent within AppControl.
- Changed: The Uninstall watcher now only executes the AppData filter.
- Changed: Corpse checks on the sdcard now support item names with variables through regex matching. Note: This mean the previous reverse lookup method can no longer be used which increases scan time.
- Fixed: Issue in several filters that could lead to false negatives if packagenames overlapped.

### SystemCleaner
- Added: Swipeable fullscreen view to look at the details of each filter.
- Added: Support for importing and exporting user made filters. Importing filters is free, creation and export paid.
- Added: Possibility to delete and exclude items from within the details view.
- Added: JSON syntax for creating user filters.
- Added: User filters now support regex, min size, max size and storage location criteria (currently not usable from the UI, only from JSON).
- Added: Logic to automatically convert old v3 custom filters to the new "user filters".
- Improved: Filter manager view, it's now split into two panes, with the right side pane allowing management of custom made filters.
- Improved: Filter creation UI, simplified possible settings, reduced chance to make mistakes.
- Improved: Default filter accuracy and flexibility by replacing basic string matching with REGEX expressions.
- Removed: Setting to enable creation of user filters. It's now on by default.
- Removed: NetStats and ProcStats filter, their usefulness was always in doubt. If you really want this, create a user filter.

### AppCleaner
- Added: Swipeable fullscreen view to look at the details of each app.
- Added: Possibility to delete and exclude items from within the details view.
- Added: Info and shortcut to system storage for people on 6.0 without root.
- Added: Support for extending cache definitions via regex.

### Duplicates
- Improved: Scan performance through better internal data structures.
- Added: Possibility to delete and exclude items from within the details view.
- Added: Safeguard that routes all single item deletions through an extra check to ensure we have one left over.
- Removed: Individual setting for preview loading, this is now a general setting.

### Biggest
- Improved: Switching behavior when viewing an entry in the Explorer, smoother change and scrolling to correct position.

### LastModified
- Improved: Switching behavior when viewing an entry in the Explorer, smoother change and scrolling to correct position.
