package com.github.argon4w.acceleratedrendering;

import com.github.argon4w.acceleratedrendering.configs.FeatureConfig;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.ModLoadingContext;
import org.slf4j.Logger;

@Mod(AcceleratedRenderingModEntry.MOD_ID)
public class AcceleratedRenderingModEntry {

    public static final String MOD_ID = "acceleratedrendering";
    public static final Logger LOGGER = LogUtils.getLogger();

    // ✅ Forge 必须能调用这个（无参）
    public AcceleratedRenderingModEntry() {
        this(FMLJavaModLoadingContext.get()); // 委托给带参构造
    }

    // 🎯 Mixin 注入的目标（带参）
    public AcceleratedRenderingModEntry(FMLJavaModLoadingContext context) {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, FeatureConfig.SPEC);
    }
}
