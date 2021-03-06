
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogscampingmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MaxdogsCampingModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TENT_BOX = register(MaxdogsCampingModModBlocks.TENT_BOX, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TENT_BLOCK = register(MaxdogsCampingModModBlocks.TENT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SLEEPBAGTENT = register(MaxdogsCampingModModBlocks.SLEEPBAGTENT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TENTDOOR = register(MaxdogsCampingModModBlocks.TENTDOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TENT_DOOR_OPEN = register(MaxdogsCampingModModBlocks.TENT_DOOR_OPEN, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
