@file:Suppress("SuspiciousCollectionReassignment")

import com.quickbirdstudios.surveykit.configureLibraryPublication

plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jetbrains.kotlin.android.extensions")
    id("com.jfrog.bintray")
    id("com.github.dcendents.android-maven")
    `maven-publish`
}
group = "com.github.andre00nogueira"

androidExtensions { isExperimental = true }

android {
    compileSdkVersion(Project.Android.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Project.Android.minSdkVersion)
        targetSdkVersion(Project.Android.targetSdkVersion)
        testInstrumentationRunner = Project.Android.testInstrumentationRunner
    }

    testOptions {
        animationsDisabled = true
    }
}

dependencies {
    implementation(Deps.Kotlin.stdlib)
    api(Deps.Kotlin.coroutines)
    implementation(Deps.Kotlin.androidCoroutines)
    implementation(Deps.AndroidSupport.appCompat)
    implementation(Deps.AndroidSupport.constraint)
    implementation(Deps.AndroidSupport.recyclerView)
    implementation(Deps.lottie)
    implementation(Deps.PlayServices.maps)

    testImplementation(Deps.Test.jUnitJupiter)
    testImplementation(Deps.Test.jUnitPlatform)
}

project.configureLibraryPublication()
