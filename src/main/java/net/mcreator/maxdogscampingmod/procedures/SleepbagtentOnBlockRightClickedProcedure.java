package net.mcreator.maxdogscampingmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.maxdogscampingmod.MaxdogsCampingModMod;

public class SleepbagtentOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.dayTime() > 12541) {
			MaxdogsCampingModMod.queueServerWork(40, () -> {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(1);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 3, false, false));
			});
		} else {
			MaxdogsCampingModMod.queueServerWork(40, () -> {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(12541);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 3, false, false));
			});
		}
	}
}
