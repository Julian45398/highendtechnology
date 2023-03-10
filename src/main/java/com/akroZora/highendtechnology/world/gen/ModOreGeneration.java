package com.akroZora.highendtechnology.world.gen;

import com.akroZora.highendtechnology.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        if(event.getCategory()== Biome.BiomeCategory.THEEND){
            base.add(ModPlacedFeatures.ENDERIUM_ORE_PLACED);
        }
    }
}
