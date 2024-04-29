package com.github.x3r.tune_sonic_boom;

import net.minecraftforge.common.ForgeConfigSpec;

public class TuneSonicBoomConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.DoubleValue sonicBoomDamageMultiplier;

    static  {
        BUILDER.push("Tune Sonic Boom Config");

        sonicBoomDamageMultiplier = BUILDER
                .comment("Multiplier for the damage dealt by the Warden's Sonic Boom attack")
                .translation("tune_sonic_boom.config.sonicBoomDamageMultiplier")
                .worldRestart()
                .defineInRange("sonicBoomDamageMultiplier", 1.0D, 0, 10000);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }


}
