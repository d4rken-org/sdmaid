
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

Example:
sign = md5('cid=35329ext_id=com.aita/untitled/ratings_exportccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/untitled/ratings_export?ext_id=com.aita&cid=35329&sign=6fbfaba2f291a04f91e05b4c94321414

29.  Featured Reviews
EndPoint: /reviews/featured

Required parameters:
cid — client ID
ext_id —
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

Example:
sign = md5('cid=35329ext_id=com.aita/reports/aso_report/countriesccY2tbUdMWctEUWtDmFG')
GET: https://api.appfollow.io/reports/aso_report/countries?ext_id=com.aita&cid=35329&sign=32a18bf98f2da4e658238499fa4d1c93

Reviews
{

  "reviews": {

    "ext_id": "618783545",

    "store": "as",

    "page": {

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

      }

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

class MultiplicationTable{

      public static void main(String args[]){

       /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        System.out.print("\nLength of the table: ");
        int lt = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
      System.out.println("\n\n*****MULTIPLICATION TABLE*****\n");


         for(int j=1;j<=lt;j++){

            System.out.print(" "+num*j+" ");

         }

         System.out.print("\n");

  }

}