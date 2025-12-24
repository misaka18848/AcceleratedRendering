ResourceLocationUtils.javapackage com.github.argon4w.acceleratedrendering.core.utils;

import com.github.argon4w.acceleratedrendering.AcceleratedRenderingModEntry;
import net.minecraft.resources.ResourceLocation;

public class ResourceLocationUtils {

    public static ResourceLocation create(String path) {
        // Forge 47.2.19 / Minecraft 1.20.1 不支持 fromNamespaceAndPath
        return new ResourceLocation(AcceleratedRenderingModEntry.MOD_ID, path);
    }
}
