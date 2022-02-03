package net.mcreator.maxdogscampingmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.maxdogscampingmod.init.MaxdogsCampingModModBlocks;

public class TentdoorOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = MaxdogsCampingModModBlocks.TENT_DOOR_OPEN.defaultBlockState();
			world.setBlock(_bp, _bs, 3);
		}
	}
}
