plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.todolist"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.todolist"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            applicationIdSuffix = ".debug"
            isDebuggable = true
        }
    }

    flavorDimensions += "version"
    productFlavors {
        create("demo") {
            dimension = "version"
            applicationIdSuffix = ".demo"
            versionNameSuffix = "-demo"
        }

        create("full") {
            dimension = "version"
            applicationIdSuffix = ".full"
            versionNameSuffix = "-full"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    lint {
        disable += "UnusedResources" + "TypographyFractions" + "TypographyQuotes"
    }

    tasks.register("printVersionInfo") {
        doLast {
            println("v${defaultConfig.versionName} (${defaultConfig.versionCode})")
        }
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}