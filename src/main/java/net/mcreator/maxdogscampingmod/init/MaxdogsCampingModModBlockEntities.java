
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogscampingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.maxdogscampingmod.block.entity.TentBoxBlockEntity;
import net.mcreator.maxdogscampingmod.MaxdogsCampingModMod;

public class MaxdogsCampingModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MaxdogsCampingModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TENT_BOX = register("tent_box", MaxdogsCampingModModBlocks.TENT_BOX, TentBoxBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
