# Changelog
- Latest production version: v5.3.15(50315), Unlocker v4.4.1(40401)
- Latest beta version: v5.3.18(50318)
- Legacy versions: [v4.15.15](changelogV4.md), [v3.1.5.4](changelogV3.txt), [v2.1.4.1](changelogV2.txt), [v0.9.8.9](changelogV1.txt).

## SD Maid [v5.3.18](https://github.com/d4rken/sdmaid-public/milestone/163?closed=1) 09.04.2022
### Core
- Improved: Clutter database.
- Improved: Translations.

### AppControl
- Improved: Retreived information about `LIBRARY` type packages-
- Added: Support for uninstalling `LIBRARY` packages if rooted (e.g. `Trichrome Library` packages).

### AppCleaner
- Improved: ACS matching for various ROMs and languages.

## SD Maid v5.3.17 03.04.2022
### Core
- Fixed: App crash when using accessibility service based features (NPE due to race condition).

## SD Maid [v5.3.16](https://github.com/d4rken/sdmaid-public/milestone/162?closed=1) 27.03.2022
### Core
- Improved: Clutter database.
- Improved: Added additional fallback options to how SD Maids accessibility service works, this increases resilience and compatibility with different ROMs, but does not fix all current issues.

### Explorer
- Fixed: UI issues where snackbars and dialogs would reappear after pausing/resuming SD Maid.

### AppCleaner
- Improved: Bugreporting filter.
- Improved: Hidden chaches filter on MIUI ROMs.
- Improved: ACS retry mechanism. Some ROMs (e.g. Huawei) need a short delay to calculate the values displayed in an app's settings page. If SD Maid reads the page too quickly, the items we are looking for at not found on screen. So now if SD Maid sees an ellispsis characters and the initial check failed, a short delay is added before the next try (#5401).
- Improved: ACS support for Ukranian.

### Statistics
- Fixed: Default retention now being correctly reflected in the settings UI.
- Changed: Statistics limit has been increased to 365 days.

## SD Maid [v5.3.15](https://github.com/d4rken/sdmaid-public/milestone/161?closed=1) 03.03.2022
### Core
- Fixed: Storage detection on Samsung S22 devices running Android 12.

### AppCleaner
- Improved: ACS matching for Huawei devices running Android 12 and locale `ca`.
- Improved: Telegram filter (location moved to Android/data).

## SD Maid [v5.3.14](https://github.com/d4rken/sdmaid-public/milestone/160?closed=1) 19.02.2022
### AppCleaner
- Improve: ACS matching for MIUI ROMs.
- Added: Offline cache filter targeting Google Play Instant Apps.
- Fixed: WhatsApp backup filter.

## SD Maid [v5.3.13](https://github.com/d4rken/sdmaid-public/milestone/159?closed=1) 12.02.2022
### Core
- Improved: Updated translations.
- Improved: Clutter database.
- Fixed: Status bar overlaying elements in a few cases (i.e. header card in the nav drawer).
- Changed: Instead access of private app data on rooted device with Android 11+. Instead of working with `/data_mirror` for which SD Maid still has incomplete support, SD Maid will now use Magisk's `--mount-master` to restore pre Android 11 behavior with regards to accessing `/data/data`.

### AppCleaner
- Improved: ACS matching on Samsung ROMs.

## SD Maid [v5.3.12](https://github.com/d4rken/sdmaid-public/milestone/158?closed=1) 05.02.2022
### Core
- Improved: Translations.
- Improved: Clutter database.
- Fixed: Statusbar overlaping navigation header card.

