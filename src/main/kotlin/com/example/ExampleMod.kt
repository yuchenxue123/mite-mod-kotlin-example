package com.example

import cute.neko.kawakaze.prepare.Prepares
import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object ExampleMod : ModInitializer {

    const val MOD_ID = "example"

    @JvmField
    val logger: Logger = LogManager.getLogger(MOD_ID)

    override fun onInitialize() {
        Prepares.register(ExampleConfigPrepare)
        Prepares.register(ExampleRecipePrepare)

        logger.info("This is a looooooooooooooooooooooooooooooooooong print for mod init!")
    }
}