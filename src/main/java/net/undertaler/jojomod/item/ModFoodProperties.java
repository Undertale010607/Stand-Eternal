package net.undertaler.jojomod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ROKAKAKA = new FoodProperties.Builder().nutrition(4).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 100), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 2), 1f).build();
}
