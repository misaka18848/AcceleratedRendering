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

    public AcceleratedRenderingModEntry(FMLJavaModLoadingContext context) {
        // 注册配置（通过 ModLoadingContext）
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, FeatureConfig.SPEC);
    }
}
