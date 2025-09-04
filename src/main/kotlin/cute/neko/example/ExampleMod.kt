package cute.neko.example

import cute.neko.kawakaze.config.ConfigTask
import net.fabricmc.api.ModInitializer

object ExampleMod : ModInitializer {

    const val MOD_ID = "example"

    override fun onInitialize() {

        // must register use [ConfigTask.before]
        ConfigTask.before { registrar ->
            registrar.register(ExampleConfig)
        }

        // check
        ConfigTask.after {
            println(ExampleConfig.example_mode.get())
        }

        println("This is a looooooooooooooooooooooooooooooooooong print for mod init!")
    }
}