pluginManagement {
  repositories {
    google()
    mavenCentral()
  }
}
buildscript {
  android.useAndroidX = true
  
  repositories {
    google()
    mavenCentral()
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    classpath("com.android.tools.build:gradle:7.0.4")
  }
}
