package com.example

import cute.neko.kawakaze.prepare.types.RecipePreparable
import cute.neko.kawakaze.registry.recipe.builder.RecipeBuilder
import net.minecraft.Item
import net.minecraft.ItemStack

object ExampleRecipePrepare : RecipePreparable() {
    override fun onRecipeCreate(creator: RecipeBuilder.RecipeCreator) {
        creator.shapeless()
            .output(ItemStack(Item.swordAdamantium))
            .input(ItemStack(Item.stick, 2))
            .withLowestCrafting()
            .build() // 用两个木棍合成艾德曼剑
            .delegate()
            .output(ItemStack(Item.swordIron))
            .input(ItemStack(Item.stick))
            .withLowestCrafting()
            .build() // 用一个木棍合成铁剑
            .delegate()
            .output(ItemStack(Item.diamond))
            .input(ItemStack(Item.stick, 3))
            .withLowestCrafting()
            .build() // 用三个木棍合成钻石
            .delegate()
    }
}