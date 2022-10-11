package net.mcreator.maxdogscampingmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.maxdogscampingmod.init.MaxdogsCampingModModBlocks;

public class TentDoorOpenOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), MaxdogsCampingModModBlocks.TENTDOOR.get().defaultBlockState(), 3);
	}
}
