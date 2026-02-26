package com.example.injection.mixins;

import com.example.ExampleMod;
import net.minecraft.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {

    @Inject(method = "startGame", at = @At(value = "HEAD"))
    public void startGame(CallbackInfo ci) {
        ExampleMod.logger.info("This is a looooooooooooooooooooooooooooooong print for mixin!");
    }
}
