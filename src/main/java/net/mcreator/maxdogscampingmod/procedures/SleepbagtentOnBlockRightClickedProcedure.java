package net.mcreator.maxdogscampingmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

public class SleepbagtentOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.dayTime() > 12541) {
			class SleepbagtentOnBlockRightClickedWait3 {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					this.world = world;
					MinecraftForge.EVENT_BUS.register(SleepbagtentOnBlockRightClickedWait3.this);
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						SleepbagtentOnBlockRightClickedWait3.this.ticks += 1;
						if (SleepbagtentOnBlockRightClickedWait3.this.ticks >= SleepbagtentOnBlockRightClickedWait3.this.waitTicks)
							run();
					}
				}

				private void run() {
					MinecraftForge.EVENT_BUS.unregister(SleepbagtentOnBlockRightClickedWait3.this);
					if (world instanceof ServerLevel _level)
						_level.setDayTime(1);
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 3, (false), (false)));
				}
			}
			new SleepbagtentOnBlockRightClickedWait3().start(world, 40);
		} else {
			class SleepbagtentOnBlockRightClickedWait6 {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					this.world = world;
					MinecraftForge.EVENT_BUS.register(SleepbagtentOnBlockRightClickedWait6.this);
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						SleepbagtentOnBlockRightClickedWait6.this.ticks += 1;
						if (SleepbagtentOnBlockRightClickedWait6.this.ticks >= SleepbagtentOnBlockRightClickedWait6.this.waitTicks)
							run();
					}
				}

				private void run() {
					MinecraftForge.EVENT_BUS.unregister(SleepbagtentOnBlockRightClickedWait6.this);
					if (world instanceof ServerLevel _level)
						_level.setDayTime(12541);
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 3, (false), (false)));
				}
			}
			new SleepbagtentOnBlockRightClickedWait6().start(world, 40);
		}
	}
}
