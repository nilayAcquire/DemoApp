# DemoApp
The official Android sdk for https://www.tagove.com/

This app includes sdk for visitor:

This is a initial **beta** version of sdk to check all chat functions only.
And also contains known bugs.

Requirements
-------------
- Android Studio 2.2.x
- Gradle 2.2.x
- Android 7.1.1 SDK
- Android Support Library, revision 24 or newer
- Google Play Services, version 9.6.0 or newer
- An Android device running Android 4.4W or newer

Steps to initialize sdk
-------------
You just need to put this when you want to start chat :
- **TagoveApp.init(MainActivity.this, _*Your Agent Id Here*_);**

like Floating button

Building
-------------
- Make sure you've installed the Android 7.1.1 SDK and upgraded to the latest version of Android Studio
- Make sure you've updated all support repository and Google Play Services repository packages in the Android SDK manager
- Check out or Download nilayTagove/DemoApp project for easy setup for your project.
- See the configuration and clone the environment into your project to run our Tagove chat sdk.

For sdk you will need to add these dependencies to your project.
```javascript
// Add these lines to your app gradle:
    compile fileTree(include: ['*.jar'], dir: 'libs')
    compile 'com.android.support:appcompat-v7:26.1.0'
    compile('io.socket:socket.io-client:0.8.3') {
        exclude group: 'org.json', module: 'json'
    }
    compile(name: 'librarytagove-release', ext: 'aar') {
        transitive true
    }
    compile 'com.android.support:multidex:1.0.1'
    compile 'com.jakewharton.picasso:picasso2-okhttp3-downloader:1.1.0'
    compile 'com.android.support:design:26.1.0'
    compile 'com.mikhaellopez:circularimageview:2.1.1'
    compile 'andhradroid.dev:aFilechooser:1.0.1'
```
Also match your global gradle with this demo's global gradle file.

Put librarytagove-release.aar file to your libs directory.

And that's it :thumbsup: 
Voila!! You had integrated whole chat module in few minutes.
