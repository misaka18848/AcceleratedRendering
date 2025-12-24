package com.github.argon4w.acceleratedrendering.compat.iris.mixins.acceleratedrendering;
import com.github.argon4w.acceleratedrendering.AcceleratedRenderingModEntry;
import com.github.argon4w.acceleratedrendering.compat.iris.programs.IrisPrograms;
import net.minecraftforge.fml.ModLoadingContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AcceleratedRenderingModEntry.class)
public class AcceleratedRenderingModEntryMixin {

    @Inject(
        method = "<init>",
        at = @At("TAIL"),
        remap = false
    )
    private void registerIrisEvents(CallbackInfo ci) {
        // 使用静态方法获取当前 mod 的事件总线
        ModLoadingContext.get()
            .getActiveContainer()
            .getEventBus()
            .register(IrisPrograms.class);
    }
}
