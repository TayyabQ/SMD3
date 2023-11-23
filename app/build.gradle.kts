plugins {
    id("com.android.application")
}

android {
    namespace = "com.tayyabqaisar.proj2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tayyabqaisar.proj2"
        minSdk = 31
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-messaging:23.3.1")
    implementation("com.google.firebase:firebase-crashlytics-buildtools:2.9.9")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-firestore:24.9.1")
    implementation("com.android.volley:volley:1.2.1")
    implementation("org.chromium.net:cronet-embedded:113.5672.61")
    implementation("androidx.compose.ui:ui-graphics-android:1.5.4")
    implementation("androidx.compose.ui:ui-text-android:1.5.4")
    implementation("androidx.compose.material3:material3:1.1.2")
    implementation("com.squareup.okhttp3:okhttp:4.9.1")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}