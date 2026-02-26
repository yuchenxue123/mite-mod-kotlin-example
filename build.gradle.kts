plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.fml)
    id("maven-publish")
}

val mod_name: String by project
val mod_version: String by project
val mod_id: String by project
val maven_group: String by project

group = maven_group
version = mod_version

base {
    archivesName = mod_id
}

repositories {
    maven("https://jitpack.io")
    maven("https://gitlab.com/api/v4/projects/74192719/packages/maven")
}


loom {
    accessWidenerPath = file("src/main/resources/example.accesswidener")
    mergedMinecraftJar()
    fml = File("loader/loader-3.4.2.jar")

    mods {
        create(mod_name) {
            sourceSet(sourceSets.main.get())
        }
    }
}

dependencies {
    minecraft("Minecraft:IsTooEasy:1.6.4-MITE")
    mappings(loom.fmlMCPMappings())
    implementation(files(loom.fml.toPath()))

    implementation(libs.kotlinLanguage)
    implementation(libs.kawakazeLib)
}

tasks.processResources {
    inputs.property("version", mod_version)

    filesMatching("fml.mod.json") {
        expand("version" to mod_version)
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
