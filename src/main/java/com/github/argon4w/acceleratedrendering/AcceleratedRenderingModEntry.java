package com.github.argon4w.acceleratedrendering;

import com.github.argon4w.acceleratedrendering.configs.FeatureConfig;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.ModLoadingContext;
import org.slf4j.Logger;

@Mod(AcceleratedRenderingModEntry.MOD_ID)
public class AcceleratedRenderingModEntry {

    public static final String MOD_ID = "acceleratedrendering";
    public static final Logger LOGGER = LogUtils.getLogger();

    // ✅ 必须提供 public 无参构造函数
    public AcceleratedRenderingModEntry() {
        // 在无参构造函数中注册配置
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, FeatureConfig.SPEC);
        
        // 如果需要注册事件总线监听器，也可以在这里做：
        // MinecraftForge.EVENT_BUS.register(...);
        // 或通过静态初始化块、ModLifecycleEvent 等方式（更推荐后者）
    }
}
