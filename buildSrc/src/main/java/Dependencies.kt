/**
 * Created by Isaac Iniongun on 2019-11-15.
 * For Tiv Bible project.
 */

object Versions {

    const val applicationId = "com.iniongun.tivbible"

    const val targetSdkVersion = 29
    const val compileSdkVersion = 29
    const val minSdkVersion = 16
    const val buildToolsVersion = "29.0.2"

    const val versionCode = 1
    const val versionName = "1.0"

    const val kotlin = "1.3.60"
    const val gradle = "3.5.2"
    const val navLifecycle = "2.1.0"
    const val appCompat = "1.1.0"
    const val androidXCoreKts = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val materialDesign = "1.1.0-alpha10"
    const val okhttp = "3.12.0"
    const val retrofit = "2.4.0"
    const val retrofitCoroutinesAdapter = "0.9.2"
    const val dagger = "2.24"
    const val coroutines = "1.3.0-RC"
    const val gson = "2.8.5"
    const val legacySupport = "1.0.0"
    const val architectureCore = "2.0.1"

    const val javaxInject = "1"
    const val javaxAnnotation = "1.0"
    const val room = "2.2.2"
    const val rxJava = "2.2.10"
    const val rxAndroid = "2.1.1"

    const val threeTenAndroidBackport = "1.2.1"

    const val juint = "4.12"
    const val junitExtension = "1.1.1"
    const val junit5DeMannodermausGradlePlugin = "1.5.1.0"
    const val junit5 = "5.5.1"
    const val mockK = "1.9.3"
    const val androidXTestCore = "1.2.0"
    const val espresso = "3.2.0"
    const val hamcrest = "1.3"
    const val robolectric = "4.3.1"
    const val threeTenBackport = "1.4.0"
}

object Dependencies {

    //Classpaths
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val navSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navLifecycle}"
    const val junit5DeMannodermausGradlePlugin = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.junit5DeMannodermausGradlePlugin}"

    //Kotlin Standard Library
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    //AppCompat
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    //AndroidXCore
    const val androidXCoreKts = "androidx.core:core-ktx:${Versions.androidXCoreKts}"

    //Constraint Layout
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    //Material Design
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"

    //Navigation
    const val navFragmentKts = "androidx.navigation:navigation-fragment-ktx:${Versions.navLifecycle}"
    const val navUIKts = "androidx.navigation:navigation-ui-ktx:${Versions.navLifecycle}"

    //Gson
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    //Kotlin Coroutines
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    //Okhttp
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

    //Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitCoroutinesAdapter =  "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutinesAdapter}"

    // ViewModel
    const val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.navLifecycle}"
    const val lifecycleViewModelKts = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.navLifecycle}"
    const val lifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.navLifecycle}"
    const val legacySupport = "androidx.legacy:legacy-support-v4:${Versions.legacySupport}"

    //Dagger
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

    //RxJava
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

    //Room
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomRx = "androidx.room:room-rxjava2:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomTesting = "android.arch.persistence.room:testing:${Versions.room}"

    //Java Annotations
    const val javax = "javax.inject:javax.inject:${Versions.javaxInject}"
    const val javaxAnnotation = "javax.annotation:jsr250-api:${Versions.javaxAnnotation}"

    //ThreeTen Android Backport for DateTime
    const val threeTenAndroidBackport = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenAndroidBackport}"

    //Apache string utilities
    const val wordUtilities = "org.apache.commons:commons-lang3:3.4"

    //Testing
    const val junit = "junit:junit:${Versions.juint}"
    const val androidXJunitExtension = "androidx.test.ext:junit:${Versions.junitExtension}"
    const val androidXArchCoreRuntime = "androidx.arch.core:core-runtime:${Versions.architectureCore}"
    const val androidXArchCoreTesting = "androidx.arch.core:core-testing:${Versions.architectureCore}"
    const val junit5JupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    const val junit5JupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
    const val junit5JupiterParams = "org.junit.jupiter:junit-jupiter-params:${Versions.junit5}"
    const val mockK = "io.mockk:mockk:${Versions.mockK}"
    const val androidXTestCore = "androidx.test:core:${Versions.androidXTestCore}"
    const val androidXTestCoreKtx = "androidx.test:core-ktx:${Versions.androidXTestCore}"
    const val androidXTestRunner = "androidx.test:runner:${Versions.androidXTestCore}"
    const val androidXTestRules = "androidx.test:rules:${Versions.androidXTestCore}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    const val hamcrest = "org.hamcrest:hamcrest-all:${Versions.hamcrest}"
    const val roboelectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val threeTenBackport = "org.threeten:threetenbp:${Versions.threeTenBackport}"
}