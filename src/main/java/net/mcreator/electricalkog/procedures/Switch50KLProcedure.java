package net.mcreator.electricalkog.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.electricalkog.init.ElectricalkogModBlocks;

public class Switch50KLProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), ElectricalkogModBlocks.SWITCH_OFF.get().defaultBlockState(), 3);
	}
}
