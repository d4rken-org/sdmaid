# Changelog
- Latest production version: v5.2.2(50202), Unlocker v4.4.1(40401)
- Latest beta version: v5.3.0(50300)
- Legacy versions: [v4.15.15](changelogV4.md), [v3.1.5.4](changelogV3.txt), [v2.1.4.1](changelogV2.txt), [v0.9.8.9](changelogV1.txt).

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
