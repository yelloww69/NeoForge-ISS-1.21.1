package net.yelloww69.wandsnwonders.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yelloww69.wandsnwonders.WandsNWonders;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WandsNWonders.MOD_ID);

    public static final DeferredItem<Item> BASICWAND = ITEMS.register("wand",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
