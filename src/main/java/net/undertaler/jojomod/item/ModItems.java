package net.undertaler.jojomod.item;

import net.undertaler.jojomod.JojoMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JojoMod.MOD_ID);

    public static final DeferredItem<Item> METEOR_INGOT = ITEMS.register("meteor_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_METEOR = ITEMS.register("raw_meteor",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
