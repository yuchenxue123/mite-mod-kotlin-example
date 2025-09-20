package cute.neko.example

import cute.neko.kawakaze.prepare.types.RecipePreparable
import cute.neko.kawakaze.registry.recipe.builder.RecipeBuilder
import net.minecraft.Item
import net.minecraft.ItemStack

object ExampleRecipePrepare : RecipePreparable() {
    override fun onRecipeCreate(creator: RecipeBuilder.RecipeCreator) {
        creator.shapeless()
            .output(ItemStack(Item.swordAdamantium))
            .input(ItemStack(Item.stick))
            .withLowestCrafting()
            .build()
            .delegate()
    }
}