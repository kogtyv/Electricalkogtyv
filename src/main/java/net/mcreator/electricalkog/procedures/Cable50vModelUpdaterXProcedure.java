package net.mcreator.electricalkog.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.electricalkog.init.ElectricalkogModBlocks;

import java.util.Map;

public class Cable50vModelUpdaterXProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState blockSelector = Blocks.AIR.defaultBlockState();
		String tagPath = "";
		String nbtSouthTagName = "";
		String nbtWestTagName = "";
		String nbtNorthTagName = "";
		String nbtEastTagName = "";
		String nbtUpTagName = "";
		String nbtDownTagName = "";
		blockSelector = ElectricalkogModBlocks.CABLE_50V_X.get().defaultBlockState();
		tagPath = "forge:cable";
		nbtUpTagName = "ForgeCableUp";
		nbtEastTagName = "ForgeCableEast";
		nbtWestTagName = "ForgeCableWest";
		nbtNorthTagName = "ForgeCableNorth";
		nbtDownTagName = "ForgeCableDown";
		nbtSouthTagName = "ForgeCableSouth";
		if (!(world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation((tagPath).toLowerCase(java.util.Locale.ENGLISH)))) && !(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y + 1, z), nbtDownTagName)) && !(world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation((tagPath).toLowerCase(java.util.Locale.ENGLISH)))) && !(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y - 1, z), nbtUpTagName)) && ((world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation((tagPath).toLowerCase(java.util.Locale.ENGLISH)))) || new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z + 1), nbtNorthTagName)) && ((world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation((tagPath).toLowerCase(java.util.Locale.ENGLISH)))) || new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z - 1), nbtSouthTagName)) && ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation((tagPath).toLowerCase(java.util.Locale.ENGLISH)))) || new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x + 1, y, z), nbtWestTagName)) && ((world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation((tagPath).toLowerCase(java.util.Locale.ENGLISH)))) || new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x - 1, y, z), nbtEastTagName))) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = blockSelector;
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			{
				Direction _dir = Direction.SOUTH;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
		}
	}
}
