package net.yelloww69.wandsnwonders.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yelloww69.wandsnwonders.WandsNWonders;

import java.util.function.Supplier;

public class WNWCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WandsNWonders.MOD_ID);

    public static final Supplier<CreativeModeTab> WANDS_TAB = CREATIVE_MODE_TAB.register("wands_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistries.BASICWAND.get()))
                    .title(Component.translatable("creativetab.wandsnwonders.wand_items"))
                    .displayItems((itemParameters, output) -> {
                        output.accept(ItemRegistries.BASICWAND);
                    })

                    .build());

    public static final Supplier<CreativeModeTab> WONDERS_TAB = CREATIVE_MODE_TAB.register("wonders_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistries.BASICWAND.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(WandsNWonders.MOD_ID, "wands_tab"))
                    .title(Component.translatable("creativetab.wandsnwonders.wonder_items"))
                    .displayItems((itemParameters, output) -> {
                        output.accept(ItemRegistries.BASICWAND);
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
