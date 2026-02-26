package com.example

import cute.neko.kawakaze.config.Config

@Suppress("unused")
object ExampleConfig : Config("example", ExampleMod.MOD_ID) {

    val example_boolean = setting("Fly", false)

    val example_float = setting("Speed", 3f, 1f, 10f)

    val example_mode = setting("Mode", arrayOf("Fast", "Slow"), "Slow")

}