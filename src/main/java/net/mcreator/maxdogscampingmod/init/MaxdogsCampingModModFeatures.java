
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogscampingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.maxdogscampingmod.world.features.plants.MarshplantFeature;
import net.mcreator.maxdogscampingmod.MaxdogsCampingModMod;

@Mod.EventBusSubscriber
public class MaxdogsCampingModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MaxdogsCampingModMod.MODID);
	public static final RegistryObject<Feature<?>> MARSHPLANT = REGISTRY.register("marshplant", MarshplantFeature::feature);
}
