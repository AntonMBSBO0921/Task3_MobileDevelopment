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

rootProject.name = "RumireamaiorovLesson3"
include(":app")
include(":app:favoritebook")
include(":app:intentapp")
include(":app:sharer")
include(":app:systemintentsapp")
include(":app:simplefragmentapp")
