// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}

buildscript {
    dependencies {
        classpath ("com.android.tools.build:gradle:8.5.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.0-RC1")
    }
}