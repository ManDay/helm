pluginManagement {
  repositories {
    google()
    mavenCentral()
  }
}
buildscript {
  repositories {
    google()
    mavenCentral()
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    classpath("com.android.tools.build:gradle:7.0.4")
    classpath("androidx.compose.compiler:compiler:1.1.0")
  }
}
