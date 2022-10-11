
package net.mcreator.maxdogscampingmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.maxdogscampingmod.procedures.ScaredOnEffectActiveTickProcedure;

public class ScaredMobEffect extends MobEffect {
	public ScaredMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public String getDescriptionId() {
		return "effect.maxdogs_camping_mod.scared";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ScaredOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
