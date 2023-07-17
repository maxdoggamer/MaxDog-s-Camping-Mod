
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogscampingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.maxdogscampingmod.item.TerrorStoriesItem;
import net.mcreator.maxdogscampingmod.item.MarshmallowItem;
import net.mcreator.maxdogscampingmod.item.CookedMarshmallowItem;
import net.mcreator.maxdogscampingmod.MaxdogsCampingModMod;

public class MaxdogsCampingModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MaxdogsCampingModMod.MODID);
	public static final RegistryObject<Item> TENT_BOX = block(MaxdogsCampingModModBlocks.TENT_BOX, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TENT_BLOCK = block(MaxdogsCampingModModBlocks.TENT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SLEEPBAGTENT = block(MaxdogsCampingModModBlocks.SLEEPBAGTENT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TENTDOOR = block(MaxdogsCampingModModBlocks.TENTDOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TENT_DOOR_OPEN = block(MaxdogsCampingModModBlocks.TENT_DOOR_OPEN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MARSHPLANT = block(MaxdogsCampingModModBlocks.MARSHPLANT, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> TERROR_STORIES = REGISTRY.register("terror_stories", () -> new TerrorStoriesItem());
	public static final RegistryObject<Item> BIG_PINE_WOOD = block(MaxdogsCampingModModBlocks.BIG_PINE_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIG_PINE_LOG = block(MaxdogsCampingModModBlocks.BIG_PINE_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIG_PINE_PLANKS = block(MaxdogsCampingModModBlocks.BIG_PINE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIG_PINE_LEAVES = block(MaxdogsCampingModModBlocks.BIG_PINE_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BIG_PINE_STAIRS = block(MaxdogsCampingModModBlocks.BIG_PINE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIG_PINE_SLAB = block(MaxdogsCampingModModBlocks.BIG_PINE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIG_PINE_FENCE = block(MaxdogsCampingModModBlocks.BIG_PINE_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BIG_PINE_FENCE_GATE = block(MaxdogsCampingModModBlocks.BIG_PINE_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BIG_PINE_PRESSURE_PLATE = block(MaxdogsCampingModModBlocks.BIG_PINE_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BIG_PINE_BUTTON = block(MaxdogsCampingModModBlocks.BIG_PINE_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MARSHMALLOW = REGISTRY.register("marshmallow", () -> new MarshmallowItem());
	public static final RegistryObject<Item> COOKED_MARSHMALLOW = REGISTRY.register("cooked_marshmallow", () -> new CookedMarshmallowItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
