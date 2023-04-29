package net.mcreator.electricalkog.procedures;

import net.minecraft.world.level.LevelAccessor;

public class Cable50vForgeEnergySideProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		double sides = 0;
		boolean east = false;
		boolean south = false;
		boolean north = false;
		boolean west = false;
		boolean up = false;
		boolean down = false;
		south = Cable50vForgeEnergySouthProcedure.execute(world, x, y, z);
		north = Cable50vForgeEnergyNorthProcedure.execute(world, x, y, z);
		east = Cable50vForgeEnergyEastProcedure.execute(world, x, y, z);
		west = Cable50vForgeEnergyWestProcedure.execute(world, x, y, z);
		up = Cable50vForgeEnergyUpProcedure.execute(world, x, y, z);
		down = Cable50vForgeEnergyDownProcedure.execute(world, x, y, z);
		sides = 0;
		if (south) {
			sides = sides + 1;
		}
		if (north) {
			sides = sides + 1;
		}
		if (east) {
			sides = sides + 1;
		}
		if (west) {
			sides = sides + 1;
		}
		if (up) {
			sides = sides + 1;
		}
		if (down) {
			sides = sides + 1;
		}
		return sides;
	}
}
