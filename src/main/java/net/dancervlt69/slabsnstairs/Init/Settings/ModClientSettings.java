package net.dancervlt69.slabsnstairs.Init.Settings;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModClientSettings {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Settings for Slabs 'n Stairs");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
    /* public static void register(IEventBus eventBus) {
        ModSettings.register(eventBus);
    } */
}
