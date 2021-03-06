package net.dancervlt69.slabsnstairs.Init.Settings;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModCommonSettings {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // public static final ForgeConfigSpec.ConfigValue<Integer> SAMPLE_CONFIG_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Integer> ILLUMINATED_GROWTH_STOP_LIGHT_RANGE;

    static {
        BUILDER.push("Settings for Labs 'n Stairs");

        // SAMPLE_CONFIG_VALUE = BUILDER.comment("How many Samples you need?").define("Needed Samples", 5);

        ILLUMINATED_GROWTH_STOP_LIGHT_RANGE = BUILDER.comment("Light Level of the illuminated Growth-Stops?")
                        .defineInRange("Light Level", 5, 1, 15);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
