
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.electricalkog.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.electricalkog.world.inventory.Incubator50KLGUIMenu;
import net.mcreator.electricalkog.world.inventory.FurniceGeneratorMenu;
import net.mcreator.electricalkog.world.inventory.ElectricalFurniceguiMenu;
import net.mcreator.electricalkog.ElectricalkogMod;

public class ElectricalkogModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ElectricalkogMod.MODID);
	public static final RegistryObject<MenuType<FurniceGeneratorMenu>> FURNICE_GENERATOR = REGISTRY.register("furnice_generator", () -> IForgeMenuType.create(FurniceGeneratorMenu::new));
	public static final RegistryObject<MenuType<Incubator50KLGUIMenu>> INCUBATOR_50_KLGUI = REGISTRY.register("incubator_50_klgui", () -> IForgeMenuType.create(Incubator50KLGUIMenu::new));
	public static final RegistryObject<MenuType<ElectricalFurniceguiMenu>> ELECTRICAL_FURNICEGUI = REGISTRY.register("electrical_furnicegui", () -> IForgeMenuType.create(ElectricalFurniceguiMenu::new));
}
