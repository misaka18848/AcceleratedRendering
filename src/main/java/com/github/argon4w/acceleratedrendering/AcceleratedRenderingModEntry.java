package com.github.argon4w.acceleratedrendering;

import com.github.argon4w.acceleratedrendering.configs.FeatureConfig;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AcceleratedRenderingModEntry.MOD_ID)
public class AcceleratedRenderingModEntry {

    public static final String MOD_ID = "acceleratedrendering";
    public static final Logger LOGGER = LogUtils.getLogger();

    // 接收 FMLJavaModLoadingContext 参数
    public AcceleratedRenderingModEntry(FMLJavaModLoadingContext context) {
        // 注册配置
        context.registerConfig(ModConfig.Type.CLIENT, FeatureConfig.SPEC);
        
        // 保存事件总线（供 Mixin 或其他地方使用）
        // 如果你需要在别处用，可以存为静态字段
    }
}
