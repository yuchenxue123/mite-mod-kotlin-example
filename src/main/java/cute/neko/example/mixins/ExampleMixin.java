package cute.neko.example.mixins;

import net.minecraft.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {

    @Inject(method = "startGame", at = @At(value = "HEAD"))
    public void startGame(CallbackInfo ci) {
        System.out.println("This is a looooooooooooooooooooooooooooooong print for mixin!");
    }
}
