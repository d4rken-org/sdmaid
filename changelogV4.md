## SD Maid [v4.15.15](https://github.com/d4rken/sdmaid-public/milestone/125?closed=1) 23.08.2020
### Core
- Improved: Clutter database.

### CorpseFinder
- Fixed: False positive results for `/data/app` and `/data/dalvik-cache` on rooted Android 11 devices (#3930).

## SD Maid [v4.15.14](https://github.com/d4rken/sdmaid-public/milestone/124?closed=1) 23.08.2020
### Core
- Improved: Clutter database (TY @programmist87).
- Improved: Translations.
- Fixed: Crash on ROMs with abnormal wakelock behavior that could lead to a crash.
- Fixed: Potential crash on MIUI ROMs (#3668).
- Fixed: SDCard detection on Huawei AppGallery builds (`v4.##.##h`).

### CorpseFinder
- Fixed: Exclusions on nested files (i.e. on child `corpse/parent/child`), not working due to the parent folder not being excluded too (#3654).

### Searcher
- Fixed: Potential fix for swipe input not working correctly in the search input field (#3699).

### AppCleaner
- Added: Vivio device specific support (#3670).
- Improved: Hidden caches, bug reporting and advertisement filters (#3809, #3756)(TY @programmist87).
- Improved: Debugging support for the accessibility service to make it easier to improve support.
- Improved: Support for ColorOS on Android 10 (#3666).
- Fixed: Added workaround for some ROMs where the accessibility service could crash because SD Maid was not correctly initialized by the system.

## SD Maid [v4.15.13](https://github.com/d4rken/sdmaid-public/milestone/122?closed=1) 10.07.2020
### Core
- Improved: Translations.
- Improved: Clutter database.
- Fixed: Crash if 3rd party apps launched a random SD Maid activity.

### AppCleaner
- Improved: Hidden caches filter.
- Improved: Advertisement files filter.
- Improved: Trash files filter.
- Improved: Offline files filter.
- Improved: Logging to easier debug future ACS related issues (#3578).
- Fixed: ACS matching on Meizu (flyme) devices (#3273).
- Fixed: ACS matching should no longer fails on devices running custom ROMs (i.e. MIUI device with LOS) (#3652).
- Fixed: ACS matching on MIUI 12.
- Fixed: ACS matching on Alcatel devices Running Android 10.
- Fixed: ACS matching on ColorOS ROMs based on Android P.

## SD Maid [v4.15.12](https://github.com/d4rken/sdmaid-public/milestone/121?closed=1) 07.06.2020
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: IAP related debug output.
- Fixed: Crash on rotation within the clutter reporting screen.
- Fixed: Donate options crashing on Huawei builds due to missing GPLay services.
- Fixed: Crash on custom ROMs with GPlay service stubs.

### QuickAccess
- Improved: Fixed summary info text on the bottom button bar being cut off when using larger fonts (#3560).

### AppControl
- Fixed: Overflow menu being non-responsive after returning from a subscreen and clearing the search field (#3477).

### AppCleaner
- Improved: Filter for hidden-caches and bugreporting related files (#3570).
- Improved: ACS based cache deletion on Huawei and LGE devices (locales `en` and `ru`) (#3577,#3576).

## SD Maid [v4.15.11](~) 14.05.2020
### Core
- Fixed: Crash when trying to switch pages in SD Maid.

## SD Maid [v4.15.10](https://github.com/d4rken/sdmaid-public/milestone/120?closed=1) 13.05.2020
### Core
- Improved: Lot's of ClutterDB updates (Thx @programmist87)!
- Improved: Translations.
- Improved: Internal build changes to allow building a separate version that can be published on the Huawei App Gallery.

### Explorer
- Fixed: Color for "common" corpses not matching the documentation (#3479).

### AppCleaner
- Improved: Hidden caches filter.
- Improved: Bug reporting filter.

### QuickAccess
- Improved: Tweaked display of total size (#3441).

## SD Maid [v4.15.9](https://github.com/d4rken/sdmaid-public/milestone/119?closed=1) 18.04.2020
### Core
- Improved: ClutterDB.
- Improved: Translations.
- Improved: Internal dependency updates.
- Improved: Upgrade check related to IAPs.

### CorpseFinder
- Added: Matching for malware related files (`com.mufc.*`).

### AppCleaner
- Improved: Trashbin folder, added Meizu gallery (#3366).
- Improved: Added eStrongs Explorer related files  to hidden caches filter (#3341).
- Improved: Moved `UnityCache` matching to the games files filter.
- Improved: Adjusted debug output, a little bit, more a little bit less, just right :).
- Improved: ACS based cache cleaning on EMUI10 (`it`) and Android Go 8.1 (`ru`) (#3424,#3425).
- Improved: ACS based cache cleaning on MIUI, in debug scenarios, disarming SD Maid should now not cause SD Maid to get stuck.
- Improved: ACS based cache cleaning on Meizu devices.
- Improved: Added hardexclusion for `com.eltechs.ed` from the scan due to huge scan slow down (hundreds of thousands of files) (#3387).
- Fixed: Manufactor matching for "Meizu" devices.
- Fixed: Hidden caches filter containg `.trash`, moved to the trash filter (#3404).

### Databases
- Improved: Excluded Evernote DB from optimization due to issues (exclusion can be manually removed).

## SD Maid [v4.15.8](https://github.com/d4rken/sdmaid-public/milestone/118?closed=1) 09.03.2020
### Core
- Fixed: Crash on Android 4.4 (#3340).

## SD Maid [v4.15.7](https://github.com/d4rken/sdmaid-public/milestone/117?closed=1) 01.03.2020
### Core
- Improved: ClutterDB.
- Improved: Translations.
- Improved: Internal dependency updates.
- Changed: Relaxed the criteria when checking for a functional mount-applet on Android 8 to increase compatibility (#3325).
- Fixed: Crash when trying to report clutter and pausing/resuming the screen.
- Fixed: Storage permission not being grantable during setup on small screens (#3287).

### AppControl
- Fixed: Activity shortcuts overwriting each other in some cases (#3304).

### AppCleaner
- Improved: Hidden caches filter.

## SD Maid [v4.15.6](https://github.com/d4rken/sdmaid-public/milestone/116?closed=1) 27.01.2020
### Core
- Improved: ClutterDB.
- Improved: Translations.
- Fixed: Github error when reporting bugs via SD Maid.

### AppCleaner
- Added: ACS support for Meizu (Flyme ROM) devices.
- Improved: Improved file naming.
- Improved: ACS matching on ColorOS.

## SD Maid [v4.15.5](https://github.com/d4rken/sdmaid-public/milestone/115?closed=1) 03.01.2020
### Core
- Improved: ClutterDB.
- Improved: Translations.
- Improved: Clutter reporter UI.

### Explorer
- Added: Media store pruning. SD Maid will check and remove any stale references to the file/folder within Android's media store database. On by default, can be disabled via settings (#3010).

### AppCleaner
- Added: ACS support for ColorOS 3.2.
- Added: Unity analytics to the analytics filter (#3181).
- Improved: ACS matching for `ru` on API29 (AOSP).
- Improved: ACS matching for `zh` (traditional) API28 (AOSP).
- Improved: Better handling of situations where the system is still calculating app sizes. SD Maid will now back off and retry with incrasing delay.

### Scheduler
- Fixed: Execution being skipped if checking for SD Maid Pro takes too long (#3210).

## SD Maid [v4.15.4](https://github.com/d4rken/sdmaid-public/milestone/114?closed=1) 13.12.2019
### Core
- Improved: Clutter database.
- Fixed: Not being able to press send when manually entering the access key from apps.darken.eu.
- Fixed: Crash when entering general settings due to an unknown locale code being encountered while loading language related data.

## SD Maid [v4.15.3](https://github.com/d4rken/sdmaid-public/milestone/113?closed=1) 09.12.2019
### Core
- Improved: Clutter database.

### AppCleaner
- Improved: Advertisements filter.

## SD Maid [v4.15.2](https://github.com/d4rken/sdmaid-public/milestone/112?closed=1) 02.12.2019
### Core
- Improved: Clutter database.
- Improved: Translations.
- Fixed: UI Crash on various screens affecting some users.
- Fixed: Possible crash when visiting the general settings page.

### AppControl
- Added: Support for exporting apps with split APKs (#2876).

## SD Maid [v4.15.1](https://github.com/d4rken/sdmaid-public/milestone/111?closed=1) 01.12.2019
### Core
- Improved: Clutter database.
- Improved: Setup layout. Permission setup should now longer awkwardly cut the text into the next line.
- Improved: Upgrade dialog, additional information about Google Play Family Library.
- Changed: The option to manually show the "Upgrade to Pro" from debug menu to general settings.
- Removed: Some bug tracking towards Google Play services related issues that is no longer necessary.
- Fixed: Crash when opening the upgrade window.
- Fixed: Crash when opening settings details and rotating the device.

### Overview
- Removed: SELinux Status on Android 6.0+ due to being unreliable without triggering root checks everytime (#2298).

### AppControl
- Fixed: Crash when viewing details and configuration changes (e.g. device rotation) happen.

### AppCleaner
- Added: ACS based cache deletion support for MIUI v11+.
- Improved: Added workaround for apps with large caches on slow devices. Previously, if the system's details screen for an app was displaying "Calculating sizes...", SD Maid could treat this as successful deletion as there is also an edge case where the system tells SD Maid there is cache, but the "Clear cache" button is disabled as there isn't actually any cache (see #2517). Now SD Maid will backtrack and scan the UI hierarchy from a few levels up again and if all buttons are disabled, wait a bit, then try again (#3121).
- Improved: ACS based cache deletion on Samsung OneUI 1.1 for Dutch.
- Improved: ACS based cache deletion, faster UI crawling, better error handling.
- Improved: Bug reporting filter (#3116).

## SD Maid [v4.15.0](https://github.com/d4rken/sdmaid-public/milestone/110?closed=1) 22.11.2019
### Core
- Added: Support for upgrading to SD Maid Pro via in-app purchase.
- Improved: Translations.
- Improved: Clutter database.
- Improved: UI and core logic related to upgrading to SD Maid Pro, better error handling.
- Improved: Internal dependency updates to data serialization and bug tracking.
- Improved: Slightly better app start performance due to better navigation related code. 
- Fixed: SD Maid not recognizing the unlocker until reboot in some cases.
- Fixed: Work around for ROM bug on some Samsung Galaxy/Note 8 custom ROMs if on Android 9 or lower. Caused a crash when loading data about installed apps via `PackageManager.getSharedLibraries(...)` (#3100).
- Fixed: Debug logs not containing the install ID.
- Changed: Hidden the hide unlocker behavior on Android 10 due to no longer being possible (#2972).

### Explorer
- Improved: Now displaying more size digits, but only showing both allocated and actual file size if the difference is larger than 5% or the file size is smaller than 4096 byte (#3112).

### AppControl
- Added: Filter option for library packages (#3104).
- Improved: No longer showing "Go to Google Play" or "Show System Settings" buttons in app details, if unavailable (e.g. for library packages) (#3104).
- Improved: Details such as install/update date are now hidden if unavailable for specific package type (e.g. instant/library types).

### SystemCleaner
- Added: Added option to toggle custom filter sorting between last modification date and name (#2772).
- Added: Custom filters without description text will display their last modification date.
- Changed: Custom filters are now sorted by date by default (#2772).

### AppCleaner
- Improved: ACS based cache deletion on Realme ROMs (#3040).
- Improved: ACS based cache deletion on AOSP ROMs for `zh-TW`.
- Improved: ACS based cache deletion on Samsung (Android 9) ROMs for `zh-TW-hanT`.
- Improved: ACS based cache deletion on Huawei (Android 10) ROMs for `de_DE`.

### Statistics
- Fixed: Overlapping chart text (#1187).

## SD Maid [v4.14.39](https://github.com/d4rken/sdmaid-public/milestone/109?closed=1) 31.10.2019
### Core
- Improved: Updated internal dependencies (fixes a couple of rare issues).
- Improved: Clutter database.
- Improved: Translations.
- Fixed: Coffee drinking animation causing a crash one some devices.
- Fixed: Improved unlocker checking, potentially fixing an issue where SD Maid wouldn't recognize the unlocker until reboot.

### AppCleaner
- Added: Initial support for ACS based cache deletion on Realme ROMs.
- Improved: ACS based cache deletion on Samsung OneUI 1.0/2.0.
- Improved: Improved bug reporting files filter (#3042).
- Improved: ACS based cache deletion will now try older (API) matching variants, i.e. if you have Android 10 but there is no specific language definition, it will try the definitions from Android 4.1 to 9.

## SD Maid [v4.14.38](https://github.com/d4rken/sdmaid-public/milestone/108?closed=1) 09.10.2019
### Core
- Added: Support for detecting installed library packages.
- Improved: Clutter database.
- Fixed: Fixed various instances of UI code where some context options were shown despite this not being supported for the currently selected entries.

### AppControl
- Improved: Small UI improvements to hide UI elements that are not supported for the current package type (necessary due to now also showing system library packages).

### CorpseFinder
- Improved: Reverted previous fix for `trichromelibrary` in favor of dynamic matching against installed library packages.

### Statistics
- Fixed: A few possible crashes when leaving the screen.

## SD Maid [v4.14.37](https://github.com/d4rken/sdmaid-public/milestone/107?closed=1) 08.10.2019
### Core
- Improved: Clutter database.

### CorpseFinder
- Fixed: False positive matching `trichromelibrary` on rooted Android 10 devices (#2987).

### SystemCleaner
- Fixed: Crashing when importing an invalid user filter instead of just showing an error.

### Statistics
- Fixed: Crash on entering task result details.

## SD Maid [v4.14.36](https://github.com/d4rken/sdmaid-public/milestone/106?closed=1) 03.10.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Animation performance.
- Improved: Updated internal dependencies.
- Fixed: Crash/failure during applet setup. If the default test (unrooted) for the mount applet failed SD Maid would either crash or not try any fallback options.

### AppCleaner
- Improved: Hidden caches and bug reporting filter.
- Improved: ACS based cache deletion support on Android 9 and 10, added locales et,ro,hr,bn,lv (#2979,#2978).
- Fixed: ACS based deletion for Serbian.

### StorageAnalyzer
- Fixed: Refreshing on existing data resetting item sizes to -1 (#2964).
- Fixed: Crash on refreshing data that contains symbolic links. No longer following symbolic links.

## SD Maid [v4.14.35](https://github.com/d4rken/sdmaid-public/milestone/105?closed=1) 19.09.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Fixed: A couple of cases where SD Maid would crash if the device unexpectedly does not have certain Activities/Apps.

### Explorer
- Fixed: Possible crash when extracting archives and permissions are missing.

### AppCleaner
- Improved: Support for ACS (accessibility) based cache clearing on Android 10. Language support should have parity with previous Android versions.

## SD Maid [v4.14.34](https://github.com/d4rken/sdmaid-public/milestone/104?closed=1) 13.09.2019
### Core
- Improved: Clutter database.
- Improved: Debug output.

### AppCleaner
- Added: Initial Android 10 support for ACS based cache cleaning.

## SD Maid [v4.14.33](https://github.com/d4rken/sdmaid-public/milestone/103?closed=1) 01.09.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Fixed: Applet setup preventing root access on Android Q/10. System-less root related changes caused SD Maid's mount applet test to fail the root test (#2903).
- Fixed: Possible issue when starting a debug recording that could cause some modules to not react to the debug mode change.

### AppCleaner
- Improved: Added ACS based deletion support for Norwegian.
- Improved: Hidden cache deletion (#2849, #2842).

# Storage Analyzer
- Fixed: Crash when trying to browse symlinks (removed symlinks) (#2901).

## SD Maid [v4.14.32](https://github.com/d4rken/sdmaid-public/milestone/102?closed=1) 07.08.2019 
### Core
- Improved: Translations.
- Improved: Clutter database.

### StorageAnalyzer
- Fixed: Long "sorting" duration. The calculation for sorting were done on the whole tree, now they are scoped correctly. I've also added a small caching mechanism that should make browsing a little bit faster.

## SD Maid [v4.14.31](https://github.com/d4rken/sdmaid-public/milestone/101?closed=1) 29.07.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Added an additional trigger for the unlocker check to fix a few cases where SD Maid was not notified of the unlocker install and would have to be restarted to notice it.

### Explorer
- Fixed: Navigation menu not dismissing when launching via shortcut.

### AppControl
- Fixed: Navigation menu not dismissing when launching via shortcut.

### AppCleaner
- Improved: ACS based deletion support (on AOSP or similar ROMs) for Serbian, Italian, Thai, Malay, Finnish, Arabic and Hebrew (#2847).
- Improved: Filter for bugreporting related files.

## SD Maid [v4.14.30](https://github.com/d4rken/sdmaid-public/milestone/100?closed=1) 19.07.2019
### Core
- Improved: Clutter database.
- Improved: Error logging.
- Improved: When debugging the accessibility service you can now long press it to change it's position.
- Fixed: A possibly UI crash when canceling the setup by going backwards.
- Fixed: UI crash during setup, when granting usage stats permission, on Huawei devices @ Android 8/9
- Fixed: Debug log hanging the UI at the end due to file being compressed on the wrong thread.

### Explorer
- Improved: When which icons will be displayed. This basically removes a few cases of multiple icons being cycled through if it is not actually any information to the user. In Detail: Icons for owners flagged as `CUSTODIAN` (e.g. "Android" for all default dirs on AOSP such as `Download/`) will only be shown when there is no other "normal" owner for that item (#2816).

### AppCleaner
- Improved: ACS based deletion on MIUI ROMs, additional locales (#2816).
- Improved: Added tracking for ACS failures due to missing locale support to find out if there are languages that need support but no one has spoken up yet.

## SD Maid [v4.14.29](https://github.com/d4rken/sdmaid-public/milestone/99?closed=1) 15.07.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: A few types of errors with low impact will no longer crash SD Maid but instead just be silently logged.

### SystemCleaner
- Fixed: False positives within the empty directory filter due a bug introduced with the support for nested empty directories in v4.14.28.

### AppCleaner
- Improved: Advertisement filter.
- Improved: Small improvements to ACS based deletion speed.
- Improved: Better support for cache deletion via ACS on MIUI ROMs. Support for 38! additional locales (Thanks Jeff!) (#2802).

## SD Maid [v4.14.28](https://github.com/d4rken/sdmaid-public/milestone/98?closed=1) 12.07.2019
### Core
- Improved: Clutter database.
- Improved: Translations.
- Fixed: QuickAccess sometimes displaying "Requires SD Maid Pro" although SD Maid was already upgraded to `Pro` (#2781).
- Fixed: Incorrectly displayed (warped) progressbar (#2771).

### SystemCleaner
- Improved: Filter UI, added scrollers (#2246).
- Improved: Empty directories filter, support for nested empty directories. SD Maid will do recursive passes on directories that are readable through the JAVA File api (that don't require root or the SAF). If the directory contains ONLY other directories, and all directories are readable (no surpises) and no exclusions are matched, then the whole nested directory tree will be considered empty (#201).

### AppCleaner
- Added: ACS based deletion support for MIUI ROMs (tested on v10.x). Currently only supports `en_*` locales, if you want support for your locale, make a ticket ;). Huge shoutout to Jeff who helped me debug this (#2783).
- Improved: Support for ACS based deletion on Italian ROMs (#2780).

## SD Maid v4.14.27 03.07.2019
### Core
- Fixed: Crash on start due to code (related to shortcuts) being initialized that isn't available on Android versions older than 7.1.

## SD Maid [v4.14.26](https://github.com/d4rken/sdmaid-public/milestone/97?closed=1) 03.07.2019
### Core
- Fixed: Multiple possible crashes when going through the setup flow that were all related to weird situations when resuming the UI (not all ROMs behaved as expected ಠ_ಠ Huawei).
- Fixed: Potential crash fix for a few Android 5.X to 6.X ROMs related to trying to use newer APIs.

### Explorer
- Fixed: Crash on a few Android 7.0 ROMs related to using the clipboard.
- Fixed: Crash when failing to extract an archive and SD Maid was unable to obtain any archive path to display in the error message.
- Fixed: Crash when using the backbutton before the UI data was loaded.

### AppCleaner
- Added: Support for Slovak (`sl_*`) to ACS based deletion.

### StorageAnalyzer
- Fixed: Crash when the UI tried to update while items were being removed (likely a pause/resume interaction).

## SD Maid [v4.14.25](https://github.com/d4rken/sdmaid-public/milestone/96?closed=1) 01.07.2019
### Core
- Improved: Clutter database.
- Improved: Updated translations.
- Fixed: Adaptive icon not working on Android 8+.
- Fixed: Donation icon showing in all settings toolbars (#2749).

## SD Maid [v4.14.24](https://github.com/d4rken/sdmaid-public/milestone/95?closed=1) 24.06.2019
### Core
- Added: Round icon for Android 7.1 devices (#2705).
- Improved: Clutter database.
- Improved: Lists with search views now collapse the keyboard when selecting list items.
- Improved: Optimized internal images to reduce app size a bit.
- Fixed: On Android TV, if we can't open the system's screen for usage stats permission directly, the general app settings screen will be shown (#2559).
- Fixed: Selected list items should no longer be unselected when filtering the list with a search phrase and rotating the device.
- Changed: The donation button within the navigation header will only show after a certain amount of time passed / app used.
- Changed: If either type of donation is bought, the button in the navigation header will no longer be displayed. Users who want to purchase additional donations (<3 ty) can do so from within the settings menu, the toolbar has a permanent donation button.

### CorpseFinder
- Fixed: Root only settings being clickable after resetting the CorpseFinder settings (#2697).

### SystemCleaner
- Improved: .log file should no longer show duplicate results due to overlap between private and public storage (#961).
- Improved: Added restrictions to exclude certain .log files that could cause issues when deleted (e.g. indexdb).

### Duplicates
- Improved: To prevent issues with performance and checksuming very small files, there is now an enforced minimum size of 1024B (#2737).
- Fixed: Internal selection not being cleared when the multiselection action mode is finished (#2512).

## SD Maid [v4.14.23](https://github.com/d4rken/sdmaid-public/milestone/94?closed=1) 16.06.2019
### Core
- Improved: Clutter database.

### CorpseFinder
- Fixed: UninstallWatcher displaying a notification even if no corpses related to the uninstalled apps were found (#2708).

### AppCleaner
- Improved: ACS based deletion on Nokia ROMs (#2695).

## SD Maid [v4.14.22](https://github.com/d4rken/sdmaid-public/milestone/93?closed=1) 10.06.2019
### Core
- Improved: Clutter database.
- Improved: Debugging output, more infos about device and app locales.
- Fixed: Potential crash during primary storage setup on Android 6.X.

### AppCleaner
- Improved: ACS based deletion on vietnamese ROMs.
- Changed: I've removed an internal minimum cache size for unrooted devices. While there is a public minimum cache size setting, there was also an internal minimum that was only in effect when the AppCleaner ran without root. The limit ranged from 12KB to 48KB, depending on your Android version. It's purpose was to exclude apps whose cache only consists of empty default folders (e.g. `files` or `cache`) that are (re)created by the system. Without a limit you'd always have results with apps having a few KBs of cache. I don't recommend setting the limit to 0KB, nonetheless if you want to, it now works as expected without root.
- Changed: To account for above mentioned changes I've raised the default minimum cache size in the settings to 48KB.

## SD Maid [v4.14.21](https://github.com/d4rken/sdmaid-public/milestone/92?closed=1) 09.06.2019
### Core
- Improved: Clutter database.
- Fixed: Potential crash if SD Maid is put into the background for longer durations during the setup steps.

### CorpseFinder
- Improved: Matching of ownership on default folders (e.g. `Android/data`). Uninstall watcher should now suggest default folders for deletion if left behind on uninstall (#2672).
- Fixed: UninstallWatcher on Android Q. Android Q blocks popups from background. I replaced the popup with an interactive notification (#2672).

### AppCleaner
- Improved: ACS based cache deletion on french ROMs.
- Fixed: Matching did not work when SD Maid's option to enforce language is used and differs from the system language (#2407).

## SD Maid [v4.14.20](https://github.com/d4rken/sdmaid-public/milestone/91?closed=1) 07.06.2019
### Core
- Improved: Clutter database.
- Improved: Added direct github link to the issue reporting screen (#2301).
- Fixed: Possible crash when pausing and resuming SD Maid at various moments, e.g. during setup or when switching between main screens.
- Fixed: Secondary storage not being initialized correctly when SD Maids setup is launched by any other means than starting a scan task (#2634).
- Fixed: Language switcher not working correctly on some ROMs (#2669).

### AppCleaner
- Improved: Recycle bins filter, added the OnePlus gallery recyclebin (#2660).
- Improved: ACS based deletion on Android Q. Incompatible apps are now skipped automatically instead of stalling the routine until timeout (#2659).
- Improved: Querying for hidden caches should now return more accurate sizes when scanning again directly after deletion.

## SD Maid [v4.14.19](https://github.com/d4rken/sdmaid-public/milestone/90?closed=1) 05.06.2019
### Core
- Improved: Updated clutter db.
- Improved: Added dynamic clutter matching for `.backups` (Helpshift SDK related files).
- Added: Debug option to remove apps.darken.eu accounts without wiping SD Maid's data (#2637).
- Fixed: Crash when opening detail subscreens (e.g. AppControl -> App or AppCleaner -> Details), then leaving SD Maid, getting into a low memory situation and returning to SD Maid.

### AppCleaner
- Improved: ACS based cleaning should now work on Android Q (at least the english locales).
- Improved: Filter for advertising related files, added a bunch of tencent related definitions (#2648).
- Fixed: Potential crash when canceling cleaning via ACS.
- Fixed: Potential crash when SD Maid failed to clean a specific app via ACS, and the retry mechanism got very unlucky with the global timeout.

## SD Maid [v4.14.18](https://github.com/d4rken/sdmaid-public/milestone/89?closed=1) 04.06.2019
### Core
- Improved: Updated clutter db.
- Improved: Updated translations.
- Improved: Internal changes related to when SD Maid initializes and updates UI elements upon visiting a new page. I moved the code to initialize earlier which should fix a few cases where users first see placeholders which are then updated in a blink.

### AppCleaner
- Improved: ACS based deletion should now work correctly on additional Spanish ROMs.

### Scheduler
- Improved: UI code. The countdown should now update more consistently. Fixed a case where the scheduler still asked for SD Maid Pro despite already having upgraded.

## SD Maid [v4.14.17](https://github.com/d4rken/sdmaid-public/milestone/88?closed=1) 30.05.2019
### Core
- Improved: Clutter db. Added new entries and removed duplicate definitions.
- Improved: Further reduced UI lag and resource consumption when opening SD Maid.
- Fixed: Flickering headercard in the navigation drawer.
- Fixed: Widget missing / not being available in SD Maid Pro.
- Fixed: Icon shortcuts not being available in SD Maid Pro.

### AppCleaner
- Added: Samsung Bixby related log files to the bugreporting filter (#2631,#2632).

## SD Maid [v4.14.16](https://github.com/d4rken/sdmaid-public/milestone/87?closed=1) 29.05.2019
### Core
- Fixed: Potential two potential crashes when opening SD Maid, both related to the upgrade routine that was changed in v4.14.15. A stereotypical racecondition: 3 threads battle each other and depending on which one has the CPU's favor we get into an undesired state. Should have seen that, but didn't :'(, hindsight... etc.

## SD Maid [v4.14.15](https://github.com/d4rken/sdmaid-public/milestone/86?closed=1) 29.05.2019
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: Code related to checking for SD Maid's "Pro" state. Memory consumption should be lower and more resources will be released when SD Maid is closed or put into the background. I also fixed a few cases where SD Maid had to be restarted to recognize the upgrade.
- Fixed: Not being able to grant secondary storage access via SAF on Android Q.
- Fixed: A few cases of bad settings label.
- Fixed: SD Maid being stuck in setup if the setup Activity is being dismissed by someone else than SD Maid (e.g. the system, due to another 3rd party app crash).

## SD Maid [v4.14.14](https://github.com/d4rken/sdmaid-public/milestone/85?closed=1) 24.05.2019
### Core
- Improved: Translations.
- Fixed: Duplicate notification channel name.

### AppCleaner
- Improved: Speed of deletion via accessibility service. A fix in v4.14.13 caused a regression that lead to SD Maid working on stale data when trying to click the `Clear cache` button.

## SD Maid [v4.14.13](https://github.com/d4rken/sdmaid-public/milestone/84?closed=1) 21.05.2019
### Core
- Improved: Translations
- Fixed: Being unable to grant secondary storage access on Android 5.0 to 6.0 due immediate default to `Unsuccessful` state (reason for this hotfix update).
- Improved: Bad UI margins on devices with large font settings and scaled up resolution (Statistics UI).
- Improved: Coffee drinking on small screens.

### Overview
- Improved: Bad UI margins on devices with large font settings and scaled up resolution.

### AppCleaner
- Added: ACS based deletion support for traditional Chinese (#2600).
- Improved: ACS deletion routine's canceling behavior, faster canceling, less UI lag.
- Improved: ACS based deletion on small screens. If the desired element is not visible SD Maid will scroll the screen and keep on looking (#2598).

## SD Maid [v4.14.12](https://github.com/d4rken/sdmaid-public/milestone/83?closed=1) 19.05.2019
### Core
- Improved: Clutter database and added new dynamic markers for tencent related apps.
- Improved: Internal dependencies.
- Improved: Translations.
- Fixed: Possible hang during app initialization/opening related to the IAP lib trying some weird file access.

### Explorer
- Fixed: Floating action button sometimes not updating correctly and staying blank (#2594).

### AppControl
- Fixed: Potential UI crash related to searching/filtering the list and refreshing it.

#### AppCleaner
- Improved: Added support for Korean `ko` to ACS based deletion.
- Improved: WebView cache filter (#2513).
- Improved: Bugreporting filter (`.logTmp`).

### Databases
- Fixed: Crash when the internal sqlite binary can't be used and SD Maid tried alternative setups.

## SD Maid [v4.14.11](https://github.com/d4rken/sdmaid-public/milestone/82?closed=1) 17.05.2019
### Core
- Improved: Better support  for different toybox/busybox setups. SD Maid can now utilize applets that are built into the shell, e.g. the `test` applet.
- Improved: Buildscript updates.
- Improved: Clutter db.
- Improved: Translations.
- Improved: Small internal changes related to Android Q support (work in progress).
- Fixed: If the system's file picker crashes when attempting to grant storage access, SD Maid's setup should now be able to be continued instead of the setup window vanishing and SD Maid being stuck in setup.
- Fixed: A couple of situations that could lead to a crash during SD Maids when pausing/resuming SD Maid during the setup screens.

### QuickAccess
- Improved: Readability of the "freeable space" prediction text on the main launch button (#2536).

### Explorer
- Fixed: The UI allowing you to try and create duplicate bookmarks (#2478).
- Fixed: In consistent states being reached by manually trying to browse to non-canonical pathes (#2510).

### AppCleaner
- Improved: Hidden caches and bug reporting filter (#2524).
- Improved: Integrated TelegramX into the existing Telegram filter (#2511).

## SD Maid [v4.14.10](https://github.com/d4rken/sdmaid-public/milestone/81?closed=1) 16.05.2019
### Core
- Improved: Clutter database.
- Improved: Various small UI tweaks, some label and text changes.
- Fixed: Navigation drawer opening when switching pages via QuickAccess (#2567)
- Fixed: In some cases the setup routine did not abort SD Maid's start sequence if it was exited via back button.

### QuickAccess
- Improved: The navigation toggle animation now respects the animation on/off setting (#2583).

### AppControl
- Improved: List search and filtering logic.
- Fixed: Being stuck on an empty list after filtering, then pausing/resuming the app.
- Fixed: App entries being sorted wrong after updating their data (e.g. scanning size) (#2537).

### AppCleaner
- Improved: Made the ACS cleaning routine a bit more resiliant. Better timings and one more case where SD Maid will retry and attempt to dismiss system dialogs that may be interfering (#2565).
- Improved: Hidden caches filter (#2577).

## SD Maid [v4.14.9](https://github.com/d4rken/sdmaid-public/milestone/80?closed=1) 14.05.2019
### Core
- Improved: Clutter db.
- Improved: Translations
- Improved: Rewritten navigation drawer related code, more consistent progress, fewer used resources. SD Maid now start faster too.
- Improved: Lags during SD Maid startup when the unlocker app is installed.
- Fixed: Double tap to exit not resetting SD Maid, canceling tasks and clearing in memory objets (#2567).

### Overview
- Fixed: Wrong label for upgrades via apps.darken.eu (#2570).

### Explorer
- Fixed: Bookmarks being cut off.

### AppCleaner
- Improved: When SD Maid can't find the initial root window, e.g. due to the notification drawer being expanded, SD Maid will attempt to close it (#2565).

## SD Maid [v4.14.8](https://github.com/d4rken/sdmaid-public/milestone/79?closed=1) 12.05.2019
### Core
- Improved: Updated clutter database.
- Fixed: Navigation entries hanging when displaying progress.
- Fixed: Overlapping text between upgrade/donate/share actions in the navigations header card (#2534).

### Searcher
- Fixed: Wrong icon and color being displayed on the floating action button (#2535).

### AppCleaner
- Improved: ACS based deletion for locales `it`, `es` (#2396, #2542).
- Improved: Hidden cache and bug reporting filter.

## SD Maid [v4.14.7](https://github.com/d4rken/sdmaid-public/milestone/78?closed=1) 02.05.2019
### Core
- Improved: Translations.
- Improved: Dependency updates.
- Improved: Added update button the setup step that is displayed when the unlocker is outdated.
- Fixed: Potential crash when trying to grant secondary storage access.

### QuickAccess
- Removed: Coffee drinking animation from quick access due to issues with some older Android devices.

## SD Maid [v4.14.6](https://github.com/d4rken/sdmaid-public/milestone/77?closed=1) 28.04.2019
### Core
- Improved: Translations.
- Improved: Small UI improvements to the setup screens.

### QuickAccess
- Improved: Small UI improvements (animations and cleaner code).

### AppCleaner
- Improved: ACS based deletion, added support for locales ID,HI,IT,UK,FR,TR,KR,PL,VI,EL,NL,HU (#2396).

## SD Maid [v4.14.5](https://github.com/d4rken/sdmaid-public/milestone/76?closed=1) 27.04.2019
### Core
- Improved: Translations (new ones, old ones, removed some, fixed some).
- Improved: Updated clutter database
- Removed: Some extra crash tracking during setup, the issue it targeted was fixed.

### AppCleaner
- Note: Is your locale/ROM not supported yet? See: https://github.com/d4rken/sdmaid-public/issues/2396
- Added: Option to specify a minimum cache size (current default: 64KB).
- Improved: ACS based deletion failures due to `Clear cache` button disabled will now count as success. This can happen when the cache is already empty but SD Maid is worked with stale information (information via usagestats is not always in sync).

### Duplicates
- Improved: Option for specifying the minimum file size.
- Changed: Raised the default minimum size for files to 36KB.

## SD Maid [v4.14.4](https://github.com/d4rken/sdmaid-public/milestone/75?closed=1) 26.04.2019
### Core
- Improved: Translations.
- Fixed: Crash during setup if SAF permission granting failed or was aborted by the user.
- Fixed: Crash during core initialization on Android 4.1 to 4.3 due to bug in new code shrinker (#2514).
- Fixed: Storage labels being empty in some cases.

### AppCleaner
- Note: Is your locale/ROM not supported yet? See: https://github.com/d4rken/sdmaid-public/issues/2396
- Improved: Added ACS based deletion support for locale `pt`.
- Changed: ACS based deletion will no longer abort batch actions if clearing one app fails. It will still abort if your ROM/locale is not supported.

## SD Maid [v4.14.3](https://github.com/d4rken/sdmaid-public/milestone/74?closed=1) 25.04.2019
### Core
- Improved: Clutter database.
- Improved: Switched to new code shrinker (R8), smaller APK, possibly better performance.
- Improved: Internal build improvements.
- Changed: The setup step for usage stats permission can now be skipped as it's only required for a select few features at the moment. Obviously features that depend on it will not work then.
- Fixed: Some screens that require setup (filter editor, settings) would not correctly wait for SD Maid's setup to complete leading to core objects to not be initialized which could lead to incorrect settings being displayed or crashes(e.g. incomplete system cleaner filter list).
- Fixed: "Don't show again" option during some setup steps should now correctly display it's state during setup.

### SystemCleaner
- Improved: Filter manager related code, making it easier to add new features due to better structure, less fragile code.

### AppCleaner
- Note: Is your locale/ROM not supported yet? See: https://github.com/d4rken/sdmaid-public/issues/2396
- Improved: ACS based cache cleaning for german locales (#2503).
- Fixed: Accessibility (ACS) based cache deletion hanging on disabled packages (Ty Aleksandr).
- Fixed: ACS based deletion routine being triggered by the scheduler.

## SD Maid [v4.14.2](https://github.com/d4rken/sdmaid-public/milestone/73?closed=1) 19.04.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Fixed: Potential crash during setup.

### Explorer
- Fixed: Crash when extracting an empty zip file.

### AppCleaner
- Improved: Accessibility based cache deletion for Russian locales.
- Improved: Cache deletion via accessibility service. Should be more resiliant now, more retries, longer timeout. Will still require some optimization, please create issue tickets or mail me.

## SD Maid [v4.14.1](https://github.com/d4rken/sdmaid-public/milestone/72?closed=1) 16.04.2019
### Core
- Added: A debug task to the debug menu that logs the UI tree such that users can record a debug log, run that task, do what SD Maid should do, and then provide me with the log such that I can add support for accessibility service based cache deletion on their ROM+locale.
- Improved: Debug logging (removed some logging, added some logging).
- Improved: Updated clutter database.
- Improved: Updated translations.
- Improved: Internal settings logic will now make it obvious (via crash) if in some cases setting changes are only reflected in the UI but not persisted.
- Fixed: Huawei devices not being able to grant storage access if public internal storage is swapped. The ROM doesn't generate direct permission requests in this case and SD Maid will fall back to a manual request (#2468).
- Fixed: Crash during setup on Android 4.4 devices with secondary storage.
- Fixed: Possible crash when granting secondary storage permission (racecondition after returning back to SD Maid).
- Fixed: Possible crash during setup when fast UI interactions brought the steps out of sync.
- Fixed: Possible crash when quickly aborting the setup while the UI is closing.
- Fixed: Navigation entries should now no longer show progress from other tools, e.g. AppCleaner was running, but Explorer was also showing activity (from the AppCleaner tool). 
- Possibly: Fixed a crash when opening SD Maid due to an UI inflation error on < 4.3 ROMs that basically shouldn't be possible, but crash tracking says otherwise.
- Changed: I've updated the domain SD Maid's analytics server to `matomo.darken.eu` (was `piwik.darken.eu`), same server just a different domain.

### Explorer
- Improved: Small improvements to result messages (chmod, delete, extract).
- Improved: Settings related code, deduplicating routines such that there is a single source of truth for settings.
- Fixed: Crash when opening via shortcut.
- Fixed: Crash when a task produced no successful results but we tried to scroll them into view anyway...
- Fixed: Three cases where refreshing the current path under certain circumstances could lead to a crash.

### AppControl
- Improved: Some ROMs don't allow you to launch arbitrary activities outside an apps main activity, if that's the case we now show an error instead of crashing.
- Fixed: A crash when determining an apps size and the system gives us some information that is unexpected null.

### SystemCleaner
- Fixed: Crash when creating editing filters on Meizu devices (ROM bug related to text input).

### AppCleaner
- Added: Accessibility service based cache deletion for locales `zh` and `ja` on AOSP and similar ROMs.
- Added: When accessibility based deletion is enabled but the service is not running the details view will now also offer a shortcut to restart the service.
- Improved: Most filters will now exclude the `.nomedia` file from deletion.
- Improved: After cache deletion via accessibility service was performed, just resume SD Maid, don't explicitly open the AppCleaners page as you could have started out on the quick access page (#2486).
- Improved: Small improvements to confirmation dialogs.
- Improved: If something is not supported by your ROM it will show an error instead of crash now (e.g. no accessibility services on Android TV).
- Improved: The accessibility cache deletion task looks whether the desired screen is open, then traverses the view tree and filters for the desired target node. The initial routine that waits for the right screen will now timeout quicker and on retry attempt to launch desired screen again (previously we just assumed the first intent launched the screen correctly).
- Improved: Accessibility service related debug logging, instead of breadth-first, we do depth-first and log the actual UI structure.
- Fixed: Failing to find the clear cache button on some ROMs due to internal UI differences (#2473).
- Fixed: A couple of error states that should abort accessibility service based cache cleaning but instead took down the whole app.
- Fixed: Crash during scanning on unrooted devices if the device has expanded it's internal storage via sdcard and SD Maid was moved to that storage. The path splitting/matching made some assumptions about length that didn't hold true. I actually had tagged it with a TODO, as I thought this case doesn't really occur, well it does ¯\\\_(ツ)_/¯.
- Fixed: The "include system apps" setting should no longer be ignored.
- Fixed: Crash when deleting whole a whole apps cache via it's details screen. Due to a racecondition, the UI tried to refresh the page for an app that was no longer part of the dataset.
- Fixed: When deleting an apps inaccessible cache via the details view it should now no longer be removed from the data set if that deletion failed.

### Scheduler
- Improved: Scheduler settings code, added reset option.
- Fixed: Crash when entering settings due to racecondition between multiple initializations (#2466)

## SD Maid [v4.14.0](https://github.com/d4rken/sdmaid-public/milestone/69?closed=1) 05.04.2019
### Core
- Added: Donation options via GPlay IAP.
- Added: Request for usage stats permission to the setup flow.
- Added: Advanced settings option to manually trigger the setup flow again without requiring a reset.
- Added: Minimum unlocker version requirement. SD Maids setup will enforce a minimum unlocker version of v4.3.6.
- Improved: Complete rework of setup flow, nicer UI, better architecture (to prepare for Android Q changes).
- Improved: Internal migration to AndroidX libraries.
- Improved: Debug recorder.
- Improved: Debugging, added information about current locale and `armed` state.
- Improved: Clutter database.
- Improved: Translations.
- Improved: Small improvements to the account API.
- Improved: New update check logic and UI flow, server side changes to simplify infrastructure.
- Improved: The debug option `armed` now affects the schedulers reboot options too.
- Changed: "Free version" is now named "Basic version".
- Fixed: Potential crash when debugging due to a racecondition when trying to print information about active shell threads.
- Fixed: A case where an error during the base setup could crash the whole app.
- Fixed: Setup canceling should now reliably allow you to restart the setup again.
- Fixed: Network requests to Bugsnag.com happening despite user opt-out (#2400).
- Fixed: Potential crash that could occur when quickly pausing resuming screens that contains previews.
- Fixed: Fixed issues related to selecting items in a tool's details view and then pausing+resuming the screen.
- Fixed: Debug log recordings not being resumed after restarting the device and or SD Maid, despite never being stopped.

### Explorer
- Added: Ability to calculate and compare MD5, SHA1 and SHA256 checksum for files (#1517).
- Added: Direct sorting within the UI instead of settings.
- Added: Sort options: Last changed, Size.
- Added: Option to reverse sort (#994).
- Added: Copy/Move tasks also add the paths to the clipboard (#1381).
- Improved: Save directory structure on multiple items are now saved into the same file.
- Improved: Navigation on Android 8.0 without root, automatically guide the user past `/storage/emulated`.
- Improved: Result displaying.
- Improved: Complete UI code rework.
- Improved: Complete settings code rework.
- Fixed: Don't allow renaming without changing the name.
- Fixed: Save directory structure on files should now work too.

### AppControl
- Improved: Menu labeling
- Fixed: Crash when uninstalling without root is not possible due to some weird ROM restrictions (`Not allowed to start intent UNINSTALL_PACKAGE`).

### SystemCleaner
- Fixed: Case where SystemCleaner custom filters could be created without the pro upgrade.

### AppCleaner
- Added: Accessibility service based cache cleaning for locales `en`,`de`,`cs`,`ru`,`es` (#2396). 
- Added: Cache cleaning via accessbility service (#1588).
- Improved: Complete core code rework.
- Improved: Support for determining inaccessible cache sizes on Android 8.0+.
- Improved: Depending the Android version an app may have several empty directories inside the default cache directory (1-4x4096Byte). Although the system may show a cache size of "12KB" it won't actually delete this on `Clear Cache`. SD Maid should not show these entries either as deletion attempts will seem to work but the files just resurface on the next scan.
- Fixed: Inaccurate deletion results in some cases when aborting a deletion task.

### Duplicates
- Added: Minimum file size option (16 KB by default). Files smaller than this will be excluded. The most common use case is finding larger 500KB+ duplicates of photos. This should reduce cases where the tool pics up duplicate icons or other app assets.

### Scheduler
- Fixed: The UI hanging (ANR) when reopening SD Maid (cold start) on the scheduler page and setup is required.

### Statistics
- Changed: Increased the default history limit to 21 days.

## SD Maid [v4.13.4](https://github.com/d4rken/sdmaid-public/milestone/71?closed=1) 14.03.2019
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: Updated internal dependencies.
- Fixed: Not being able to grant secondary public storage permission via SAF on Android Q (#2379).
- Fixed: Crash on OPPO devices with Android 7.0 or lower when opening SD Maid.

## SD Maid [v4.13.3](https://github.com/d4rken/sdmaid-public/milestone/70?closed=1) 05.03.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Optimized size of all PNGs.
- Added: Link to discord.
- Improved: Help screen, added some icons for better identification.
- Fixed: Crash/Memory leak within the debug menu (long press on settings).

## SD Maid [v4.13.2](https://github.com/d4rken/sdmaid-public/milestone/68?closed=1) 22.02.2019
### Core
- Added: Complete UI for recording debug logs.
- Improved: Translations.
- Improved: Clutter database.
- Improved: Dependency upgrades.
- Improved: Debugging information.
- Fixed: Crash when copy pasting activation key (includes #2303).
- Fixed: Crash on some Xiaomi devices when killing apps (#2311).
- Fixed: Crash when attempting to record unlocker related debug data.
- Fixed: Crash re-entering the upgrade screen after the activity has been vacated from memory.

### AppControl
- Added: Details screen toolbar shortcut for opening Google Play, opening the system's settings panel and sharing a link to the app on Google Play (but only if the app was installed through Google Play) (#2302).
- Improved: Activity shortcut creation code.
- Fixed: Activity shortcut actions showing empty result messages.
- Fixed: Activity shortcuts not being visible on white backgrounds due to the icon being white, it now has a grey background (#2299).
- Fixed: It's no longer possible to toggle SD Maid's own receivers and subsequently crash the app (#2303).

### AppCleaner
- Improved: Hidden caches filter (#2221).

### CorpseFinder
- Added: Details screen now contains the modification date (#2241).

### StorageAnalyzer
- Fixed: "Device" bread crumb not reacting to clicks (#2274).

## SD Maid [v4.13.1](https://github.com/d4rken/sdmaid-public/milestone/67?closed=1) 20.01.2019
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Debugging/logging.
- Improved: Added more instructions to help users restore SD Maid Pro.
- Added: Alternative way of upgrading to SD Maid Pro without Google and without extra app via [apps.darken.eu](https://apps.darken.eu). Currently in beta testing, requires at least SD Maid v4.13.1.

### AppControl
- Fixed: Potential fix for inconsistent sorting of chinese characters.

### AppCleaner
- Fixed: Potential fix for inconsistent sorting of chinese characters.

## SD Maid [v4.13.0](https://github.com/d4rken/sdmaid-public/milestone/66?closed=1) 19.12.2018
### Core
- Improved: Clutter database (ty!).
- Improved: Translations (ty!).
- Improved: Improved debug logging.
- Added: Code for future support of purchases outside of Google Play and without unlocker app.
- Improved: Clutter data generation from SD Maids database. Better handling of apps with multiple definitions.
- Fixed: Possible crash due to theming when opening SD Maid.
- Improved: Few internal changes to object instantiation to improve overall architecture and lower memory consumption.
- Fixed: Possible crash that could occur when viewing tool details while deleting files.
- Improved: UX flow when clicking "Upgrade", added information about how to restore a purchase as this seems to be most common topic in emails I get.
- Improved: Automatic app detection for apps using their packagename for multiple directory names (e.g. com/app/pkg).
- Improved: Public storage on Android is case-insensitive. Clutter matching on public storage now fully understands that leading to more accurate detection with less overhead for multiple definitions.
- Improved: Overall improvements to filtering of paths with non-english locales/characters.

### Overview
- Added: Version display to binaries.
- Improved: SD Maid Pro display to account for alternate methods of unlocking.

### AppControl
- Fixed: Symlinks will no longer be followed when calculating app estates. This fixes size estimation for apps like Termux that symlink to public storage (#2166).
- Fixed: The receiver manager should no longer cut off the names (#2197).

### CorpseFinder
- Fixed: Uninstall watcher not deactivating when using "Reset to defaults" (#2196).

### AppCleaner
- Improved: The search algorithm can now search deeper. It will now find expendable files in directories that are nested several folders deep. Previously, to keep scan performance acceptable, SD Maid only compared against the top-level folders and if no top-level folder matched our filters we would skip them. I've now reversed this slightly such that we try to search ALL KNOWN clutter paths of apps that are installed and that share their path with a top-level folder. Combined with a few other improvements scan speed should stay about the same, but be much more thorough. This overall change was inspired users who mailed me and with which I worked toegether <3 to improve detection for many Tencent apps (which are quite dirty ಠ_ಠ).
- Improved: Filter for ads and hidden caches (e.g. WeChat).
- Improved: Filter for bugreporting related files (e.g. Tencent related apps).
- Improved: Matching in cases where two apps share the same path but only one app creates expendable files in a subdirectory of that path. Previously files could be missed depending on which app was matched first to a folder.
- Improved: Matching performance by switching from `contains` to `startsWith` for pre-filtering results. Most comparison are done using regular expressions, but because those are costly, SD Maid does a quick check before that. Previously this was mostly done using `contains` but for comparisons of small strings this could lead to too many false-positive matches and thus trying the expensive regular expression. I've switched a lot of definitions to `startsWith` which is more restrictive in that regard.

### Scheduler
- Fixed: Scheduler not restoring after updates on Android Oreo+.

## SD Maid [v4.12.3](https://github.com/d4rken/sdmaid-public/milestone/65?closed=1) 02.12.2018
### Core
- Improved: Clutter database.
- Improved: Log output for debugging.
- Improved: Translations.
- Fixed: Potential crash when updating statistics.

### AppControl
- Fixed: Potential crash when loading app data and the IPC buffer runs full (android.os.TransactionTooLargeException).

### Databases
- Fixed: SQlite biniary not working on <= Android 5.1 (#2154).

## SD Maid [v4.12.2](https://github.com/d4rken/sdmaid-public/milestone/64?closed=1) 28.11.2018
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: Updated internal sqlite binary to `3250300` (#2042).
- Improved: Few minor layout tweaks to have nicer paddings/margins-

### Explorer
- Fixed: CorpseFinder icon tinting.
	- Red: Corpse is flagged as 'common', meaning it has such a generic name that SD Maid won't make deletion decisions on it, despite knowing an app that owns it.
	- Orange: Corpse is flagged as 'keeper', meaning there is an app that owns this but marks this item as 'desirable remnant', depending on settings, SD Maid will delete it.

### SystemCleaner
- Fixed: Log filter deleting Telegram X's settings (#2147).

### AppControl
- Improved: List item layout for devices with very large fonts.
- Improved: Layout performance.

### Databases
- Improved: Updated SD Maid's SQL binary. SQL databases were skipped if they contained features from newer version (e.g. Chrome) (#2042).
- Fixed: Details not updating when retrying operations on items (#2151).

## SD Maid [v4.12.1](https://github.com/d4rken/sdmaid-public/milestone/63?closed=1) 27.11.2018
### Core
- Improved: New translations, also fixed a few typos.
- Improved: Clutter database, also added additional dynamic clutter matchers for common directories used by many apps. A dynamic matcher isn't a hardcoded reference but can instead infer ownership without directly knowing an app.
- Improved: Setup time on rooted devices, reduced the number used root shells.

### Explorer
- Fixed: "Share" action not working reliably on Android Nougat and newer.

### AppControl
- Improved: Labels & descriptions.
- Improved: Loading time, by reducing the number of used root shells.
- Improved: If the system crashes due to `TransactionTooLargeException` when getting app details, we shouldn't crash, but fail gracefully with an error message.
- Fixed: Crash when exporting APKs to an invalid path (or one with lacking permission).

### AppCleaner
- Added: Extra filter for WeChat/Weixin
- Improved: Hidden caches and bugreporting filter, better matching for WeChat/Weixin.

## SD Maid [v4.12.0](https://github.com/d4rken/sdmaid-public/milestone/62?closed=1) 22.11.2018
### Core
- Improved: Translations.
- Improved: Clutter database, fresh new app<->file relations.
- Improved: Pathes in details are no longer in process order, but sorted by path.
- Fixed: Rejecting the mount applet unnecessarily on systemless ROMs which could lead to SD Maid relinquishing root access (#2110).
- Removed: Links to SD Maid's G+ due to Google sunsetting the service (#2061).
- Improved: Internal changes to SD Maid's testing routines.

### Overview
- Improved: Text is now selectable (#2121).
- Added: Additional device information (#2105).

### AppCleaner
- Improved: Hidden caches filter.
- Improved: WhatsApp filter, added additional folders.
- Added: WhatsApp 4 Business to the WhatsApp filter.
- Added: New filter for recycle bin data (#2141).
- Added: New filter for downloaded game files (#2084).
- Improved: Added support for Telegram X (#2138).

### Duplicates
- Added: Default exclusion for Ringtones/, Alarms/ and Notifications/ (#2094).

### Statistics
- Changed: Increased default retention to 7 days.

## SD Maid [v4.11.10](https://github.com/d4rken/sdmaid-public/milestone/61?closed=1) 30.10.2018
### Core
- Improved: Translations
- Improved: Ownership detection and updated definitions.
- Fixed: Possible crash when SD Maid is started during an update.

### AppControl
- Fixed: Possible crash when creating Activity shortcuts.

### SystemCleaner
- Improved: Long pathes should no longer be cut off when creating user filters (#2055).
- Improved: Multiline support when editing long pathes in user filters (#2056).

### AppCleaner
- Fixed: Some exclusions were unnecessarily prevented from being applied. On <= Android 6.0 the `freeStorageAndNotify` trick is used to clear private caches, this technique doesn't support exclusions, so SD Maid prevents exclusions that overlap with the default caches from being applied. This resulted in some edge cases where exclusion are not applied even though they are not affected.

## SD Maid [v4.11.9](https://github.com/d4rken/sdmaid-public/milestone/60?closed=1) 22.09.2018
### Core
- Improved: Translations
- Improved: Clutter database & app matching.
- Improved: Coffee-drinking animation. Less GIF, more vector animation (Ty https://twitter.com/maxpatchs).

## SD Maid [v4.11.8](https://github.com/d4rken/sdmaid-public/milestone/59?closed=1) 17.09.2018
### Core
- Improved: Translations.
- Improved: Clutter database.

### AppCleaner
- Added: Cache definitions for NaviKing (#1985).

### Databases
- Added: Default exclusion for WeChat (#1973).

## SD Maid [v4.11.7](https://github.com/d4rken/sdmaid-public/milestone/58?closed=1) 26.08.2018
### Core
- Improved: Translations.
- Improved: Clutter database.
- Added: Dynamic clutter matcher for `bmwgroup` (#1891).
- Added: Default exclusion for MobiSystem's dictionaries (#1953).

### StorageAnalyzer
- Added: Modification date within an item's details dialog (#1960).
- Fixed: FAB not updating correctly when selecting items and navigating up (#1959).

## SD Maid [v4.11.6](https://github.com/d4rken/sdmaid-public/milestone/57?closed=1) 07.08.2018
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Updated internal dependencies.
- Improved: Name display of translators that contributed to SD Maid.
- Changed: Tried to use emojis for a few easter eggs but not all devices seem to support these :(.

### AppControl
- Improved: File naming of exported APKs: `Name(PKG)-vCode(vName).apk`.

### AppCleaner
- Added: Default exclusion for WPS Office font caches (#1914).
- Improved: Hidden caches matching for KingSoftOffice (#1923).
- Changed: Matching is now case-insensitive (#1940).

### Databases
- Added: Default exclusion for a problematic OneDrive database (#1925).
- Fixed: Size difference always showing 0 (#1926).

## SD Maid [v4.11.5](https://github.com/d4rken/sdmaid-public/milestone/56?closed=1) 26.07.2018
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Settings migration related code, better cold start performance (#1908).
- Improved: If the main app is open while the root check times out a little hint toast is shown (#1898).
- Improved: The navigation drawers background color is now the same as each nav item such that if it contains only a few items, that it looks better (#1878).
- Fixed: Crash on initialization (first task/setup) due to undocumented behavior of some ROMs (e.g. Infinix/TECNO) (#1906).
- Fixed: File size in details previews being cut off (#1886).

### AppCleaner
- Improved: Hidden caches filter (ZArchiver) (#1889).
- Changed: Moved UnityCache related matching from the hidden caches filter to the offline caches filter.
- Changed: The offline cache filter is now visible without having experimental features enabled (#1887).

### QuickAccess
- Fixed: Total amount including sizes of tools that are not visible (e.g. duplicates has data but is not shown) (#1908).

## SD Maid [v4.11.4](https://github.com/d4rken/sdmaid-public/milestone/55?closed=1) 20.07.2018
### Core
- Added: Option to disable the update check (#253).
- Improved: Translations.
- Improved: Clutter database (#1869).
- Improved: Reduced analytics, data that isn't used doesn't need to be gathered.
- Improved: Update check code, added support for HTTPS (encrypt all the things!)(#1876, #808).
- Changed: I've moved SD Maid related services to new servers at [Digital Ocean](https://m.do.co/c/782112f2c46a). Should have no impact on users, but makes the dev happy :).

### Overview
- Fixed: Calculation of free space showing negative values on some devices (#1863).

### AppControl
- Improved: Small improvements to the uninstaller code.
- Fixed: Crash when trying to export an app that can't be exported (#1868).

### AppCleaner
- Improved: Hidden caches filter (#1852).

### StorageAnalyzer
- Fixed: Path copied via breadcrumbs containing extra characters (#1869).

### QuickAccess
- Changed: I've made the duplicates tool opt-in again due to some valid concerns that were raised. New users would delete their duplicates without checking the details and possible delete files that were duplicated on purpose.

## SD Maid [v4.11.3](https://github.com/d4rken/sdmaid-public/milestone/54?closed=1) 10.07.2018 (BETA)
### Core
- Improved: Debugging / logging.
- Improved: Removed/reduced overlapping code between each tools main view and details view.
- Improved: Various small code improvements, mostly refactoring to make the responsibilities clearer.
- Improved: Clutter database.
- Improved Translations.
- Fixed: Tab-bar in swipeable details screens not jumping to the correct position.
- Fixed: Crash when deleting the last item/page in tool details screens.
- Fixed: Multi item selection not canceling on changing the details page.
- Fixed: Disabled apps not being detected on Android 4.1 (#1823).

### Explorer
- Fixed: Crash when extracting a corrupted ZIP file (#1847).
- Fixed: Ownership icons not loading in all circumstances (#1824).

### Searcher
- Fixed: Crash caused my settings migration.

### CorpseFinder.
- Improved: Refactored UI code to new architecture.
- Fixed: When deleting a corpses content, the corpse itself (i.e. the now empty dir) is now staying visible in the UI.
- Fixed: Theme related packages being detected as corpses on Samsung ROMs (#1813,#1815).

### SystemCleaner
- Improved: Refactored UI code to new architecture.

### AppCleaner
- Improved: Refactored UI code to new architecture.
- Improved: Web cache related filter (#1839, #1840).
- Improved: Hidden caches filter (#1841).
- Improved: Analytics filter (#1844, #1845).
- Improved: Bugreporting files filter (#1816).

### Duplicates
- Improved: Autoselection performance. Now takes about 1-2 seconds for 1000 clonesets (#1833).

### QuickAccess
- Changed: Once more, duplicates is now shown by default.

## SD Maid [v4.11.2](https://github.com/d4rken/sdmaid-public/milestone/53?closed=1) 03.07.2018 (BETA)
### Core
- Improved: Updated translations.
- Improved: Clutter database.
- Improved: Internal logging.
- Improved: Bug report screen (#1803).
- Removed: Option to supply an email for bug reports due being used so few times and not being helpful enough.

### Searcher
- Improved: Refactored UI code to new architecture.
- Improved: Fixed a couple of UI lags.
- Fixed: Possible crash on rotation.

### AppControl
- Improved: Handling of apps uninstalled by 3rd parties.
- Improved: Only show "Show in explorer" for successful APK exports (#1789).
- Improved: Small tweaks to improve performance (e.g. don't try to create a path if it already exists).
- Improved: Faster app scan by delaying gathering of export data until actually required.
- Improved: Faster details loading by using a more efficient way of loading Activity data.
- Fixed: Crash when uninstalling outside of SD Maid while SD Maid has that apps details page open (#1802).
- Changed: The `Activity` manager is no longer considered experimental.

### Databases
- Added: Default exclusion for Samsungs "Galaxy Finder" (#1788).
- Improved: Sortmode label (#1788).

### Duplicates
- Fixed: Duplicate word in the delete task's result (#1788).

## SD Maid [v4.11.1](https://github.com/d4rken/sdmaid-public/milestone/52?closed=1) 30.06.2018 (BETA)
### Core
- Improved: Translations.
- Improved: Tweaks to crash related logging.
- Improved: Coldstart performance (new SD Maid instance to first task running) by fixing an inefficiency that caused the root check to run twice if there was no root available.
- Fixed: Crash on app launch when running <Android 5.1. A component that was only meant for newer APIs was falsely initialized (#1774)
- Fixed: Crash when running any tasks with specific progress messages in Thai due to faulty localization (#1777).
- Fixed: Possible crash when entering advanced settings (#1779).
- Fixed: Possible crash when opening the app (#1780).
- Fixed: Possible racecondition that could lead to previously set up applets not being available (#1782).

### AppControl
- Fixed: Select filters not being restored in the UI when re-entering the page (#1787).
- Fixed: Permission data not being loaded when entering the detailed app view.
- Fixed: Possible crash when entering app details (#1775).

### CorpseFinder
- Fixed: Crash when checking `/data/app*` and a valid corpse exists that belongs to a still installed app (#1773).

### Duplicates
- Fixed: Crash that could occur when duplicates were deleted, or a new scan is started while an autoselection process is currently running in the UI (#1784).

### Widget
- Fixed: Crash when creating or canceling creation of a new widget (#1778).

## SD Maid [v4.11.0](https://github.com/d4rken/sdmaid-public/milestone/50?closed=1) 29.06.2018 (BETA)
### Core
- Added: An in-app screen to report issues/ideas to GitHub (#1111) that is currently only visible in betas.
- Added: Dynamic clutter matching for another common dev mistake (`/sdcard/data/user/0`) (#1756).
- Added: Support for Instant Apps (#1503). Requires root as instant apps are hidden from other apps by the system.
- Added: Android P permission `FOREGROUND_SERVICE` which is necessary to start a service that runs with just a notification as UI element.
- Improved: Reverted previous workarounds that have been fixed in newer Android P releases.
- Improved: Small changes to used sentences and words within the settings UI elements.
- Improved: Reduced overall UI code related technical debt. Looking at some older code I recognized a few chances to simplify code and reduce side-effects that just weren't obvious to me before 🤷.
- Improved: More addition ands updates to the clutter database.
- Improved: Translations (ty!).
- Improved: Adjusted toolbar titles/subtitles such that the tool-name is always the primary title and the current subsection the subtitle.
- Improved: The navigation drawer will now flash the scrollbar shortly when opening such that new users know the drawer can be vertically scrolled (#1708).
- Improved: On rooted devices SD Maid will now also check `/sbin/` for usable binaries (#1694).
- Improved: App loading performance. All tools now get their app information from a common repository that offers a smart caching mechanism to reduce the amount of overlapping app data we request from the system.
- Improved: General reduction of technical debt. Overhaul of SD Maids dependency injection.
- Changed: SD Maids `armed` status is now visible in the hidden debug menu if experimental features are enable (previously restricted to dev builds). Changing this feature puts MOST (NOT ALL) features into a 'DEMO' mode, e.g. no files are actually deleted which can be quite useful for debugging (#1723).
- Improved: Text readability in various areas (#1663).
- Improved: Check usage of `https` for websites (#1580).
- Improved: Increased crash log size in BETA builds.
- Changed: SD Maid now has a target/compile API level of 28 (Android P), and still a minimum API level of 16 (Android 4.1).
- Fixed: Service notification message not updating correctly after the initial setup task finishes (#1684).
- Fixed: Edge case that could lead to SD Maid requesting just by being opened.

### Explorer
- Improved: Removing bookmarks will now ask for confirmation first (#1385).
- Improved: When opening files an app chooser should now be shown (#1685).
- Fixed: Launcher shortcut option not working on Android Oreo and later (#1743).
- Fixed: Don't allow trying to extract directories (#1761).

### CorpseFinder
- Fixed: False-positives related to 'Instant Apps' (#1724).

### AppControl
- Added: Option to reset settings to default (#1762).
- Added: Instant apps filter option.
- Added: Reverse sort option (#1656).
- Added: New Android P permission `REQUEST_DELETE_PACKAGES` which is required on to uninstall apps (#1579).
- Improved: Scan speed by delaying some information gathering until app details are viewed (#1753).
- Improved: Messages in confirmation dialoges (#1730).
- Improved: Refactored main and details UI code to new architecture.
- Improved: Sorting can now be changed without triggering a task (#1253).
- Improved: Migrated settings to it's own module (backup is coming... just gotta migrate all tools 😩).
- Fixed: Launcher shortcut option not working on Android Oreo and later (#1743).
- Fixed: Scan being triggered just by opening the UI.
- Removed: `NO_APK` filter option due to being virtually never used with the Android versions that SD Maid is comaptible (this was more of a pre holo thing...).

### SystemCleaner
- Improved: User filter manager now has a 'select all' option (#1414).
- Improved: User filters are now sorted by their label to give a consistent order between devices (#1414).
- Improved: User filter help texts (#1415).

### AppCleaner
- Added: Removable default exclusion for `WINE` (#1571).
- Added: A new "Offline Caches" filter (opt-in). Currently only matches very apps. If you know apps that could be added create a ticket on GitHub please!
- Improved: Hidden caches filter. Expanded the list of potential names folders and added a specific entries for known apps (#1650).
- Improved: Better icon for the filter options (in the future we could consolidate the options & filters and then make a shortcut to that).
- Improved: Added exclusion routines VERY early on such that apps that cause the search to slow down to a crawl can be effectively excluded (#1571).

### Duplicates
- Improved: Various UI elements, e.g. details related to showing the task results.
- Improved: Finished refactoring the details view to the new UI architecture (the main view was already refactored in 4.10.0).

### StorageAnalyzer
- Improved: UI code. Refactored existing UI code to new architecture (just like the other tools).
- Fixed: Scroll position not being remembered (new UI code yay 🙌) (#1300).

### Databases
- Added: Removable default exclusion for `WINE` (#1571).
- Added: Sortmodes (#1136).
- Added: Option to reset settings to defaults.
- Added: 'Show in Explorer' option.
- Added: More file and directory types that will be considered when trying to find valid databases that SD Maid can process.
- Improved: Progress feedback during search.
- Improved: Various small UI tweaks (icon order, padding and margins).- Improved: Added exclusion routines VERY early on such that apps that cause the search to slow down to a crawl can be effectively excluded (#1571).
- Improved: Task result messages, try to show how much space was gained.
- Improved: The resulting list of databases can now also be searched by database name.
- Improved: Refactored the UI code to use the new architecture (https://github.com/d4rken/mvp-bakery).
- Improved: When working on databases that have multiple owners, SD Maid should now correctly suspend and resume ALL known owners.
- Improved: Database settings have been moved into their own module which allows for a reset feature (and future backup functionality).
- Changed: System apps are no longer included by default, and require opt-in via settings. Potential issue: If the `Skip running apps` option is not checked on a rooted device, it could come to a situation where SD Maid pauses a system process to work on it's database which can make the system unstable until reboot. While this is very rare to occur, SD Maids default settings should prioritize safety. Power users can just enable it via settings (#1562).
- Fixed: When checking which app owns a database we shouldn't exclude owners that are marked as `COMMON` (which are apps that own folders that have such common names that we can't reasonably use the information for deletion, database operations are different though, so we shouldn't ignore them). 
- Fixed: An edge cases where SD Maid end up working on a database even if the app, that we think owns the database, is not installed. The issue here is that it's likely that the database is owned by another (unknown) app and we can't skip or pause it then.
- Fixed: Searching the UI not always returning the expected entries.

### Scheduler
- Fixed: Side-effect between different toggle buttons (#1669).

## SD Maid [v4.10.13](https://github.com/d4rken/sdmaid-public/milestone/51?closed=1) 10.05.2018
### Core
- Fixed: Crash on Android P DPP2 when initializing due to using reflection on methods that are now blacklisted since DPP2 (#1678).
- Fixed: Secondary storage permission via storage-access-framework (SAF) not getting mapped (accepted). The internal `StorageMapper` errored out due to reflection that is blacklisted since DPP2 (#1678).

## SD Maid [v4.10.12](https://github.com/d4rken/sdmaid-public/milestone/49?closed=1) 26.04.2018
### Core
- Improved: Translations.
- Improved: Added and updated clutter/app definitions.

## SD Maid [v4.10.11](https://github.com/d4rken/sdmaid-public/milestone/48?closed=1) 11.04.2018
### Core
- Improved: Translations.
- Improved: Updated android support libraries and build tools.

### Overview
- Fixed: Crash on refresh when root check is disabled (#1624).

### CorpseFinder
- Added: Clutter report option to the corpse details screen (#1622).

### Databases
- Changed: Added default exclusion for Telegram (#1542).

## SD Maid [v4.10.10](https://github.com/d4rken/sdmaid-public/milestone/47?closed=1) 28.03.2018
### Core
- Improved: Translations.

### QuickAccess
- Fixed: "Go-Button" state issues (no canceling).

## SD Maid [v4.10.9](https://github.com/d4rken/sdmaid-public/milestone/46?closed=1) 28.03.2018
### Core
- Fixed: Crash during setup when the ROM has a faulty (weird?) su binary.

## SD Maid [v4.10.8](https://github.com/d4rken/sdmaid-public/milestone/45?closed=1) 28.03.2018
### Core
- Improved: Translations.
- Improved: Root type identification.
- Fixed: Crash when upgrading from older SD Maid versions and old exclusions exist that contain the deprecated tag `LASTMODIFIED`.

### AppControl
- Fixed: Force-stop not working with some types of root.
- Fixed: Component enabling/disabling not working with root setups other than SuperSU (Ty Einwood).

### Scheduler
- Fixed: Reboot not correctly working depending on root type.

## SD Maid [v4.10.7](https://github.com/d4rken/sdmaid-public/milestone/44?closed=1) 25.03.2018
### Core
- Added: Detection and subsequent display of a warning (instead of a crash), if a device is affected by the "Android 8.0 Instant Apps Issue" (see #1513). 
- Improved: Clutter database.
- Improved: Translations.
- Fixed: Root check not correctly timing out.
- Fixed: Detection of certain types of root binaries/apps.

### Explorer
- Improved: If trying to open `/storage/emulated` and insufficient permission are available, SD Maid will automatically navigate to `/storage/emulated/0` (#1493).

### StorageAnalyzer
- Added: Context menu option "Select All".
- Fixed: Issue where the UI would not correctly layout if the navigation target is an empty directy.

### QuickAccess
- Fixed: Help button not working (#1587).
- Fixed: Bottom action button not switching states correctly if results are empty (#1586).

## SD Maid [v4.10.6](https://github.com/d4rken/sdmaid-public/milestone/43?closed=1) 13.03.2018
### Core
- Fixed: Crash on launching SD Maid if beta v4.10.5 was opened. The cause was an issue related to exclusion format migration. If beta v4.10.5 was opened the exclusions were unfortunately corrupted and had to be reset. Any other upgrade should be fine (#1570).

## SD Maid [v4.10.5](https://github.com/d4rken/sdmaid-public/milestone/42?closed=1) 12.03.2018
### Core
- Improved: Clutter database.
- Fixed: Issue related to migrating older exclusions which could lead to a crash when opening SD Maid.

### QuickAccess
- Fixed: Crash when too quickly launching actions after opening SD Maid. Entries will now be hidden until ready.

## SD Maid [v4.10.4](https://github.com/d4rken/sdmaid-public/milestone/41?closed=1) 09.03.2018
### Core
- Improved: Updated clutter database.
- Improved: Updated translations.
- Added: Adaptive icon (#1249).
- Improved: Optimized size of all PNG images used in SD Maid.
- Fixed: UI racecondition that could lead to a crash when switching activities in SD Maid.
- Fixed: Various small UI issues.

## SD Maid [v4.10.3](https://github.com/d4rken/sdmaid-public/milestone/40?closed=1) 26.02.2018
### Core
- Improved: Updated clutter database.
- Improved: Updated translations.
- Improved: Bugreporting and error logging.
- Improved: Small improvements to exclusion storage code.
- Fixed: Progress indicators not displaying correctly.

### CorpseFinder
- Improved: Delete task description and confirmation dialogs.

### SystemCleaner
- Improved: Delete task description and confirmation dialogs.

### AppCleaner
- Improved: Delete task description and confirmation dialogs.

### Duplicates
- Improved: Delete task description and confirmation dialogs.
- Fixed: Autoselection criteria not saving consistently between version upgrades (this will reset it once more) (#1527).

### StorageAnalyzer
- Improved: If there is a gap in the file tree (file parent missing for unknown reasons) then SD Maid will try to generate the missing parent items (#1479).

### Databases
- Improved: Delete task description and confirmation dialogs.

### QuickAccess
- Improved: Confirmation dialog options and displayed information.
- Fixed: Confirmation dialogs not displaying.

## SD Maid [v4.10.2](https://github.com/d4rken/sdmaid-public/milestone/39?closed=1) 22.02.2018
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: Internal debug related routines.
- Improved: Navigation headcard layouting (#1308).
- Improved: Exclusion manager core code.
- Improved: Code related to serialization of exclusions/filters and other data.
- Improved: Updated used 3rd party libraries.
- Fixed: Issue with I/O operations where SD Maid would crash instead of just displaying an error.
- Fixed: Crash when root permission are inconsitently granted.

### SystemCleaner
- Changed: Default exclusion of `.stfolder` from the empty directories filter.
- Fixed: Crash when opening filter editor.

## SD Maid [v4.10.1](https://github.com/d4rken/sdmaid-public/milestone/38?closed=1) 04.02.2018
### Core
- Improved: Updated clutter database.
- Improved: Internal structure to improve testing.
- Improved: Progressbar performance in all tool pages.
- Improved: If automatic sdcard permission granting (Android 7.0+) fails because the ROM returns incorrect data (some NOKIA ROMs) SD Maid will automatically fall back to manual selection.
- Improved: Updated libraries (RxShell to better handle root detection, if `su` binary is unavailable).
- Fixed: Launch issue on some ROMs.
- Fixed: Storage access framework permission not being accepted by SD Maid in some circumstances.

### AppCleaner
- Improved: Filter for bugreporting related files.

### Duplicates
- Fixed: Added toolbar backarrow navigation.
- Fixed: Crash when editing autoselection criteria (#1483).
- Fixed: Crash when rotating the duplicates settings screen (#1484).

### Scheduler
- Fixed: Crash when rotating the scheduler settings screen.

### QuickAccess
- Improved: Better layout performance.
- Improved: Progress and action feedback should feel more responsive.
- Fixed: Button states sometimes not updating correctly.

## SD Maid [v4.10.0](https://github.com/d4rken/sdmaid-public/milestone/37?closed=1) 29.01.2018
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Internal code changes to improve code testing and make the code more modular. Also some structural changes to progress feedback and internal "workers" for future features.
- Fixed: Crash related to SD Maids binary setup. SD Maid should no longer try to use root to clear injected binaries if root isn't actually available.

### AppControl
- Fixed: Entering the screen should no longer trigger a scan automatically.

### SystemCleaner
- Fixed: The filter for empty dirs should now correctly match empty sub directories of DCIM/Pictures etc.

### StorageAnalyzer
- Improved: UI performance.
- Fixed: Layout being cut off when accessiblity options to increase textsize are used. 

### Duplicates
- Added: Option to reset settings to defaults.
- Added: Feature "Prune Media Storage" (on by default). Pruning Media Storage means that when SD Maid deletes a duplicate, the system's media storage app is queried for references to the deleted file and if necessary that reference is deleted. This keeps gallery apps from showing stale references.
- Added: "Automatic" autoselection. SD Maid can now automatically choose the best duplicates to keep based on a set of criteria you can adjust.
- Improved: Migrated duplicates tool related settings from the general settings file into their own settings file (for future import/export of settings).
- Improved: User interface. Better use of space and better UI performance on low end devices due to flatter UI layouts.
- Fixed: Autoselection should no longer lag the UI when running on thousands of files. The UI will stay responsive and the operation can also be canceled.
- Fixed: Option "Generate previews" now also affects previews of duplicates.
- Changed: Moved item context options a bit around.
- Changed: Exclusion of `/Android/data/` is no longer hardcoded and can be modified as part of SD Maids exclusion system.

## SD Maid [v4.9.5](https://github.com/d4rken/sdmaid-public/milestone/36?closed=1) 11.01.2018
### Core
- Improved: Translations.
- Improved: Clutter database.
- Fixed: Second try at fixing a possible crash when shell processes die prematurely.

### SystemCleaner
- Improved: Thumbnails filter variants of `thumbnails` folders in `<SDCARD>/DCIM`.

### Scheduler
- Fixed: Resetting the reboot option by opening the ui page.

## SD Maid [v4.9.4] 25.12.2017
### Core
- Improved: Translations.
- Fixed: Second try at fixing a possible crash when shell processes die prematurely.

## SD Maid [v4.9.3] 24.12.2017
### Core
- Improved: Translations.
- Fixed: Possible crash when a shell process dies prematurely.

## SD Maid [v4.9.2](https://github.com/d4rken/sdmaid-public/milestone/35?closed=1) 21.12.2017
### Core
- Improved: Translations.
- Improved: Clutter database.
- Fixed: Inconsistent list display when deleting the last items [#1361].
- Fixed: Strings such as SD Maid `PRO` or `BETA` not actually being colored on Android 8.0+.
- Fixed: A rare crash that could happen when a shell process failed and exited prematurely.
- Fixed: Crash when granting SAF on permissions and the ROM returns that the action was `OK`, but actually wasn't, and no data is returned.
- Fixed: Crash when trying to report a clutter entry but the list of installed apps contains an app without a name.

### AppControl
- Fixed: Crash when creating an `Activity` shortcut and the app has no name.

### SystemCleaner
- Changed: The thumbnails filter is no longer enabled by default [#1382].
- Changed: The three different types of thumbnail filters have been merged into one [#1386]
- Changed: Filter categories generic/specific.

### AppCleaner
- Improved: Bugreports filter.
- Improved: if `freeStorageAndNotify` is unavailable, hide it.

### Duplicates
- Improved: Duplicates scan now skips files when I/O errors occur during checksum calculation instead of aborting [#1389].

### Scheduler
- Fixed: Crash when opening the Scheduler settings [#1383].
- Fixed: Crash when restoring the Scheduler page after low memory events [#1387].

## SD Maid [v4.9.1](https://github.com/d4rken/sdmaid-public/milestone/34?closed=1) 15.12.2017 (BETA)
### Core
- Improved: Updated clutter database.
- Improved: Updated support libraries which may or may not fix some rare UI issues.
- Improved: Logic related to enabling pro features after installing the unlocker.
- Improved: Started migration to a new MVP type UI architecture to make the code cleaner code and allow for better testing. The library I created for this is also open-sourced and available, see [OMMVP](https://github.com/d4rken/ommvplib)).
- Improved: Updated all used library where available.
- Improved: On Android 7.0+ secondary external storage permission can now be granted via yes/no dialog (scoped directory access) instead of manual path selection [#1380].
- Changed: Target/Compile SDK is now finally set to API 27 (Android 8.1), this didn't work correctly previously.
- Changed: Switched the core file data from using `ctime` (change time of metadata) to `mtime` (change time of file content) [#1285].
- Fixed: Root detection not working [#1352] with SuperSU and other root types due to migration to [RxShell](https://github.com/d4rken/RxShell) which is finally open-sourced, yay!
- Fixed: List data not being updated correctly in almost every tool page if the last entry was deleted via details [#1361].
- Fixed: SAF permission for nested locations (e.g. Android/data) not being available after completing the setup until SD Maids had been restarted [#1296].

### Explorer
- Changed: "Create filter" is now called "Add to SystemCleaner" to make it more descriptive (#1364).
- Fixed: Not being able to install `*.apk` files on Android 8.0+ [#1313].

### AppControl
- Fixed: Activity shortcuts not working on Android 8.0+ [#1376].

### SystemCleaner
- Fixed: Minimum age not being saved if maximum age was not set for user filters [#1363].

### AppCleaner.
- Added: `apolloCache`, `.facebook_cache` , FB & FB Messenger [#1159] "videoCache" as hidden cache.
- Added: Added `*.crdownloads` to Chrome as hidden cache [#1154].

### Scheduler
- Improved: UI loading feedback.
- Improved: Options that are not available (require root) are now hidden if there is no root [#1335].

## SD Maid [v4.9.0](https://forum.xda-developers.com/showpost.php?p=74669914&postcount=3020) 28.11.2017 (BETA)
### Core
- Improved: Rewritten internal shell system. The new shell system improves the performance of all shell using routines, some routines (e.g. SystemCleaner) are up to 50% faster (Ty Mike).
- Fixed: Failure to kill/cancel processes running with root.

## SD Maid [v4.8.7](https://github.com/d4rken/sdmaid-public/milestone/33) 28.11.2017
### Core
- Improved: Updated clutter database.
- Improved: Updated translations.

## SD Maid [v4.8.6] 18.11.2017
### Core
- Fixed: Build with buildtools 27.0.1 to fix bootloops on CyanogenMod 12-13/LineageOS 13/Replicant 6 due to [OS bug](https://issuetracker.google.com/issues/64434571).

### SystemCleaner
- Improved: Canceling behavior.
- Fixed: Fixed incorrect scan summaries when exclusions are used ([#1290](https://github.com/d4rken/sdmaid-public/issues/1290)).

## SD Maid [v4.8.5] 31.10.2017
### SystemCleaner
- Fixed: Stock filters not instantiating (proguard *sigh*).

## SD Maid [v4.8.4](https://github.com/d4rken/sdmaid-public/milestone/32?closed=1) 31.10.2017
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: Clutter database structure and match generation. Support for multiple markers for the same package. This allows us to describe more apps with less entries.
- Improved: Internal code structures and unit tests related to file forensics (ownership etc.) to keep SD Maids code base healthy :).
- Improved: Tooling, libraries.
- Fixed: USB-OTG storage is now ignored if the mountpoint has the filesystem TMPFS. This should fix SD Maid trying to get permission for non-existing storage ([#1277](https://github.com/d4rken/sdmaid-public/issues/1277)).

### CorpseFinder
- Fixed: Inconsistently displayed scan results between the UninstallWatcher, QuickAccess page and CorpseFinder main view ([#1281](https://github.com/d4rken/sdmaid-public/issues/1281)).

### AppCleaner
- Improved: Hiddencaches filter additional `MediaCache` related folders are targeted ([#1258](https://github.com/d4rken/sdmaid-public/issues/1258)).

### SystemCleaner
- Improved: Internal code structure to reduce duplicate code, improve unit testing and allow better reuse of routines between default and user created filters.

### Databases
- Added: Default exclusion for the system settings provider and the sync provider on older phones (~Android 5.X).

## SD Maid [v4.8.3] 30.09.2017
### Core
- Added: Setting "Result notifications" which affects whether SD Maid shows notifications for task results, similar to the previous "Persistent notifications" setting. I'll remove this setting again when sufficient people are running Android Oreo (so probably in a few years...).
- Improved: Translations.

### Explorer
- Improved: The corpse icon will now be colored teal if SD Maid thinks an item is a corpse, but the item is flagged as common and thus not part of CorpseFinder results (see [common items](https://github.com/d4rken/sdmaid-public/wiki/Explorer#common)).

### CorpseFinder
- Improved: UninstallWatcher now uses the same scan scope as the normal scan from SD Maids UI. It was previously limited to public storage, and private app data storage.
- Fixed: UninstallWatcher not finding corpses when SD Maid was still in memory with an old list of installed apps (doing a forced refresh now).

## SD Maid [v4.8.2](https://github.com/d4rken/sdmaid-public/milestone/31?closed=1) 28.09.2017
### Core
- Improved: Updated translations.
- Improved: Clutter database ([#1156](https://github.com/d4rken/sdmaid-public/issues/1156), [#1153](https://github.com/d4rken/sdmaid-public/issues/1153), [#1161](https://github.com/d4rken/sdmaid-public/issues/1161), [#1160](https://github.com/d4rken/sdmaid-public/issues/1160), [#1162](https://github.com/d4rken/sdmaid-public/issues/1162))
- Improved: Path (breadcrumb) UI elements.

### AppControl
- Added: App version to list view.

### AppCleaner
- Added: Hidden Plex cache.

### StorageAnalyzer
- Fixed: Crash when canceling tasks.

### Databases
- Improved: UI show "Not possible" instead of "Error" as it's more accurate.
- Fixed: Database owner being shown as "Unknown".

## SD Maid [v4.8.1](https://github.com/d4rken/sdmaid-public/milestone/30?closed=1) 23.09.2017
### Core
- Improved: Updated translations.
- Fixed: Fixed racecondition that could lead to a crash when canceling tasks ([#1150](https://github.com/d4rken/sdmaid-public/issues/1150)).
- Fixed: Worker thread priority not being set according to foreground/background state of SD Maid.
- Fixed: SD Maid not correctly detecting when running in the background ([#1148](https://github.com/d4rken/sdmaid-public/issues/1148), ty @GabrielMGitHub).
- Fixed: Crash when canceling tasks running with root ([#1149](https://github.com/d4rken/sdmaid-public/issues/1149)).

### Databases
- Fixed: Symlink setting not being used when searching for databases ([#1151](https://github.com/d4rken/sdmaid-public/issues/1151), ty Sergey).

## SD Maid [v4.8.0](https://github.com/d4rken/sdmaid-public/milestone/29?closed=1) 22.09.2017
### Core
- Added: Language selection, option to enforce different languages than english ([#916](https://github.com/d4rken/sdmaid-public/issues/916)).
- Added: Dynamic clutter matching for `/sdcard/data/Data/some.pkg` (developer path mistakes).
- Improved: Clutter database ([#1053](https://github.com/d4rken/sdmaid-public/issues/1053), [#1049](https://github.com/d4rken/sdmaid-public/issues/1049), [#1048](https://github.com/d4rken/sdmaid-public/issues/1048), [#1047](https://github.com/d4rken/sdmaid-public/issues/1047), [#1046](https://github.com/d4rken/sdmaid-public/issues/1046), [#1054](https://github.com/d4rken/sdmaid-public/issues/1054), [#1058](https://github.com/d4rken/sdmaid-public/issues/1058), [#1059](https://github.com/d4rken/sdmaid-public/issues/1059), [#1060](https://github.com/d4rken/sdmaid-public/issues/1060), [#1065](https://github.com/d4rken/sdmaid-public/issues/1065), [#1068](https://github.com/d4rken/sdmaid-public/issues/1068), [#1070](https://github.com/d4rken/sdmaid-public/issues/1070), [#1072](https://github.com/d4rken/sdmaid-public/issues/1072), [#1073](https://github.com/d4rken/sdmaid-public/issues/1073), [#1074](https://github.com/d4rken/sdmaid-public/issues/1074), [#1075](https://github.com/d4rken/sdmaid-public/issues/1075), [#1076](https://github.com/d4rken/sdmaid-public/issues/1076), [#1077](https://github.com/d4rken/sdmaid-public/issues/1077), [#1088](https://github.com/d4rken/sdmaid-public/issues/1088), [#1109](https://github.com/d4rken/sdmaid-public/issues/1109), [#1108](https://github.com/d4rken/sdmaid-public/issues/1108), [#1107](https://github.com/d4rken/sdmaid-public/issues/1107), [#1106](https://github.com/d4rken/sdmaid-public/issues/1106), [#1105](https://github.com/d4rken/sdmaid-public/issues/1105), [#1094](https://github.com/d4rken/sdmaid-public/issues/1094), [#1095](https://github.com/d4rken/sdmaid-public/issues/1095), [#1027](https://github.com/d4rken/sdmaid-public/issues/1027), [#1114](https://github.com/d4rken/sdmaid-public/issues/1114), [#1118](https://github.com/d4rken/sdmaid-public/issues/1118), [#1119](https://github.com/d4rken/sdmaid-public/issues/1119), [#1120](https://github.com/d4rken/sdmaid-public/issues/1120), [#1137](https://github.com/d4rken/sdmaid-public/issues/1137), [#1131](https://github.com/d4rken/sdmaid-public/issues/1131), [#1132](https://github.com/d4rken/sdmaid-public/issues/1132), [#1141](https://github.com/d4rken/sdmaid-public/issues/1141), [#1142](https://github.com/d4rken/sdmaid-public/issues/1142)).
- Improved: Image loading (glide update).
- Improved: Added support for dynamic package matching more than 1 level deep.
- Improved: Content description for floating action buttons to help with accessibility ([#1027](https://github.com/d4rken/sdmaid-public/issues/1027)).
- Improved: USB-OTG device detection ([#1116](https://github.com/d4rken/sdmaid-public/issues/1116)).
- Improved: Root type detection (MAGISK) ([#1092](https://github.com/d4rken/sdmaid-public/issues/1092)).
- Improved: Debug output, now also printing environment variables into debug logs to help troubleshoot sdcard/usb detection ([#1117](https://github.com/d4rken/sdmaid-public/issues/1117)).
- Improved: Raised target SDK to Android Oreo.
- Improved: App launch speed ([#998](https://github.com/d4rken/sdmaid-public/issues/998)).
- Improved: Notification messages.
- Improved: Translations.
- Fixed: Crash when checking running processes and the system returns `null` instead of an empty list.
- Fixed: SD Maid indefinitely hanging at the root check ([#878](https://github.com/d4rken/sdmaid-public/issues/878)).
- Fixed: Deadlock during task canceling ([#878](https://github.com/d4rken/sdmaid-public/issues/878)).
- Changed: Target API to 26 (Oreo).
- Changed: Internal background, service and notification behavior to conform to new Android Oreo restrictions ([#801](https://github.com/d4rken/sdmaid-public/issues/801), [#804](https://github.com/d4rken/sdmaid-public/issues/804)). 
- Removed: Setting "persistent notifications". The notification system was rewritten to improve compatibility with Android Oreo and this setting didn't fit with the changes I had to make ([#801](https://github.com/d4rken/sdmaid-public/issues/801)).

### AppControl
- Improved: App details text can now be selected and copied ([#1139](https://github.com/d4rken/sdmaid-public/issues/1139)).
- Fixed: SD Maid being shown among frozen apps (despite being obviously not frozen, [#1103](https://github.com/d4rken/sdmaid-public/issues/1103), ty MikeL).

### CorpseFinder
- Improved: Wording in the clutter report screen ([#1137](https://github.com/d4rken/sdmaid-public/issues/1137)).
- Improved: Detect corpses of apps that are still installed, but where the ROM's app installer failed to remove files (in app, app-private) after updates ([#996](https://github.com/d4rken/sdmaid-public/issues/996), Ty mzielinskim).
- Fixed: Ownership detection of base app files for Android Oreo ([#802](https://github.com/d4rken/sdmaid-public/issues/802))

### SystemCleaner
- Changed: Filter categorization to make more sense.

### AppCleaner
- Added: Filter for Threema files.
- Improved: Bug reporting filter to include more log file types.
- Changed: Filter categorization to make more sense.
- Removed: Shortcut to system storage settings on Android Oreo, due to system cache clearing options no longer being available ([#1121](https://github.com/d4rken/sdmaid-public/issues/1121)).

### Databases
- Improved: Searching , expanded checked extensions in non database folders to `*.sqlite` and `*.sql`
- Improved: Search locations, search now includes all public storage ([#1067](https://github.com/d4rken/sdmaid-public/issues/1067)).

## SD Maid [v4.7.6](https://github.com/d4rken/sdmaid-public/milestone/28?closed=1) 05.08.2017
### Core
- Improved: Updated translations.
- Improved: Updated clutter database ([#997](https://github.com/d4rken/sdmaid-public/issues/997), [#1009](https://github.com/d4rken/sdmaid-public/issues/1009), [#1014](https://github.com/d4rken/sdmaid-public/issues/1014), [#1015](https://github.com/d4rken/sdmaid-public/issues/1015), [#1021](https://github.com/d4rken/sdmaid-public/issues/1021), [#1022](https://github.com/d4rken/sdmaid-public/issues/1022), [#1023](https://github.com/d4rken/sdmaid-public/issues/1023), [#1024](https://github.com/d4rken/sdmaid-public/issues/1024), [#1025](https://github.com/d4rken/sdmaid-public/issues/1025), [#1032](https://github.com/d4rken/sdmaid-public/issues/1032), [#1034](https://github.com/d4rken/sdmaid-public/issues/1034), [#1035](https://github.com/d4rken/sdmaid-public/issues/1035), [#1036](https://github.com/d4rken/sdmaid-public/issues/1036), [#1017](https://github.com/d4rken/sdmaid-public/issues/1017)).

## SD Maid [v4.7.5](https://github.com/d4rken/sdmaid-public/milestone/27?closed=1) 29.06.2017
### Core
- Improved: Translations (some new languages yay \o/).
- Improved: Clutter database ([#977](https://github.com/d4rken/sdmaid-public/issues/977), [#972](https://github.com/d4rken/sdmaid-public/issues/972), [#971](https://github.com/d4rken/sdmaid-public/issues/971), [#970](https://github.com/d4rken/sdmaid-public/issues/970), [#968](https://github.com/d4rken/sdmaid-public/issues/968), [#965](https://github.com/d4rken/sdmaid-public/issues/965), [#955](https://github.com/d4rken/sdmaid-public/issues/955), [#952](https://github.com/d4rken/sdmaid-public/issues/952), [#950](https://github.com/d4rken/sdmaid-public/issues/950), [#992](https://github.com/d4rken/sdmaid-public/issues/992), [#988](https://github.com/d4rken/sdmaid-public/issues/988)).
- Improved: Code related to checking app cache sizes on Android 6-7.
- Fixed: Make sure that we don't launch something like "BlackBerry Market" when trying to take the user to SD Maid on Google Play ([#861](https://github.com/d4rken/sdmaid-public/issues/861)).
- Fixed: Crash when a newer version of SD Maid is installed and SD Maid tries to update internal binaries.

### Explorer
- Fixed: Not being able to jpg files on some ROMs ([#951](https://github.com/d4rken/sdmaid-public/issues/951)).

### AppControl
- Improved: App install data (e.g. /data/app ) detection. Adjusted routines for apps with unusual pathes. Mostly relating preinstalled aps, mostly emulator type ROMs but also some others.
- Fixed: Not being able to access the filter drawer if the list is empty as otherwise the user could be stuck on a specific sort mode.

## SD Maid [v4.7.4](https://github.com/d4rken/sdmaid-public/milestone/26?closed=1) 30.05.2017
### Core
- Improved: Translations.
- Improved: Small code improvements.
- Improved: Clutter database ([#944](https://github.com/d4rken/sdmaid-public/issues/944), [#943](https://github.com/d4rken/sdmaid-public/issues/943), [#942](https://github.com/d4rken/sdmaid-public/issues/942), [#940](https://github.com/d4rken/sdmaid-public/issues/940), [#938](https://github.com/d4rken/sdmaid-public/issues/938), [#937](https://github.com/d4rken/sdmaid-public/issues/937), [#936](https://github.com/d4rken/sdmaid-public/issues/936), [#935](https://github.com/d4rken/sdmaid-public/issues/935), [#933](https://github.com/d4rken/sdmaid-public/issues/933), [#909](https://github.com/d4rken/sdmaid-public/issues/909), [#913](https://github.com/d4rken/sdmaid-public/issues/913), [#914](https://github.com/d4rken/sdmaid-public/issues/914), [#941](https://github.com/d4rken/sdmaid-public/issues/941), [#934](https://github.com/d4rken/sdmaid-public/issues/934)).
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


## SD Maid [v4.7.3](https://github.com/d4rken/sdmaid-public/milestone/25?closed=1) 25.05.2017
### Core
- Improved: Handling of files with invalid group/user ids (out of valid number) range. Mostly happens with custom mounted storage devices.
- Improved: Handling of symbolic links without link target (encountered when mounting storage from other operating systems).
- Improved: Debugging output.
- Improved: Clutter database ([#889](https://github.com/d4rken/sdmaid-public/issues/889), [#890](https://github.com/d4rken/sdmaid-public/issues/890), [#891](https://github.com/d4rken/sdmaid-public/issues/891), [#893](https://github.com/d4rken/sdmaid-public/issues/893), [#894](https://github.com/d4rken/sdmaid-public/issues/894), [#895](https://github.com/d4rken/sdmaid-public/issues/895), [#897](https://github.com/d4rken/sdmaid-public/issues/897), [#899](https://github.com/d4rken/sdmaid-public/issues/899), [#900](https://github.com/d4rken/sdmaid-public/issues/900), [#901](https://github.com/d4rken/sdmaid-public/issues/901), [#902](https://github.com/d4rken/sdmaid-public/issues/902)).
- Fixed: Crash when automatic crash reporting was disabled and SD Maid tried to report a specific issue.

### AppControl
- Fixed: Export function missing since v4.7.2.

### SystemCleaner
- Added: Filter for old (>1day) WhatsApp message backups to filter page "other" ([#904](https://github.com/d4rken/sdmaid-public/issues/904)).

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

## SD Maid [v4.7.0](https://github.com/d4rken/sdmaid-public/milestone/24?closed=1) 13.05.2017
### Core
- Improved: Translations (thanks!).
- Improved: Clutter database ([#880](https://github.com/d4rken/sdmaid-public/issues/880), [#875](https://github.com/d4rken/sdmaid-public/issues/875), [#874](https://github.com/d4rken/sdmaid-public/issues/874), [#873](https://github.com/d4rken/sdmaid-public/issues/873), [#847](https://github.com/d4rken/sdmaid-public/issues/847), [#855](https://github.com/d4rken/sdmaid-public/issues/855), [#856](https://github.com/d4rken/sdmaid-public/issues/856), [#857](https://github.com/d4rken/sdmaid-public/issues/857), [#858](https://github.com/d4rken/sdmaid-public/issues/858), [#860](https://github.com/d4rken/sdmaid-public/issues/860), [#849](https://github.com/d4rken/sdmaid-public/issues/849), [#859](https://github.com/d4rken/sdmaid-public/issues/859), [#862](https://github.com/d4rken/sdmaid-public/issues/862), [#876](https://github.com/d4rken/sdmaid-public/issues/876)).
- Improved: Debug output ([#851](https://github.com/d4rken/sdmaid-public/issues/851)).
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
- Fixed: Debug data reading on Android O ([#833](https://github.com/d4rken/sdmaid-public/issues/833)).
- Fixed: Files not being read correctly depending on which stat applet was used (parsing failure).
- Fixed: SD Maids own update check not checking the previous version correctly.

### Overview
- Improved: Busybox/Sqlite details regarding applet use.

### Explorer
- Added: Corpses marked as "keeper" will now appear with an orange ghost icon instead of the normal white one.
- Improved: When creating a filter, a sample description will be prefilled.
- Changed: When creating filters, and the item is a directory, `/` will be appended ([#868](https://github.com/d4rken/sdmaid-public/issues/868)).

### CorpseFinder
- Fixed: ApkData false positives on Android O ([#829](https://github.com/d4rken/sdmaid-public/issues/829), ty dreamland2000).

### AppControl
- Improved: App size display. If SD Maid is unsure about an apps size, this is now visible ([#844](https://github.com/d4rken/sdmaid-public/issues/844)).
- Changed: SD Maids unlocker is now visible ([#837](https://github.com/d4rken/sdmaid-public/issues/837)).
- Changed: Certain actions are disallowed on SD Maid and the Unlocker (it doesn't make sense to let SD Maid disable SD Maid) ([#837](https://github.com/d4rken/sdmaid-public/issues/837)).

### SystemCleaner
- Added: Attributes & UI elements to support filtering by `minimumAge` and `maximumAge´ ([#333](https://github.com/d4rken/sdmaid-public/issues/333)).
- Improved: UserFilter export. Only save fields into the `.json` file that are actually necessary ([#867](https://github.com/d4rken/sdmaid-public/issues/867)).
- Improved: Scan performance for items that will eventually match a filter that doesn't use the `location` criteria.

## SD Maid [v4.6.5](https://github.com/d4rken/sdmaid-public/milestone/23?closed=1) 06.04.2017
### Core
- Improved: Translations.
- Improved: Root binary & app detection, added support for magisku.
- Improved: Updated clutter database ([#799](https://github.com/d4rken/sdmaid-public/issues/799), [#780](https://github.com/d4rken/sdmaid-public/issues/780), [#782](https://github.com/d4rken/sdmaid-public/issues/782)).
- Improved: Debug output. Fixed typos, better naming.
- Improved: Root related code. Lots of refactoring and new unit tests. Some preperation to move root related classes into an external library that I can open source.
- Improved: Improved analytics. Moved to https. Removed tracking for data that proved to be not useful (referrer data). Updated to latest Piwik 2.0 build.
- Improved: Image loading (latest glide library).
- Improved: Pro/Unlocker related code. Unified checks and upgrade dialog. More granular control (instead of isPro(), hasFeature(X)). Preparations to allow for different upgrade paths than via the unlocker app.
- Fixed: Filetype being wrong when sharing files (e.g. uploading to GDrive) ([#786](https://github.com/d4rken/sdmaid-public/issues/786)).
- Changed: Changing the "preview" option in the settings no longer requires the pro version. Currently only affects previews in the duplicates tool.

### Searcher
- Added: Search option field for "Path doesn't contain". Will be exanded to a list in a future rewrite ([#809](https://github.com/d4rken/sdmaid-public/issues/809)).
- Removed: Global searcher exclusion as they were not working ([#809](https://github.com/d4rken/sdmaid-public/issues/809)).

### CorpseFinder
- Improved: Uninstall watcher should now work on Android O ([#800](https://github.com/d4rken/sdmaid-public/issues/800)).

### AppControl
- Fixed: Always showing a toast message when adding an activity ([#823](https://github.com/d4rken/sdmaid-public/issues/823)).
- Fixed: App size not correctly determined on unrooted devices ([#820](https://github.com/d4rken/sdmaid-public/issues/820)).
- Fixed: Typo in date format when sharing a list of apps.

### AppCleaner
- Improved: Hidden caches filter, added facebook video cache.
- Fixed: Inconsistent toolbar icons ([#788](https://github.com/d4rken/sdmaid-public/issues/788)).

### Duplicates
- Changed: The free version will now show file previews.

### StorageAnalyzer
- Fixed: Text being cut off when changing font sizes via accessibility settings ([#789](https://github.com/d4rken/sdmaid-public/issues/789)).

### Statistics
- Improved: Only attempt truncation if new limit is lower than old one.

## SD Maid [v4.6.4](https://github.com/d4rken/sdmaid-public/milestone/22?closed=1) 05.03.2017
### Core
- Added: Link to privacy policy (sdmaid.darken.eu/privacy).
- Added: Support for clutter markers which define their target packages via regular expressions.
- Improved: Automatic bug reporting tool.
- Improved: Translations.
- Improved: Clutter database ([#768](https://github.com/d4rken/sdmaid-public/issues/768), [#761](https://github.com/d4rken/sdmaid-public/issues/761), [#765](https://github.com/d4rken/sdmaid-public/issues/765), [#767](https://github.com/d4rken/sdmaid-public/issues/767), [#771](https://github.com/d4rken/sdmaid-public/issues/771), [#772](https://github.com/d4rken/sdmaid-public/issues/772), [#773](https://github.com/d4rken/sdmaid-public/issues/773), [#774](https://github.com/d4rken/sdmaid-public/issues/774), [#762](https://github.com/d4rken/sdmaid-public/issues/762), [#763](https://github.com/d4rken/sdmaid-public/issues/763), [#751](https://github.com/d4rken/sdmaid-public/issues/751), [#755](https://github.com/d4rken/sdmaid-public/issues/755)).
- Improved: Updated tooling and used libraries.
- Improved: Code handling dynamic clutter markers (which can match apps without really knowing the specific apps).
- Fixed: Clutter reporter not including uninstalled (but known apps) in the reports ([#769](https://github.com/d4rken/sdmaid-public/issues/769)).

### StorageAnalyzer
- Improved: Internal code structure to allow for better testing.
- Fixed: Case where deleting files lead to a crash (if the files had already been deleted).

## SD Maid [v4.6.3](https://github.com/d4rken/sdmaid-public/milestone/21?closed=1) 16.02.2017
### Core
- Improved: Updated clutter database ([#737](https://github.com/d4rken/sdmaid-public/issues/737), [#740](https://github.com/d4rken/sdmaid-public/issues/740), [#739](https://github.com/d4rken/sdmaid-public/issues/739), [#747](https://github.com/d4rken/sdmaid-public/issues/747)).
- Improved: Updated translations.
- Improved: Various improvements to logging output and code structure.
- Improved: Routines related to remounting storage when deleting, creating, copying or moving items.
- Improved: Device related analytics data.
- Improved: Added mount details to crash reports ([#744](https://github.com/d4rken/sdmaid-public/issues/744)).
- Improved: Binary setup on non ARM devices. SD Maid should now correctly detect and use the PREFERRED architecture, if a device supports multiple ([#745](https://github.com/d4rken/sdmaid-public/issues/745)).
- Improved: Updated Android support libraries.
- Improved: App killing code. Fixed crash due to firmware bug on LG devices running Android 7.0 ([#748](https://github.com/d4rken/sdmaid-public/issues/748)).
- Fixed: Shell tasks falsely trying to remount the emulated primary storage.

### AppControl
- Fixed: Crash when APKs failed to export.
- Fixed: Export failing on some unrooted devices.

### AppCleaner
- Improved: Hidden cache filter ([#747](https://github.com/d4rken/sdmaid-public/issues/747)).

## SD Maid [v4.6.2] 10.02.2017
### StorageAnalyzer
- Fixed: Detecting not existing partition.

## SD Maid [v4.6.1](https://github.com/d4rken/sdmaid-public/milestone/20?closed=1) 10.02.2017
###
- Improved: Debug output.
- Improved: Clutter database ([#735](https://github.com/d4rken/sdmaid-public/issues/735), [#730](https://github.com/d4rken/sdmaid-public/issues/730), [#729](https://github.com/d4rken/sdmaid-public/issues/729)).
- Improved: Translations ([#726](https://github.com/d4rken/sdmaid-public/issues/726)).
- Improved: Updated analytics library and reduced amount of tracked actions (popularity: AppControl: togglereceiver>delete>kill>freeze>forcestop>export, Explorer:Delete>move/copy>size>rename), nothing suprising here so I'll no longer track this.
- Changed: Settings layout.

### AppControl
- Improved: APK export behavior when encountering errors.
- Fixed: "Show unknown" (receiver) menu checkbox not reflecting the state correctly.

### CorpseFinder
- Changed: Removed experimental tag from Link2SD/Apps2SD filter.

### Databases
- Added: MediaMonkey as default exclusion ([#732](https://github.com/d4rken/sdmaid-public/issues/732)).

### Scheduler
- Changed: Increased maximum interval to 31 ([#733](https://github.com/d4rken/sdmaid-public/issues/733)).

## SD Maid [v4.6.0](https://github.com/d4rken/sdmaid-public/milestone/19?closed=1) 31.01.2017
### Core
- Added: Support for `/data/sdext2`.
- Added: Support for clutter matching in `/data`.
- Improved: Clutter database ([#711](https://github.com/d4rken/sdmaid-public/issues/711), [#695](https://github.com/d4rken/sdmaid-public/issues/695), [#696](https://github.com/d4rken/sdmaid-public/issues/696), [#697](https://github.com/d4rken/sdmaid-public/issues/697), [#694](https://github.com/d4rken/sdmaid-public/issues/694), [#701](https://github.com/d4rken/sdmaid-public/issues/701), [#702](https://github.com/d4rken/sdmaid-public/issues/702), [#704](https://github.com/d4rken/sdmaid-public/issues/704), [#705](https://github.com/d4rken/sdmaid-public/issues/705), [#707](https://github.com/d4rken/sdmaid-public/issues/707), [#708](https://github.com/d4rken/sdmaid-public/issues/708), [#709](https://github.com/d4rken/sdmaid-public/issues/709), [#710](https://github.com/d4rken/sdmaid-public/issues/710), [#703](https://github.com/d4rken/sdmaid-public/issues/703), [#706](https://github.com/d4rken/sdmaid-public/issues/706)).
- Improved: Debug output (better performance when debugging, more useful information).
- Improved: "Double press to exit" now respects the systems vibration settings ([#693](https://github.com/d4rken/sdmaid-public/issues/693)).
- Improved: Code responsible for detecting storages.
- Improved: Updated translations.
- Fixed: Progress messages when doing statistics.

### AppControl
- Added: Through SD Maid uninstalled apps are now logged in statistics.
- Improved: Forced-stopped apps can now also be determined on unrooted devices ([#712](https://github.com/d4rken/sdmaid-public/issues/712)).
- Improved: Initial scan speed should be faster, specifically detecting disabled and stopped apps.
- Changed: App list filter entries are now only shown if they contain apps ([#713](https://github.com/d4rken/sdmaid-public/issues/713)).

### CorpseFinder
- Added: Filter for Link2SD and Apps2SD related files.

### AppCleaner
- Improved: Deletion performance. Items are no longer deleted one by one. SD Maid will try to find common parent directories and then delete in batches while still respecting exclusions ([#430](https://github.com/d4rken/sdmaid-public/issues/430)).
- Improved: Scan performance, specifically final checks (alias & exclusions).
- Improved: Bug reporting file filter.

### Duplicates
- Added: Default exclusion for Link2SD and Apps2SD ([#254](https://github.com/d4rken/sdmaid-public/issues/254)).
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
- Changed:  Removed labels from chart (due to overlapping) and moved the size to each legend entry ([#699](https://github.com/d4rken/sdmaid-public/issues/699), [#689](https://github.com/d4rken/sdmaid-public/issues/689)).

## SD Maid [v4.5.9](https://github.com/d4rken/sdmaid-public/milestone/18?closed=1) 12.01.2017
### Core
- Improved: Translations.
- Improved: Clutter database ([#684](https://github.com/d4rken/sdmaid-public/issues/684)).
- Fixed: Clutter report tool crashing when adding apps ([#686](https://github.com/d4rken/sdmaid-public/issues/686)).
- Fixed: FAB staying invisible after being hidden ([#685](https://github.com/d4rken/sdmaid-public/issues/685)).
- Fixed: FAB being missaligned within the file/path picker screen (exclusions, filters etc.).

### AppControl
- Fixed: Handling of empty packages/restrictions XML files.

### StorageAnalyzer
- Improved: Gracefully deal with cases where a file could not be found.

## SD Maid [v4.5.8](https://github.com/d4rken/sdmaid-public/milestone/17?closed=1) 08.01.2017
### Core
- Improved: Clutter database.
- Improved: Updated android support libraries.
- Improved: Import screen should now only show files with supported extensions.
- Improved: Show error instead of crash when trying to import invalid files into exceptions.
- Fixed: Update check delaying initialization when blocking internet access via firewall.

### Explorer
- Improved: Files created by "Save directory structure" now contain ROM infos ([#675](https://github.com/d4rken/sdmaid-public/issues/675)).
- Fixed: Copy/Move snackbar not consistently showing.

### AppControl
- Improved: Receiver (boot) details. Previous colors were not very readable. Made some layout changes.

### CorpseFinder
- Changed: "TWRP" and "clockworkmod" have been flagged as `common` and will no longer be suggested as corpses ([#673](https://github.com/d4rken/sdmaid-public/issues/673)).

### SystemCleaner
- Fixed: `/data/system/dropbox` filter (Ty Roman).

### AppCleaner
- Improved: Hidden cache filter (additional image and video cache matching).

### StorageAnalyzer
- Added: "Read only" to read-only storages ([#676](https://github.com/d4rken/sdmaid-public/issues/676)).

## SD Maid [v4.5.7] 03.01.2017
### Core
- Improved: Translations.
- Improved: Debug logging.

### AppControl
- Fixed: SD Maid crashing after processing an uninstall or app reset.

## SD Maid [v4.5.6](https://github.com/d4rken/sdmaid-public/milestone/16?closed=1) 02.01.2017
### Core
- Improved: Updated toybox ([#668](https://github.com/d4rken/sdmaid-public/issues/668)).
- Improved: Clutter database ([#665](https://github.com/d4rken/sdmaid-public/issues/665) Ty RedMaxKr, [#629](https://github.com/d4rken/sdmaid-public/issues/629), [#664](https://github.com/d4rken/sdmaid-public/issues/664) & [#663](https://github.com/d4rken/sdmaid-public/issues/663) Ty Gitoffthelawn).
- Improved: File research performance, better sychronization during generation of clutter marker data ([#663](https://github.com/d4rken/sdmaid-public/issues/663)).
- Improved: File research performance, prevent the marker cache from containing entries ([#663](https://github.com/d4rken/sdmaid-public/issues/663)).
- Improved: Gracefully handle files with invalid modification dates by using a default date as fallback. Previously files with invalid stats would have been omitted causing tools like StorageAnalyzer to break because parent directories were omitted ([#668](https://github.com/d4rken/sdmaid-public/issues/668)).
- Fixed: Experimental setting not correctly reflecting the actual state (i.e. when using a beta version).
- Fixed: File opening on Android N+ ([#667](https://github.com/d4rken/sdmaid-public/issues/667) Ty Joly0).

### AppControl
- Improved: Internal code by further modularizing functionality to reduce bug susceptibility.

### CorpseFinder
- Added: Ownership information within the details screen ([#663](https://github.com/d4rken/sdmaid-public/issues/663)).

### SystemCleaner
- Improved: Advertisement filter, added `.mobvista\d+`.

### Scheduler
- Added: If a full reboot attempt via system intent fails we try reboot via command line applet as fallback option ([#662](https://github.com/d4rken/sdmaid-public/issues/662) Ty Yowlen).

## SD Maid [v4.5.5](https://github.com/d4rken/sdmaid-public/milestone/15?closed=1) 24.12.2016
### Core
- Added: Support for files of type 'named pipes'.
- Improved: Detection of running apps that use multiple processes.

### AppControl
- Fixed: Listdata being duplicated when refreshing single entries through tasks (e.g. size check).

### AppCleaner
- Improved: Hidden caches filter (TempData).

### Databases
- Fixed: SD Maid getting stuck when trying to suspend running apps (using bad PID values) (Ty Ben).

## SD Maid [v4.5.4](https://github.com/d4rken/sdmaid-public/milestone/14?closed=1) 22.12.2016
### Core
- Improved: Clutter database.
- Improved: Translations.

### CorpseFinder
- Fixed: File reporting not opening the browser.

### AppCleaner
- Added: Option to open files from details in SD Maids Explorer.
- Added: Amazon app store to hidden cache and analytics filter ([#457](https://github.com/d4rken/sdmaid-public/issues/457) Ty Gitoffthelawn & jawz101).
- Improved: Scan performance. Under certain conditions SD Maid scanned the same folder twice.
- Improved: Handling of issues when determining force-stopped apps.
- Fixed: Scanning subfolders now also follows symlinks (fixes issues with App2SD apps) ([#622](https://github.com/d4rken/sdmaid-public/issues/622) Ty Antonio).

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

## SD Maid [v4.5.1](https://github.com/d4rken/sdmaid-public/milestone/13?closed=1) 17.12.2016
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
- Fixed: Action "Save directory structure" not working ([#618](https://github.com/d4rken/sdmaid-public/issues/618) Ty jawz101).

### Searcher
- Fixed: Not finding anything if modification time settings are not used.

### AppControl
- Added: Tapping the app icon will launch the app.
- Added: Info to the app move button saying if an app doesn't want to be moved, but can be forced to.
- Changed: The activities manager is now flagged as experimental.
- Fixed: Apps being disabled as movable when they were not ([#614](https://github.com/d4rken/sdmaid-public/issues/614) Ty noc-jfcbs).
- Fixed: Search field not being displayed on smaller screens.
- Fixed: Crash when unfreezing apps on <5.0.
- Fixed: Crash when trying to determine app sizes (e.g. after uninstall).
- Fixed: Crash when refreshing after trying to kill a library type app without application infos.
- Fixed: Crash when entering and exiting the AppControl page and SD Maid tried to update the ui filters prematurely.
- Fixed: Issue leading to a crash when placing a shortcut through the activities manager.

### CorpseFinder
- Fixed: Crash when triggering the uninstall watcher.
- Fixed: False positive detection of theme/overlay files in private app data on LG devices ([#615](https://github.com/d4rken/sdmaid-public/issues/615) Ty Brian).

### SystemCleaner
- Fixed: Crash when a racecondition lead to division by 0 during progress display.

## SD Maid [v4.5.0](https://github.com/d4rken/sdmaid-public/milestone/12?closed=1) - 12.12.2016
### Core
- Added: Support for locations `data_system_ce` and `data_system_de`.
- Added: Additional debugging options.
- Added: Timestamps to new exclusions, preparing for future sort options.
- Added: Android TV (leanback) support ([#389](https://github.com/d4rken/sdmaid-public/issues/389)).
- Added: Debug option to run all tools.
- Added: Debug option to disable the root check.
- Improved: Clutter database.
- Improved: User-interface, various small tweaks (e.g. [#578](https://github.com/d4rken/sdmaid-public/issues/578)).
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
- Fixed: Android 4.4's "Provider trick" deletion method being used on other version too, where it obviously failed and slowed down deletion in edge cases ([#595](https://github.com/d4rken/sdmaid-public/issues/595)).
- Fixed: Running apps detection on Android 7.0+ ([#527](https://github.com/d4rken/sdmaid-public/issues/527)).
- Fixed: Floating action button not anchoring correctly ([#610](https://github.com/d4rken/sdmaid-public/issues/610)).

### Explorer
- Improved: Extraction behavior to better deal with uncommon archives structures.
- Improved: Error message when opening something ([#612](https://github.com/d4rken/sdmaid-public/issues/612)).
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
- Added: Filter for `/mnt/secure/asec` ([#247](https://github.com/d4rken/sdmaid-public/issues/247)).
- Fixed: Failsafe check for asec related corpses which checks if the `.asec` file is currently mounted (and thus not _yet_ a corpse). 

### SystemCleaner
- Added: Filter for recent tasks, which deletes metadata and screenshots used to restore the the recent tasks list after reboots ([#235](https://github.com/d4rken/sdmaid-public/issues/235)).

### Appcleaner
- Added: Filter to delete send/received files from Telegram ([#609](https://github.com/d4rken/sdmaid-public/issues/609)).
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
- Added: Options to sort the list by state, app and size ([#598](https://github.com/d4rken/sdmaid-public/issues/598)).

### Statistics
- Changed: Reduced default chronic limit to 3 days.

### QuickAccess
- Added: Triggering QuickAccess through Android 7.1 "app-icon-shortcuts" (requires SD Maid Pro).
- Improved: Progressbar behavior when tasks switch between "In queue" and working.

### Scheduler
- Added: Option to reboot the device after scheduler action complete.
- Improved: Layout padding and tap behavior.

### Exclusions
- Added: Options to filter the list by type of exclusion ([#600](https://github.com/d4rken/sdmaid-public/issues/600)).
- Improved: Exclusions are now sorted by their last modification time ([#600](https://github.com/d4rken/sdmaid-public/issues/600)).
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

## SD Maid [v4.4.0](https://github.com/d4rken/sdmaid-public/milestone/11?closed=1) - 05.11.2016
### Core
- Added: Support for CustomTabs when opening web links ([#576](https://github.com/d4rken/sdmaid-public/issues/576)).
- Improved: Clutter database ([#569](https://github.com/d4rken/sdmaid-public/issues/569), [#580](https://github.com/d4rken/sdmaid-public/issues/580), [#584](https://github.com/d4rken/sdmaid-public/issues/584), [#585](https://github.com/d4rken/sdmaid-public/issues/585), [#593](https://github.com/d4rken/sdmaid-public/issues/593), [#592](https://github.com/d4rken/sdmaid-public/issues/592)).
- Improved: Translations.
- Improved: API targets and build tools raised to API25.
- Improved: In the weird event that a ROM has no activity to grant runtime permissions, gracefully show an error instead of crashing.
- Fixed: No longer showing snackbars for empty results.
- Fixed: Possible crash when launching SD Maid for the first time after an install.
- Fixed: Tab hiding affecting tool access from QuickAccess ([#540](https://github.com/d4rken/sdmaid-public/issues/540)).
- Changed: Label for scan actions from 'check' to 'scan' (:D).

### Explorer
- Added: Support for showing mount points. Items that are mountpoints will show an extra icon if option 'Research owners' is enabled ([#579](https://github.com/d4rken/sdmaid-public/issues/579)).
- Fixed: Possible crash when opening files.
- Fixed: Possible crash when trying to determine file type when trying to open a file.

### Searcher
- Added: Function to share files/results ([#382](https://github.com/d4rken/sdmaid-public/issues/382)).
- Improved: Search progress feedback.
- Fixed: Crash when encountering corrupt filesystem entries (will now just be omitted).

### AppControl
- Added: Option change list sorting from the right side filter drawer ([#573](https://github.com/d4rken/sdmaid-public/issues/573)).

### CorpseFinder
- Improved: Details layout.

### Duplicates
- Added: Autoselection option for primary/secondary storage ([#473](https://github.com/d4rken/sdmaid-public/issues/473)).
- Improved: Line item layout.
- Fixed: Duplicates not being found across different storages.

### Storage Analyzer
- Added: Support for location `/cache` ([#575](https://github.com/d4rken/sdmaid-public/issues/575)).
- Added: Clicking files tries to open them.
- Fixed: No longer showing empty action mode when selecting items in the root view ([#577](https://github.com/d4rken/sdmaid-public/issues/577)).

### Databases
- Added: Default exclusion for apple music ([#539](https://github.com/d4rken/sdmaid-public/issues/539)).

### Statistics
- Improved: Chart layout and display ([#572](https://github.com/d4rken/sdmaid-public/issues/572), [#574](https://github.com/d4rken/sdmaid-public/issues/574)).
- Improved: History details and structure ([#572](https://github.com/d4rken/sdmaid-public/issues/572), [#574](https://github.com/d4rken/sdmaid-public/issues/574)).
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

## SD Maid [v4.3.7](https://github.com/d4rken/sdmaid-public/milestone/10?closed=1) - 14.10.2016
### Core
- Added: Dynamic clutter marker for `IQQI` ([#546](https://github.com/d4rken/sdmaid-public/issues/546)).
- Improved: Clutter database (Ty david082321 [#535](https://github.com/d4rken/sdmaid-public/issues/535) - [#566](https://github.com/d4rken/sdmaid-public/issues/566)).
- Improved: If available root will be used to determine running apps ([#527](https://github.com/d4rken/sdmaid-public/issues/527)).
- Fixed: Crash if the system returns unusually large (> Int.Max) uids ([#537](https://github.com/d4rken/sdmaid-public/issues/537)).
- Fixed: Double press to exit setting being ignored ([#538](https://github.com/d4rken/sdmaid-public/issues/538)).

### AppControl
- Added: Option to add a launcher shortcut for this tool.

### AppCleaner
- Improved: Hidden caches filter (`.temp`, `.thumbnails`) (Ty david082321 [#557](https://github.com/d4rken/sdmaid-public/issues/557), [#558](https://github.com/d4rken/sdmaid-public/issues/558)).
- Improved: Hidden caches filter (`.face` and video player thumbnails).

### CorpseFinder
- Changed: "Keeper" items, e.g. backups/photos now show a red circle in addition to a tag, independent of corpse location.

### Scheduler
- Fixed: Issue with scheduling a 2 day interval.
- Fixed: Issue with restoring schedule after reboot to the correct time.
- Changed: Initial scheduling, will now trigger at the next hour/minute time, then repeat according to interval.

## SD Maid [v4.3.6](https://github.com/d4rken/sdmaid-public/milestone/9?closed=1) - 03.10.2016
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Internal toybox updated.
- Fixed: Alternative binary setup strategies failing on Android Nougat due to mount applet using different arguments ([#528](https://github.com/d4rken/sdmaid-public/issues/528)).
- Fixed: SD Maid crashing during initialization if a user binary is not available, but a root binary is available. We should gracefully abort here ([#528](https://github.com/d4rken/sdmaid-public/issues/528)).
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

## SD Maid [v4.3.5](https://github.com/d4rken/sdmaid-public/milestone/8?closed=1) - 25.09.2016
### Core
- Fixed: UI related crash when reentering SD Maids UI by downgrading to an older support library (newest version introduced this crash) ([#525](https://github.com/d4rken/sdmaid-public/issues/525)).
- Fixed: SD Maid trying to use Android 6.0+ code on <6.0 devices, didn't cause a crash but spammed the log and used unnecessary CPU time.
- Fixed: Crash if binary is not available instead of allowing an error to be displayed.

### Overview
- Improved: If a binary is not available (mostly affects sqlite3 binaries), show an info entry about this instead of showing no entry at all.

### AppControl
- Improved: Name of saved list of apps display human readable date.
- Improved: Better logging for more detailed debug logs.
- Fixed: Crash when clicking "show" after exporting a shared list of apps.
- Fixed: Only being to able to share one item.

## SD Maid [v4.3.4](https://github.com/d4rken/sdmaid-public/milestone/7?closed=1) - 24.09.2016
### Core
- Added: SD Maid can now use two different binaries for root/normal actions. This increases device compatibility and makes it less likely that SD Maid or the user has to install a binary into /system.
- Improved: SD Maid will no longer require a preinstalled system binary on devices that don't have a default `chmod` applet (though this is bad in any case and the user should install a system toybox/busybox to fix their `chmod` applet).
- Fixed: Mountpoint detection fallback solution not working due to unexpected output format ([#522](https://github.com/d4rken/sdmaid-public/issues/522)).
- Fixed: Crash if the api call for external storages returns an array containing a `null` value ([#519](https://github.com/d4rken/sdmaid-public/issues/519)).
- Fixed: Failure to detect mountpoints from user perspective if SD Maid employed RootFS injection to use it's binary with root ([#521](https://github.com/d4rken/sdmaid-public/issues/521)).
- Changed: Storage size determination will now be run on the storage path itself, not its mountpoint (affects Overview & Storage Analyzer).

### Explorer
- Fixed: Crash if we try to restore the last path, have to fallback to a default value, and then the system gives us an empty string as external storage path.
- Fixed: Crash when trying to select files in type 'UNKNOWN' locations ([#520](https://github.com/d4rken/sdmaid-public/issues/520)).
- Fixed: Crash when trying to extract empty files ([#518](https://github.com/d4rken/sdmaid-public/issues/518)).

## SD Maid [v4.3.3](https://github.com/d4rken/sdmaid-public/milestone/6?closed=1) - 21.09.2016
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Fast scroller behavior (library: github.com/FutureMind/recycler-fast-scroll).
- Improved: Swapped labeling when asking for secondary storage permission to help users better identify the target storage.
- Improved: Core shell routines. Simplified some unnecessarily complex code constructs (I don't think the performance gain is noticeable).
- Improved: Logging to better help users with sdcard (secondary public storage) issues.
- Improved: Breadcrumb bars displaying pathes.
- Improved: Mount point detection, on KNOX enabled devices, if the internal mount applet can't be called without root, SD Maid will try the systems native mount applet to obtain the users mountpoints (see [#502](https://github.com/d4rken/sdmaid-public/issues/502)).
- Fixed: Various minor RTL related ui issues ([#483](https://github.com/d4rken/sdmaid-public/issues/483)).
- Fixed: Issues granting access to secondary storage on "Prestigio" devices ([#493](https://github.com/d4rken/sdmaid-public/issues/493)).
- Fixed: Erroneously detecting /storage/emulated/legacy as secondary public storage on "Prestigio" devices ([#492](https://github.com/d4rken/sdmaid-public/issues/492)).
- Fixed: Mount point detection issue caused by mount space seperation ([#502](https://github.com/d4rken/sdmaid-public/issues/502) Ty Ivan).
- Fixed: Fixed rare "random" (depends on ps output) crash during detection of running apps.
- Fixed: Fixed rare crash if a system app returns an empty sourcedir path or one that points to rootfs.

### Explorer
- Improved: Archive extraction is now cancelable.
- Improved: ZIP archive extraction now also works on secondary storages if storage permission have been granted ([#478](https://github.com/d4rken/sdmaid-public/issues/478) Ty dukelc).
- Improved: If secondary storage setup has been been skipped and extraction is attempted, a snackbar will show asking the user to complete the setup.
- Changed: Error message when a directory can't be accessed ([#478](https://github.com/d4rken/sdmaid-public/issues/478)).
- Fixed: ZIP extraction action should only be visible for public storages.

### AppControl
- Improved: Right side drawer now allows multiple filter tags to be selected at once.
- Fixed: Filter tags not being reapplied to results after refreshing the lest ([#495](https://github.com/d4rken/sdmaid-public/issues/495)).

### Storage Analyzer
- Improved: Browsing already loaded data no longer shows the "Successful" toolbar (it was anoying, wasn't it?).

## SD Maid [v4.3.2](https://github.com/d4rken/sdmaid-public/milestone/5?closed=1) - 10.09.2016
### Core
- Improved: Translations.
- Improved: Clutter database.
- Improved: Added link to wiki to the exclusions help dialog.
- Fixed: Crash during resource cleanup when operations end and an interactive shell died prematurely without causing the whole operation to fail. 
- Fixed: Exclusions import always showing success.

### Explorer
- Improved: Creating user filter for the system cleaner now tries to fill in the location field.
- Fixed: Crash if quickly entering and leaving the clutter reporter tool ([#486](https://github.com/d4rken/sdmaid-public/issues/486)).

### AppControl
- Fixed: Trying to open a file as directory when clicking a path in app details.

### SystemCleaner
- Fixed: Crash when creating a new user filter from scratch ([#485](https://github.com/d4rken/sdmaid-public/issues/485)).

### Databases
- Fixed: Possible hang during size comparison on devices with high database (800+) counts ([#488](https://github.com/d4rken/sdmaid-public/issues/488) Ty danielling23).

### QuickAccess
- Fixed: Database tool entry always showing something to do.
- Fixed: Database tool always showing expected sizes for all items, not only those that are still unprocessed.

## SD Maid [v4.3.1](https://github.com/d4rken/sdmaid-public/milestone/4?closed=1) - 07.09.2016
### Core
- Improved: Translations
- Improved: Clutter database ([#481](https://github.com/d4rken/sdmaid-public/issues/481), [#480](https://github.com/d4rken/sdmaid-public/issues/480), [#479](https://github.com/d4rken/sdmaid-public/issues/479)).
- Improved: If a tool can't find any storage (why?), that tool will now display an error instead of crashing SD Maid.
- Improved: Display of error messages in tools.
- Fixed: Crash on devices where SD Maid used rootfs injection to get a working binary. Despite having root, SD Maid didn't use when looking up mounts, causing that to fail and SD Maid ending up with no detected storages ([#475](https://github.com/d4rken/sdmaid-public/issues/475) Ty Sandris).
- Fixed: Crash if the shell process would die prematurely. Tasks scheduled for execution would get a NULL result instead of an result with state "error".

### AppControl
- Fixed: Crash if estates were determined based on a stale list of installed apps.

### SystemCleaner
- Added: Filter for `/data/logger` (LG devices) ([#464](https://github.com/d4rken/sdmaid-public/issues/464)).
- Improved: Matching of already existing filters, better deal with file-seperators.

### Storage Analyzer
- Fixed: Crash when operations were too quick (divide by 0) ([#477](https://github.com/d4rken/sdmaid-public/issues/477)).
- Fixed: Crash wen pressing the backbutton without loaded data ([#476](https://github.com/d4rken/sdmaid-public/issues/476)).

## SD Maid [v4.3.0](https://github.com/d4rken/sdmaid-public/milestone/1?closed=1) - 02.09.2016 (BETA)
### Core
- Added: Adaptive support for different (core-utils providing) binaries, currently "toybox" and "busybox".
- Added: Added support for location "/oem" ([#441](https://github.com/d4rken/sdmaid-public/issues/441) Ty randomname1234).
- Added: Option to toggle animations (currently only coffee drinking).
- Added: If SD Maid is running in the background but requires setup via user action, operations are canceled and a notification is displayed ([#435](https://github.com/d4rken/sdmaid-public/issues/435) Ty sjoshua270).
- Added: SD Maids file forensics can now get clutter markers from dynamic sources. This means that in addition to static sources (i.e. a database with entries), there are now dynamic sources that can generate clutter markers without explicitly knowing an app.
- Added: Dynamic clutter sources for `.UTSystemConfig` and `.EveryplayCache`.
- Improved: Accuracy of size calculation when deleting files of which some failed to be deleted (or don't exist anymore).
- Improved: Clutter database (dozen of new entries).
- Improved: Clutter database format to better cover multiple apps with the same clutter.
- Improved: Updated all of SD Maids dependencies and libraries.
- Improved: Instead of tapping out with a "busybox error", SD Maid will now relinquish root access if the current toybox/busybox setup is not root compatible ([#442](https://github.com/d4rken/sdmaid-public/issues/442)).
- Improved: Both busybox and toybox can be used by SD Maid and both types of binaries will be tried as fallback solution ([#452](https://github.com/d4rken/sdmaid-public/issues/452)).
- Improved: Reduced SD Maids resource (RAM/CPU) consumption by reducing the amount of shells that are kept open. Reading files now shares a shell with all other operations (delete, move, copy etc).
- Improved: Operation results (ok, skipped, failed) now only show values that are non zero.
- Improved: Speed of file object creation, some calls be done in a more effective order and a few memory optimizations weren't effective.
- Improved: File forensics performance, less information is (i.e. App name) is requested during research and deferred to be gathered when it is actually needed.
- Improved: Reduced memory use by reducing the footprint of the clutter matching (simpler objects).
- Improved: Ownership detection. In some cases SD Maid will now match "fixed paths" -> "variable packagenames", previousy we could only match "fixed package names" -> "variable pathes". Example: Match "/sdcard/.strawberry/eu.thedarken.sdm" without specifically having a database entry for "eu.thedarken.sdm").
- Improved: Busybox error screen shows more device infos and a better explanation.
- Improved: Logging. Reduced logging in production builds and adjusted logging priorities to be more useful (verbose vs debug).
- Fixed: Task results not showing correct amount of failed deletions.
- Fixed: "Double tap to exit" toast not being correctly themed ([#438](https://github.com/d4rken/sdmaid-public/issues/438) Ty TWiStErRob).
- Fixed: Shell data not being disregarded directly if data is streamed instead of buffered. This should reduce peak memory consumption during scan for SystemCleaner, Duplicates, Biggest and Databases.
- Fixed: Commands failing that use remounting on Android 6.0+. Multiple mount commands were used to guarantee reliable execution on different devices, but on some the toybox binary segfault. This would cause any command using remounting to end up with a segfault (139) errorcode. SD Maid now checks if the toybox binary segfaults during setup.
- Fixed: A racecondition where the FAB become visible when SD Maid started executing a task triggered from list multiselection.
- Fixed: Shell operation (move/create) failing if the the target path was a symlink pointing to a read-only partition with a different path (e.g. /vendor -> /system/vendor).
- Fixed: Random crashes related to inflating the menu in each tools toolbar, possibly related to devices with hardware menu-buttons.
- Fixed: Crash related to a race-condition between UI input (e.g. clicks) and UI state.
- Fixed: Crash if SD Maid could not find any locations of type `SDCARD` but tried use the data to build sub-locations such as `PUBLIC_DATA`.
- Changed: Instead of file length, "size on filesystem" is now used to calculate the amount of space freed by a deletion. You will notice that with the exception of sparse-files, deletion will show slightly (blocksize) increased amounts of freed space, especially when deleting lots of small files.
- Changed: SD Maid now ships with toybox instead of busybox (leaner and fixes [#451](https://github.com/d4rken/sdmaid-public/issues/451)).
- Changed: Log files are now stored in SD Maids cache instead of files folder (i.e. `/sdcard/Android/data/eu.thedarken.sdm/cache/logfiles`).
- Changed: If root access is available, SD Maid will skip asking for storage access via the storage-access-framework (SAF).

### QuickAccess
- Fixed: Database tool still requiring confirmation despite single-pass option activated.

### Overview
- Added: If SD Maid relinquihes root access to avoid a busybox/toybox error the root state will display this ([#442](https://github.com/d4rken/sdmaid-public/issues/442)).
- Changed: Refresh no longer reloads the storage manager, it is now only refreshed once per session.

### Explorer
- Added: Option to place a shortcut on your home screen which open the explorer and refreshes it ([#187](https://github.com/d4rken/sdmaid-public/issues/187)).
- Added: Octal permission display when changing permissions.
- Added: Reporting option via context menu if you have experimental mode enabled.
- Added: Support for extracting ZIP (zip/apk etc, anything zip based) files ([#198](https://github.com/d4rken/sdmaid-public/issues/198)).
- Added: Details dialog, currently a bit rough, will be expanded later on.
- Added: Files now show both blocksize (size file actually occupies) and file length (size file says it is), if this value differs. The format is `size on storage (file length)`.
- Fixed: Pathbar at the top not updating correctly when switching to the Explorer from a different tool, directly loading that path ([#439](https://github.com/d4rken/sdmaid-public/issues/439)).
- Fixed: Creating dirs/files not updating directory content correctly without extra refresh.
- Fixed: Directory content not updating correctly after deletion.
- Fixed: Paste action causing change to parent directory.
- Fixed: Trying to remount a source as `rw` if we are only copying files.
- Fixed: When trying to create a file the operation could return an error even if it was successful.
- Changed: Don't popup a snackbar for every path change.

### Searcher
- Added: Options find files based on minimum and maximum modification date. Using these options automatically causes results to be sorted by date.

### AppControl
- Added: Right-side drawer with additional information and filtering options ([#406](https://github.com/d4rken/sdmaid-public/issues/406)).
- Improved: Tags for filtering (e.g. frozen apps) are no longer a search string and can be used in addition to manual search input (i.e. search in all frozen apps).
- Improved: SD Maid will check more locations now to find all items that belong to an app, this was previously limited to specific locations such as data/dalvik etc. but now covers all locations SD Maid knows.
- Improved: Files and sizes belonging to each app (estate) can now be determined on-demand.
- Improved: Speed when determining files owned by an app (estate).
- Changed: By default app files and sizes are not researched during list generation, except if the sort-mode is SIZE or the option to do the research in advance is turned on in the settings.
- Fixed: Corruption of exported APKs ([#451](https://github.com/d4rken/sdmaid-public/issues/451)).

### CorpseFinder
- Improved: SDcard filter scan speed. Changes to clutter information allow us to better determine when we have to search deeper and when reading the top level item is sufficient.
- Improved: Reporting tool is now more comfortable and allows adding more information.
- Changed: Reports are now posted via GitHub, which requires a free GitHub account. People that want to contribute can now do so in higher quality and get recognition for their contributions. People who kept spamming me via the old report tool with weird stories can now try again and then be banned from SD Maids GitHub repository.

### SystemCleaner
- Added: Tracking to determine how often UserFilter are actually used.
- Added: `.chartboost` and `adhub` to advertisement filter.
- Added: Help link to SD Maids wiki ([#298](https://github.com/d4rken/sdmaid-public/issues/298) Ty Trasd).
- Improved: Some people create placeholders for `__chartboost` and `.chartboost` to block them from being created, these will no longer be removed.
- Fixed: UserFilter creation was possible without the pro version.
- Fixed: Size calculation for AdvertisementFilter items, should now also show children of matched directories ([#471](https://github.com/d4rken/sdmaid-public/issues/471) Ty Solomon1732).

### Biggest
- Added: File previews if you have SD Maid Pro.
- Added: Support for locations requiring root access ([#129](https://github.com/d4rken/sdmaid-public/issues/129)).
- Added: "Device view" ([#467](https://github.com/d4rken/sdmaid-public/issues/467)). The tool starts out with a "device view" showing all available storages the tool can show. Changing any settings is no longer necessary.
- Improved: Refresh behavior. Previously a refresh caused the whole cached file-tree to be reloaded. Now we can just refresh subnodes of the cached file-tree.
- Changed: Made list items more compact ([#346](https://github.com/d4rken/sdmaid-public/issues/346)).
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
- Fixed: Changing workercount not working reliably ([#428](https://github.com/d4rken/sdmaid-public/issues/428) Ty jawz101).
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
- Fixed: Scrollbar not initialising correctly ([#429](https://github.com/d4rken/sdmaid-public/issues/429)).

## SD Maid [4.2.9] - 29.06.2016
### Core
- Added: Support for plurals (day/days, item/items) where applicable.
- Improved: Translations (specifically plurals).
- Fixed: Possibly racecondition crash on devices with physical menu buttons when they are rapidly pressed during UI changes ([#341](https://github.com/d4rken/sdmaid-public/issues/341)).
- Fixed: Remount of /system failing on newer CM13 builds (toybox/toolbox issue).
- Fixed: UI pages always switching back to the initial one if the UI was launched through the QuickAccess widget.

### Explorer
- Added: Option to manually specify a path to load.
- Improved: Navigation should be more consistent, instead of buttons/crumbs not reacting, SD Maid will now enter any folder and display any errors it may encounter.
- Fixed: Crash when pressung the backbutton on a cold start.
- Fixed: Crash due to trying to load "//" after navigating to the root, then reentering the Explorer again.

### QuickAccess
- Added: Summary of estimated space affected by actions to be executed (because we can't know how much it is for VACUUM per databases, it currently just adds 4KB per database) ([#407](https://github.com/d4rken/sdmaid-public/issues/407)).

## SD Maid [4.2.8] - 25.06.2016
### Core
- Improved: Updated translations.
- Fixed: Settings pages not opening ([#424](https://github.com/d4rken/sdmaid-public/issues/424) Ty Trasd).

## SD Maid [4.2.7] - 25.06.2016
### Core
- Updated: Clutter database.
- Improved: Resiliance against weird storage setups. SD Maid will try continue even if the system API crashes while trying to determine external storages.
- Changed: The working notification is now no longer cosmetic and will elevate the service to foreground priority within the systems task killer, when the workers are done and the result is displayed, the service releases foreground mode and displays a normal notification.
- Changed: Settings layout and behavior. Removed lots of legacy code and wrote a cleaner solution that is not as fragile to support library updates.
- Fixed: Preferences not being themed correctly ([#421](https://github.com/d4rken/sdmaid-public/issues/421) Ty dukelc).

### Explorer
- Fixed: Not navigating correctly between symlinked directories ([#416](https://github.com/d4rken/sdmaid-public/issues/416) Ty Morpheus)

### AppControl
- Fixed: Uninstalls, freezing and disabling of broadcast receivers failing since v4.2.6 due to component names not being correctly wrapped when being passed to the packagemanager ([#422](https://github.com/d4rken/sdmaid-public/issues/422) Ty Roman).

### SystemCleaner
- Changed: Filter that only work on rooted devices will now be hidden if SD Maid doesn't have root (it's cleaner and less confusing).
- Fixed: Longer filter load time due to root filter being loaded on unrooted devices.

### Scheduler
- Improved: Reliability when running in background. The working notification is now used to start the service in foreground mode, which should reduce issues with SD Maid being prematurely killed to free memory ([#420](https://github.com/d4rken/sdmaid-public/issues/420)).

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
- Fixed: Issues handling files with unicode characters in their name ([#408](https://github.com/d4rken/sdmaid-public/issues/408)).
- Fixed: SD Maid accepting system busyboxes that don't work correctly (seg fault), but also return correct data ([#397](https://github.com/d4rken/sdmaid-public/issues/397)).
- Fixed: Overlapping switch buttons overlaying other UI elements on <5.0 ([#398](https://github.com/d4rken/sdmaid-public/issues/398)).

### Explorer
- Fixed: Fixed being able to select directories for the share action leading to errors ([#383](https://github.com/d4rken/sdmaid-public/issues/383)).

### AppControl
- Improved: Fixed impossible actions being visible.
- Fixed: List elements making a clicking sound despite not being clickable.
- Fixed: System app uninstall failing for files sourcing their apk from /vendor ([#410](https://github.com/d4rken/sdmaid-public/issues/410) Ty Morpheus).

### AppCleaner
- Fixed: Private app directories not being completely searched if directory permission allow reading (or more) without root ([#413](https://github.com/d4rken/sdmaid-public/issues/413) Ty rsngfrce & JERW86).

### Widget
- Improved: Handling of UI updates if multiple widgets are used.
- Fixed: All actions triggering if widget is more than one action is defined.

### Scheduler
- Improved: TimePicker will use 12/24 mode depending on system settings ([#415](https://github.com/d4rken/sdmaid-public/issues/415)).

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
- Fixed: Failing system app uninstalls if it's apk removal was blocked through a false positive ownership match ([#391](https://github.com/d4rken/sdmaid-public/issues/391) Ty Alexey).

### AppCleaner
- Added: Optional filter for files received through WhatsApp.
- Fixed: Exclusions not working completely on unrooted devices despite deactivatin the "freeStorageAndNotify" option ([#401](https://github.com/d4rken/sdmaid-public/issues/401) Ty Kisl0iD).

### Biggest
- Changed: Searchpath has been reset to prepare for future support of multiple locations.

### Databases
- Fixed: Settings displaying (not using) wrong default search pathes under specific conditions.

## SD Maid [4.2.3] - 28.05.2016
### Core
- Improved: Translations.
- Improved: Added fallback options if for some reason the default private cache or files directory doesn't exist (weird crash reports from weird devices).

### CorpseFinder
- Fixed: A few cases of false positive results within filters for "/data/app", "/data/app-private", "/data/app-asec" and "/data/app-lib", if the install number appendix is bigger than a single digit ([#394](https://github.com/d4rken/sdmaid-public/issues/394) Ty ew@XDA).

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
- Fixed: Filter-modules not loading and filter configuration being empty ([#387](https://github.com/d4rken/sdmaid-public/issues/387) Ty igoivo).
- Fixed: Crash when creating a UserFilter and entering a minimum or maximum size > Long.MAX_VALUE.

### AppCleaner
- Fixed: Crash if caches were found via clutter database entries and there was more than one entry matching the same file/directory ([#388](https://github.com/d4rken/sdmaid-public/issues/388)).
- Fixed: Non-Root routines being used even if root is not available.

## SD Maid [4.2.0] - 11.05.2016
### Core
- Added: User interface for adding and testing regular expression based exclusions.
- Improved: Translations.
- Improved: Workaround for KingoRoot should now be automatically applied (setting has been removed).
- Improved: Details entries should no longer cutoff pathes, independent of their length.
- Improved: Setup layouts are now scrollable to allow viewing full content on small devices with large fonts ([#368](https://github.com/d4rken/sdmaid-public/issues/368)).
- Improved: Reduced peak memory consumption by making a few core objects easier to be garbage collected.
- Improved: Setup help menu is now available on all setup steps and directly open the setup help page now.
- Improved: Slightly changed timing when the UI is initialised to reduce/fix a few random crashes.
- Improved: Detection of localized private data folders on Andriod N.
- Improved: Feedback on task results, previously the summary details were only visible in progress bars or the menus, now (if applicable) a snackbar temporarily shows the primary result message.
- Improved: Task description in confirmations and dialogs.
- Fixed: During secondary storage setup, storage entry not turning green despite success, on low memory devices.
- Fixed: Secondary storage detection on MediaTek devices. Added a workaround that detects this the swapped storage situation and fakes the primary UUID ([#312](https://github.com/d4rken/sdmaid-public/issues/312) Ty bgiesing).
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
- Fixed: Size being incorrectly determined (too low) for items from the sdcard filter ([#369](https://github.com/d4rken/sdmaid-public/issues/369)).
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
- Fixed: Crash when autoselecting from a filtered list ([#367](https://github.com/d4rken/sdmaid-public/issues/367)).
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
- Fixed: Startup crash on some MediaTek based devices ([#361](https://github.com/d4rken/sdmaid-public/issues/361)).
- Improved: Clutter database.
- Improved: On some custom ROMs SD Maids own cache folders was not created, SD Maid will check that now and try to create it.
- Improved: When a modded ROM is missing string resources for storage labels SD Maid will now gracefully deals with that instead of crash.
- Improved: When displaying previews, basic fallback icons for filetypes are now higher resolution and scaled to target.
- Changed: The user interface elements will now unsubscribe from workers in onPause instead of onViewDestroyed.
- Changed: The way events that happen on rotation or while the main UI was paused are cached and replayed.

### Explorer
- Improved: Pathdumps now follow symlinks ([#364](https://github.com/d4rken/sdmaid-public/issues/364)).
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
- Changed: Reduced list item height 72dp to 56dp ([#346](https://github.com/d4rken/sdmaid-public/issues/346)).

### Databases
- Changed: Removed circle cropping from app icons.

### Scheduler
- Fixed: A crash when using choosing a recurrence through the seekbar ([#339](https://github.com/d4rken/sdmaid-public/issues/339)).
- Changed: Max recurrence is now 14 days.

## SD Maid [4.1.4] - 06.04.2016 (RC)
### Core
- Added: If you accidentally disabled system apps required for storage access, SD Maid will now warn you (e.g. Package Disabler apps for Samsung).
- Improved: Secondary storage setup now tries to display the same name the documents activity also display for its storage entries.
- Improved: Busybox setup, as fallback option "/system/bin/busybox will" now also be checked ([#355](https://github.com/d4rken/sdmaid-public/issues/355)).
- Improved: Logging regarding matches exclusions.
- Improved: Stage0 busybox setup, try loading version first then do further tests.
- Fixed: Option "Don't show again" during setup of secondary storage, previously you had to toggle it on/off/on for it to stick ([#356](https://github.com/d4rken/sdmaid-public/issues/356)).
- Fixed: Duplicate test for the same busybox applet.
- Fixed: During secondary storage setup, exiting the "Documents" app without selecting something (e.g. if it's empty) now counts as failure and makes the "Don't show again" option visible ([#352](https://github.com/d4rken/sdmaid-public/issues/352)).
- Fixed: Occasional crash when exiting SD Maid during setup initialisation.

### Explorer
- Fixed: Floating Action Button not being clickable on <Android4.3 ([#357](https://github.com/d4rken/sdmaid-public/issues/357)).
- Fixed: Share file option not being visible.

### AppControl
- Fixed: Occasional crash when quickly entering or leaving app details (e.g. when uninstalling an app).

### Databases
- Added: Database entries now show if they have been skipped or failed ([#353](https://github.com/d4rken/sdmaid-public/issues/353)).
- Added: Default exclusion for AquaMail (org.kman.AquaMail) ([#354](https://github.com/d4rken/sdmaid-public/issues/354)).
- Improved: Scan performance by skipping too small files early on ([#344](https://github.com/d4rken/sdmaid-public/issues/344)).
- Fixed: Check database existence right before any sqlite3 action to prevent accidental creation of a new database ([#354](https://github.com/d4rken/sdmaid-public/issues/354)).

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
- Fixed: Bug that prevented the improved sdcard access granting (added in 4.0.11) via SAF to fail ([#231](https://github.com/d4rken/sdmaid-public/issues/231) [#330](https://github.com/d4rken/sdmaid-public/issues/330)).

### QuickAccess
- Fixed: Link to sdmaid.darken.eu/help not working.

## SD Maid [4.0.11] - 28.03.2016 (BETA)
### Core
- Improved: Translations
- Improved: Busybox error screen now shows more debugging information that might help me, help you.
- Improved: Busybox setup now cycles through other architecture canidates if the first one fails.
- Improved: Issues while granting uri access no longer take down the app (Improves upon [#336](https://github.com/d4rken/sdmaid-public/issues/336) Ty Vagelis1608).
- Improved: Granting sdcard access via SAF uri should no longer fail on most LG devices (Improves upon [#231](https://github.com/d4rken/sdmaid-public/issues/231)).
- Improved: Notification progress results are more accurate if it's only one task finishing.
- Improved: Navdrawer headcard layouting on <5.0.
- Fixed: Write-access test for java.io.File accessible storage (e.g. secondary storage + sdcardfix) ([#330](https://github.com/d4rken/sdmaid-public/issues/330) Ty gaich).
- Fixed: Crash on 4.4 devices where a hacky file deletion method for sdcards fails.

### Overview
- Improved: Text layouting being cut off early on some languages ([#331](https://github.com/d4rken/sdmaid-public/issues/331) Ty jpzex).
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
- Fixed: Subsequent delete attempts in single-pass mode only scanning and not deleting ([#329](https://github.com/d4rken/sdmaid-public/issues/329) Ty Geocfu).
- Fixed: Layout issues ([#328](https://github.com/d4rken/sdmaid-public/issues/328) Ty Geocfu)

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
- Fixed: Crash when canceling root operations ([#323](https://github.com/d4rken/sdmaid-public/issues/323) Ty Geocfu).

### QuickAccess
- Improved: Progressbar and message behavior, especiall yon rotation.
- Fixed: Inconsistent confirmation dialogs in single-pass mode.
- Fixed: Jumping textboxes ([#314](https://github.com/d4rken/sdmaid-public/issues/314) Ty Geocfu).
- Fixed: Cut off titles on small displays (as good as possible) ([#318](https://github.com/d4rken/sdmaid-public/issues/318) Ty Geocfu).
- Fixed: ButtonBar not correctly switching states in single-pass mode ([#322](https://github.com/d4rken/sdmaid-public/issues/322) Ty Geocfu).

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
- Changed: If running apps are not skipped, SD Maid will suspend (SIGSTOP) them before working on their database (root only) instead of killing them (Fixes [#325](https://github.com/d4rken/sdmaid-public/issues/325)).
- Improved: Result now indicates successful, skipped and failed operations.

## SD Maid [4.0.8] - 06.03.2015 (BETA)
### Core
- Added: Progress indicator for stats being processed at the end of a task.
- Improved: Various small layout issues.
- Improved: Clutter database.
- Improved: Translations.
- Improved: Tool events that result in an UI action other than the results being populated (showing a snackbar etc) could have dropped these theoretically before, this should now no longer happen.
- Improved: Minor text issues i.e. 'show' vs 'open'.
- Improved: Busybox check on rooted devices ([#313](https://github.com/d4rken/sdmaid-public/issues/313) Ty elhennig@github).
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
- Added: Option to allow for case sensitive search ([#230](https://github.com/d4rken/sdmaid-public/issues/230) Ty mcl21014).

### AppControl
- Added: Option to share information about your installed apps to text (other apps or text file). Currently includes: Name, package-name, version, version-code, Google-Play download link. The shared text is markdown formatted, but that's up for discussion :) ([#249](https://github.com/d4rken/sdmaid-public/issues/249) [#255](https://github.com/d4rken/sdmaid-public/issues/255) Ty cloud_strife84).
- Added: Action to 'Force stop' applications(requires root). Note that a force-stopped application will not run until the user explicitly opens it.
- Added: Force-stopped apps (e.g. apps with state stopped=true) now show a 'Stopped' tag by which you can also filter.
- Improved: UI updating and progress feedback when executing tasks from the details view.
- Improved: Killing an app will use root if available.
- Improved: When killing and root is available all pids matching the packagename will be killed instead of only the first one.
- Changed: Replaced permanent SearchBar with collapsible one in the toolbar, more screen-estate yay!
- Fixed: Double check for frozen apps always coming up empty due to reading wrong xml tag.

### SystemCleaner
- Removed: Setting entry, because we currently have no settings ([#315](https://github.com/d4rken/sdmaid-public/issues/315) Ty SuperSandro2000).

### AppCleaner
- Added: If an app is running and can't be killed, it will be skipped.
- Improved: SD Maid will now also try to use root to kill an app before working on it.

### Duplicates
- Changed: Replaced permanent SearchBar with collapsible one in the toolbar, more screen-estate yay!
- Fixed: Possible racecondition crash when deleting items while viewing details.

### Biggest
- Added: Option to delete items, via info dialog and multi selection ([#149](https://github.com/d4rken/sdmaid-public/issues/149)).
- Changed: Long press now triggers multiselection, dialog has a show option that open the Explorer.

### Databases
- Added: If an app is running and can't be killed, it's database will be skipped.
- Improved: Databases from official database folders that are sql databases are now also found ([#182](https://github.com/d4rken/sdmaid-public/issues/182) Ty h4ku).
- Improved: Only valid sql databases are now shown. 
- Improved: SD Maid will now also try to use root to kill an app before working on it's database.
- Fixed: Crash when vacuum results are processed and some databases were not accessible.
- Fixed: SD Maid being killed when running vacuum from the background (scheduler/widget).

### QuickAccess
- Improved: Marked the area where you can press the row entry to trigger its action.
- Improved: Widget events, it's a lot more responsive but may glitch, working on that.
- Changed: Button bar to FAB again (see poll).
- Fixed: Wrong icon for Databases action ([#316](https://github.com/d4rken/sdmaid-public/issues/316) Ty DO97).
- Fixed: VACUUM action not showing in the toolbar.

### Statistics
- Added: Settings now allow negative numbers. Chronic or statistics limit at 0 will remove any limits, setting it to < 0 will disable it.
- Improved: Rotation handling regarding search field.
- Improved: Entering nonsense values will now reset it to default instead of crashing.
- Improved: Layouting and removed duplicate code, the chronic is now just rehoused in a full activity if the user chooses to expand it.
- Fixed: Chart on-click behavior, replaced snackbar with actual chart-marker ([#311](https://github.com/d4rken/sdmaid-public/issues/311) Ty Geocfu1@XDA).
- Fixed: Potential crash when closing or changing rotation.

## SD Maid [4.0.7] - 2016-02-24 (BETA)
### Core
- Added: Support for /data/app-private
- Added: There is now an advanced setting that allows you to restore the unlocker icon.
- Improved: Mechanics for shell creation. This brings no noticeable change but the code is a lot clean now which makes the developer happy.
- Improved: Task & Result system to prepare for better statistics.
- Improved: Clutter database ([#299](https://github.com/d4rken/sdmaid-public/issues/299)).
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
- Fixed: 3 cases of canceling to hang endlessly ([#302](https://github.com/d4rken/sdmaid-public/issues/302) Ty Geocfu).
- Fixed: Fixed location being UNKNOWN for some subdirectories of /data.
 
### QuickAccess
- Changed: When in singlepass mode, confirmations are no longer shown ([#305](https://github.com/d4rken/sdmaid-public/issues/305) Ty Geocfu).

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
- Changed: Code related loading the coffee animation in an attempt to address glide[#928](https://github.com/d4rken/sdmaid-public/issues/928).

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
- Fixed: Picker content now refreshes after creating a file/dir ([#290](https://github.com/d4rken/sdmaid-public/issues/290)).
- Fixed: Old pro version icon being visible in the BuyPro dialog.
- Fixed: Thread synchronization when reading files, rare hanging cases and a few crashes related to canceling are fixed now.
- Fixed: Progress indicators in the navigation drawer being shown for wrong items.
- Fixed: Entering and exiting item details should no longer cause memory leaks.
- Fixed: Crash when entering and exiting the details view and then deleting an item through the tools main page.
- Changed: Task error handling, previously some errors might just have been ignored instead of crashing the app, preventing me from finding out about them and fixing it

### Explorer:
- Improved: UX by disabling the new file/dir add button if no text is entered ([#282](https://github.com/d4rken/sdmaid-public/issues/282)).
- Changed: Visual distinction between user and default bookmarks ([#284](https://github.com/d4rken/sdmaid-public/issues/284)).
- Fixed: ActionMode staying active despite leaving the main activity.
- Fixed: After permission changes not scrolling to the right item.
- Fixed: Crash when trying to add a bookmark on an unloaded Explorer ([#286](https://github.com/d4rken/sdmaid-public/issues/286)).
- Fixed: Fixed FAB button showing with sidebar open ([#285](https://github.com/d4rken/sdmaid-public/issues/285)).

### Searcher
- Fixed: Root search checkbox being weird ([#287](https://github.com/d4rken/sdmaid-public/issues/287)).

### CorpseFinder
- Improved: The UninstallWatcher now only returns results that can be attributed to the uninstalled app.
- Improved: SDCard filter scanning speed.
- Changed: Trying new icon. Ghosty :)
- Fixed: Corpse filter not acting according to their default settings value.

### AppControl
- Improved: Cross check items that are to be removed on uninstall if they are shared with another app.
- Fixed: APK export failing when exporting to external sdcards on 5.0+ ([#271](https://github.com/d4rken/sdmaid-public/issues/271) & [#270](https://github.com/d4rken/sdmaid-public/issues/270)).
- Fixed: Crash on apps that either don't have an apk file or they have one but SD Maid can't find it.
- Fixed: Not being able to enter app details again after uninstalling an app.

### AppCleaner
- Fixed: Exclusions are no longer applied if we can't enforce them (e.g. non-root private caches) ([#246](https://github.com/d4rken/sdmaid-public/issues/246)).

### Duplicates
- Fixed: Being able to press/longpress the header when viewing details which lead to a crash.

### Scheduler
- Fixed: Rewritten the external task system, which is now what both scheduler and widgets use to trigger actions indirectly (fixes [#277](https://github.com/d4rken/sdmaid-public/issues/277)).
- Fixed: Scheduler failing because setup was not done by enforcing the setup to happen before setting a schedule (fixes [#278](https://github.com/d4rken/sdmaid-public/issues/278)).

### QuickAccess
- Improved: Dialog messages in single-pass mode ([#279](https://github.com/d4rken/sdmaid-public/issues/279)).
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
- Fixed: Crash upon entering the exclusion manager ([#274](https://github.com/d4rken/sdmaid-public/issues/274)).

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
- Fixed: Rotation crash in receiver manager ([#263](https://github.com/d4rken/sdmaid-public/issues/263)).
- Improved: Improved receiver manager layouting ([#266](https://github.com/d4rken/sdmaid-public/issues/266)).

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
