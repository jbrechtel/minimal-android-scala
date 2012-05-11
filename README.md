minimal-android-scala
====================

This is a demonstration of the minimal files and ceremony needed to build an Android application in Scala.
Only 5 files are used for building.

    MainActivity.scala
    build.scala
    plugins.sbt
    icon.png
    AndroidManifest.xml

You must have the [Android SDK](http://developer.android.com/sdk/index.html) installed and your ANDROID_HOME environment variable set.
You also need [sbt](https://github.com/harrah/xsbt/wiki).

To build the project run:

    sbt android:package-debug
   
To install the build package to an attached device or running emulator run:

    sbt android:start-device
or
    sbt android:start-emulator