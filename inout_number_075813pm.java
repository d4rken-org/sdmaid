
On March 1st, our discounts for semi-annual and annual offers will change to 7% and 15% respectively.
Choose semi-annual or annual subscription before February 28th to still get 10% and 25% discount.

AppFollow API
You can use AppFollow API to create your own dashboards, real time tracking features and custom reports.
Access to API is open for Free plan as well as for all Premium plans.

Basic
API Base URL: https://api.appfollow.io

Message format — JSON

Format requests — GET, POST

To get access to our API you need:
cid — 35329
api_secret — ccY2tbUdMWctEUWtDmFG

All data requests to AppFollow should be signed. Signature is following after sign parameter.

SDK
Please check out the official JavaScript SDK: https://github.com/AppFollow/appfollow-api-js

How to create signature
Sorted request parameters in following format:

sign = md5(
	parameter’s name and value (sort by name ex. apps_id, cid ...),
	API method (URI path, e.g.: /test),
	api_secret
)
Signature example:

sign = md5(cid=124ext_id=903655975/reviewsYOUR_API_SECRET)
sign = md5(apps_id=1111cid=124/testYOUR_API_SECRET)
Handling Errors
In case there are any errors, server answer would be in JSON format, status is 200 (except mistakes 502 и 504).

Error example: https://api.appfollow.io/sdsd

Methods
1.  App collections list
EndPoint: /apps

Required parameters:
cid — client ID

