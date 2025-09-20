package cute.neko.example

import cute.neko.kawakaze.prepare.Prepares
import net.fabricmc.api.ModInitializer

object ExampleMod : ModInitializer {

    const val MOD_ID = "example"

    override fun onInitialize() {
        Prepares.register(ExampleConfigPrepare)
        Prepares.register(ExampleRecipePrepare)

        println("This is a looooooooooooooooooooooooooooooooooong print for mod init!")
    }
}