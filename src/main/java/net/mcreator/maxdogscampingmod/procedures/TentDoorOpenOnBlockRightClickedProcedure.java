package net.mcreator.maxdogscampingmod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.maxdogscampingmod.init.MaxdogsCampingModModBlocks;

public class TentDoorOpenOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = MaxdogsCampingModModBlocks.TENTDOOR.defaultBlockState();
			world.setBlock(_bp, _bs, 3);
		}
	}
}
