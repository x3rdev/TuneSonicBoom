package com.github.x3r.tune_sonic_boom.mixin;

import com.github.x3r.tune_sonic_boom.TuneSonicBoomConfig;
import net.minecraft.world.entity.ai.behavior.warden.SonicBoom;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(SonicBoom.class)
public class SonicBoomMixin {

    @ModifyArg(method = "lambda$tick$2", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"), index = 1)
    private static float injectedSonicBoomDamage(float original) {
        return (float) (original * TuneSonicBoomConfig.sonicBoomDamageMultiplier.get());
    }
}
