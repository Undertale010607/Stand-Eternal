package net.undertaler.jojomod.item;

import net.undertaler.jojomod.JojoMod;
import net.undertaler.jojomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JojoMod.MOD_ID);

    public static final Supplier<CreativeModeTab> JOJO_ITEMS_TAB = CREATIVE_MODE_TAB.register("jojo_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_METEOR.get()))
                    .title(Component.translatable("creativetab.jojomod.jojo_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.METEOR_INGOT);
                        output.accept(ModItems.RAW_METEOR);
                    }).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_MODE_TAB.register("jojo_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.METEOR_RAW_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(JojoMod.MOD_ID, "jojo_items_tab"))
                    .title(Component.translatable("creativetab.jojomod.jojo_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.METEOR_BLOCK);
                        output.accept(ModBlocks.METEOR_RAW_BLOCK);
                        output.accept(ModBlocks.METEOR_STONE);
                        output.accept(ModBlocks.METEOR_ORE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
