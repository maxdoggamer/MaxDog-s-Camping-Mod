
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogscampingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.maxdogscampingmod.block.TentdoorBlock;
import net.mcreator.maxdogscampingmod.block.TentDoorOpenBlock;
import net.mcreator.maxdogscampingmod.block.TentBoxBlock;
import net.mcreator.maxdogscampingmod.block.TentBlockBlock;
import net.mcreator.maxdogscampingmod.block.SleepbagtentBlock;
import net.mcreator.maxdogscampingmod.block.MarshplantBlock;
import net.mcreator.maxdogscampingmod.block.BigPineWoodBlock;
import net.mcreator.maxdogscampingmod.block.BigPineStairsBlock;
import net.mcreator.maxdogscampingmod.block.BigPineSlabBlock;
import net.mcreator.maxdogscampingmod.block.BigPinePressurePlateBlock;
import net.mcreator.maxdogscampingmod.block.BigPinePlanksBlock;
import net.mcreator.maxdogscampingmod.block.BigPineLogBlock;
import net.mcreator.maxdogscampingmod.block.BigPineLeavesBlock;
import net.mcreator.maxdogscampingmod.block.BigPineFenceGateBlock;
import net.mcreator.maxdogscampingmod.block.BigPineFenceBlock;
import net.mcreator.maxdogscampingmod.block.BigPineButtonBlock;
import net.mcreator.maxdogscampingmod.MaxdogsCampingModMod;

public class MaxdogsCampingModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MaxdogsCampingModMod.MODID);
	public static final RegistryObject<Block> TENT_BOX = REGISTRY.register("tent_box", () -> new TentBoxBlock());
	public static final RegistryObject<Block> TENT_BLOCK = REGISTRY.register("tent_block", () -> new TentBlockBlock());
	public static final RegistryObject<Block> SLEEPBAGTENT = REGISTRY.register("sleepbagtent", () -> new SleepbagtentBlock());
	public static final RegistryObject<Block> TENTDOOR = REGISTRY.register("tentdoor", () -> new TentdoorBlock());
	public static final RegistryObject<Block> TENT_DOOR_OPEN = REGISTRY.register("tent_door_open", () -> new TentDoorOpenBlock());
	public static final RegistryObject<Block> MARSHPLANT = REGISTRY.register("marshplant", () -> new MarshplantBlock());
	public static final RegistryObject<Block> BIG_PINE_WOOD = REGISTRY.register("big_pine_wood", () -> new BigPineWoodBlock());
	public static final RegistryObject<Block> BIG_PINE_LOG = REGISTRY.register("big_pine_log", () -> new BigPineLogBlock());
	public static final RegistryObject<Block> BIG_PINE_PLANKS = REGISTRY.register("big_pine_planks", () -> new BigPinePlanksBlock());
	public static final RegistryObject<Block> BIG_PINE_LEAVES = REGISTRY.register("big_pine_leaves", () -> new BigPineLeavesBlock());
	public static final RegistryObject<Block> BIG_PINE_STAIRS = REGISTRY.register("big_pine_stairs", () -> new BigPineStairsBlock());
	public static final RegistryObject<Block> BIG_PINE_SLAB = REGISTRY.register("big_pine_slab", () -> new BigPineSlabBlock());
	public static final RegistryObject<Block> BIG_PINE_FENCE = REGISTRY.register("big_pine_fence", () -> new BigPineFenceBlock());
	public static final RegistryObject<Block> BIG_PINE_FENCE_GATE = REGISTRY.register("big_pine_fence_gate", () -> new BigPineFenceGateBlock());
	public static final RegistryObject<Block> BIG_PINE_PRESSURE_PLATE = REGISTRY.register("big_pine_pressure_plate", () -> new BigPinePressurePlateBlock());
	public static final RegistryObject<Block> BIG_PINE_BUTTON = REGISTRY.register("big_pine_button", () -> new BigPineButtonBlock());
}
