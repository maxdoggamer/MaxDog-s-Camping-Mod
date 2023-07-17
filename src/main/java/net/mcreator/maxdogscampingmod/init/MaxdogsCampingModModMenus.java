
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogscampingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.maxdogscampingmod.world.inventory.TentBoxGuiMenu;
import net.mcreator.maxdogscampingmod.MaxdogsCampingModMod;

public class MaxdogsCampingModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MaxdogsCampingModMod.MODID);
	public static final RegistryObject<MenuType<TentBoxGuiMenu>> TENT_BOX_GUI = REGISTRY.register("tent_box_gui", () -> IForgeMenuType.create(TentBoxGuiMenu::new));
}
