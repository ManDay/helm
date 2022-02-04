plugins {
    // From com.android.tools.build:gradle
    id("com.android.application")
    // From org.jetbrains.kotlin:kotlin-gradle-plugin
    id("kotlin-android")
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.github.manday.helm"
        minSdkVersion(16)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.4.1")
}
