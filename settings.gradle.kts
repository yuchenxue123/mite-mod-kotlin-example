pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()

        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }

        maven {
            name = "Project"
            url = uri("file://${rootDir}/repo")
        }
    }

    plugins {
        val kotlin_version: String by settings
        val loom_version: String by settings

        kotlin("jvm") version kotlin_version
        id("fml-loom") version loom_version
    }
}