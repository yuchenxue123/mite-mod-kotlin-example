import Versions.kawakaze_version
import Versions.kotlin_version
import org.gradle.api.artifacts.dsl.DependencyHandler

val DependencyHandler.`kotlin-stdlib`: String
    get() = "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"

val DependencyHandler.`kawakaze-lib`: String
    get() = "cute.neko.mite:kawakaze-lib:$kawakaze_version"