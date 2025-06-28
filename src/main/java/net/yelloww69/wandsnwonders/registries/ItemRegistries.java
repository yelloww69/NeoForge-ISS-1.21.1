package net.yelloww69.wandsnwonders.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yelloww69.wandsnwonders.WandsNWonders;
import net.yelloww69.wandsnwonders.items.wands.YellowSpellbook;

public class ItemRegistries {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WandsNWonders.MOD_ID);

    public static final DeferredItem<Item> BASICWAND = ITEMS.register("wand",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredHolder<Item, Item> YELLOW_SPELLBOOK = ITEMS.register("yellow_spellbook", YellowSpellbook::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
