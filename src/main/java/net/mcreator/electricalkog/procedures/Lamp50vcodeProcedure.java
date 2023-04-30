package net.mcreator.electricalkog.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.electricalkog.init.ElectricalkogModBlocks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;
import java.util.Map;

public class Lamp50vcodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double previousRecipe = 0;
		double energy = 0;
		double Random = 0;
		double cheker = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.LAMP_50V.get()) {
			cheker = 0;
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.LAMPON_50V.get()) {
			cheker = 1;
		}
		Random = Mth.nextInt(RandomSource.create(), 1, 4096);
		if (cheker == 1) {
			cheker = -1;
			if (new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, new BlockPos(x, y, z)) < 5) {
				if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.LAMP_50V.get())) {
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = ElectricalkogModBlocks.LAMP_50V.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		}
		if (cheker == 0) {
			cheker = -1;
			if (new Object() {
				public int getEnergyStored(LevelAccessor level, BlockPos pos) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
					return _retval.get();
				}
			}.getEnergyStored(world, new BlockPos(x, y, z)) >= 5) {
				if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.LAMPON_50V.get())) {
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = ElectricalkogModBlocks.LAMPON_50V.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElectricalkogModBlocks.LAMPON_50V.get() && Random == 1) {
			world.setBlock(new BlockPos(x, y, z), ElectricalkogModBlocks.DEAD_LAMP_50_KL.get().defaultBlockState(), 3);
		}
		if (new Object() {
			public int getEnergyStored(LevelAccessor level, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, new BlockPos(x, y, z)) >= 5) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 5;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
	}
}
