package com.akroZora.highendtechnology.item;

import com.akroZora.highendtechnology.registration.HighEndTechnologyItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ENDERIUM = new ForgeTier(4, 2569, 10F, 5.5F, 22,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(HighEndTechnologyItems.ENDERIUM_INGOT.get()));
}
