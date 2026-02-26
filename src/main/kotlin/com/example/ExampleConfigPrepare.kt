package com.example

import cute.neko.kawakaze.config.ConfigRegistrar
import cute.neko.kawakaze.prepare.types.ConfigPreparable

object ExampleConfigPrepare : ConfigPreparable() {
    override fun onConfigRegister(registrar: ConfigRegistrar) {
        registrar.register(ExampleConfig)
    }
}