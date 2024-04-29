package com.github.x3r.tune_sonic_boom;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(TuneSonicBoom.MOD_ID)
public class TuneSonicBoom {

    public static final String MOD_ID = "tune_sonic_boom";

    public TuneSonicBoom() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, TuneSonicBoomConfig.SPEC);
    }

}
