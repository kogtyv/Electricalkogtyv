
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.electricalkog.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.electricalkog.item.SmallCoperTenItem;
import net.mcreator.electricalkog.item.MultimetrItem;
import net.mcreator.electricalkog.item.MediumCoperTenItem;
import net.mcreator.electricalkog.item.Lamp5KLItem;
import net.mcreator.electricalkog.item.CoalspiraleItem;
import net.mcreator.electricalkog.ElectricalkogMod;

public class ElectricalkogModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ElectricalkogMod.MODID);
	public static final RegistryObject<Item> INFINITY_ENERGY = block(ElectricalkogModBlocks.INFINITY_ENERGY, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> FURNICE_GEN = block(ElectricalkogModBlocks.FURNICE_GEN, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> SMALL_CABLE_NULL = block(ElectricalkogModBlocks.SMALL_CABLE_NULL, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> CABLE_50V = block(ElectricalkogModBlocks.CABLE_50V, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> DIODE_CABLE_50V = block(ElectricalkogModBlocks.DIODE_CABLE_50V, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> MULTIMETR = REGISTRY.register("multimetr", () -> new MultimetrItem());
	public static final RegistryObject<Item> LAMP_50V = block(ElectricalkogModBlocks.LAMP_50V, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> DEAD_LAMP_50_KL = block(ElectricalkogModBlocks.DEAD_LAMP_50_KL, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> CABLE_50V_E = block(ElectricalkogModBlocks.CABLE_50V_E, null);
	public static final RegistryObject<Item> CABLE_50V_I = block(ElectricalkogModBlocks.CABLE_50V_I, null);
	public static final RegistryObject<Item> CABLE_50V_L = block(ElectricalkogModBlocks.CABLE_50V_L, null);
	public static final RegistryObject<Item> CABLE_50V_LC = block(ElectricalkogModBlocks.CABLE_50V_LC, null);
	public static final RegistryObject<Item> CABLE_50V_LCC = block(ElectricalkogModBlocks.CABLE_50V_LCC, null);
	public static final RegistryObject<Item> CABLE_50V_LT = block(ElectricalkogModBlocks.CABLE_50V_LT, null);
	public static final RegistryObject<Item> CABLE_50V_LTC = block(ElectricalkogModBlocks.CABLE_50V_LTC, null);
	public static final RegistryObject<Item> CABLE_50V_F = block(ElectricalkogModBlocks.CABLE_50V_F, null);
	public static final RegistryObject<Item> LAMPON_50V = block(ElectricalkogModBlocks.LAMPON_50V, null);
	public static final RegistryObject<Item> CABLE_50V_S = block(ElectricalkogModBlocks.CABLE_50V_S, null);
	public static final RegistryObject<Item> CABLE_50V_T = block(ElectricalkogModBlocks.CABLE_50V_T, null);
	public static final RegistryObject<Item> CABLE_50V_TC = block(ElectricalkogModBlocks.CABLE_50V_TC, null);
	public static final RegistryObject<Item> CABLE_50V_TX = block(ElectricalkogModBlocks.CABLE_50V_TX, null);
	public static final RegistryObject<Item> CABLE_50V_TXC = block(ElectricalkogModBlocks.CABLE_50V_TXC, null);
	public static final RegistryObject<Item> CABLE_50V_TXCC = block(ElectricalkogModBlocks.CABLE_50V_TXCC, null);
	public static final RegistryObject<Item> CABLE_50V_X = block(ElectricalkogModBlocks.CABLE_50V_X, null);
	public static final RegistryObject<Item> CABLE_50V_XC = block(ElectricalkogModBlocks.CABLE_50V_XC, null);
	public static final RegistryObject<Item> SWITCH_OFF = block(ElectricalkogModBlocks.SWITCH_OFF, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> SWITCH_ON = block(ElectricalkogModBlocks.SWITCH_ON, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> RELAYS_OFF = block(ElectricalkogModBlocks.RELAYS_OFF, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> RELAYS_ON = block(ElectricalkogModBlocks.RELAYS_ON, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> INCUBATOR_EGG_50_KL = block(ElectricalkogModBlocks.INCUBATOR_EGG_50_KL, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> ELECTRICAL_FURNICE = block(ElectricalkogModBlocks.ELECTRICAL_FURNICE, ElectricalkogModTabs.TAB_ELECTRICALKOGTYV);
	public static final RegistryObject<Item> SMALL_COPER_TEN = REGISTRY.register("small_coper_ten", () -> new SmallCoperTenItem());
	public static final RegistryObject<Item> MEDIUM_COPER_TEN = REGISTRY.register("medium_coper_ten", () -> new MediumCoperTenItem());
	public static final RegistryObject<Item> LAMP_5_KL = REGISTRY.register("lamp_5_kl", () -> new Lamp5KLItem());
	public static final RegistryObject<Item> COALSPIRALE = REGISTRY.register("coalspirale", () -> new CoalspiraleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
