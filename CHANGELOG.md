# Changelog

- Latest production version: v4.7.4(40704), Unlocker v4.0.9(40009)
- Latest beta version: v4.7.5(40705)
- Legacy versions: [v3.1.5.4](changelogV3.txt), [v2.1.4.1](changelogV2.txt), [v0.9.8.9](changelogV1.txt).

## SD Maid [v4.7.5] 29.06.2017
### Core
- Improved: Translations (some new languages yay \o/).
- Improved: Clutter database (#977,#972,#971,#970,#968,#965,#955,#952,#950,#992,#988).
- Improved: Code related to checking app cache sizes on Android 6-7.
- Fixed: Make sure that we don't launch something like "BlackBerry Market" when trying to take the user to SD Maid on Google Play (#861).
- Fixed: Crash when a newer version of SD Maid is installed and SD Maid tries to update internal binaries.

### Explorer
- Fixed: Not being able to jpg files on some ROMs (#951).

### AppControl
- Improved: App install data (e.g. /data/app ) detection. Adjusted routines for apps with unusual pathes. Mostly relating preinstalled aps, mostly emulator type ROMs but also some others.
- Fixed: Not being able to access the filter drawer if the list is empty as otherwise the user could be stuck on a specific sort mode.

## SD Maid [v4.7.4] 30.05.2017
### Core
- Improved: Translations.
- Improved: Small code improvements.
- Improved: Clutter database (#944,#943,#942,#940,#938,#937,#936,#935,#933,#909,#913,#914,#941,#934).
- Changed: The secondary storage setup can now be skipped after a few seconds (before you had to try granting permissionat least once).

### AppControl
- Fixed: Crash when an app was uninstalled and SD Maid was working with stale data.
- Fixed: Crash when sorting apps by name and an app had no name.

### SystemCleaner
- Removed: Filter for old WhatsApp backups. The SystemCleaner works best with files with unknown owners, in this case we know who owns the files (WhatsApp) so the AppCleaner is better suited this as it can check if an app is running or work with exclusions via packagename.

### AppCleaner
- Added: Filter for old WhatsApp backups.
- Added: Markers ".Trash" and ".trash" to the hidden caches filter.
- Improved: WhatsApp sent/received filters. Added matching for "Animated Gifs".


## SD Maid [v4.7.3] 25.05.2017
### Core
- Improved: Handling of files with invalid group/user ids (out of valid number) range. Mostly happens with custom mounted storage devices.
- Improved: Handling of symbolic links without link target (encountered when mounting storage from other operating systems).
- Improved: Debugging output.
- Improved: Clutter database (#889,#890,#891,#893,#894,#895,#897,#899,#900,#901,#902).
- Fixed: Crash when automatic crash reporting was disabled and SD Maid tried to report a specific issue.

### AppControl
- Fixed: Export function missing since v4.7.2.

### SystemCleaner
- Added: Filter for old (>1day) WhatsApp message backups to filter page "other" (#904).

## SD Maid [v4.7.2] 13.05.2017
### Core
- Fixed: Don't crash SD Maid if unknown apps send incompatible intents to the ExternalTaskReceiver.
- Fixed: Shell environment variables not being correctly set (Ty Марат Зельман & Семен Топаль).
- Fixed: Preview loading. Previews should no longer fail to load and get stuck on the "spinning circle", should be a little bit faster too.
- Fixed: Preview failing for some apps build for Android O.
- Changed: Reverted hotfix from v4.7.1 because it didn't address the underlying issue.

## SD Maid [v4.7.1] 13.05.2017
### Core
- Fixed: Issue issue when reading/getting files (stat output parsing issue).

## SD Maid [v4.7.0] 13.05.2017
### Core
- Improved: Translations (thanks!).
- Improved: Clutter database (#880,#875,#874,#873,#847,#855,#856,#857,#858,#860,#849,#859,#862,#876).
- Improved: Debug output (#851).
- Improved: Updated used libraries & tooling.
- Improved: Updated toybox binary.
- Improved: Binary setup/compatibility tests for `xargs` and `find`.
- Improved: Binary setup. Better ROM comaptibility. "Mix&Match" of applets from different binary sources is now supported.
- Improved: Dalvik-Cache ownership detection.
- Improved: Improved `/data/app` & `/data/app-private` ownership detection.
- Improved: File processing of unusual names (carriage return/newline feeds).
- Improved: Resource usage, certain internal objects are now no longer aquired multiple times during SD Maids runtime.
- Improved: Lots of internal code structure, refactoring galore to improve unit testing.
- Improved: Exclusion creation. It's now no longer possible to accidentally enter `\n` when creating exclusions.
- Improved: Dates displayed in SD Maid use the users preferred (system set) way of displaying dates (dd/MM/YY vs MM/dd/YY).
- Fixed: Binary update routine in cases where the existing binary could not be deleted due to wrong permissions.
- Fixed: Debug data reading on Android O (#833).
- Fixed: Files not being read correctly depending on which stat applet was used (parsing failure).
- Fixed: SD Maids own update check not checking the previous version correctly.

### Overview
- Improved: Busybox/Sqlite details regarding applet use.

### Explorer
- Added: Corpses marked as "keeper" will now appear with an orange ghost icon instead of the normal white one.
- Improved: When creating a filter, a sample description will be prefilled.
- Changed: When creating filters, and the item is a directory, `/` will be appended (#868).

### CorpseFinder
- Fixed: ApkData false positives on Android O (#829, ty dreamland2000).

### AppControl
- Improved: App size display. If SD Maid is unsure about an apps size, this is now visible (#844).
- Changed: SD Maids unlocker is now visible (#837).
- Changed: Certain actions are disallowed on SD Maid and the Unlocker (it doesn't make sense to let SD Maid disable SD Maid) (#837).

### SystemCleaner
- Added: Attributes & UI elements to support filtering by `minimumAge` and `maximumAge´ (#333).
- Improved: UserFilter export. Only save fields into the `.json` file that are actually necessary (#867).
- Improved: Scan performance for items that will eventually match a filter that doesn't use the `location` criteria.

## SD Maid [v4.6.5] 06.04.2017
### Core
- Improved: Translations.
- Improved: Root binary & app detection, added support for magisku.
- Improved: Updated clutter database (#799,#780,#782).
- Improved: Debug output. Fixed typos, better naming.
- Improved: Root related code. Lots of refactoring and new unit tests. Some preperation to move root related classes into an external library that I can open source.
- Improved: Improved analytics. Moved to https. Removed tracking for data that proved to be not useful (referrer data). Updated to latest Piwik 2.0 build.
- Improved: Image loading (latest glide library).
- Improved: Pro/Unlocker related code. Unified checks and upgrade dialog. More granular control (instead of isPro(), hasFeature(X)). Preparations to allow for different upgrade paths than via the unlocker app.
- Fixed: Filetype being wrong when sharing files (e.g. uploading to GDrive) (#786).
- Changed: Changing the "preview" option in the settings no longer requires the pro version. Currently only affects previews in the duplicates tool.

### Searcher
- Added: Search option field for "Path doesn't contain". Will be exanded to a list in a future rewrite (#809).
- Removed: Global searcher exclusion as they were not working (#809).

### CorpseFinder
- Improved: Uninstall watcher should now work on Android O (#800).

### AppControl
- Fixed: Always showing a toast message when adding an activity (#823).
- Fixed: App size not correctly determined on unrooted devices (#820).
- Fixed: Typo in date format when sharing a list of apps.

### AppCleaner
- Improved: Hidden caches filter, added facebook video cache.
- Fixed: Inconsistent toolbar icons (#788).

### Duplicates
- Changed: The free version will now show file previews.

### StorageAnalyzer
- Fixed: Text being cut off when changing font sizes via accessibility settings (#789).

### Statistics
- Improved: Only attempt truncation if new limit is lower than old one.

## SD Maid [v4.6.4] 05.03.2017
### Core
- Added: Link to privacy policy (sdmaid.darken.eu/privacy).
- Added: Support for clutter markers which define their target packages via regular expressions.
- Improved: Automatic bug reporting tool.
- Improved: Translations.
- Improved: Clutter database (#768,#761,#765,#767,#771,#772,#773,#774,#762,#763,#751,#755).
- Improved: Updated tooling and used libraries.
- Improved: Code handling dynamic clutter markers (which can match apps without really knowing the specific apps).
- Fixed: Clutter reporter not including uninstalled (but known apps) in the reports (#769).

### StorageAnalyzer
- Improved: Internal code structure to allow for better testing.
- Fixed: Case where deleting files lead to a crash (if the files had already been deleted).

## SD Maid [v4.6.3] 16.02.2017
### Core
- Improved: Updated clutter database (#737,#740,#739,#747).
- Improved: Updated translations.
- Improved: Various improvements to logging output and code structure.
- Improved: Routines related to remounting storage when deleting, creating, copying or moving items.
- Improved: Device related analytics data.
- Improved: Added mount details to crash reports (#744).
- Improved: Binary setup on non ARM devices. SD Maid should now correctly detect and use the PREFERRED architecture, if a device supports multiple (#745).
- Improved: Updated Android support libraries.
- Improved: App killing code. Fixed crash due to firmware bug on LG devices running Android 7.0 (#748).
- Fixed: Shell tasks falsely trying to remount the emulated primary storage.

### AppControl
- Fixed: Crash when APKs failed to export.
- Fixed: Export failing on some unrooted devices.

### AppCleaner
- Improved: Hidden cache filter (#747).

## SD Maid [v4.6.2] 10.02.2017
### StorageAnalyzer
- Fixed: Detecting not existing partition.

## SD Maid [v4.6.1] 10.02.2017
###
- Improved: Debug output.
- Improved: Clutter database (#735,#730,#729).
- Improved: Translations (#726).
- Improved: Updated analytics library and reduced amount of tracked actions (popularity: AppControl: togglereceiver>delete>kill>freeze>forcestop>export, Explorer:Delete>move/copy>size>rename), nothing suprising here so I'll no longer track this.
- Changed: Settings layout.

### AppControl
- Improved: APK export behavior when encountering errors.
- Fixed: "Show unknown" (receiver) menu checkbox not reflecting the state correctly.

### CorpseFinder
- Changed: Removed experimental tag from Link2SD/Apps2SD filter.

### Databases
- Added: MediaMonkey as default exclusion (#732).

### Scheduler
- Changed: Increased maximum interval to 31 (#733).

## SD Maid [v4.6.0] 31.01.2017
### Core
- Added: Support for `/data/sdext2`.
- Added: Support for clutter matching in `/data`.
- Improved: Clutter database (#711, #695, #696, #697, #694, #701, #702, #704, #705, #707, #708, #709, #710, #703, #706).
- Improved: Debug output (better performance when debugging, more useful information).
- Improved: "Double press to exit" now respects the systems vibration settings (#693).
- Improved: Code responsible for detecting storages.
- Improved: Updated translations.
- Fixed: Progress messages when doing statistics.

### AppControl
- Added: Through SD Maid uninstalled apps are now logged in statistics.
- Improved: Forced-stopped apps can now also be determined on unrooted devices (#712).
- Improved: Initial scan speed should be faster, specifically detecting disabled and stopped apps.
- Changed: App list filter entries are now only shown if they contain apps (#713).

### CorpseFinder
- Added: Filter for Link2SD and Apps2SD related files.

### AppCleaner
- Improved: Deletion performance. Items are no longer deleted one by one. SD Maid will try to find common parent directories and then delete in batches while still respecting exclusions (#430).
- Improved: Scan performance, specifically final checks (alias & exclusions).
- Improved: Bug reporting file filter.

### Duplicates
- Added: Default exclusion for Link2SD and Apps2SD (#254).
- Fixed: Use the same icons as in other places in the app for "Show in Explorer".

### StorageAnalyzer
- Added: `/data/sdext2` to displayed storages if detected.
- Added: Root items now display a little extra info like "Requires root permissions" or "Read only".
- Added: Setting to show inaccessible items (i.e. SD Maid can't search them but still determine the overall storage/size data).
- Improved: Viewing entries in the Explorer now shows the content if a directory is the target, instead of the directory itself in its parent.
- Improved: If the system cache is located at `/data/cache`, the entry will be omitted as it's already covered.
- Changed: `/data` and `/cache` will now be shown on unrooted devices if it's enabled in settings.

### Scheduler
- Improved: New custom views to improve UI behavior.

### Statistics
- Changed:  Removed labels from chart (due to overlapping) and moved the size to each legend entry (#699, #689).

## SD Maid [v4.5.9] 12.01.2017
### Core
- Improved: Translations.
- Improved: Clutter database (#684).
- Fixed: Clutter report tool crashing when adding apps (#686).
- Fixed: FAB staying invisible after being hidden (#685).
- Fixed: FAB being missaligned within the file/path picker screen (exclusions, filters etc.).

### AppControl
- Fixed: Handling of empty packages/restrictions XML files.

### StorageAnalyzer
- Improved: Gracefully deal with cases where a file could not be found.

## SD Maid [v4.5.8] 08.01.2017
### Core
- Improved: Clutter database.
- Improved: Updated android support libraries.
- Improved: Import screen should now only show files with supported extensions.
- Improved: Show error instead of crash when trying to import invalid files into exceptions.
- Fixed: Update check delaying initialization when blocking internet access via firewall.

### Explorer
- Improved: Files created by "Save directory structure" now contain ROM infos (#675).
- Fixed: Copy/Move snackbar not consistently showing.

### AppControl
- Improved: Receiver (boot) details. Previous colors were not very readable. Made some layout changes.

### CorpseFinder
- Changed: "TWRP" and "clockworkmod" have been flagged as `common` and will no longer be suggested as corpses (#673).

### SystemCleaner
- Fixed: `/data/system/dropbox` filter (Ty Roman).

### AppCleaner
- Improved: Hidden cache filter (additional image and video cache matching).

### StorageAnalyzer
- Added: "Read only" to read-only storages (#676).

## SD Maid [v4.5.7] 03.01.2017
### Core
- Improved: Translations.
- Improved: Debug logging.

### AppControl
- Fixed: SD Maid crashing after processing an uninstall or app reset.

## SD Maid [v4.5.6] 02.01.2017
### Core
- Improved: Updated toybox (#668).
- Improved: Clutter database (#665 Ty RedMaxKr, #629, #664 & #663 Ty Gitoffthelawn).
- Improved: File research performance, better sychronization during generation of clutter marker data (#663).
- Improved: File research performance, prevent the marker cache from containing entries (#663).
- Improved: Gracefully handle files with invalid modification dates by using a default date as fallback. Previously files with invalid stats would have been omitted causing tools like StorageAnalyzer to break because parent directories were omitted (#668).
- Fixed: Experimental setting not correctly reflecting the actual state (i.e. when using a beta version).
- Fixed: File opening on Android N+ (#667 Ty Joly0).

### AppControl
- Improved: Internal code by further modularizing functionality to reduce bug susceptibility.

### CorpseFinder
- Added: Ownership information within the details screen (#663).

### SystemCleaner
- Improved: Advertisement filter, added `.mobvista\d+`.

### Scheduler
- Added: If a full reboot attempt via system intent fails we try reboot via command line applet as fallback option (#662 Ty Yowlen).

## SD Maid [v4.5.5] 24.12.2016
### Core
- Added: Support for files of type 'named pipes'.
- Improved: Detection of running apps that use multiple processes.

### AppControl
- Fixed: Listdata being duplicated when refreshing single entries through tasks (e.g. size check).

### AppCleaner
- Improved: Hidden caches filter (TempData).

### Databases
- Fixed: SD Maid getting stuck when trying to suspend running apps (using bad PID values) (Ty Ben).

## SD Maid [v4.5.4] 22.12.2016
### Core
- Improved: Clutter database.
- Improved: Translations.

### CorpseFinder
- Fixed: File reporting not opening the browser.

### AppCleaner
- Added: Option to open files from details in SD Maids Explorer.
- Added: Amazon app store to hidden cache and analytics filter (#457 Ty Gitoffthelawn & jawz101).
- Improved: Scan performance. Under certain conditions SD Maid scanned the same folder twice.
- Improved: Handling of issues when determining force-stopped apps.
- Fixed: Scanning subfolders now also follows symlinks (fixes issues with App2SD apps) (#622 Ty Antonio).

## SD Maid [v4.5.3] 18.12.2016
### Explorer
- Improved: Saving the directory structure now appends a timestamp (epoch).

### AppControl
- Improved: Running apps detection instead of treating different data sources as fallback options, pull all data, then merge it.
- Changed: Don't make assumptions about enabled/force-stopped state based on whether a package is running, just check and display. Less prone to show false data if detection of running apps returns incorrect data (issues such as the one fixed in this update would have been easier to detect).
- Fixed: Incorrectly detecting running apps (shared uid values among apps caused to false positives, especially for system apps).
- Fixed: Crash when updating the rightside filter drawer.

### AppCleaner
- Improved: Scan speed by looking up running packages only once.

## SD Maid [v4.5.2] 17.12.2016
### Core
- Fixed: Bugtracking issue.

## SD Maid [v4.5.1] 17.12.2016
### Core
- Improved: Debug output.
- Improved: Updated clutterdb.
- Improved: Translations.
- Changed: Leanback launcher icon.
- Changed: Beta builds now automatically have experimental features enabled.
- Changed: Reduced and update analytics.
- Fixed: Previously placed shortcuts and widgets causing a crash and no longer working until recreated (if you recreated them in v4.5.0, then you have to do it again).
- Fixed: Debug level not updating directly.
- Fixed: Concurrency issue when multiple tools requested to have a file from the same location type checked.

### Explorer
- Fixed: Action "Save directory structure" not working (#618 Ty jawz101).

### Searcher
- Fixed: Not finding anything if modification time settings are not used.

### AppControl
- Added: Tapping the app icon will launch the app.
- Added: Info to the app move button saying if an app doesn't want to be moved, but can be forced to.
- Changed: The activities manager is now flagged as experimental.
- Fixed: Apps being disabled as movable when they were not (#614 Ty noc-jfcbs).
- Fixed: Search field not being displayed on smaller screens.
- Fixed: Crash when unfreezing apps on <5.0.
- Fixed: Crash when trying to determine app sizes (e.g. after uninstall).
- Fixed: Crash when refreshing after trying to kill a library type app without application infos.
- Fixed: Crash when entering and exiting the AppControl page and SD Maid tried to update the ui filters prematurely.
- Fixed: Issue leading to a crash when placing a shortcut through the activities manager.

### CorpseFinder
- Fixed: Crash when triggering the uninstall watcher.
- Fixed: False positive detection of theme/overlay files in private app data on LG devices (#615 Ty Brian).

### SystemCleaner
- Fixed: Crash when a racecondition lead to division by 0 during progress display.

## SD Maid [v4.5.0] - 12.12.2016
### Core
- Added: Support for locations `data_system_ce` and `data_system_de`.
- Added: Additional debugging options.
- Added: Timestamps to new exclusions, preparing for future sort options.
- Added: Android TV (leanback) support (#389).
- Added: Debug option to run all tools.
- Added: Debug option to disable the root check.
- Improved: Clutter database.
- Improved: User-interface, various small tweaks (e.g. #578).
- Improved: Updated SD Maids internal toybox (bugfixes, removed ls applet, added pidof applet).
- Improved: If statistics fail due to having no device space, gracefully continue instead of crashing.
- Improved: UI performance/behavior related to the navigation drawer.
- Improved: Bugreporting related to binary setup issues (toybox/busybox/sqlite3).
- Improved: UI. Small tweaks to used strings, a bit of padding here and there.
- Improved: Setup/Baseconditions task logic. Cleaner abort/continue behavior. Fixed a few issues that could lead to getting stuck in setup, having to kill SD Maid.
- Improved: Multitasking behavior. Reboot tasks only make sense to be executed when everything else is done. To support this I've rewritten some chunks of SD Maids tasks-to-worker (each tool is a worker) distribution code.
- Improved: If the statistics database corrupts, it now automatically resets itself.
- Changed: SD Maids external tasks system to a simpler approach, previously functionality was overkill and convoluted. This should have positive effect on scheduler and widget actions. If it never worked on a specific ROM before, it might now.
- Fixed: UI crash related to exiting a view when items were selected.
- Fixed: Crash related to writing (copy/move) to external storage through the storage access framework.
- Fixed: Crash related to storage access framework based access (external sdcards/portable storage).
- Fixed: Crash related to deletion on external storage on Android 4.4 devices (provider trick).
- Fixed: Crash related to initialization of SD Maids multiuser detection.
- Fixed: Crash related to unlocker detection.
- Fixed: Crash related to loading AppControl while either CorpseFinder or SystemCleaner was running.
- Fixed: Android 4.4's "Provider trick" deletion method being used on other version too, where it obviously failed and slowed down deletion in edge cases (#595).
- Fixed: Running apps detection on Android 7.0+ (#527).
- Fixed: Floating action button not anchoring correctly (#610).

### Explorer
- Improved: Extraction behavior to better deal with uncommon archives structures.
- Improved: Error message when opening something (#612).
- Fixed: A rare UI related crash when trying to open a file with an app that directly closes again.
- Fixed: Crash when trying to create SystemCleaner user-filter based on an invalid item.
- Fixed: UI issue when quickly opening the report dialog, then closing it.

### Searcher
- Fixed: Empty searcher tasks failing in some cases instead of just listing the whole device.

### AppControl
- Added: "Activity manager" which allows you to view all exported Activities an app may have, launch them or add them as shortcut to your home screen (requires SD Maid Pro).
- Added: View apps internal/external storage location.
- Added: Action to move apps to internal/external storage on rooted devices (requires SD Maid Pro).
- Improved: Core routines related to creating and updating "App" objects. A more modular approach now makes it faster to update Apps accurately after actions changed their state/behavior. The new approach also allows easier addition of new app details.
- Changed: A few layout and color details to make more sense (green running, blue frozen, force stopped in between).
- Fixed: Don't crash if the ROM has no uninstall activity (wtf?).
- Fixed: Receivers being no longer shown after disabling them.

### CorpseFinder
- Added: Filter for `/mnt/secure/asec` (#247).
- Fixed: Failsafe check for asec related corpses which checks if the `.asec` file is currently mounted (and thus not _yet_ a corpse). 

### SystemCleaner
- Added: Filter for recent tasks, which deletes metadata and screenshots used to restore the the recent tasks list after reboots (#235).

### Appcleaner
- Added: Filter to delete send/received files from Telegram (#609).
- Improved: Analytics filter, added Adobe Analytics related files.
- Improved: No longer require parent folder to contain the packagenames (fixes matching issues on the sdcard root).
- Improved: Hidden cache filter.
- Improved: Hidden cache filter matching. More aggressive matching against variants of the "tmp" folder.
- Fixed: Bluetooth snoop log matching.

### Storage analyzer
- Fixed: Possible issue when browsing external storage on Android 5.0+ and base storage item has no parent.
- Fixed: Being able to enable /cache without root.
- Fixed: Filetree not being correctly updated after deleting something.

### Databases
- Added: Options to sort the list by state, app and size (#598).

### Statistics
- Changed: Reduced default chronic limit to 3 days.

### QuickAccess
- Added: Triggering QuickAccess through Android 7.1 "app-icon-shortcuts" (requires SD Maid Pro).
- Improved: Progressbar behavior when tasks switch between "In queue" and working.

### Scheduler
- Added: Option to reboot the device after scheduler action complete.
- Improved: Layout padding and tap behavior.

### Exclusions
- Added: Options to filter the list by type of exclusion (#600).
- Improved: Exclusions are now sorted by their last modification time (#600).
- Fixed: Being able to select locked exclusions in multiselect mode.

## SD Maid [v4.4.1] - 11.11.2016
### Core
- Improved: Clutter database.
- Improved: Translations.
- Fixed: Crash when trying to open links on devices without a browser.

### Explorer
- Improved: Loading bookmarks, more resiliant against crashes caused by getting weird pathes from storage or Android APIs.

### CorpseFinder
- Fixed: Layout issues causing item size to be cutoff.

### SystemCleaner
- Fixed: Layout issues causing item size to be cutoff.

### AppCleaner
- Improved: Bugreporting filter (added `btsnoop_hci.log`).
- Fixed: Layout issues causing item size to be cutoff.

### Statistics
- Fixed: Crash when trying to track AppControl tasks such as toggeling receivers.
- Fixed: Crash when event details didn't fit into a single line.
- Changed: Default limit reduced from 31 days to 7 days.
- Changed: Reset statistics again.

## SD Maid [v4.4.0] - 05.11.2016
### Core
- Added: Support for CustomTabs when opening web links (#576).
- Improved: Clutter database (#569, #580, #584, #585, #593, #592).
- Improved: Translations.
- Improved: API targets and build tools raised to API25.
- Improved: In the weird event that a ROM has no activity to grant runtime permissions, gracefully show an error instead of crashing.
- Fixed: No longer showing snackbars for empty results.
- Fixed: Possible crash when launching SD Maid for the first time after an install.
- Fixed: Tab hiding affecting tool access from QuickAccess (#540).
- Changed: Label for scan actions from 'check' to 'scan' (:D).

### Explorer
- Added: Support for showing mount points. Items that are mountpoints will show an extra icon if option 'Research owners' is enabled (#579).
- Fixed: Possible crash when opening files.
- Fixed: Possible crash when trying to determine file type when trying to open a file.

### Searcher
- Added: Function to share files/results (#382).
- Improved: Search progress feedback.
- Fixed: Crash when encountering corrupt filesystem entries (will now just be omitted).

### AppControl
- Added: Option change list sorting from the right side filter drawer (#573).

### CorpseFinder
- Improved: Details layout.

### Duplicates
- Added: Autoselection option for primary/secondary storage (#473).
- Improved: Line item layout.
- Fixed: Duplicates not being found across different storages.

### Storage Analyzer
- Added: Support for location `/cache` (#575).
- Added: Clicking files tries to open them.
- Fixed: No longer showing empty action mode when selecting items in the root view (#577).

### Databases
- Added: Default exclusion for apple music (#539).

### Statistics
- Improved: Chart layout and display (#572, #574).
- Improved: History details and structure (#572, #574).
- Fixed: Negative stats.

## SD Maid [v4.3.8] - 15.10.2016
### Core
- Improved: Clutter database.

### CorpseFinder
- Added: SD Maid now tries to show file previews in the details page (requires SD Maid Pro).
- Added: Tapping the icon of a list item in the details view asks the system to open that file with a compatible app.

### SystemCleaner
- Added: SD Maid now tries to show file previews in the details page (requires SD Maid Pro).
- Added: Tapping the icon of a list item in the details view asks the system to open that file with a compatible app.

### AppCleaner
- Added: SD Maid now tries to show file previews in the details page (requires SD Maid Pro).
- Added: Tapping the icon of a list item in the details view asks the system to open that file with a compatible app.
- Changed: Clutter items marked as `COMMON`, which means that their name is too common to remove them via AppControl or CorpseFinder, will no longer be skipped when searching for caches (e.g. folder `<sdcard>/.thumbnails`).

### Duplicates
- Added: Last modification date to items in the details view.

## SD Maid [v4.3.7] - 14.10.2016
### Core
- Added: Dynamic clutter marker for `IQQI` (#546).
- Improved: Clutter database (Ty david082321 #535 - #566).
- Improved: If available root will be used to determine running apps (#527).
- Fixed: Crash if the system returns unusually large (> Int.Max) uids (#537).
- Fixed: Double press to exit setting being ignored (#538).

### AppControl
- Added: Option to add a launcher shortcut for this tool.

### AppCleaner
- Improved: Hidden caches filter (`.temp`, `.thumbnails`) (Ty david082321 #557, #558).
- Improved: Hidden caches filter (`.face` and video player thumbnails).

### CorpseFinder
- Changed: "Keeper" items, e.g. backups/photos now show a red circle in addition to a tag, independent of corpse location.

### Scheduler
- Fixed: Issue with scheduling a 2 day interval.
- Fixed: Issue with restoring schedule after reboot to the correct time.
- Changed: Initial scheduling, will now trigger at the next hour/minute time, then repeat according to interval.

## SD Maid [v4.3.6] - 03.10.2016
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Internal toybox updated.
- Fixed: Alternative binary setup strategies failing on Android Nougat due to mount applet using different arguments (#528).
- Fixed: SD Maid crashing during initialization if a user binary is not available, but a root binary is available. We should gracefully abort here (#528).
- Fixed: Wrong determining wrong size for files > 2GB.
- Fixed: SD Maid failing to update its binary on first try.

### Explorer
- Fixed: Crash when users on KitKat try to extract a file on a secondary storage (external sdcard).

### Searcher
- Fixed: SD Maid crashing when coming across corrupted files instead of skipping them.

### CorpseFinder
- Added: Filter for `<public-storage>/Android/media`.
- Fixed: Fixed one case where the obb corpse filter ignored the "remove keepers" setting.

### Duplicates
- Added: Additional fail-safe module based on pathes (Ty Chris).
- Fixed: A case of false-positives on rooted devices if SD Maid fallsback to a native busybox which segfaults (Ty Chris).

## SD Maid [v4.3.5] - 25.09.2016
### Core
- Fixed: UI related crash when reentering SD Maids UI by downgrading to an older support library (newest version introduced this crash) (#525).
- Fixed: SD Maid trying to use Android 6.0+ code on <6.0 devices, didn't cause a crash but spammed the log and used unnecessary CPU time.
- Fixed: Crash if binary is not available instead of allowing an error to be displayed.

### Overview
- Improved: If a binary is not available (mostly affects sqlite3 binaries), show an info entry about this instead of showing no entry at all.

### AppControl
- Improved: Name of saved list of apps display human readable date.
- Improved: Better logging for more detailed debug logs.
- Fixed: Crash when clicking "show" after exporting a shared list of apps.
- Fixed: Only being to able to share one item.

## SD Maid [v4.3.4] - 24.09.2016
### Core
- Added: SD Maid can now use two different binaries for root/normal actions. This increases device compatibility and makes it less likely that SD Maid or the user has to install a binary into /system.
- Improved: SD Maid will no longer require a preinstalled system binary on devices that don't have a default `chmod` applet (though this is bad in any case and the user should install a system toybox/busybox to fix their `chmod` applet).
- Fixed: Mountpoint detection fallback solution not working due to unexpected output format (#522).
- Fixed: Crash if the api call for external storages returns an array containing a `null` value (#519).
- Fixed: Failure to detect mountpoints from user perspective if SD Maid employed RootFS injection to use it's binary with root (#521).
- Changed: Storage size determination will now be run on the storage path itself, not its mountpoint (affects Overview & Storage Analyzer).

### Explorer
- Fixed: Crash if we try to restore the last path, have to fallback to a default value, and then the system gives us an empty string as external storage path.
- Fixed: Crash when trying to select files in type 'UNKNOWN' locations (#520).
- Fixed: Crash when trying to extract empty files (#518).

## SD Maid [v4.3.3] - 21.09.2016
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Fast scroller behavior (library: github.com/FutureMind/recycler-fast-scroll).
- Improved: Swapped labeling when asking for secondary storage permission to help users better identify the target storage.
- Improved: Core shell routines. Simplified some unnecessarily complex code constructs (I don't think the performance gain is noticeable).
- Improved: Logging to better help users with sdcard (secondary public storage) issues.
- Improved: Breadcrumb bars displaying pathes.
- Improved: Mount point detection, on KNOX enabled devices, if the internal mount applet can't be called without root, SD Maid will try the systems native mount applet to obtain the users mountpoints (see #502).
- Fixed: Various minor RTL related ui issues (#483).
- Fixed: Issues granting access to secondary storage on "Prestigio" devices (#493).
- Fixed: Erroneously detecting /storage/emulated/legacy as secondary public storage on "Prestigio" devices (#492).
- Fixed: Mount point detection issue caused by mount space seperation (#502 Ty Ivan).
- Fixed: Fixed rare "random" (depends on ps output) crash during detection of running apps.
- Fixed: Fixed rare crash if a system app returns an empty sourcedir path or one that points to rootfs.

### Explorer
- Improved: Archive extraction is now cancelable.
- Improved: ZIP archive extraction now also works on secondary storages if storage permission have been granted (#478 Ty dukelc).
- Improved: If secondary storage setup has been been skipped and extraction is attempted, a snackbar will show asking the user to complete the setup.
- Changed: Error message when a directory can't be accessed (#478).
- Fixed: ZIP extraction action should only be visible for public storages.

### AppControl
- Improved: Right side drawer now allows multiple filter tags to be selected at once.
- Fixed: Filter tags not being reapplied to results after refreshing the lest (#495).

### Storage Analyzer
- Improved: Browsing already loaded data no longer shows the "Successful" toolbar (it was anoying, wasn't it?).

## SD Maid [v4.3.2] - 10.09.2016
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Added link to wiki to the exclusions help dialog.
- Fixed: Crash during resource cleanup when operations end and an interactive shell died prematurely without causing the whole operation to fail. 
- Fixed: Exclusions import always showing success.

### Explorer
- Improved: Creating user filter for the system cleaner now tries to fill in the location field.
- Fixed: Crash if quickly entering and leaving the clutter reporter tool (#486).

### AppControl
- Fixed: Trying to open a file as directory when clicking a path in app details.

### SystemCleaner
- Fixed: Crash when creating a new user filter from scratch (#485).

### Databases
- Fixed: Possible hang during size comparison on devices with high database (800+) counts (#488 Ty danielling23).

### QuickAccess
- Fixed: Database tool entry always showing something to do.
- Fixed: Database tool always showing expected sizes for all items, not only those that are still unprocessed.

## SD Maid [v4.3.1] - 07.09.2016
### Core
- Improved: Translations
- Improved: Clutter database (#481, #480, #479).
- Improved: If a tool can't find any storage (why?), that tool will now display an error instead of crashing SD Maid.
- Improved: Display of error messages in tools.
- Fixed: Crash on devices where SD Maid used rootfs injection to get a working binary. Despite having root, SD Maid didn't use when looking up mounts, causing that to fail and SD Maid ending up with no detected storages (#475 Ty Sandris).
- Fixed: Crash if the shell process would die prematurely. Tasks scheduled for execution would get a NULL result instead of an result with state "error".

### AppControl
- Fixed: Crash if estates were determined based on a stale list of installed apps.

### SystemCleaner
- Added: Filter for `/data/logger` (LG devices) (#464).
- Improved: Matching of already existing filters, better deal with file-seperators.

### Storage Analyzer
- Fixed: Crash when operations were too quick (divide by 0) (#477).
- Fixed: Crash wen pressing the backbutton without loaded data (#476).

## SD Maid [v4.3.0] - 02.09.2016 (BETA)
### Core
- Added: Adaptive support for different (core-utils providing) binaries, currently "toybox" and "busybox".
- Added: Added support for location "/oem" (#441 Ty randomname1234).
- Added: Option to toggle animations (currently only coffee drinking).
- Added: If SD Maid is running in the background but requires setup via user action, operations are canceled and a notification is displayed (#435 Ty sjoshua270).
- Added: SD Maids file forensics can now get clutter markers from dynamic sources. This means that in addition to static sources (i.e. a database with entries), there are now dynamic sources that can generate clutter markers without explicitly knowing an app.
- Added: Dynamic clutter sources for `.UTSystemConfig` and `.EveryplayCache`.
- Improved: Accuracy of size calculation when deleting files of which some failed to be deleted (or don't exist anymore).
- Improved: Clutter database (dozen of new entries).
- Improved: Clutter database format to better cover multiple apps with the same clutter.
- Improved: Updated all of SD Maids dependencies and libraries.
- Improved: Instead of tapping out with a "busybox error", SD Maid will now relinquish root access if the current toybox/busybox setup is not root compatible (#442).
- Improved: Both busybox and toybox can be used by SD Maid and both types of binaries will be tried as fallback solution (#452).
- Improved: Reduced SD Maids resource (RAM/CPU) consumption by reducing the amount of shells that are kept open. Reading files now shares a shell with all other operations (delete, move, copy etc).
- Improved: Operation results (ok, skipped, failed) now only show values that are non zero.
- Improved: Speed of file object creation, some calls be done in a more effective order and a few memory optimizations weren't effective.
- Improved: File forensics performance, less information is (i.e. App name) is requested during research and deferred to be gathered when it is actually needed.
- Improved: Reduced memory use by reducing the footprint of the clutter matching (simpler objects).
- Improved: Ownership detection. In some cases SD Maid will now match "fixed paths" -> "variable packagenames", previousy we could only match "fixed package names" -> "variable pathes". Example: Match "/sdcard/.strawberry/eu.thedarken.sdm" without specifically having a database entry for "eu.thedarken.sdm").
- Improved: Busybox error screen shows more device infos and a better explanation.
- Improved: Logging. Reduced logging in production builds and adjusted logging priorities to be more useful (verbose vs debug).
- Fixed: Task results not showing correct amount of failed deletions.
- Fixed: "Double tap to exit" toast not being correctly themed (#438 Ty TWiStErRob).
- Fixed: Shell data not being disregarded directly if data is streamed instead of buffered. This should reduce peak memory consumption during scan for SystemCleaner, Duplicates, Biggest and Databases.
- Fixed: Commands failing that use remounting on Android 6.0+. Multiple mount commands were used to guarantee reliable execution on different devices, but on some the toybox binary segfault. This would cause any command using remounting to end up with a segfault (139) errorcode. SD Maid now checks if the toybox binary segfaults during setup.
- Fixed: A racecondition where the FAB become visible when SD Maid started executing a task triggered from list multiselection.
- Fixed: Shell operation (move/create) failing if the the target path was a symlink pointing to a read-only partition with a different path (e.g. /vendor -> /system/vendor).
- Fixed: Random crashes related to inflating the menu in each tools toolbar, possibly related to devices with hardware menu-buttons.
- Fixed: Crash related to a race-condition between UI input (e.g. clicks) and UI state.
- Fixed: Crash if SD Maid could not find any locations of type `SDCARD` but tried use the data to build sub-locations such as `PUBLIC_DATA`.
- Changed: Instead of file length, "size on filesystem" is now used to calculate the amount of space freed by a deletion. You will notice that with the exception of sparse-files, deletion will show slightly (blocksize) increased amounts of freed space, especially when deleting lots of small files.
- Changed: SD Maid now ships with toybox instead of busybox (leaner and fixes #451).
- Changed: Log files are now stored in SD Maids cache instead of files folder (i.e. `/sdcard/Android/data/eu.thedarken.sdm/cache/logfiles`).
- Changed: If root access is available, SD Maid will skip asking for storage access via the storage-access-framework (SAF).

### QuickAccess
- Fixed: Database tool still requiring confirmation despite single-pass option activated.

### Overview
- Added: If SD Maid relinquihes root access to avoid a busybox/toybox error the root state will display this (#442).
- Changed: Refresh no longer reloads the storage manager, it is now only refreshed once per session.

### Explorer
- Added: Option to place a shortcut on your home screen which open the explorer and refreshes it (#187).
- Added: Octal permission display when changing permissions.
- Added: Reporting option via context menu if you have experimental mode enabled.
- Added: Support for extracting ZIP (zip/apk etc, anything zip based) files (#198).
- Added: Details dialog, currently a bit rough, will be expanded later on.
- Added: Files now show both blocksize (size file actually occupies) and file length (size file says it is), if this value differs. The format is `size on storage (file length)`.
- Fixed: Pathbar at the top not updating correctly when switching to the Explorer from a different tool, directly loading that path (#439).
- Fixed: Creating dirs/files not updating directory content correctly without extra refresh.
- Fixed: Directory content not updating correctly after deletion.
- Fixed: Paste action causing change to parent directory.
- Fixed: Trying to remount a source as `rw` if we are only copying files.
- Fixed: When trying to create a file the operation could return an error even if it was successful.
- Changed: Don't popup a snackbar for every path change.

### Searcher
- Added: Options find files based on minimum and maximum modification date. Using these options automatically causes results to be sorted by date.

### AppControl
- Added: Right-side drawer with additional information and filtering options (#406).
- Improved: Tags for filtering (e.g. frozen apps) are no longer a search string and can be used in addition to manual search input (i.e. search in all frozen apps).
- Improved: SD Maid will check more locations now to find all items that belong to an app, this was previously limited to specific locations such as data/dalvik etc. but now covers all locations SD Maid knows.
- Improved: Files and sizes belonging to each app (estate) can now be determined on-demand.
- Improved: Speed when determining files owned by an app (estate).
- Changed: By default app files and sizes are not researched during list generation, except if the sort-mode is SIZE or the option to do the research in advance is turned on in the settings.
- Fixed: Corruption of exported APKs (#451).

### CorpseFinder
- Improved: SDcard filter scan speed. Changes to clutter information allow us to better determine when we have to search deeper and when reading the top level item is sufficient.
- Improved: Reporting tool is now more comfortable and allows adding more information.
- Changed: Reports are now posted via GitHub, which requires a free GitHub account. People that want to contribute can now do so in higher quality and get recognition for their contributions. People who kept spamming me via the old report tool with weird stories can now try again and then be banned from SD Maids GitHub repository.

### SystemCleaner
- Added: Tracking to determine how often UserFilter are actually used.
- Added: `.chartboost` and `adhub` to advertisement filter.
- Added: Help link to SD Maids wiki (#298 Ty Trasd).
- Improved: Some people create placeholders for `__chartboost` and `.chartboost` to block them from being created, these will no longer be removed.
- Fixed: UserFilter creation was possible without the pro version.
- Fixed: Size calculation for AdvertisementFilter items, should now also show children of matched directories (#471 Ty Solomon1732).

### Biggest
- Added: File previews if you have SD Maid Pro.
- Added: Support for locations requiring root access (#129).
- Added: "Device view" (#467). The tool starts out with a "device view" showing all available storages the tool can show. Changing any settings is no longer necessary.
- Improved: Refresh behavior. Previously a refresh caused the whole cached file-tree to be reloaded. Now we can just refresh subnodes of the cached file-tree.
- Changed: Made list items more compact (#346).
- Changed: The tool has been renamed to "Storage analyzer".
- Removed: Settings page (no longer necessary).

### LastModified
- Removed: This tools functionality has been merged into the searcher tool.

## SD Maid [4.2.13] - 11.07.2016
### Core
- Fixed: Settings using slider inputs not displaying correct default values.

## SD Maid [4.2.12] - 09.07.2016
### Core
- Improved: Translations. Our awesome translators have added lots of missing translations and refined existing phrases.
- Improved: Added new clutter database entries.
- Changed: Reset worker count to default (2), due to making changes on how it is stored.
- Fixed: Crash if the worker-count was set to 0 (someone was curious...).
- Fixed: Crash when changing advanced settings that require a restart and quickly exiting settings.
- Fixed: Crash due to support-library initialising the menu on a detached fragment.
- Fixed: Being able to create invalid regex exclusions that could be created but crashed SD Maid on scan.

### Explorer
- Fixed: Crash if directory could not be read, but it wasn't due to permission issues.
- Fixed: Crash if an explorer action was completing but there was not yet a directory loaded.

### SystemCleaner
- Improved: Filter for advertisement files.

### Appcleaner
- Improved: Hidden cache filter.

## SD Maid [4.2.11] - 01.07.2016
### Core
- Fixed: Hungary crashing.
- Fixed: Changing workercount not working reliably (#428 Ty jawz101).
- Improved: Display of translator names.

## SD Maid [4.2.10] - 30.06.2016
### Core
- Improved: Clutter database.
- Improved: Simplified a few strings/translations.
- Improved: Updated translations.
- Fixed: A few cases where shell error handling would not work correctly.
- Fixed: Possible crash when switching UI pages.
- Fixed: Rotation still not handling page switching correctly in every edge case.

### Explorer
- Fixed: Scrollbar not initialising correctly (#429).

## SD Maid [4.2.9] - 29.06.2016
### Core
- Added: Support for plurals (day/days, item/items) where applicable.
- Improved: Translations (specifically plurals).
- Fixed: Possibly racecondition crash on devices with physical menu buttons when they are rapidly pressed during UI changes (#341).
- Fixed: Remount of /system failing on newer CM13 builds (toybox/toolbox issue).
- Fixed: UI pages always switching back to the initial one if the UI was launched through the QuickAccess widget.

### Explorer
- Added: Option to manually specify a path to load.
- Improved: Navigation should be more consistent, instead of buttons/crumbs not reacting, SD Maid will now enter any folder and display any errors it may encounter.
- Fixed: Crash when pressung the backbutton on a cold start.
- Fixed: Crash due to trying to load "//" after navigating to the root, then reentering the Explorer again.

### QuickAccess
- Added: Summary of estimated space affected by actions to be executed (because we can't know how much it is for VACUUM per databases, it currently just adds 4KB per database) (#407).

## SD Maid [4.2.8] - 25.06.2016
### Core
- Improved: Updated translations.
- Fixed: Settings pages not opening (#424 Ty Trasd).

## SD Maid [4.2.7] - 25.06.2016
### Core
- Updated: Clutter database.
- Improved: Resiliance against weird storage setups. SD Maid will try continue even if the system API crashes while trying to determine external storages.
- Changed: The working notification is now no longer cosmetic and will elevate the service to foreground priority within the systems task killer, when the workers are done and the result is displayed, the service releases foreground mode and displays a normal notification.
- Changed: Settings layout and behavior. Removed lots of legacy code and wrote a cleaner solution that is not as fragile to support library updates.
- Fixed: Preferences not being themed correctly (#421 Ty dukelc).

### Explorer
- Fixed: Not navigating correctly between symlinked directories (#416 Ty Morpheus)

### AppControl
- Fixed: Uninstalls, freezing and disabling of broadcast receivers failing since v4.2.6 due to component names not being correctly wrapped when being passed to the packagemanager (#422 Ty Roman).

### SystemCleaner
- Changed: Filter that only work on rooted devices will now be hidden if SD Maid doesn't have root (it's cleaner and less confusing).
- Fixed: Longer filter load time due to root filter being loaded on unrooted devices.

### Scheduler
- Improved: Reliability when running in background. The working notification is now used to start the service in foreground mode, which should reduce issues with SD Maid being prematurely killed to free memory (#420).

### Widget
- Fixed: Color issues on Android N.

## SD Maid [4.2.6] - 19.06.2016
### Core
- Added: Support for "/vendor" as location within tools (affects AppControl).
- Improved: Translations.
- Improved: Logging when troubleshooting issues
- Improved: Simplified actions necessary to help me debug issues.
- Improved: Speed of executing shell commands. Any tool (basically all tools) using shell commands should be slightly faster now.
- Improved: Now building against Android N (API24).
- Improved: Several layout files have been fixed for future (correct) RTL support.
- Changed: Debugging options have been moved into a hidden page which can be reached through long presing the settings entry. This makes it easier to record debug logs if SD Maid malfunctions during setup (as entering settings already triggers a basic setup).
- Fixed: Issues handling files with unicode characters in their name (#408).
- Fixed: SD Maid accepting system busyboxes that don't work correctly (seg fault), but also return correct data (#397).
- Fixed: Overlapping switch buttons overlaying other UI elements on <5.0 (#398).

### Explorer
- Fixed: Fixed being able to select directories for the share action leading to errors (#383).

### AppControl
- Improved: Fixed impossible actions being visible.
- Fixed: List elements making a clicking sound despite not being clickable.
- Fixed: System app uninstall failing for files sourcing their apk from /vendor (#410 Ty Morpheus).

### AppCleaner
- Fixed: Private app directories not being completely searched if directory permission allow reading (or more) without root (#413 Ty rsngfrce & JERW86).

### Widget
- Improved: Handling of UI updates if multiple widgets are used.
- Fixed: All actions triggering if widget is more than one action is defined.

### Scheduler
- Improved: TimePicker will use 12/24 mode depending on system settings (#415).

## SD Maid [4.2.5] - 10.06.2016
### Core
- Improved: Updated clutter database.
- Improved: Reduced log spam on <4.3 devices due to missing functionality.
- Improved: Resilience against weird storage setups, in this case the internal storage being available multiple times (spotted on X800+, Micromax q346).
- Fixed: Crash when a system apk exists but can't be read.
- Fixed: More cases of UI raceconditions that could lead to crashes.

### AppCleaner
- Improved: Advertisement filter, added "Vungle" (Ty Brandon).

### Databases
- Changed: Collation sequence errors will now be shown as "skipped" as this is a permanent condition and distracts from actual errors.

### Scheduler
- Fixed: Cutoff layout of schedule picker on small screens (it now scrolls).

## SD Maid [4.2.4] - 04.06.2016
### Core
- Improved: Ownership detection for `/system/app` and `/system/priv-app` files that are superseeded by an updated app in userspace (prepares for future AppControl operations and Explorer enhancements).
- Improved: Translations.
- Improved: Improved exit behavior. Less UI lag when exiting SD Maid and operations have to be cancelled.
- Fixed: Navigation entry width glitching when doing a cold start of the app on tool pages where the navigation menu is opened on launch.
- Fixed: Glitchy showing and hiding of tabhostbar in details activies if there is only one item.
- Fixed: A few UI crashes in details pages when operations finished just when you were closing or opening the UI.
- Fixed: Subtitle shortly showing as "CorpseFinder" when opening details activies.
- Fixed: False positive ownership detection, if app names overlap, in `/system/priv-app`, `/system/app` and `/system`.

### AppControl
- Fixed: Failing system app uninstalls if it's apk removal was blocked through a false positive ownership match (#391 Ty Alexey).

### AppCleaner
- Added: Optional filter for files received through WhatsApp.
- Fixed: Exclusions not working completely on unrooted devices despite deactivatin the "freeStorageAndNotify" option (#401 Ty Kisl0iD).

### Biggest
- Changed: Searchpath has been reset to prepare for future support of multiple locations.

### Databases
- Fixed: Settings displaying (not using) wrong default search pathes under specific conditions.

## SD Maid [4.2.3] - 28.05.2016
### Core
- Improved: Translations.
- Improved: Added fallback options if for some reason the default private cache or files directory doesn't exist (weird crash reports from weird devices).

### CorpseFinder
- Fixed: A few cases of false positive results within filters for "/data/app", "/data/app-private", "/data/app-asec" and "/data/app-lib", if the install number appendix is bigger than a single digit (#394 Ty ew@XDA).

### AppCleaner
- Fixed: Possible crash when opening/closing the UI right after a deletion.

### Scheduler
- Fixed: Scheduler ward being disabled when it shouldn't be. The scheduler ward cares for the scheduler alarm and reinstates it if necessary. For battery improvements this component is enabled/disabled if not necessary, but its state was falsely tied to the existence of the alarm instead of the setting that tells us whether it should be turned on. 

## SD Maid [4.2.2] - 24.05.2016
### Core
- Added: Launch screen.
- Added: A hidden debug menu :).
- Improved: Translations.
- Improved: Clutter database.
- Improved: Improved overall scan speed by reducing time it takes to match clutter markers (skip internal test data, require simple match before regex match).
- Removed: No longer needed logging statements.
- Fixed: A couple of rare UI related racecondition crashes (i.e. opening closing the ui with tasks finishing simultaneously). 

### AppControl
- Fixed: Crash when exiting app details after uninstalling app on Android <4.1.2.

### CorpseFinder
- Improved: Scan speed of SDCARD filter.

### AppCleaner
- Improved: Hidden cache database.
- Improved: Bug reporting database.
- Improved: Scan performance durching search and sort (2nd phase).

### Biggest
- Fixed: Parent size calculation if a child is deleted.
- Fixed: Deleted item reappearing if a directory is reentered.

### Scheduler
- Added: Automatic scheduler check when launching SD Maid.
- Improved: Accuracy of seconds countdown.
- Improved: Reduced resource use, we no longer need to check the countdown daily.
- Changed: Rewrote implementation and use of the AlarmManager service in an attempt to fix the unreliability I could not reproduce.

### Statistics
- Improved: Space usage, better truncating of data, preemptively throw away old data if new data will exceed the truncate threshold.
- Improved: Handling of error situations such as inaccessible databases or full disks (should crash less often).

## SD Maid [4.2.1] - 12.05.2016
### Core
- Updated: Translations.
- Improved: Detection of dalvik-cache locations, previously the SDK level was used, now we check for actual existence.
- Improved: Storage detection for devices that return non-absolute pathes from API calls for external storage (likely due to user modifications, e.g. XInternalSD). Pathes are now checked for absoluteness and SD Maid should now either not crash at all or continue gracefully.
- Fixed: Crash when resuming SD Maid after being purged from memory and the last page open was a details page.).
- Fixed: Navigation entries showing extra highlights when being clicked.

### Explorer
- Fixed: Crash if the current path the explorer tried to open is invalid (e.g. not absolute).

### CorpseFinder
- Fixed: Crash within the DalvikCache filter if a device has files both in `/cache/dalvik-cache` and `/data/dalvik-cache`.

### SystemCleaner
- Improved: Scan performance by reducing overhead of matching against file pathes.
- Fixed: Filter-modules not loading and filter configuration being empty (#387 Ty igoivo).
- Fixed: Crash when creating a UserFilter and entering a minimum or maximum size > Long.MAX_VALUE.

### AppCleaner
- Fixed: Crash if caches were found via clutter database entries and there was more than one entry matching the same file/directory (#388).
- Fixed: Non-Root routines being used even if root is not available.

## SD Maid [4.2.0] - 11.05.2016
### Core
- Added: User interface for adding and testing regular expression based exclusions.
- Improved: Translations.
- Improved: Workaround for KingoRoot should now be automatically applied (setting has been removed).
- Improved: Details entries should no longer cutoff pathes, independent of their length.
- Improved: Setup layouts are now scrollable to allow viewing full content on small devices with large fonts (#368).
- Improved: Reduced peak memory consumption by making a few core objects easier to be garbage collected.
- Improved: Setup help menu is now available on all setup steps and directly open the setup help page now.
- Improved: Slightly changed timing when the UI is initialised to reduce/fix a few random crashes.
- Improved: Detection of localized private data folders on Andriod N.
- Improved: Feedback on task results, previously the summary details were only visible in progress bars or the menus, now (if applicable) a snackbar temporarily shows the primary result message.
- Improved: Task description in confirmations and dialogs.
- Fixed: During secondary storage setup, storage entry not turning green despite success, on low memory devices.
- Fixed: Secondary storage detection on MediaTek devices. Added a workaround that detects this the swapped storage situation and fakes the primary UUID (#312 Ty bgiesing).
- Removed: Update databases option in advanced settings. Will be replaced with a better mechanism in a future update.

### Overview
- Added: Info how much space is left until the storage is considered full.
- Changed: The icon color of storage entries will now change according to system behavior. Red meaning the system considers the storage full, orange meaning the system considers the storage low on space and restrictions apply (e.g. not being able to install new apps).

### Explorer
- Added: Option to enable/disable research of items that match an AppCleaner filter.
- Added: Option to enable/disable research of items that match a SystemCleaner filter.
- Added: Icon that shows whether an item matches a SystemCleaner filter.
- Improved: Adjusted entries such that entry layouts expand for very long filenames.
- Fixed: "Save directory structure" and "Force MediaScan" only being visible if >1 items are selected.

### Searcher
- Added: Delete action for selected items.
- Added: Option to turn off automatic wildscards to allow searching for exact matches.

### AppControl
- Added: List of app permissions to app details.
- Added: Paths in app details are now clickable. Clicking a path opens it in the Explorer.
- Fixed: Crash when checking the state of a component that is for some reason UNKNOWN, we will return it as disabled now.
- Changed: Removed circle cropping from app icons.

### CorpseFinder
- Fixed: Size being incorrectly determined (too low) for items from the sdcard filter (#369).
- Fixed: Setting for public and private data being switched.
- Changed: Feedback during SDCARD scan now shows a % done feedback but no longer the current item being scanned, was missleading and inconsistent with other filters.

### SystemCleaner
- Added: Added new filter category "other" for more specific use cases.
- Added: Filter for LeakCanary files.
- Added: UI feedback when importing or exporting user filter.
- Added: UI elements to specify regex entries for user filters.
- Added: UI elements to specify locations for user filters.
- Added: UI elements to specify a minimum and maximum size for user filters.
- Added: Filter for apks in /Download which have a versionCode less or equal than the already installed version.
- Improved: Filter colors to better reflected their risk.
- Changed: Scan now show amount of filtered files so far instead of the last filtered file.
- Fixed: Layout cutting off filter descriptions early.
- Fixed: Locations data not being persisted after trying to edit an imported file.
- Fixed: Possible inconsistencies when importing/exporting user filters or trying to overwrite existing filters (missnamed JSON fields).

### AppCleaner
- Added: New UI window that allows configuration of filter modules which determine whether an item is expendable.
- Added: Filter module for default caches.
- Added: Filter module for hidden caches.
- Added: Filter module for webview caches.
- Added: Filter module for bug report files, currently Fabric(by default off).
- Added: Filter module for analytics related files, currently Fabric & Flurry (by default off).
- Added: Filter module for WhatsApp Sent files (by default off).
- Added: Filter module for advertisement files, currently Mologiq (by default off).
- Added: Setting to enable/disable using 'freeStorageAndNotify'.
- Improved: Detection of hidden caches with name variations of the default folder name.
- Improved: Detection of hidden caches nested in /files/.
- Improved: Updated cache database (Samsung gallery temp files).
- Improved: Made progress feedback a little more detailed.
- Improved: Speed of the initial searchpath building step. It should now be faster by a factor of ~10x (caching some resources that were previous looked up on demand).
- Improved: Speed of the file search and filtering step. Fixing a few badly written routines (nobody is perfect) made the whole thing ~2x faster on my test device.
- Improved: Peak memory consumption during scan. A few objects can be released earlier from memory now which should help against out of memory crashes on low end devices.
- Fixed: Not cleaning private caches on unrooted device if the action was triggered through the FAB instead of the toolbar (Ty Steffen).

### Duplicates
- Fixed: Crash when autoselecting from a filtered list (#367).
- Fixed: Crash when a stale item was attempted to be selected.

### Databases
- Added: If there is an issue, more information is available in the databases details window.

### QuickAccess
- Changed: Global action button now says "run now", instead of "delete".

## SD Maid [4.1.6] - 12.04.2016 (RC)
### Core
- Improved: Translations.
- Fixed: Memory leak on device rotation.

## SD Maid [4.1.5] - 11.04.2016 (RC)
### Core
- Fixed: A few occasional RecyclerView crashes.
- Fixed: Startup crash on some MediaTek based devices (#361).
- Improved: Clutter database.
- Improved: On some custom ROMs SD Maids own cache folders was not created, SD Maid will check that now and try to create it.
- Improved: When a modded ROM is missing string resources for storage labels SD Maid will now gracefully deals with that instead of crash.
- Improved: When displaying previews, basic fallback icons for filetypes are now higher resolution and scaled to target.
- Changed: The user interface elements will now unsubscribe from workers in onPause instead of onViewDestroyed.
- Changed: The way events that happen on rotation or while the main UI was paused are cached and replayed.

### Explorer
- Improved: Pathdumps now follow symlinks (#364).
- Fixed: Crash when quickly scrolling lists with several hundred entries (bitmap recycling issue).

### AppControl:
- Added: Information about who installed an app (e.g. Google Play).
- Fixed: Crash when trying to toggle receivers for apps that have been uninstalled.

### SystemCleaner
- Fixed: Crash if a device has no public storage.

### AppCleaner
- Changed: Removed circle cropping from app icons.

### Duplicates
- Fixed: Wrong item count in confirmation message when deleting from details.

### Biggest
- Fixed: Possible crash if storage situation changed while SD Maid was traversing file structures.
- Changed: Reduced list item height 72dp to 56dp (#346).

### Databases
- Changed: Removed circle cropping from app icons.

### Scheduler
- Fixed: A crash when using choosing a recurrence through the seekbar (#339).
- Changed: Max recurrence is now 14 days.

## SD Maid [4.1.4] - 06.04.2016 (RC)
### Core
- Added: If you accidentally disabled system apps required for storage access, SD Maid will now warn you (e.g. Package Disabler apps for Samsung).
- Improved: Secondary storage setup now tries to display the same name the documents activity also display for its storage entries.
- Improved: Busybox setup, as fallback option "/system/bin/busybox will" now also be checked (#355).
- Improved: Logging regarding matches exclusions.
- Improved: Stage0 busybox setup, try loading version first then do further tests.
- Fixed: Option "Don't show again" during setup of secondary storage, previously you had to toggle it on/off/on for it to stick (#356).
- Fixed: Duplicate test for the same busybox applet.
- Fixed: During secondary storage setup, exiting the "Documents" app without selecting something (e.g. if it's empty) now counts as failure and makes the "Don't show again" option visible (#352).
- Fixed: Occasional crash when exiting SD Maid during setup initialisation.

### Explorer
- Fixed: Floating Action Button not being clickable on <Android4.3 (#357).
- Fixed: Share file option not being visible.

### AppControl
- Fixed: Occasional crash when quickly entering or leaving app details (e.g. when uninstalling an app).

### Databases
- Added: Database entries now show if they have been skipped or failed (#353).
- Added: Default exclusion for AquaMail (org.kman.AquaMail) (#354).
- Improved: Scan performance by skipping too small files early on (#344).
- Fixed: Check database existence right before any sqlite3 action to prevent accidental creation of a new database (#354).

## SD Maid [4.1.3] - 04.04.2016 (RC)
### Core
- Improved: Handling of invalid and or corrupt filenames.
- Improved: Clutter database.
- Fixed: Crash caused by invalid filenames.
- Fixed: Various small crashs, mostly racecondition cases where SD Maid was quickly closed or opened when doing something.

### AppControl
- Improved: Handling and feedback when exporting APKs fails.
- Fixed: SD Maid not directly updating an app's enabled/disabled state on some ROMs.

## SD Maid [4.1.2] - 03.04.2016 (RC)
### Core
- Added: Another easteregg.
- Added: Animation to the overflow menu during storage access framework setup.
- Added: Link to help website from overflow menu during setup.
- Improved: Code around setup, some more defensive checks so we don't crash but gracefully deal with it.
- Improved: General error messages should now also show in the tools page via SnackBar.
- Improved: Log output for debugging.
- Improved: Translations.
- Improved: Various rare crashs that only a few persons experienced.
- Improved: Support for keyboard based navigation.
- Changed: Animation handling to fix possible crash on app resume.

### Overview
- Fixed: Should no longer crash if sqlite binary setup failed.

### SystemCleaner
- Improved: Excluded app default "files" and "cache" directories from empty directory filter as these are automatically recreated.

### Databases
- Added: Default exclusion for Google Photos (doesn't play nice with SQL VACUUM).
- Fixed: If no SQL binary is available, we exit with an error instead of crashing.

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
