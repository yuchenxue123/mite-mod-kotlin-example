plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
}

gradlePlugin {
    plugins {
        register("lite") {
            id = "lite"
            implementationClass = "LitePlugin"
        }
    }

}