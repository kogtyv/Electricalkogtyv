package net.mcreator.electricalkog.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.electricalkog.init.ElectricalkogModBlocks;

public class Cable50vModelUpdaterMainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V.get())) {
			Cable50vModelUpdaterNProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_E.get())) {
			Cable50vModelUpdaterEProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_I.get())) {
			Cable50vModelUpdaterIProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_L.get())) {
			Cable50vModelUpdaterLProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_LC.get())) {
			Cable50vModelUpdaterLCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_LCC.get())) {
			Cable50vModelUpdaterLCCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_LT.get())) {
			Cable50vModelUpdaterLTProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_LTC.get())) {
			Cable50vModelUpdaterLTCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_T.get())) {
			Cable50vModelUpdaterTProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_TC.get())) {
			Cable50vModelUpdaterTCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_TX.get())) {
			Cable50vModelUpdaterTXProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_TXC.get())) {
			Cable50vModelUpdaterTXCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_TXCC.get())) {
			Cable50vModelUpdaterTXCCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_X.get())) {
			Cable50vModelUpdaterXProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_XC.get())) {
			Cable50vModelUpdaterXCProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_F.get())) {
			Cable50vModelUpdaterFProcedure.execute(world, x, y, z);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.CABLE_50V_S.get())) {
			Cable50vModelUpdaterSProcedure.execute(world, x, y, z);
		}
	}
}
