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
        minSdkVersion(22)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true        
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.0"
    }
}

dependencies {
    implementation("androidx.preference:preference:1.2.0")
    implementation("androidx.activity:activity:1.4.0")
    implementation("androidx.compose.material:material:1.1.0")
}
