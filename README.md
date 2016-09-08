Sunshine
========

Sunshine is the companion Android app for the Udacity course [Developing Android Apps: Android Fundamentals](https://www.udacity.com/course/ud853).

##### Open Weather Map API Key is required.

In order for the Sunshine app to function properly, an API key for openweathermap.org must be included with the build. [instructions](http://openweathermap.org/appid#use), and the following line is added to [USER_HOME]/.gradle/gradle.properties include the unique key for the build

`MyOpenWeatherMapApiKey="<UNIQUE_API_KEY">`

This app provide users with a 10 day forecast of the user's preferred location. It is compatible with all devices running on Ice Cream Sandwich and higher (API Level 15). Internet connectivity is required to establish connection to the Open Weather database.Features:

1. Weather forecast for 10 days
2. Optimized app experience for tablet
3. Rain, fog, snow and sleet alerts.
4. Widgets
5. Getting location using google maps
6. Rich Notifications
7. Wallpaper to reciprocate the weather

*Implements:*  SyncAdapter; Custom View creation; AppWidgetProvider; RecyclerView with ViewHolder and CardViews; SQLite database with custom Content Provider; Google ApI; User Interface and Layout managers; Cursor Loaders / CursorAdapters; PreferenceManager; NotificationManager; Parcelable; App navigation with Explicit Intents; Alarms; AsyncTask; ShareIntent; FragmentManager; [Muzei App](https://github.com/romannurik/muzei/wiki/API) integration for wallpaper change; [Picasso](http://square.github.io/picasso/)
For the original version, please go [here](https://github.com/udacity/Sunshine).