### AppCleaner
- Improved: ACS matching for `ru` on OnePlus devices with Android 12.
- Improved: Exclusions are now applied earlier during scan, this should make it easier for low powered devices to exclude large folders from being scanned (#5324).

### StorageAnalyzer
- Fixed: Not being able to delete some items on rooted Android 12 under `/data/data` (#5325).

## SD Maid [v5.3.11](https://github.com/d4rken/sdmaid-public/milestone/157?closed=1) 21.01.2022
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: ACS should now handle non-breaking-spaces correctly in AppControl/AppCleaner (#5238).

### AppCleaner
- Improved: ACS support for Android 10+ on AOSP devices (#5266)
- Improved: ACS support on Samsung devices with Android 9+.
- Improved: ACS support on MIUI11 ROMs.

## SD Maid [v5.3.10](https://github.com/d4rken/sdmaid-public/milestone/156?closed=1) 07.12.2021
### Core
- Improved: Clutter database.
- Fixed: Crash related to Google Play services.

## SD Maid v5.3.9 04.12.2021
### Core
- Improved: Translations.
- Improved: Clutter database.
- Added: I've added a grace period that keeps the pro status for a bit, when upgrading via Google Play In-App purchase, as Google Play does not reliably return IAP data.
- Fixed: Api level check. Some devices where crashing due to supplying inconsistent version information (faking higher Android versions).
- Fixed: Read check for single files/directories when using SAF mode. It always returned `exists=true`, afaict it only affected copy/move within the explorer.

### Explorer
- Fixed: Crash when trying to copy/move some files that require SAF mode.

### AppCleaner
- Improved: ACS matching on Android 12 for `pl`.

## SD Maid v5.3.8 29.11.2021
### Core
- Improved: Translations.
- Fixed: Crash during SAF setup. If the newer storage API don't return a path for a StorageVolume, we now try the legacy (reflection-based) APIs as fallback.
- Fixed: Crash on faulty ROMs, where an API is not available despite the Android version being high enough.
- Fixed: Crash when deleting files and the storage state changes, after search but before deletion, e.g. storage being mounted/unmounted/ejecting. We'll now just skip such a file, results in most tools correctly refect the deletion failure, as X items remaining/skipped.
 
## SD Maid [v5.3.7](https://github.com/d4rken/sdmaid-public/milestone/155?closed=1) 23.11.2021
### Core
* Improved: Additional debug output and code changes to make it easier for be to debug permission issues on specific ROMs.
* Fixed: Permission setup for `Android/data` on OnePlus devices with Android 11+ (Thanks Craig).

### AppControl
- Fixed: App estates showing all potential folders belonging to an app instead of just those that exist.

### StorageAnalyzer
- Fixed: `/data/data` being empty on Android 11+, SD Maid will apply `--mount-master` when scanning `/data` to circumvent the bind mount from `/data_mirror` #5201).

## SD Maid [v5.3.6](https://github.com/d4rken/sdmaid-public/milestone/154?closed=1) 17.11.2021
### Core
- Added: Restored access to `Android/data` on Android 11 & 12 (#5183).
- Improved: Fixed files on sdcard not being deletable on some ROMs due to storage write access detection defaulting to `NORMAL` instead of using `SAF` during write check, but not read check (#5179).
- Improved: Translations.
- Improved: Scan speed by optimizing root check.
- Improved: SAF permission setup should be simpler now on Android 9,10,11 and 12. Window should open on the correct path.
- Improved: File crawling performance when using SAF access.

### SystemCleaner
- Improved: ANR filter.

### QuickAccess
- Improved: Hint to enable accessibility service now also shows when using the button bar at the bottom (#5178).

### StorageAnalyzer
- Improved: Scan on Android 11 & 12, inclusion of `Android/data`. Note that `Android/obb` is currently not supported on Android 11 & 12.

## SD Maid [v5.3.5](https://github.com/d4rken/sdmaid-public/milestone/153?closed=1) 06.11.2021
### Core
- Improved: Translations.
- Fixed: License link from apps.darken.eu not being opened in SD Maid on Android 12.

### SystemCleaner
- Improved: ANR filter.

### AppCleaner
- Improved: ACS matching for Samsung ROMs @ Android 10.

## SD Maid [v5.3.4](https://github.com/d4rken/sdmaid-public/milestone/152?closed=1) 04.11.2021
### Core
- Improved: Translations.
- Fixed: Read access determination code erroneously returning `NORMAL` on some rooted ROMs for locations such as `/data` (SD Maid should always use root permission for `/data` if available).

### AppCleaner
- Added: New filter for `code_cache` folders.
- Improved: ACS matching for Samsung & OnePlus ROMs.

### StorageAnalyzer
- Fixed: Lookup of `/data` not using root on some rooted ROMs.

## SD Maid [v5.3.3](https://github.com/d4rken/sdmaid-public/milestone/151?closed=1) 01.11.2021
### Core
- Improved: Translations.
- Improved: Logic that determines which read/write permissions are used for which storage.
- Improved: Support for private app data folders on Android 11+ (the original `/data/data` is an overlay, actual data is at `/data_mirror`).
- Fixed: Deletion failing for public storages on unrooted Android 11+ devices.

### Scheduler
- Fixed: Scheduler not getting restored after reboots (#5168).

## SD Maid [v5.3.2](https://github.com/d4rken/sdmaid-public/milestone/150?closed=1) 31.10.2021
### Core
- Improved: Translations.
- Improved: Error logging.
- Fixed: Storage detection failing on Android TV devices with Android 11.
- Fixed: Reading public storage on rooted Android 11+ devices. Root is now utilized to read `Android/data|obb`.

### AppCleaner
- Improved: ACS matching for Samsung devices.
- Fixed: ColorOS ROMs not being detected in some cases.

### StorageAnalyzer
- Fixed: Crash when scanning secondary public storages on some Android 11 ROMs.

## SD Maid [v5.3.1](https://github.com/d4rken/sdmaid-public/milestone/149?closed=1) 27.10.2021
### Core
- Improved: Error logging for SAF file reading.
- Improved: Translations.
- Fixed: Crash during setup wizard due to some devices not supporting the standard AOSP activity intent `Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION` (!?).
- Fixed: Fixed crash on storage initialization. NPE on some ROMs where SD Maid tried to read ids and labels for storages from the system API via reflection.

### AppCleaner
- Improved: Offline cache filter (vlc subtitles) (#5052).

### StorageAnalyzer
- Fixed: Crash when trying to the storage index/home view (NPE due to bad case switch between normal file items and the home item representing all storages).

### Duplicates
- Fixed: Crash when trying to calculate the checksum for a deleted file (could happen when multiple SD Maid tools are run simultaneously.

## SD Maid [v5.3.0](https://github.com/d4rken/sdmaid-public/milestone/126?closed=1) 26.10.2021
### Core
- Added: SAF based read-access for secondary storages on Android 5-10. Previously SD Maid could only support a secondary storage if readable through normal Java-file access, where SAF access was only required for write/delete actions. Now SD Maid supports storages that are just readable using the storage access framework (SAF).
- Improved: Translations.
- Improved: Clutter database.
- Improved: Storage access on Android 11&12.
- Changed: Debug menu.
- Fixed: Crash when updating widget.

### Explorer
- Improved: Explorer bookmark refresh behavior, default bookmarks should be reloaded automatically once SD Maid has scanned for storages.
- Fixed: Crash due to UI update on background thread.

### AppControl
- Improved: Task feedback when creating shortcuts.

### CorpseFinder
- Improved: Dalvik-* filter support for Android 11+.

### SystemCleaner
- Improved: Support for Android 11+.
- Improved: Support for secondary storages.

### AppCleaner
- Improved: Recycle-bin filter.
- Improved: ACS matching on various ROM/language combinations.

### Duplicates
- Improved: Support for Android 11+.
- Improved: Support for secondary storages.

## SD Maid [v5.2.2](https://github.com/d4rken/sdmaid-public/milestone/148?closed=1) 07.10.2021
### Core
- Improved: Logging for various tools.
- Changed: Display language labels in their own language (#4823).
- Fixed: Crash when donating a coffee.

### Explorer
- Improved: Checksum dialog now also shows file path (#4836).
- Fixed: Checksum dialog not closing action mode (#4837).
- Fixed: Checksum dialog showing multiple times when SD Maid is paused/resumed (#4838).

### Searcher
- Fixed: find/grep search terms being stored inconsitently, now happens after pressing search (#4772).

### SystemCleaner
- Improved: Ownership for exported filters is now correctly display (#4504).
- Fixed: Missing feedback when importing custom filters (#4092).

## SD Maid [v5.2.1](https://github.com/d4rken/sdmaid-public/milestone/147?closed=1) 05.10.2021
### Core
- Improved: Translations.
- Fixed: Background crash on devices without Google Play services.

### AppCleaner
- Improved: Compatibility with Xiaomi devices (MIUI11/12, specifically Mi 10[T Pro]).
- Fixed: Potential NPE crashing the accessibility service when logging is enabled.

## SD Maid [v5.2.0](https://github.com/d4rken/sdmaid-public/milestone/146?closed=1) 04.10.2021
### Core
- Improved: In-app purchase handling.
- Improved: Updated a few dependencies.
- Fixed: Navigation drawer somtimes not reflecting pro status.
- Fixed: A few random crashes on app launch related to async background checks for IAPs.

### AppControl
- Added: New feature `Custom action`. You can input labels in AppControl settings, and then execute `Custom action` on one or more selected apps. Example: Input the labels `Disable` + `Disable app` and use it to batch disable multiple apps ([Demo Video](https://www.youtube.com/watch?v=4aR7H3Cihk8)).
- Improved: Reworked some internal structures related to initating the AppControl tool.

## SD Maid [v5.1.10](https://github.com/d4rken/sdmaid-public/milestone/145?closed=1) 26.09.2021
### Core
- Improved: Updated translations.
- Improved: Updated clutter database.
- Improved: Update In-App-Purchase to improve synchronization.
- Fixed: Screen staying when SD Maid is not working (#4962).

### AppCleaner
- Improved: ACS Matching for RealMe ROMs.
- Improved: Hidden caches filter.
- Improved: Default exclusion for system apps that can't be cleared via ACS on Android 11 (#5077).

### StorageAnalyzer
- Improved: Compatibility with unrooted Android 11 devices.
- Fixed: Failure to read `Android/*` subdirectories via SAF resulting in incorrect sizes.

## SD Maid [v5.1.9](https://github.com/d4rken/sdmaid-public/milestone/144?closed=1) 30.08.2021
### Core
- Improved: Updated translations.
- Improved: Updated clutter database.

### Explorer
- Fixed: Crash when scanning directory and owner research is not enabled.

### AppCleaner
- Added: Experimental option to specify a custom ACS sequence of labels for SD Maid to click.
- Improved: Compatibility with different ROMs and languages.

## SD Maid [v5.1.8](https://github.com/d4rken/sdmaid-public/milestone/143?closed=1) 11.08.2021
### Explorer
- Fixed: Crash due to faulty parcel creation when opening clutter reporter.

## SD Maid [v5.1.7](https://github.com/d4rken/sdmaid-public/milestone/142?closed=1) 10.08.2021
### Core
- Added: Support for SAF based file preview generation.
- Improved: Clutter database.
- Improved: When using apps.darken.eu, show a more specific error message if the device quota is reached.
- Fixed: Issue with analytics sometimes causing a crash on low storage devices.
- Fixed: SAF based deletion sometimes failing for no good reason (system said SD Maid can not delete the fail, but if actually trying it, it works).
- Fixed: SAF based deletion always saying 0 bytes deleted.

### AppCleaner
- Improved: ACS based cache deletion for Android 11+ Samsung ROMs in all languages (ty @spiritETG)
- Improved: WhatsApp Send/Receive/Backup matching.
- Improved: Added a forced refresh as fallback behavior for cases where the initial system data is empty for some reason on some ROMs.
- Fixed: ACS based deletion on Samsung devices.

## SD Maid [v5.1.6](https://github.com/d4rken/sdmaid-public/milestone/141?closed=1) 19.06.2021
### Core
- Improved: Translations.
- Improved: Initial setup flow, removed a few annoying quirks and improved the layouts.
- Improved: Storage-Access-Framework (SAF) path reading performance (#4886).

### AppCleaner
- Improved: ACS Matching on ColorOS (#4939).

## SD Maid [v5.1.5](https://github.com/d4rken/sdmaid-public/milestone/140?closed=1) 19.06.2021
### Core
- Improved: Translations.
- Improved: Clutterd database.
- Improved: Internal refactoring.

### Explorer
- Fixed: Crash on Android 11 when trying to view `Android/data` via SAF and file permissions couldn't be read (#4899).

### AppCleaner
- Improved: Color ACS matching on Android 8.1 (#4817).
- Improved: `ar` locale mapping on OnePlus devices on Android 11 (#4812).
- Improved: Hidden caches, recyclebin and bug reporting filter (#4804,#4802).
- Improved: ACS matching on Samsung devices with Android 11.
- Improved: WhatsApp related filters support `Android/media` now (#4910).

## SD Maid v5.1.4 03.05.2021
### Core
- Improved: Translations.

## SD Maid v5.1.3 02.05.2021
### Core
- Improved: Added additional instructions to SAF setup, to help with selecting the right paths.
- Fixed: Crash on certain root setups when SD Maid attempts to find a way to get a running binary that work with root.
- Fixed: Issue with error reporting not being correctly setup on some devices.

### QuickAccess
- Improved: AppCleaner deletion will suggest enabling ACS if necessary.
 
### AppCleaner
- Improved: ACS matching Samsung, Android 11, locale "cs".

## SD Maid [v5.1.2](https://github.com/d4rken/sdmaid-public/milestone/139?closed=1) 27.04.2021
### Core
- Fixed: Crash during storage detection on certain ROMs. Previous changes allowed for duplicate sdcard storage elements which got caught during later validiation (as it should be) and lead to a crash.

## SD Maid [v5.1.1](https://github.com/d4rken/sdmaid-public/milestone/138?closed=1) 26.04.2021
### Core
- Improved: Clutter database.
- Improved: Translations.
- Improved: Internal storage detection.

### Explorer
- Improved: Extracting zip files.

### AppCleaner
- Improved: Hidden caches filter.
- Improved: Trashbin filter.
- Improved: Bugreporting filter.
- Improved: ACS matching on Samsung, Vivo and ColorOS ROMs.

## SD Maid [v5.1.0](https://github.com/d4rken/sdmaid-public/milestone/136?closed=1) 01.03.2021
### Core
- Improved: Clutter database.
- Improved: Improved data access on Android 11 (#4571), extended setup to include selecting an SAF path for primary storage.

### Explorer
- Improved: Preliminary access to `Android/data` on Android 11, read/delete should work, copy/move not yet.

### CorpseFinder
- Improved: Access to `Android/data` on Android 11.

### SystemCleaner
- Improved: Access to `Android/data` on Android 11.

### AppCleaner
- Improved: Bug reporting filter.
- Improved: ACS matching for Korean on LGE & AOSP ROMs.
- Improved: Access to `Android/data` on Android 11.

## SD Maid [v5.0.11](https://github.com/d4rken/sdmaid-public/milestone/137?closed=1) 22.02.2021
### Core
- Fixed: Crash to due invalid clutter database data.

## SD Maid [v5.0.10](https://github.com/d4rken/sdmaid-public/milestone/137?closed=1) 22.02.2021
### Core
- Improved: Clutter database (🍰).
- Improved: Translations (☕).

## SD Maid [v5.0.9](https://github.com/d4rken/sdmaid-public/milestone/135?closed=1) unreleased
### Core
- Improved: Clutter database.

### AppCleaner
- Added: Preliminary support for ACS based cache deletion on "Nubia" devices, locale "es" (#4527).
- Improved: Use scrolling mechanics to better support ACS based cache deletion on Android TV.
- Improved: ACS based cache deletion on LGE devices, locale "pt".
- Improved: ACS bnased cache deletion on Samsung Android 10+ devices, locale "in" (#4508).
- Improved: ACS based cached eletion on RealME devices, locale "ru".

## SD Maid [v5.0.8](https://github.com/d4rken/sdmaid-public/milestone/134?closed=1) 17.01.2021
### Core
- Improved: Clutter database.

### AppCleaner
- Added: Preliminary support for ACS based cache deletion on Android TV devices (#4149).
- Improved: ACS matching on AOSP ROMs for locales `pa,az`.
- Improved: ACS matching on ColorOS ROMs for locales `th,ja`.
- Improved: ACS matching on MIUI ROMs for locales `sl,ms,hr,ro,sk,th,lo`.
- Improved: ACS matching on RealMe ROMs for locales `de,fil`.
- Improved: ACS matching on LGE ROMs for locale `pt`.
- Fixed: Issues with ACS matching on Vivo ROMs (#4487).
- Fixed: Some cases of ACS fallback routines not triggering on AOSP ROMs.

## SD Maid [v5.0.7](https://github.com/d4rken/sdmaid-public/milestone/133?closed=1) 02.01.2021
### Core
- Improved: Clutter database.

### SystemCleaner
- Improved: Use root if available to scan `Android/data` on Android 11+ (#4483).
- Changed: Obsolete APK filter description to indicate that APKs with lower or EQUAL version are deleted (#4485).

### AppCleaner
- Added: ACS Support for Vivio Android 10+ ROMs (#4487).
- Improved: ACS Support for locales `th,is,ka,bs` on Samsung API 29+.
- Improved: ACS Support for LANIX Android 7.0 ROMs.
- Improved: ACS Support for LGE API29+ ROMs, locale `eu`.
- Improved: ACS Support for MIUI 11 ROMs on Android 8.0+.
- Improved: ACS Support for ColorOS API28+ locales `jp,ru,th,pl,ka,ar,es,tr,fr,vi,ms`.

## SD Maid [v5.0.6](https://github.com/d4rken/sdmaid-public/milestone/132?closed=1) 24.12.2020
### AppCleaner
- Improved: Compatibility with colorOS ROMs (API28/29, German, Indian, Dutch, Chinese).

## SD Maid [v5.0.5](https://github.com/d4rken/sdmaid-public/milestone/131?closed=1) 20.12.2020
### AppCleaner
- Improved: Compatibility with colorOS ROMs (API28, Italian).
- Improved: Debugging options to easier add support for new ROMs & languages.

## SD Maid [v5.0.4](https://github.com/d4rken/sdmaid-public/milestone/130?closed=1) 20.12.2020
### Core
- Improved: Translations.
- Improved: Clutter database. So many new entries! (Ty u/Ingood5).

### AppCleaner
- Improved: Updated advertisement filter.
- Improved: Updated hidden caches filter.
- Improved: Updated trashbin filter.
- Improved: Changes to bug reporting to make it easier to support more devices and languages.
- Fixed: ACS matching for Polish on Samsung devices with Android 9.

## SD Maid [v5.0.3](https://github.com/d4rken/sdmaid-public/milestone/129?closed=1) 15.11.2020
### Core
- Improved: Translations.
- Changed: Removed the ACS Permission step from the onboarding setup.

## SD Maid [v5.0.2](https://github.com/d4rken/sdmaid-public/milestone/128?closed=1) 08.11.2020
### Core
- Improved: Translations.
- Improved: Clutter database (Ty u/Ingood5 & u/adsakeme on GitHub).
- Changed: Because it was apparently not obvious enough, the "permanently skip" option in the initial setup will now pop-open once.

### AppCleaner
- Improved: Hidden caches filters.
- Improved: Advertisements filter.
- Improved: Better ACS compatibility with OPPO devices (#3864).
- Improved: Matching for Polish on Samsung API 29+ ROMs.
- Fixed: A bug where SD Maid would not correctly try all available fallback mechanisms for some language & ROM combinations when using the accessibility service.

## SD Maid [v5.0.1](https://github.com/d4rken/sdmaid-public/milestone/127?closed=1) 25.10.2020
### Core
- Improved: Update clutter database (Ty u/Ingood5 on GitHub).
- Improved: Fixed minor UI issues.
- Improved: Added accessibility service setup to setup flow, can be skipped. If the accessibility service and usage stats permission are enabled, AppCleaner will automatically enable the features that use it, unless explicitly disabled (i.e. not on default values).
- Fixed: Crash when trying to detect file ownership in some scenarios on rooted Android 11 devices.

### Explorer
- Fixed: Wrong message being used for the force media scan result (4096).

### AppControl
- Fixed: Task result snackbars and dialogs being shown inconsistently (#4158).

### CorpseFinder
- Fixed: Crash when using nested exclusions (#3952).

### SystemCleaner
- Fixed: Filter order being inconsistent (now sorted by title, #3862).
- Fixed: Filter export sometimes not showing a result message (#4092).

### AppCleaner
- Added: ACS support for polish Samsung Android 10 ROMs (#4124).
- Improved: Updated filters for hidden cache, recycle bins files and bug reporting files.
- Fixed: ACS Matching on Android 11 Asus devices (#4046).

## SD Maid [v5.0.0](https://github.com/d4rken/sdmaid-public/milestone/123?closed=1) 27.09.2020
### Core
- Improved: General dependency updates.
- Improved: Update clutter database.
- Improved: Translations.
- Improved: Fixed minor UI issues.
- Changed: Android minApiLevel from 16(4.1) to 21 (5.0). This means that the latest version for Android 4.1 to 4.4 is SD Maid v4.15.15.
- Changed: Raised target API level to 29(Android 10) to improve compatbility with Android 10.

### CorpseFinder
- Fixed: Crash when using nested exclusions (#3952).

### AppCleaner
- Improved: Updated filters for hidden cache, recycle bins files and bug reporting files.
- Fixed: ACS Matching on Android 11 Pixel devices (#3939).
