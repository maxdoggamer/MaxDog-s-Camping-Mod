
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogscampingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.maxdogscampingmod.potion.ScaredMobEffect;
import net.mcreator.maxdogscampingmod.MaxdogsCampingModMod;

public class MaxdogsCampingModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MaxdogsCampingModMod.MODID);
	public static final RegistryObject<MobEffect> SCARED = REGISTRY.register("scared", () -> new ScaredMobEffect());
}
