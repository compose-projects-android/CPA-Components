pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven (url = "https://jitpack.io" )


    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven (url = "https://jitpack.io" )
    }
}

rootProject.name = "CPA-COMPONENTS"
include(":app")
include(":cpa_buttons")
include(":cpa_textfield")
