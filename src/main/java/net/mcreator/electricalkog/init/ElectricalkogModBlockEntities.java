
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.electricalkog.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.electricalkog.block.entity.SwitchOnBlockEntity;
import net.mcreator.electricalkog.block.entity.RelaysOnBlockEntity;
import net.mcreator.electricalkog.block.entity.Lampon50vBlockEntity;
import net.mcreator.electricalkog.block.entity.Lamp50vBlockEntity;
import net.mcreator.electricalkog.block.entity.InfinityEnergyBlockEntity;
import net.mcreator.electricalkog.block.entity.IncubatorEgg50KLBlockEntity;
import net.mcreator.electricalkog.block.entity.FurniceGenBlockEntity;
import net.mcreator.electricalkog.block.entity.ElectricalFurniceBlockEntity;
import net.mcreator.electricalkog.block.entity.DiodeCable50vBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vXCBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vXBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vTXCCBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vTXCBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vTXBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vTCBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vTBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vSBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vLTCBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vLTBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vLCCBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vLCBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vLBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vIBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vFBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vEBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50vBlockEntity;
import net.mcreator.electricalkog.block.entity.Cable50v2BlockEntity;
import net.mcreator.electricalkog.ElectricalkogMod;

public class ElectricalkogModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ElectricalkogMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> INFINITY_ENERGY = register("infinity_energy", ElectricalkogModBlocks.INFINITY_ENERGY, InfinityEnergyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FURNICE_GEN = register("furnice_gen", ElectricalkogModBlocks.FURNICE_GEN, FurniceGenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMALL_CABLE_NULL = register("small_cable_null", ElectricalkogModBlocks.SMALL_CABLE_NULL, Cable50v2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V = register("cable_50v", ElectricalkogModBlocks.CABLE_50V, Cable50vBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIODE_CABLE_50V = register("diode_cable_50v", ElectricalkogModBlocks.DIODE_CABLE_50V, DiodeCable50vBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAMP_50V = register("lamp_50v", ElectricalkogModBlocks.LAMP_50V, Lamp50vBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_E = register("cable_50v_e", ElectricalkogModBlocks.CABLE_50V_E, Cable50vEBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_I = register("cable_50v_i", ElectricalkogModBlocks.CABLE_50V_I, Cable50vIBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_L = register("cable_50v_l", ElectricalkogModBlocks.CABLE_50V_L, Cable50vLBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_LC = register("cable_50v_lc", ElectricalkogModBlocks.CABLE_50V_LC, Cable50vLCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_LCC = register("cable_50v_lcc", ElectricalkogModBlocks.CABLE_50V_LCC, Cable50vLCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_LT = register("cable_50v_lt", ElectricalkogModBlocks.CABLE_50V_LT, Cable50vLTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_LTC = register("cable_50v_ltc", ElectricalkogModBlocks.CABLE_50V_LTC, Cable50vLTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_F = register("cable_50v_f", ElectricalkogModBlocks.CABLE_50V_F, Cable50vFBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAMPON_50V = register("lampon_50v", ElectricalkogModBlocks.LAMPON_50V, Lampon50vBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_S = register("cable_50v_s", ElectricalkogModBlocks.CABLE_50V_S, Cable50vSBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_T = register("cable_50v_t", ElectricalkogModBlocks.CABLE_50V_T, Cable50vTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_TC = register("cable_50v_tc", ElectricalkogModBlocks.CABLE_50V_TC, Cable50vTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_TX = register("cable_50v_tx", ElectricalkogModBlocks.CABLE_50V_TX, Cable50vTXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_TXC = register("cable_50v_txc", ElectricalkogModBlocks.CABLE_50V_TXC, Cable50vTXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_TXCC = register("cable_50v_txcc", ElectricalkogModBlocks.CABLE_50V_TXCC, Cable50vTXCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_X = register("cable_50v_x", ElectricalkogModBlocks.CABLE_50V_X, Cable50vXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_50V_XC = register("cable_50v_xc", ElectricalkogModBlocks.CABLE_50V_XC, Cable50vXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SWITCH_ON = register("switch_on", ElectricalkogModBlocks.SWITCH_ON, SwitchOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RELAYS_ON = register("relays_on", ElectricalkogModBlocks.RELAYS_ON, RelaysOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INCUBATOR_EGG_50_KL = register("incubator_egg_50_kl", ElectricalkogModBlocks.INCUBATOR_EGG_50_KL, IncubatorEgg50KLBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRICAL_FURNICE = register("electrical_furnice", ElectricalkogModBlocks.ELECTRICAL_FURNICE, ElectricalFurniceBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
