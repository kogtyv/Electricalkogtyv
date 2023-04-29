package net.mcreator.electricalkog.procedures;

import net.minecraft.world.level.LevelAccessor;

public class Cable50vObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Cable50vModelUpdaterMainProcedure.execute(world, x, y, z);
		Cable50vForgeEnergyMainProcedure.execute(world, x, y, z);
	}
}