Example:
sign = md5('cid=35329/appsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/apps?cid=35329&sign=3d661d7f1b6d5c3f8e7439af51574e24

2.  Apps of the collection
EndPoint: /apps/app

Required parameters:
cid — client ID
apps_id — app collection ID

Example:
sign = md5('apps_id=42630cid=35329/apps/appccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/apps/app?apps_id=42630&cid=35329&sign=38223c286d98d0094dcf2582fce857d9

3.  Reviews
EndPoint: /reviews

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
review_id — review ID in Store
page — page number
date — date in format: YYYY-MM-DD
last_modified — date and time of last update in format: YYYY-MM-DD HH:MM:SS
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
lang — lang (for Google Play apps only) in short format e.g. en
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD
custom_status — filter by status (open|closed|reopened). You can list multiple statuses with commas (e.g. open,reopened)

Example:
sign = md5('cid=35329ext_id=com.aita/reviewsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reviews?ext_id=com.aita&cid=35329&sign=e8050eae6b8402dbd73d9fd7196d8558

4.  Reviews Summary
EndPoint: /reviews/summary

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
lang — lang (for Google Play apps only) in short format e.g. en
version — app version (for App Store apps or Google Play with Google Play Console integration) e.g. 1.1.1

Example:
sign = md5('cid=35329ext_id=com.aita/reviews/summaryccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reviews/summary?ext_id=com.aita&cid=35329&sign=a7b69cb1c0ce9ffd3639678930a10fc8

5.  Review Reply
EndPoint: /reply

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers
review_id — review ID in Store
answer_text — reply for review

Additional parameters:
login — api user login for statistics and display in reviews list (private beta, please contact support)

Example:
sign = md5('answer_text=answer_textcid=35329ext_id=498958864review_id=2455079393/replyccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reply?ext_id=498958864&review_id=2455079393&answer_text=answer_text&cid=35329&sign=8eae135a534dd3d5ae8ad4efc6da3144

6.  Review Tags Update
EndPoint: /tags/update

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers
review_id — review ID in Store
tags — set tags name. Use comma or breakline to separate tags, e.g. dislike, bug, crush...

Additional parameters:
apps_id — app collection ID

Example:
sign = md5('cid=35329ext_id=498958864review_id=2455079393tags=tag1,tag2/tags/updateccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/tags/update?ext_id=498958864&review_id=2455079393&tags=tag1%2Ctag2&cid=35329&sign=c71c62d944c3733a95de238db2d3458e

7.  Review Bug Trackers Update
EndPoint: /bt_tags/update

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers
review_id — review ID in Store
tags — set bugtracker tags name. Using a special prefix, like 'OTRS' Use comma or breakline to separate tags, e.g. OTRS-001,OTRS-002,OTRS-003...

Additional parameters:
apps_id — app collection ID

Example:
sign = md5('cid=35329ext_id=498958864review_id=2455079393tags=OTRS-tag1,OTRS-tag2/bt_tags/updateccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/bt_tags/update?ext_id=498958864&review_id=2455079393&tags=OTRS-tag1%2COTRS-tag2&cid=35329&sign=d69563895d5a73a736daad7d30438310

8.  Review Notes Update
EndPoint: /notes/update

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers
review_id — review ID in Store
content — note messages

Example:
sign = md5('cid=35329content=content noteext_id=498958864review_id=2455079393/notes/updateccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/notes/update?ext_id=498958864&review_id=2455079393&content=content%20note&cid=35329&sign=d8769435f57b2c5ff3fd85a135e61456

9.  Ratings
EndPoint: /ratings

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
date — date in format: YYYY-MM-DD
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
lang — lang (for Google Play apps only) in short format e.g. en

Example:
sign = md5('cid=35329ext_id=com.aita/ratingsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/ratings?ext_id=com.aita&cid=35329&sign=e386422db1e74d4836790615e878faf1

10.  Versions (any changes including meta data)
EndPoint: /versions

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
page — page number
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
lang — lang (for Google Play apps only) in short format e.g. en

Example:
sign = md5('cid=35329ext_id=com.aita/versionsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/versions?ext_id=com.aita&cid=35329&sign=6920231a3956f0454f6e2222581a1e54

11.  What's New (new versions)
EndPoint: /whatsnew

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
page — page number
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
lang — lang (for Google Play apps only) in short format e.g. en
last_modified — date and time of last update in format: YYYY-MM-DD HH:MM:SS

Example:
sign = md5('cid=35329ext_id=com.aita/whatsnewccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/whatsnew?ext_id=com.aita&cid=35329&sign=a85022ad44b3aea144c4ce861a917f05

12.  Rankings
EndPoint: /rankings

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
page — page number
date — date in format: YYYY-MM-DD
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
device — e.g. iphone, ipad, android

Example:
sign = md5('cid=35329ext_id=com.aita/rankingsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/rankings?ext_id=com.aita&cid=35329&sign=aed9745ea04cdb03fb60a84df78bb32e

13.  Keywords
EndPoint: /keywords

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
page — page number
date — date in format: YYYY-MM-DD
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
device — e.g. iphone, ipad, android

Example:
sign = md5('cid=35329ext_id=com.aita/keywordsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/keywords?ext_id=com.aita&cid=35329&sign=62177946ee0187b6eb41626af0e5b6d5

14.  Keywords Edit
EndPoint: /keywords/edit

Required parameters:
cid — client ID
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
device — e.g. iphone, ipad, android
keywords — set keywords. Use comma or breakline to separate keywords, e.g. hotel, booking, book a hotel, ...

Additional parameters:
apps_id — app collection ID: (if not set, then will take first of collections)

Example:
sign = md5('cid=35329country=countrydevice=devicekeywords=keyword1,keyword2,keyword3/keywords/editccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/keywords/edit?country=country&device=device&keywords=keyword1%2Ckeyword2%2Ckeyword3&cid=35329&sign=80afb823a98db1da35d1f96c8d0209aa

15.  ASO Suggest
EndPoint: /aso/suggest

Required parameters:
cid — client ID
term — keyword

Additional parameters:
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
device — e.g. iphone, ipad, android

Example:
sign = md5('cid=35329term=term/aso/suggestccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/aso/suggest?term=term&cid=35329&sign=47705241af4745b8c24941b778a544f3

16.  ASO Search
EndPoint: /aso/search

Required parameters:
cid — client ID
term — keyword

Additional parameters:
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
device — e.g. iphone, ipad, android

Example:
sign = md5('cid=35329term=term/aso/searchccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/aso/search?term=term&cid=35329&sign=b79c52b7513e5d30ee5ad86f93a8c953

17.  ASO Search Ads
EndPoint: /aso/search_ads

Required parameters:
cid — client ID
app — name app ex. telegram
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us

Additional parameters:
phrase — messenger

Example:
sign = md5('app=telegramcid=35329country=ru/aso/search_adsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/aso/search_ads?app=telegram&country=ru&cid=35329&sign=6a671be6905045e285b181305466f916

18.  ASO Trending
EndPoint: /aso/trending

Required parameters:
cid — client ID
keyword — keyword

Additional parameters:
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
device — e.g. iphone, ipad, android

Example:
sign = md5('cid=35329keyword=keyword/aso/trendingccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/aso/trending?keyword=keyword&cid=35329&sign=d1c291ed4d005dcc6b9a8b58e233e8db

19.  App Analytics
EndPoint: /app_analytics

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
channels — e.g. summary,channel,campaign
date_from — date in format: YYYY-MM-DD
date_to — date in format: YYYY-MM-DD

Example:
sign = md5('cid=35329ext_id=com.aita/app_analyticsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/app_analytics?ext_id=com.aita&cid=35329&sign=463a3eb5e6a3ee8aeaff39efd5a2e46e

20.  ASO Reports
EndPoint: /reports/aso_report

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers
channel — e.g.
for App Store connect: summary, time_series, channel, channel_country, campaign, site
for Google Developer Console: сountry_summary, channel, country_organic_summary

Additional parameters:
country — country code e.g. us: for channel: time_series, channel_country, country_summary, country_organic_summary
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD

Metrics description:
App Store:
summary: act_devices (active devices), crashes, iap, impressions (impressions total), sales, sessions, units, views (page view count)
time_series: sum_impressions (impressions total unique), sum_units, sum_views (page view unique)
channel(country=all): impressions_uniq,units, views_uniq
channel_country: impressions_uniq, units, views_uniq
campaign: views (views total), sales, sessions, units
site: views (views total), sales, sessions, units
GDC:
country_summary: sum_installers, sum_visitors
channel: installers visitors
country_organic_summary: sum_installers, sum_visitors


Example:
sign = md5('channel=summarycid=35329ext_id=498958864/reports/aso_reportccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reports/aso_report?ext_id=498958864&channel=summary&cid=35329&sign=060c1e4e3ee6ecbe97f16a2ab4c3b86a

21.  Stat reviews
EndPoint: /stat/reviews

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD

Example:
sign = md5('cid=35329ext_id=com.aita/stat/reviewsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/stat/reviews?ext_id=com.aita&cid=35329&sign=0053f2b9d72f66afc60b799986465366

22.  Stat reviews rating
EndPoint: /stat/reviews/rating

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
date — date in format: YYYY-MM-DD
answer_user_id — user ID

Example:
sign = md5('cid=35329ext_id=com.aita/stat/reviews/ratingccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/stat/reviews/rating?ext_id=com.aita&cid=35329&sign=d8c991c3b2b0d90bf9abda9b3b8377e6

23.  Stat reviews by version
EndPoint: /stat/reviews/version

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
date — date in format: YYYY-MM-DD
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
lang — lang (for Google Play apps only) in short format e.g. en
version — app version (for App Store apps or Google Play with Google Play Console integration) e.g. 1.1.1

Example:
sign = md5('cid=35329ext_id=com.aita/stat/reviews/versionccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/stat/reviews/version?ext_id=com.aita&cid=35329&sign=c41d0281015fd6772e99b23ac904ff30

24.  Stat reviews replies
EndPoint: /stat/replies

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
date — date in format: YYYY-MM-DD
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD
answer_user_id — user ID

Example:
sign = md5('cid=35329ext_id=com.aita/stat/repliesccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/stat/replies?ext_id=com.aita&cid=35329&sign=1a635c6612e96fd8381ea5233888c3e9

25.  Stat replies speed
EndPoint: /stat/replies/time

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
date — date in format: YYYY-MM-DD
answer_user_id — user ID

Example:
sign = md5('cid=35329ext_id=com.aita/stat/replies/timeccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/stat/replies/time?ext_id=com.aita&cid=35329&sign=13d15765080b3c1ded863671973a2fb2

26.  Collection reviews
EndPoint: /COLLECTION_NAME/reviews

Required parameters:
cid — client ID
COLLECTION_NAME — name of collection (part of url)

Additional parameters:
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD

Example:
sign = md5('cid=35329/untitled/reviewsccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/untitled/reviews?cid=35329&sign=df9d50828782fe45165f6d4771bce2a2

27.  Review custom status (private beta)
EndPoint: /reviews/custom_status

Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers
review_id — review ID in Store
custom_status — reopened or closed

Example:
sign = md5('cid=35329custom_status=closedext_id=498958864review_id=2455079393/reviews/custom_statusccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reviews/custom_status?ext_id=498958864&review_id=2455079393&custom_status=closed&cid=35329&sign=a4373e55c245f104151caa2059753f0b

28.  Ratings Export
EndPoint: /COLLECTION_NAME/ratings_export
Date (UTC),ID,Action,Category,User Email,Ip Address,Device,User Agent﻿ 2019-02-10 1:26,accact_1E275FB8dBjbtfF8HlkgGRU4,Exported data,Reporting,shoppingandmore34@hotmail.com,37.201.7.167,27d935acf4f00499ad26fcbd13da7c43ec418baf,"Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.27 Mobile Safari/537.36"﻿ 2019-02-10 1:22,accact_1E271cB8dBjbtfF8d7siaeJh,Enabled Connect platform,Connect,shoppingandmore34@hotmail.com,37.201.7.167,27d935acf4f00499ad26fcbd13da7c43ec418baf,"Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.27 Mobile Safari/537.36"﻿ 2019-02-10 1:21,accact_1E2711B8dBjbtfF84SEXqWTr,Viewed API keys from a new device,Api,shoppingandmore34@hotmail.com,37.201.7.167,27d935acf4f00499ad26fcbd13da7c43ec418baf,"Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.27 Mobile Safari/537.36"Date (UTC),ID,Action,Category,User Email,Ip Address,Device,User Agent﻿ 2019-02-10 1:26,accact_1E275FB8dBjbtfF8HlkgGRU4,Exported data,Reporting,shoppingandmore34@hotmail.com,37.201.7.167,27d935acf4f00499ad26fcbd13da7c43ec418baf,"Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.27 Mobile Safari/537.36"﻿ 2019-02-10 1:22,accact_1E271cB8dBjbtfF8d7siaeJh,Enabled Connect platform,Connect,shoppingandmore34@hotmail.com,37.201.7.167,27d935acf4f00499ad26fcbd13da7c43ec418baf,"Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.27 Mobile Safari/537.36"﻿ 2019-02-10 1:21,accact_1E2711B8dBjbtfF84SEXqWTr,Viewed API keys from a new device,Api,shoppingandmore34@hotmail.com,37.201.7.167,27d935acf4f00499ad26fcbd13da7c43ec418baf,"Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.27 Mobile Safari/537.36"
PHP logo
PHP Version 5.5.15 for Two Seven Two Development - Icode-Go Web IDE

System	Linux localhost 4.4.111-14902807-QB21249916 #1 SMP PREEMPT Wed Dec 26 11:33:43 KST 2018 armv8l
Build Date	Dec 27 2015 21:10:25
Configure Command	no value
Server API	CGI/FastCGI
Virtual Directory Support	disabled
Configuration File (php.ini) Path	/system/lib
Loaded Configuration File	/data/data/com.twoseventwodev.icodego/app_icode_server/php_5/php.ini
Scan this dir for additional .ini files	/data/user/0/com.twoseventwodev.icodego/app_icode_server/php_5/conf.d
Additional .ini files parsed	(none)
PHP API	20121113
PHP Extension	20121212
Zend Extension	220121212
Zend Extension Build	API220121212,NTS
PHP Extension Build	API20121212,NTS
Debug Build	no
Thread Safety	disabled
Zend Signal Handling	disabled
Zend Memory Manager	enabled
Zend Multibyte Support	provided by mbstring
IPv6 Support	enabled
DTrace Support	disabled
Registered PHP Streams	https, ftps, compress.zlib, php, file, glob, data, http, ftp, phar, zip
Registered Stream Socket Transports	tcp, udp, unix, udg, ssl, sslv3, sslv2, tls
Registered Stream Filters	zlib.*, convert.iconv.*, mcrypt.*, mdecrypt.*, string.rot13, string.toupper, string.tolower, string.strip_tags, convert.*, consumed, dechunk

Zend logo This program makes use of the Zend Scripting Language Engine:
Zend Engine v2.5.0, Copyright (c) 1998-2014 Zend Technologies

Configuration
bcmath
BCMath support	enabled

Directive	Local Value	Master Value
bcmath.scale	0	0

calendar
Calendar support	enabled

cgi-fcgi
Directive	Local Value	Master Value
cgi.check_shebang_line	1	1
cgi.discard_path	0	0
cgi.fix_pathinfo	1	1
cgi.force_redirect	0	0
cgi.nph	0	0
cgi.redirect_status_env	no value	no value
cgi.rfc2616_headers	0	0
fastcgi.logging	1	1

Core
PHP Version	5.5.15

Directive	Local Value	Master Value
allow_url_fopen	On	On
allow_url_include	On	On
always_populate_raw_post_data	Off	Off
arg_separator.input	&	&
arg_separator.output	&	&
asp_tags	Off	Off
auto_append_file	no value	no value
auto_globals_jit	On	On
auto_prepend_file	no value	no value
browscap	no value	no value
default_charset	utf-8	utf-8
default_mimetype	text/html	text/html
disable_classes	no value	no value
disable_functions	no value	no value
display_errors	On	On
display_startup_errors	On	On
doc_root	no value	no value
docref_ext	no value	no value
docref_root	no value	no value
enable_dl	Off	Off
enable_post_data_reading	On	On
error_append_string	no value	no value
error_log	/data/user/0/com.twoseventwodev.icodego/app_icode_server/logs/php.log	/data/user/0/com.twoseventwodev.icodego/app_icode_server/logs/php.log
error_prepend_string	no value	no value
error_reporting	24575	24575
exit_on_timeout	Off	Off
expose_php	Off	Off
extension_dir	/system/lib/php/extensions/no-debug-non-zts-20121212	/system/lib/php/extensions/no-debug-non-zts-20121212
file_uploads	On	On
highlight.comment	#FF8000	#FF8000
highlight.default	#0000BB	#0000BB
highlight.html	#000000	#000000
highlight.keyword	#007700	#007700
highlight.string	#DD0000	#DD0000
html_errors	On	On
ignore_repeated_errors	Off	Off
ignore_repeated_source	Off	Off
ignore_user_abort	Off	Off
implicit_flush	Off	Off
include_path	.:	.:
log_errors	On	On
log_errors_max_len	1024	1024
mail.add_x_header	On	On
mail.force_extra_parameters	no value	no value
mail.log	no value	no value
max_execution_time	720	720
max_file_uploads	20	20
max_input_nesting_level	64	64
max_input_time	60	60
max_input_vars	1000	1000
memory_limit	128M	128M
open_basedir	no value	no value
output_buffering	4096	4096
output_handler	no value	no value
post_max_size	32M	32M
precision	14	14
realpath_cache_size	16K	16K
realpath_cache_ttl	120	120
register_argc_argv	On	On
report_memleaks	On	On
report_zend_debug	On	On
request_order	GP	GP
sendmail_from	no value	no value
sendmail_path	/data/user/0/com.twoseventwodev.icodego/app_icode_server/msmtp --file=/data/user/0/com.twoseventwodev.icodego/app_icode_server/msmtprc -t -i	/data/user/0/com.twoseventwodev.icodego/app_icode_server/msmtp --file=/data/user/0/com.twoseventwodev.icodego/app_icode_server/msmtprc -t -i
serialize_precision	17	17
short_open_tag	On	On
SMTP	localhost	localhost
smtp_port	25	25
sql.safe_mode	Off	Off
sys_temp_dir	no value	no value
track_errors	On	On
unserialize_callback_func	no value	no value
upload_max_filesize	32M	32M
upload_tmp_dir	/data/user/0/com.twoseventwodev.icodego/app_icode_server/tmp/	/data/user/0/com.twoseventwodev.icodego/app_icode_server/tmp/
user_dir	no value	no value
user_ini.cache_ttl	300	300
user_ini.filename	.user.ini	.user.ini
variables_order	GPCS	GPCS
xmlrpc_error_number	0	0
xmlrpc_errors	Off	Off
zend.detect_unicode	On	On
zend.enable_gc	On	On
zend.multibyte	Off	Off
zend.script_encoding	no value	no value

ctype
ctype functions	enabled

curl
cURL support	enabled
cURL Information	7.37.0
Age	3
Features
AsynchDNS	No
CharConv	No
Debug	No
GSS-Negotiate	No
IDN	No
IPv6	No
krb4	No
Largefile	Yes
libz	Yes
NTLM	Yes
NTLMWB	Yes
SPNEGO	No
SSL	Yes
SSPI	No
TLS-SRP	Yes
Protocols	dict, file, ftp, ftps, gopher, http, https, imap, imaps, pop3, pop3s, rtsp, smtp, smtps, telnet, tftp
Host	arm-unknown-linux-gnu
SSL Version	OpenSSL/1.0.1h
ZLib Version	1.2.8

date
date/time support	enabled
"Olson" Timezone Database Version	2014.5
Timezone Database	internal
Default timezone	America/Detroit

Directive	Local Value	Master Value
date.default_latitude	31.7667	31.7667
date.default_longitude	35.2333	35.2333
date.sunrise_zenith	90.583333	90.583333
date.sunset_zenith	90.583333	90.583333
date.timezone	America/Detroit	America/Detroit

dom
DOM/XML	enabled
DOM/XML API Version	20031129
libxml Version	2.9.1
HTML Support	enabled
XPath Support	enabled
XPointer Support	enabled
Schema Support	enabled
RelaxNG Support	enabled

ereg
Regex Library	Bundled library enabled

exif
EXIF Support	enabled
EXIF Version	1.4 $Id$
Supported EXIF Version	0220
Supported filetypes	JPEG,TIFF

Directive	Local Value	Master Value
exif.decode_jis_intel	JIS	JIS
exif.decode_jis_motorola	JIS	JIS
exif.decode_unicode_intel	UCS-2LE	UCS-2LE
exif.decode_unicode_motorola	UCS-2BE	UCS-2BE
exif.encode_jis	no value	no value
exif.encode_unicode	ISO-8859-15	ISO-8859-15

fileinfo
fileinfo support	enabled
version	1.0.5

filter
Input Validation and Filtering	enabled
Revision	$Id: 4d3899e089e6e45b157975ceef2ac7deb6e9d762 $

Directive	Local Value	Master Value
filter.default	unsafe_raw	unsafe_raw
filter.default_flags	no value	no value

ftp
FTP support	enabled

gd
GD Support	enabled
GD Version	bundled (2.1.0 compatible)
FreeType Support	enabled
FreeType Linkage	with freetype
FreeType Version	2.5.3
GIF Read Support	enabled
GIF Create Support	enabled
JPEG Support	enabled
libJPEG Version	9 compatible
PNG Support	enabled
libPNG Version	1.6.12
WBMP Support	enabled
XBM Support	enabled

Directive	Local Value	Master Value
gd.jpeg_ignore_warning	1	1

gettext
GetText Support	enabled

hash
hash support	enabled
Hashing Engines	md2 md4 md5 sha1 sha224 sha256 sha384 sha512 ripemd128 ripemd160 ripemd256 ripemd320 whirlpool tiger128,3 tiger160,3 tiger192,3 tiger128,4 tiger160,4 tiger192,4 snefru snefru256 gost adler32 crc32 crc32b fnv132 fnv164 joaat haval128,3 haval160,3 haval192,3 haval224,3 haval256,3 haval128,4 haval160,4 haval192,4 haval224,4 haval256,4 haval128,5 haval160,5 haval192,5 haval224,5 haval256,5

iconv
iconv support	enabled
iconv implementation	libiconv
iconv library version	1.14

Directive	Local Value	Master Value
iconv.input_encoding	ISO-8859-1	ISO-8859-1
iconv.internal_encoding	ISO-8859-1	ISO-8859-1
iconv.output_encoding	ISO-8859-1	ISO-8859-1

ide
Version	1.0.0

json
json support	enabled
json version	1.2.1

libxml
libXML support	active
libXML Compiled Version	2.9.1
libXML Loaded Version	20901
libXML streams	enabled

mbstring
Multibyte Support	enabled
Multibyte string engine	libmbfl
HTTP input encoding translation	disabled
libmbfl version	1.3.2

mbstring extension makes use of "streamable kanji code filter and converter", which is distributed under the GNU Lesser General Public License version 2.1.

Multibyte (japanese) regex support	enabled
Multibyte regex (oniguruma) backtrack check	On
Multibyte regex (oniguruma) version	5.9.2

Directive	Local Value	Master Value
mbstring.detect_order	no value	no value
mbstring.encoding_translation	Off	Off
mbstring.func_overload	0	0
mbstring.http_input	pass	pass
mbstring.http_output	pass	pass
mbstring.http_output_conv_mimetypes	^(text/|application/xhtml\+xml)	^(text/|application/xhtml\+xml)
mbstring.internal_encoding	no value	no value
mbstring.language	neutral	neutral
mbstring.strict_detection	Off	Off
mbstring.substitute_character	no value	no value

mcrypt
mcrypt support	enabled
mcrypt_filter support	enabled
Version	2.5.8
Api No	20021217
Supported ciphers	cast-128 gost rijndael-128 twofish arcfour cast-256 loki97 rijndael-192 saferplus wake blowfish-compat des rijndael-256 serpent xtea blowfish enigma rc2 tripledes
Supported modes	cbc cfb ctr ecb ncfb nofb ofb stream

Directive	Local Value	Master Value
mcrypt.algorithms_dir	no value	no value
mcrypt.modes_dir	no value	no value

mysql
MySQL Support	enabled
Active Persistent Links	0
Active Links	0
Client API version	mysqlnd 5.0.11-dev - 20120503 - $Id: bf9ad53b11c9a57efdb1057292d73b928b8c5c77 $

Directive	Local Value	Master Value
mysql.allow_local_infile	On	On
mysql.allow_persistent	On	On
mysql.connect_timeout	60	60
mysql.default_host	no value	no value
mysql.default_password	no value	no value
mysql.default_port	3306	3306
mysql.default_socket	/data/user/0/com.twoseventwodev.icodego/app_icode_server/mariadb/mysql.sock	/data/user/0/com.twoseventwodev.icodego/app_icode_server/mariadb/mysql.sock
mysql.default_user	no value	no value
mysql.max_links	Unlimited	Unlimited
mysql.max_persistent	Unlimited	Unlimited
mysql.trace_mode	On	On

mysqli
MysqlI Support	enabled
Client API library version	mysqlnd 5.0.11-dev - 20120503 - $Id: bf9ad53b11c9a57efdb1057292d73b928b8c5c77 $
Active Persistent Links	0
Inactive Persistent Links	0
Active Links	0

Directive	Local Value	Master Value
mysqli.allow_local_infile	On	On
mysqli.allow_persistent	On	On
mysqli.default_host	no value	no value
mysqli.default_port	3306	3306
mysqli.default_pw	no value	no value
mysqli.default_socket	/data/user/0/com.twoseventwodev.icodego/app_icode_server/mariadb/mysql.sock	/data/user/0/com.twoseventwodev.icodego/app_icode_server/mariadb/mysql.sock
mysqli.default_user	no value	no value
mysqli.max_links	Unlimited	Unlimited
mysqli.max_persistent	Unlimited	Unlimited
mysqli.reconnect	On	On

mysqlnd
mysqlnd	enabled
Version	mysqlnd 5.0.11-dev - 20120503 - $Id: bf9ad53b11c9a57efdb1057292d73b928b8c5c77 $
Compression	supported
core SSL	supported
extended SSL	supported
Command buffer size	4096
Read buffer size	32768
Read timeout	31536000
Collecting statistics	Yes
Collecting memory statistics	Yes
Tracing	n/a
Loaded plugins	mysqlnd,debug_trace,auth_plugin_mysql_native_password,auth_plugin_mysql_clear_password,auth_plugin_sha256_password
API Extensions	mysqli,pdo_mysql,mysql

mysqlnd statistics
bytes_sent	0
bytes_received	0
packets_sent	0
packets_received	0
protocol_overhead_in	0
protocol_overhead_out	0
bytes_received_ok_packet	0
bytes_received_eof_packet	0
bytes_received_rset_header_packet	0
bytes_received_rset_field_meta_packet	0
bytes_received_rset_row_packet	0
bytes_received_prepare_response_packet	0
bytes_received_change_user_packet	0
packets_sent_command	0
packets_received_ok	0
packets_received_eof	0
packets_received_rset_header	0
packets_received_rset_field_meta	0
packets_received_rset_row	0
packets_received_prepare_response	0
packets_received_change_user	0
result_set_queries	0
non_result_set_queries	0
no_index_used	0
bad_index_used	0
slow_queries	0
buffered_sets	0
unbuffered_sets	0
ps_buffered_sets	0
ps_unbuffered_sets	0
flushed_normal_sets	0
flushed_ps_sets	0
ps_prepared_never_executed	0
ps_prepared_once_executed	0
rows_fetched_from_server_normal	0
rows_fetched_from_server_ps	0
rows_buffered_from_client_normal	0
rows_buffered_from_client_ps	0
rows_fetched_from_client_normal_buffered	0
rows_fetched_from_client_normal_unbuffered	0
rows_fetched_from_client_ps_buffered	0
rows_fetched_from_client_ps_unbuffered	0
rows_fetched_from_client_ps_cursor	0
rows_affected_normal	0
rows_affected_ps	0
rows_skipped_normal	0
rows_skipped_ps	0
copy_on_write_saved	0
copy_on_write_performed	0
command_buffer_too_small	0
connect_success	0
connect_failure	0
connection_reused	0
reconnect	0
pconnect_success	0
active_connections	0
active_persistent_connections	0
explicit_close	0
implicit_close	0
disconnect_close	0
in_middle_of_command_close	0
explicit_free_result	0
implicit_free_result	0
explicit_stmt_close	0
implicit_stmt_close	0
mem_emalloc_count	0
mem_emalloc_amount	0
mem_ecalloc_count	0
mem_ecalloc_amount	0
mem_erealloc_count	0
mem_erealloc_amount	0
mem_efree_count	0
mem_efree_amount	0
mem_malloc_count	0
mem_malloc_amount	0
mem_calloc_count	0
mem_calloc_amount	0
mem_realloc_count	0
mem_realloc_amount	0
mem_free_count	0
mem_free_amount	0
mem_estrndup_count	0
mem_strndup_count	0
mem_estndup_count	0
mem_strdup_count	0
proto_text_fetched_null	0
proto_text_fetched_bit	0
proto_text_fetched_tinyint	0
proto_text_fetched_short	0
proto_text_fetched_int24	0
proto_text_fetched_int	0
proto_text_fetched_bigint	0
proto_text_fetched_decimal	0
proto_text_fetched_float	0
proto_text_fetched_double	0
proto_text_fetched_date	0
proto_text_fetched_year	0
proto_text_fetched_time	0
proto_text_fetched_datetime	0
proto_text_fetched_timestamp	0
proto_text_fetched_string	0
proto_text_fetched_blob	0
proto_text_fetched_enum	0
proto_text_fetched_set	0
proto_text_fetched_geometry	0
proto_text_fetched_other	0
proto_binary_fetched_null	0
proto_binary_fetched_bit	0
proto_binary_fetched_tinyint	0
proto_binary_fetched_short	0
proto_binary_fetched_int24	0
proto_binary_fetched_int	0
proto_binary_fetched_bigint	0
proto_binary_fetched_decimal	0
proto_binary_fetched_float	0
proto_binary_fetched_double	0
proto_binary_fetched_date	0
proto_binary_fetched_year	0
proto_binary_fetched_time	0
proto_binary_fetched_datetime	0
proto_binary_fetched_timestamp	0
proto_binary_fetched_string	0
proto_binary_fetched_blob	0
proto_binary_fetched_enum	0
proto_binary_fetched_set	0
proto_binary_fetched_geometry	0
proto_binary_fetched_other	0
init_command_executed_count	0
init_command_failed_count	0
com_quit	0
com_init_db	0
com_query	0
com_field_list	0
com_create_db	0
com_drop_db	0
com_refresh	0
com_shutdown	0
com_statistics	0
com_process_info	0
com_connect	0
com_process_kill	0
com_debug	0
com_ping	0
com_time	0
com_delayed_insert	0
com_change_user	0
com_binlog_dump	0
com_table_dump	0
com_connect_out	0
com_register_slave	0
com_stmt_prepare	0
com_stmt_execute	0
com_stmt_send_long_data	0
com_stmt_close	0
com_stmt_reset	0
com_stmt_set_option	0
com_stmt_fetch	0
com_deamon	0
bytes_received_real_data_normal	0
bytes_received_real_data_ps	0

openssl
OpenSSL support	enabled
OpenSSL Library Version	OpenSSL 1.0.1h 5 Jun 2014
OpenSSL Header Version	OpenSSL 1.0.1h 5 Jun 2014

pcre
PCRE (Perl Compatible Regular Expressions) Support	enabled
PCRE Library Version	8.34 2013-12-15

Directive	Local Value	Master Value
pcre.backtrack_limit	1000000	1000000
pcre.recursion_limit	100000	100000

PDO
PDO support	enabled
PDO drivers	mysql, sqlite

pdo_mysql
PDO Driver for MySQL	enabled
Client API version	mysqlnd 5.0.11-dev - 20120503 - $Id: bf9ad53b11c9a57efdb1057292d73b928b8c5c77 $

Directive	Local Value	Master Value
pdo_mysql.default_socket	/data/user/0/com.twoseventwodev.icodego/app_icode_server/mariadb/mysql.sock	/data/user/0/com.twoseventwodev.icodego/app_icode_server/mariadb/mysql.sock

pdo_sqlite
PDO Driver for SQLite 3.x	enabled
SQLite Library	3.8.4.3

Phar
Phar: PHP Archive support	enabled
Phar EXT version	2.0.2
Phar API version	1.1.1
SVN revision	$Id: a5488937a80433d434af6753d3db8517feaf91df $
Phar-based phar archives	enabled
Tar-based phar archives	enabled
ZIP-based phar archives	enabled
gzip compression	enabled
bzip2 compression	disabled (install pecl/bz2)
OpenSSL support	enabled

Phar based on pear/PHP_Archive, original concept by Davey Shafik.
Phar fully realized by Gregory Beaver and Marcus Boerger.
Portions of tar implementation Copyright (c) 2003-2009 Tim Kientzle.

Directive	Local Value	Master Value
phar.cache_list	no value	no value
phar.readonly	On	On
phar.require_hash	On	On

posix
Revision	$Id: 1dfa9997ed76804e53c91e0ce862f3707617b6ed $

Reflection
Reflection	enabled
Version	$Id: 31d836a7ac92a37b5c580836d91ad4736fe2f376 $

session
Session Support	enabled
Registered save handlers	files user
Registered serializer handlers	php_serialize php php_binary wddx

Directive	Local Value	Master Value
session.auto_start	Off	Off
session.cache_expire	180	180
session.cache_limiter	nocache	nocache
session.cookie_domain	no value	no value
session.cookie_httponly	Off	Off
session.cookie_lifetime	0	0
session.cookie_path	/	/
session.cookie_secure	Off	Off
session.entropy_file	no value	no value
session.entropy_length	0	0
session.gc_divisor	1000	1000
session.gc_maxlifetime	1440	1440
session.gc_probability	1	1
session.hash_bits_per_character	5	5
session.hash_function	0	0
session.name	PHPSESSID	PHPSESSID
session.referer_check	no value	no value
session.save_handler	files	files
session.save_path	/data/user/0/com.twoseventwodev.icodego/app_icode_server/tmp/	/data/user/0/com.twoseventwodev.icodego/app_icode_server/tmp/
session.serialize_handler	php	php
session.upload_progress.cleanup	On	On
session.upload_progress.enabled	On	On
session.upload_progress.freq	1%	1%
session.upload_progress.min_freq	1	1
session.upload_progress.name	PHP_SESSION_UPLOAD_PROGRESS	PHP_SESSION_UPLOAD_PROGRESS
session.upload_progress.prefix	upload_progress_	upload_progress_
session.use_cookies	On	On
session.use_only_cookies	On	On
session.use_strict_mode	Off	Off
session.use_trans_sid	0	0

SimpleXML
Simplexml support	enabled
Revision	$Id: a915862ec47f9589309acc4996ca8f6179788746 $
Schema support	enabled

soap
Soap Client	enabled
Soap Server	enabled

Directive	Local Value	Master Value
soap.wsdl_cache	1	1
soap.wsdl_cache_dir	/data/user/0/com.twoseventwodev.icodego/app_icode_server/tmp/	/data/user/0/com.twoseventwodev.icodego/app_icode_server/tmp/
soap.wsdl_cache_enabled	1	1
soap.wsdl_cache_limit	5	5
soap.wsdl_cache_ttl	86400	86400

sockets
Sockets Support	enabled

SPL
SPL support	enabled
Interfaces	Countable, OuterIterator, RecursiveIterator, SeekableIterator, SplObserver, SplSubject
Classes	AppendIterator, ArrayIterator, ArrayObject, BadFunctionCallException, BadMethodCallException, CachingIterator, CallbackFilterIterator, DirectoryIterator, DomainException, EmptyIterator, FilesystemIterator, FilterIterator, GlobIterator, InfiniteIterator, InvalidArgumentException, IteratorIterator, LengthException, LimitIterator, LogicException, MultipleIterator, NoRewindIterator, OutOfBoundsException, OutOfRangeException, OverflowException, ParentIterator, RangeException, RecursiveArrayIterator, RecursiveCachingIterator, RecursiveCallbackFilterIterator, RecursiveDirectoryIterator, RecursiveFilterIterator, RecursiveIteratorIterator, RecursiveRegexIterator, RecursiveTreeIterator, RegexIterator, RuntimeException, SplDoublyLinkedList, SplFileInfo, SplFileObject, SplFixedArray, SplHeap, SplMinHeap, SplMaxHeap, SplObjectStorage, SplPriorityQueue, SplQueue, SplStack, SplTempFileObject, UnderflowException, UnexpectedValueException

sqlite3
SQLite3 support	enabled
SQLite3 module version	0.7-dev
SQLite Library	3.8.4.3

Directive	Local Value	Master Value
sqlite3.extension_dir	no value	no value

standard
Dynamic Library support not available
.
Path to sendmail	/data/user/0/com.twoseventwodev.icodego/app_icode_server/msmtp --file=/data/user/0/com.twoseventwodev.icodego/app_icode_server/msmtprc -t -i

Directive	Local Value	Master Value
assert.active	1	1
assert.bail	0	0
assert.callback	no value	no value
assert.quiet_eval	0	0
assert.warning	1	1
auto_detect_line_endings	0	0
default_socket_timeout	60	60
from	no value	no value
url_rewriter.tags	a=href,area=href,frame=src,input=src,form=fakeentry	a=href,area=href,frame=src,input=src,form=fakeentry
user_agent	no value	no value

sysvmsg
sysvmsg support	enabled
Revision	$Id: adf1d2d6be849c46eed3c3ee6f1cbebd1448d6e5 $

tokenizer
Tokenizer Support	enabled

wddx
WDDX Support	enabled
WDDX Session Serializer	enabled

xml
XML Support	active
XML Namespace Support	active
EXPAT Version	expat_2.1.0

xmlreader
XMLReader	enabled

xmlrpc
core library version	xmlrpc-epi v. 0.51
php extension version	0.51
author	Dan Libby
homepage	http://xmlrpc-epi.sourceforge.net
open sourced by	Epinions.com

xmlwriter
XMLWriter	enabled

zip
Zip	enabled
Extension Version	$Id: 05dd1ecc211075107543b0ef8cee488dd229fccf $
Zip version	1.11.0
Libzip version	0.10.1

zlib
ZLib Support	enabled
Stream Wrapper	compress.zlib://
Stream Filter	zlib.inflate, zlib.deflate
Compiled Version	1.2.8
Linked Version	1.2.8

Directive	Local Value	Master Value
zlib.output_compression	Off	Off
zlib.output_compression_level	-1	-1
zlib.output_handler	no value	no value

Additional Modules
Module Name
sysvsem
sysvshm

Environment
Variable	Value
REDIRECT_UNIQUE_ID	XHWrEn8AAAEAABPTCIoAAABP
REDIRECT_PHP_INI_SCAN_DIR	/data/user/0/com.twoseventwodev.icodego/app_icode_server/php_5/conf.d
REDIRECT_HANDLER	application/x-httpd-php5
REDIRECT_STATUS	200
UNIQUE_ID	XHWrEn8AAAEAABPTCIoAAABP
PHP_INI_SCAN_DIR	/data/user/0/com.twoseventwodev.icodego/app_icode_server/php_5/conf.d
HTTP_HOST	localhost:8080
HTTP_CONNECTION	keep-alive
HTTP_UPGRADE_INSECURE_REQUESTS	1
HTTP_USER_AGENT	Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3711.0 Mobile Safari/537.36
HTTP_DNT	1
HTTP_ACCEPT	text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
HTTP_ACCEPT_ENCODING	gzip, deflate, br
HTTP_ACCEPT_LANGUAGE	de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7
PATH	/sbin:/system/sbin:/system/bin:/system/xbin:/vendor/bin:/vendor/xbin
SERVER_SIGNATURE	no value
SERVER_SOFTWARE	Apache/2.2.34 (Unix) DAV/2 mod_ssl/2.2.34 OpenSSL/1.0.2h
SERVER_NAME	localhost
SERVER_ADDR	::1
SERVER_PORT	8080
REMOTE_ADDR	::1
DOCUMENT_ROOT	/storage/emulated/0/Icode-Go/data_files/www
SERVER_ADMIN	[no address given]
SCRIPT_FILENAME	/storage/emulated/0/Icode-Go/data_files/www/index.php
REMOTE_PORT	53332
REDIRECT_URL	/index.php
GATEWAY_INTERFACE	CGI/1.1
SERVER_PROTOCOL	HTTP/1.1
REQUEST_METHOD	GET
QUERY_STRING	no value
REQUEST_URI	/
SCRIPT_NAME	/index.php
ORIG_SCRIPT_FILENAME	/data/user/0/com.twoseventwodev.icodego/app_icode_server/php_5/php
ORIG_PATH_INFO	/index.php
ORIG_PATH_TRANSLATED	/storage/emulated/0/Icode-Go/data_files/www/index.php
ORIG_SCRIPT_NAME	/cgi-bin/php_5/php

PHP Variables
Variable	Value
_SERVER["REDIRECT_UNIQUE_ID"]	XHWrEn8AAAEAABPTCIoAAABP
_SERVER["REDIRECT_PHP_INI_SCAN_DIR"]	/data/user/0/com.twoseventwodev.icodego/app_icode_server/php_5/conf.d
_SERVER["REDIRECT_HANDLER"]	application/x-httpd-php5
_SERVER["REDIRECT_STATUS"]	200
_SERVER["UNIQUE_ID"]	XHWrEn8AAAEAABPTCIoAAABP
_SERVER["PHP_INI_SCAN_DIR"]	/data/user/0/com.twoseventwodev.icodego/app_icode_server/php_5/conf.d
_SERVER["HTTP_HOST"]	localhost:8080
_SERVER["HTTP_CONNECTION"]	keep-alive
_SERVER["HTTP_UPGRADE_INSECURE_REQUESTS"]	1
_SERVER["HTTP_USER_AGENT"]	Mozilla/5.0 (Linux; Android 8.0.0; SM-G950F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3711.0 Mobile Safari/537.36
_SERVER["HTTP_DNT"]	1
_SERVER["HTTP_ACCEPT"]	text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
_SERVER["HTTP_ACCEPT_ENCODING"]	gzip, deflate, br
_SERVER["HTTP_ACCEPT_LANGUAGE"]	de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7
_SERVER["PATH"]	/sbin:/system/sbin:/system/bin:/system/xbin:/vendor/bin:/vendor/xbin
_SERVER["SERVER_SIGNATURE"]	no value
_SERVER["SERVER_SOFTWARE"]	Apache/2.2.34 (Unix) DAV/2 mod_ssl/2.2.34 OpenSSL/1.0.2h
_SERVER["SERVER_NAME"]	localhost
_SERVER["SERVER_ADDR"]	::1
_SERVER["SERVER_PORT"]	8080
_SERVER["REMOTE_ADDR"]	::1
_SERVER["DOCUMENT_ROOT"]	/storage/emulated/0/Icode-Go/data_files/www
_SERVER["SERVER_ADMIN"]	[no address given]
_SERVER["SCRIPT_FILENAME"]	/storage/emulated/0/Icode-Go/data_files/www/index.php
_SERVER["REMOTE_PORT"]	53332
_SERVER["REDIRECT_URL"]	/index.php
_SERVER["GATEWAY_INTERFACE"]	CGI/1.1
_SERVER["SERVER_PROTOCOL"]	HTTP/1.1
_SERVER["REQUEST_METHOD"]	GET
_SERVER["QUERY_STRING"]	no value
_SERVER["REQUEST_URI"]	/
_SERVER["SCRIPT_NAME"]	/index.php
_SERVER["ORIG_SCRIPT_FILENAME"]	/data/user/0/com.twoseventwodev.icodego/app_icode_server/php_5/php
_SERVER["ORIG_PATH_INFO"]	/index.php
_SERVER["ORIG_PATH_TRANSLATED"]	/storage/emulated/0/Icode-Go/data_files/www/index.php
_SERVER["ORIG_SCRIPT_NAME"]	/cgi-bin/php_5/php
_SERVER["PHP_SELF"]	/index.php
_SERVER["REQUEST_TIME_FLOAT"]	1551215378.6727
_SERVER["REQUEST_TIME"]	1551215378
_SERVER["argv"]
Array
(
)
_SERVER["argc"]	0

PHP Credits
PHP Group
Thies C. Arntzen, Stig Bakken, Shane Caraveo, Andi Gutmans, Rasmus Lerdorf, Sam Ruby, Sascha Schumann, Zeev Suraski, Jim Winstead, Andrei Zmievski

Language Design & Concept
Andi Gutmans, Rasmus Lerdorf, Zeev Suraski, Marcus Boerger

PHP Authors
Contribution	Authors
Zend Scripting Language Engine	Andi Gutmans, Zeev Suraski, Stanislav Malyshev, Marcus Boerger, Dmitry Stogov
Extension Module API	Andi Gutmans, Zeev Suraski, Andrei Zmievski
UNIX Build and Modularization	Stig Bakken, Sascha Schumann, Jani Taskinen
Windows Port	Shane Caraveo, Zeev Suraski, Wez Furlong, Pierre-Alain Joye
Server API (SAPI) Abstraction Layer	Andi Gutmans, Shane Caraveo, Zeev Suraski
Streams Abstraction Layer	Wez Furlong, Sara Golemon
PHP Data Objects Layer	Wez Furlong, Marcus Boerger, Sterling Hughes, George Schlossnagle, Ilia Alshanetsky
Output Handler	Zeev Suraski, Thies C. Arntzen, Marcus Boerger, Michael Wallner

SAPI Modules
Contribution	Authors
AOLserver	Sascha Schumann
Apache 1.3 (apache_hooks)	Rasmus Lerdorf, Zeev Suraski, Stig Bakken, David Sklar, George Schlossnagle, Lukas Schroeder
Apache 1.3	Rasmus Lerdorf, Zeev Suraski, Stig Bakken, David Sklar
Apache 2.0 Filter	Sascha Schumann, Aaron Bannert
Apache 2.0 Handler	Ian Holsman, Justin Erenkrantz (based on Apache 2.0 Filter code)
Caudium / Roxen	David Hedbor
CGI / FastCGI	Rasmus Lerdorf, Stig Bakken, Shane Caraveo, Dmitry Stogov
CLI	Edin Kadribasic, Marcus Boerger, Johannes Schlueter, Moriyoshi Koizumi, Xinchen Hui
Continuity	Alex Leigh (based on nsapi code)
Embed	Edin Kadribasic
FastCGI Process Manager	Andrei Nigmatulin, dreamcat4, Antony Dovgal, Jerome Loyet
ISAPI	Andi Gutmans, Zeev Suraski
litespeed	George Wang
NSAPI	Jayakumar Muthukumarasamy, Uwe Schindler
phttpd	Thies C. Arntzen
pi3web	Holger Zimmermann
Sendmail Milter	Harald Radi
thttpd	Sascha Schumann
tux	Sascha Schumann
WebJames	Alex Waugh

Module Authors
Module	Authors
BC Math	Andi Gutmans
Bzip2	Sterling Hughes
Calendar	Shane Caraveo, Colin Viebrock, Hartmut Holzgraefe, Wez Furlong
COM and .Net	Wez Furlong
ctype	Hartmut Holzgraefe
cURL	Sterling Hughes
Date/Time Support	Derick Rethans
DB-LIB (MS SQL, Sybase)	Wez Furlong, Frank M. Kromann
DBA	Sascha Schumann, Marcus Boerger
DOM	Christian Stocker, Rob Richards, Marcus Boerger
enchant	Pierre-Alain Joye, Ilia Alshanetsky
ereg	Rasmus Lerdorf, Jim Winstead, Jaakko Hyvätti
EXIF	Rasmus Lerdorf, Marcus Boerger
fileinfo	Ilia Alshanetsky, Pierre Alain Joye, Scott MacVicar, Derick Rethans
Firebird/InterBase driver for PDO	Ard Biesheuvel
FTP	Stefan Esser, Andrew Skalski
GD imaging	Rasmus Lerdorf, Stig Bakken, Jim Winstead, Jouni Ahto, Ilia Alshanetsky, Pierre-Alain Joye, Marcus Boerger
GetText	Alex Plotnick
GNU GMP support	Stanislav Malyshev
Iconv	Rui Hirokawa, Stig Bakken, Moriyoshi Koizumi
IMAP	Rex Logan, Mark Musone, Brian Wang, Kaj-Michael Lang, Antoni Pamies Olive, Rasmus Lerdorf, Andrew Skalski, Chuck Hagenbuch, Daniel R Kalowsky
Input Filter	Rasmus Lerdorf, Derick Rethans, Pierre-Alain Joye, Ilia Alshanetsky
InterBase	Jouni Ahto, Andrew Avdeev, Ard Biesheuvel
Internationalization	Ed Batutis, Vladimir Iordanov, Dmitry Lakhtyuk, Stanislav Malyshev, Vadim Savchuk, Kirti Velankar
JSON	Omar Kilani, Scott MacVicar
LDAP	Amitay Isaacs, Eric Warnke, Rasmus Lerdorf, Gerrit Thomson, Stig Venaas
LIBXML	Christian Stocker, Rob Richards, Marcus Boerger, Wez Furlong, Shane Caraveo
mcrypt	Sascha Schumann, Derick Rethans
MS SQL	Frank M. Kromann
Multibyte String Functions	Tsukada Takuya, Rui Hirokawa
MySQL driver for PDO	George Schlossnagle, Wez Furlong, Ilia Alshanetsky, Johannes Schlueter
MySQL	Zeev Suraski, Zak Greant, Georg Richter, Andrey Hristov
MySQLi	Zak Greant, Georg Richter, Andrey Hristov, Ulf Wendel
MySQLnd	Andrey Hristov, Ulf Wendel, Georg Richter, Johannes Schlüter
OCI8	Stig Bakken, Thies C. Arntzen, Andy Sautins, David Benson, Maxim Maletsky, Harald Radi, Antony Dovgal, Andi Gutmans, Wez Furlong, Christopher Jones, Oracle Corporation
ODBC driver for PDO	Wez Furlong
ODBC	Stig Bakken, Andreas Karajannis, Frank M. Kromann, Daniel R. Kalowsky
OpenSSL	Stig Venaas, Wez Furlong, Sascha Kettler, Scott MacVicar
Oracle (OCI) driver for PDO	Wez Furlong
pcntl	Jason Greene, Arnaud Le Blanc
Perl Compatible Regexps	Andrei Zmievski
PHP Archive	Gregory Beaver, Marcus Boerger
PHP Data Objects	Wez Furlong, Marcus Boerger, Sterling Hughes, George Schlossnagle, Ilia Alshanetsky
PHP hash	Sara Golemon, Rasmus Lerdorf, Stefan Esser, Michael Wallner, Scott MacVicar
Posix	Kristian Koehntopp
PostgreSQL driver for PDO	Edin Kadribasic, Ilia Alshanetsky
PostgreSQL	Jouni Ahto, Zeev Suraski, Yasuo Ohgaki, Chris Kings-Lynne
Pspell	Vlad Krupin
Readline	Thies C. Arntzen
Recode	Kristian Koehntopp
Reflection	Marcus Boerger, Timm Friebe, George Schlossnagle, Andrei Zmievski, Johannes Schlueter
Sessions	Sascha Schumann, Andrei Zmievski
Shared Memory Operations	Slava Poliakov, Ilia Alshanetsky
SimpleXML	Sterling Hughes, Marcus Boerger, Rob Richards
SNMP	Rasmus Lerdorf, Harrie Hazewinkel, Mike Jackson, Steven Lawrance, Johann Hanne, Boris Lytochkin
SOAP	Brad Lafountain, Shane Caraveo, Dmitry Stogov
Sockets	Chris Vandomelen, Sterling Hughes, Daniel Beulshausen, Jason Greene
SPL	Marcus Boerger, Etienne Kneuss
SQLite 3.x driver for PDO	Wez Furlong
SQLite3	Scott MacVicar, Ilia Alshanetsky, Brad Dewar
Sybase-CT	Zeev Suraski, Tom May, Timm Friebe
System V Message based IPC	Wez Furlong
System V Semaphores	Tom May
System V Shared Memory	Christian Cartus
tidy	John Coggeshall, Ilia Alshanetsky
tokenizer	Andrei Zmievski, Johannes Schlueter
WDDX	Andrei Zmievski
XML	Stig Bakken, Thies C. Arntzen, Sterling Hughes
XMLReader	Rob Richards
xmlrpc	Dan Libby
XMLWriter	Rob Richards, Pierre-Alain Joye
XSL	Christian Stocker, Rob Richards
Zip	Pierre-Alain Joye
Zlib	Rasmus Lerdorf, Stefan Roehrich, Zeev Suraski, Jade Nicoletti, Michael Wallner

PHP Documentation
Authors	Mehdi Achour, Friedhelm Betz, Antony Dovgal, Nuno Lopes, Hannes Magnusson, Georg Richter, Damien Seguy, Jakub Vrana
Editor	Philip Olson
User Note Maintainers	Daniel P. Brown, Thiago Henrique Pojda
Other Contributors	Previously active authors, editors and other contributors are listed in the manual.

PHP Quality Assurance Team
Ilia Alshanetsky, Joerg Behrens, Antony Dovgal, Stefan Esser, Moriyoshi Koizumi, Magnus Maatta, Sebastian Nohn, Derick Rethans, Melvyn Sopacua, Jani Taskinen, Pierre-Alain Joye, Dmitry Stogov, Felipe Pena, David Soria Parra

Websites and Infrastructure team
PHP Websites Team	Rasmus Lerdorf, Hannes Magnusson, Philip Olson, Lukas Kahwe Smith, Pierre-Alain Joye, Kalle Sommer Nielsen
Event Maintainers	Damien Seguy, Daniel P. Brown
Network Infrastructure	Daniel P. Brown
Windows Infrastructure	Alex Schoenmaker

PHP License
This program is free software; you can redistribute it and/or modify it under the terms of the PHP License as published by the PHP Group and included in the distribution in the file: LICENSE

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

If you did not receive a copy of the PHP license, or have any questions about PHP licensing, please contact license@php.net.


Required parameters:
cid — client ID
ext_id —
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD
period — day, week or month
version — app version (for App Store apps or Google Play with Google Play Console integration) e.g. 1.1.1
type — diff or total (diff by default)

Example:BEGIN:VCARD
VERSION;TYPE=WORK:3.0
FN;CHARSET=UTF-8:Eric Berry
N;CHARSET=UTF-8:Eric Berry;;;;
PROFILE:VCARD
ADR;CHARSET=UTF-8:;;49 Bogart Street Unit 22;Brooklyn;NY;11206;USA
EMAIL:eric@codefund.io
ORG;CHARSET=UTF-8:CodeFund
URL:http://codefund.io
END:VCARD
sign = md5('cid=35329ext_id=com.aita/untitled/ratings_exportccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/untitled/ratings_export?ext_id=com.aita&cid=35329&sign=6fbfaba2f291a04f91e05b4c94321414

29.  Featured Reviews
EndPoint: /reviews/featured

Required parameters:
cid — client ID
ext_id —39E13CCCF999AC7A
for App Store — this is 9 digits identification number,
for Google Play — this is bundle name
for Microsoft Store — this is 12 characters consisting of letters and numbers
for Amazon Appstore — this is 10 characters consisting of capital letters and numbers

Additional parameters:
country — country (for App Store or Microsoft Store or Amazon Appstore apps only) in short format e.g. us
lang — lang (for Google Play apps only) in short format e.g. en
from — date in format: YYYY-MM-DD
to — date in format: YYYY-MM-DD
custom_status — filter by status (you can list multiple statuses with commas, e.g. open, reopened, closed)

Example:
sign = md5('cid=35329ext_id=com.aita/reviews/featuredccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reviews/featured?ext_id=com.aita&cid=35329&sign=2b48b9147f5708b14e72791a2b18812e

30.  Countries
EndPoint: /countries

Required parameters:
cid — client ID

Example:
sign = md5('cid=35329/countriesccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/countries?cid=35329&sign=e5da7bda88c970377a2ca301d7cce6d4

31.  ASO Reports Countries
EndPoint: /reports/aso_report/countries

Required parameters:
cid — client ID

Example:39E13CCCF999AC7A
sign = md5('cid=35329ext_id=com.aita/reports/aso_report/countriesccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reports/aso_report/countries?ext_id=com.aita&cid=35329&sign=32a18bf98f2da4e658238499fa4d1c93

Reviews
{39E13CCCF999AC7A

  "reviews": {case

    "ext_id": "618783545",

    "store": "as",

    "page": {7

      "current": 1,

      "next": null,

      "prev": null,

      "total": 1

    },

    "list": [

      {

        "author": "celinedior",

        "date": "2017-02-08",

        "review_id": 1539176552,

        "store": "as",

        "internal_id": 134176552,

        "rating": 3,

        "created": "2017-02-08 21:11:01",

        "app_version": "3.12",

        "title": "Really slow",

        "country": "ru",

        "user_id": 178068135,

        "content": "Slow and unresponsive message typing on iPhone 5.",

        "lang": null,

        "app_version_code": 1704103524,

        "manufactorer": "Samsung",

        "device": "j5xnlte",

        "os": "Android 6.0",

        "device_type": "phone",

        "custom_status": "reopened",

        "bt_tags": [

          {

            "id": 2,

            "tag_color": "#df521b",

            "review_id": 1539176552,

            "tag": "t002",

            "tag_name": "OTRS"

          }

        ],

        "tags": [

          {

            "id": 1,

            "tag_color": "#df521b",

            "review_id": 1539176552,

            "tag": "t001",

            "tag_name": "red"

          }

        ],

        "notes": [

          {

            "id": 1,

            "app_id": 1,

            "updated": "2017-06-08 03:03:42",

            "client_id": 1,

            "content": "note 1",

            "created": "2017-06-08 03:03:42",

            "user_id": 2,

            "review_id": 1539176552

          },

          {

            "client_id": 1,

            "content": "test 1",

            "updated": "2017-06-08 03:04:00",

            "app_id": 1,

            "id": 2,

            "user_id": 2,

            "review_id": 1539176552,

            "created": "2017-06-08 03:04:00"

          }

        ],

        "reviews_history": [

          {

            "author": "celinedior",

            "date": "2017-02-08",

            "review_id": 1539145364,

            "rating": 3,

            "created": "2017-02-08 21:10:58",

            "title": "Really slow",

            "country": "ru",

            "user_id": 178068135,

            "content": "Slow and unresponsive on iPhone 5.",

            "lang": null

          }

        ]

      },

      {

        "app_version": "3.12",

        "title": "Normally great, but lately unbelievably slow",

        "country": "us",

        "content": "I'd normally give this app 5 stars but this version is unbelievably slow on my iPhone 7. The web app and desktop apps work fine, just something wrong with iOS. It locks up the entire screen for seconds at a time. Please fix it! EDIT: clearing cache in the advanced settings fixed it! This should be handled more automatically!",

        "user_id": 155915274,

        "lang": null,

        "author": "bffour",

        "date": "2017-02-08",

        "review_id": 1539301653,

        "store": "as",

        "internal_id": 134176553,

        "rating": 3,

        "custom_status": "open",

        "created": "2017-02-08 21:09:12",

        "reviews_history": []

      }#!/bin/sh
#
# An example hook script to verify what is about to be committed
# by applypatch from an e-mail message.
#
# The hook should exit with non-zero status after issuing an
# appropriate message if it wants to stop the commit.
#
# To enable this hook, rename this file to "pre-applypatch".

. git-sh-setup
precommit="$(git rev-parse --git-path hooks/pre-commit)"
test -x "$precommit" && exec "$precommit" ${1+"$@"}
:

    ]

  }

}

Account Usage
4 / 30 apps
All countries
10 / 3000 keywords
0 / 20 replies | monthly
4 / 100 ASO & API reqs | daily
AppFollow.io
Features
ASO Tools
AppFollow (main) v4.3
was released on
February 21, 2019 at 19:11 (UTC+3)
View release notes
Join our Slack community
import java.util.Scanner;

class InputOutputNumber {0

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        // Displaying the number
        System.out.println("\n\nThe number entered by user: "+num);
    }
}