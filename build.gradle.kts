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
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.github.manday.helm"
        minSdkVersion(16)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation("androidx.preference:preference:1.2.0")
    implementation("androidx.fragment:fragment:1.4.1")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
}
