
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.electricalkog.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.electricalkog.block.SwitchOnBlock;
import net.mcreator.electricalkog.block.SwitchOffBlock;
import net.mcreator.electricalkog.block.RelaysOnBlock;
import net.mcreator.electricalkog.block.RelaysOffBlock;
import net.mcreator.electricalkog.block.Lampon50vBlock;
import net.mcreator.electricalkog.block.Lamp50vBlock;
import net.mcreator.electricalkog.block.InfinityEnergyBlock;
import net.mcreator.electricalkog.block.IncubatorEgg50KLBlock;
import net.mcreator.electricalkog.block.FurniceGenBlock;
import net.mcreator.electricalkog.block.ElectricalFurniceBlock;
import net.mcreator.electricalkog.block.DiodeCable50vBlock;
import net.mcreator.electricalkog.block.DeadLamp50KLBlock;
import net.mcreator.electricalkog.block.Cable50vXCBlock;
import net.mcreator.electricalkog.block.Cable50vXBlock;
import net.mcreator.electricalkog.block.Cable50vTXCCBlock;
import net.mcreator.electricalkog.block.Cable50vTXCBlock;
import net.mcreator.electricalkog.block.Cable50vTXBlock;
import net.mcreator.electricalkog.block.Cable50vTCBlock;
import net.mcreator.electricalkog.block.Cable50vTBlock;
import net.mcreator.electricalkog.block.Cable50vSBlock;
import net.mcreator.electricalkog.block.Cable50vLTCBlock;
import net.mcreator.electricalkog.block.Cable50vLTBlock;
import net.mcreator.electricalkog.block.Cable50vLCCBlock;
import net.mcreator.electricalkog.block.Cable50vLCBlock;
import net.mcreator.electricalkog.block.Cable50vLBlock;
import net.mcreator.electricalkog.block.Cable50vIBlock;
import net.mcreator.electricalkog.block.Cable50vFBlock;
import net.mcreator.electricalkog.block.Cable50vEBlock;
import net.mcreator.electricalkog.block.Cable50vBlock;
import net.mcreator.electricalkog.block.Cable50v2Block;
import net.mcreator.electricalkog.ElectricalkogMod;

public class ElectricalkogModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ElectricalkogMod.MODID);
	public static final RegistryObject<Block> INFINITY_ENERGY = REGISTRY.register("infinity_energy", () -> new InfinityEnergyBlock());
	public static final RegistryObject<Block> FURNICE_GEN = REGISTRY.register("furnice_gen", () -> new FurniceGenBlock());
	public static final RegistryObject<Block> SMALL_CABLE_NULL = REGISTRY.register("small_cable_null", () -> new Cable50v2Block());
	public static final RegistryObject<Block> CABLE_50V = REGISTRY.register("cable_50v", () -> new Cable50vBlock());
	public static final RegistryObject<Block> DIODE_CABLE_50V = REGISTRY.register("diode_cable_50v", () -> new DiodeCable50vBlock());
	public static final RegistryObject<Block> LAMP_50V = REGISTRY.register("lamp_50v", () -> new Lamp50vBlock());
	public static final RegistryObject<Block> DEAD_LAMP_50_KL = REGISTRY.register("dead_lamp_50_kl", () -> new DeadLamp50KLBlock());
	public static final RegistryObject<Block> CABLE_50V_E = REGISTRY.register("cable_50v_e", () -> new Cable50vEBlock());
	public static final RegistryObject<Block> CABLE_50V_I = REGISTRY.register("cable_50v_i", () -> new Cable50vIBlock());
	public static final RegistryObject<Block> CABLE_50V_L = REGISTRY.register("cable_50v_l", () -> new Cable50vLBlock());
	public static final RegistryObject<Block> CABLE_50V_LC = REGISTRY.register("cable_50v_lc", () -> new Cable50vLCBlock());
	public static final RegistryObject<Block> CABLE_50V_LCC = REGISTRY.register("cable_50v_lcc", () -> new Cable50vLCCBlock());
	public static final RegistryObject<Block> CABLE_50V_LT = REGISTRY.register("cable_50v_lt", () -> new Cable50vLTBlock());
	public static final RegistryObject<Block> CABLE_50V_LTC = REGISTRY.register("cable_50v_ltc", () -> new Cable50vLTCBlock());
	public static final RegistryObject<Block> CABLE_50V_F = REGISTRY.register("cable_50v_f", () -> new Cable50vFBlock());
	public static final RegistryObject<Block> LAMPON_50V = REGISTRY.register("lampon_50v", () -> new Lampon50vBlock());
	public static final RegistryObject<Block> CABLE_50V_S = REGISTRY.register("cable_50v_s", () -> new Cable50vSBlock());
	public static final RegistryObject<Block> CABLE_50V_T = REGISTRY.register("cable_50v_t", () -> new Cable50vTBlock());
	public static final RegistryObject<Block> CABLE_50V_TC = REGISTRY.register("cable_50v_tc", () -> new Cable50vTCBlock());
	public static final RegistryObject<Block> CABLE_50V_TX = REGISTRY.register("cable_50v_tx", () -> new Cable50vTXBlock());
	public static final RegistryObject<Block> CABLE_50V_TXC = REGISTRY.register("cable_50v_txc", () -> new Cable50vTXCBlock());
	public static final RegistryObject<Block> CABLE_50V_TXCC = REGISTRY.register("cable_50v_txcc", () -> new Cable50vTXCCBlock());
	public static final RegistryObject<Block> CABLE_50V_X = REGISTRY.register("cable_50v_x", () -> new Cable50vXBlock());
	public static final RegistryObject<Block> CABLE_50V_XC = REGISTRY.register("cable_50v_xc", () -> new Cable50vXCBlock());
	public static final RegistryObject<Block> SWITCH_OFF = REGISTRY.register("switch_off", () -> new SwitchOffBlock());
	public static final RegistryObject<Block> SWITCH_ON = REGISTRY.register("switch_on", () -> new SwitchOnBlock());
	public static final RegistryObject<Block> RELAYS_OFF = REGISTRY.register("relays_off", () -> new RelaysOffBlock());
	public static final RegistryObject<Block> RELAYS_ON = REGISTRY.register("relays_on", () -> new RelaysOnBlock());
	public static final RegistryObject<Block> INCUBATOR_EGG_50_KL = REGISTRY.register("incubator_egg_50_kl", () -> new IncubatorEgg50KLBlock());
	public static final RegistryObject<Block> ELECTRICAL_FURNICE = REGISTRY.register("electrical_furnice", () -> new ElectricalFurniceBlock());
}
