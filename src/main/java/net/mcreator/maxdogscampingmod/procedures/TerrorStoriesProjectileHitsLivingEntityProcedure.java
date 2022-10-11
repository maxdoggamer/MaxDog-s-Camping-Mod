package net.mcreator.maxdogscampingmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maxdogscampingmod.init.MaxdogsCampingModModMobEffects;

public class TerrorStoriesProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MaxdogsCampingModModMobEffects.SCARED.get(), 1200, 1, (false), (false)));
	}
}
