pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
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
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.3")
    }
}

// nếu file của bạn đang dùng version catalog (libs.…) thì phần còn lại cứ để nguyên
// ví dụ:
plugins {
    // có thể đang trống, hoặc không có cũng được
}


rootProject.name = "Fragment_Nhan2So"
include(":app")
