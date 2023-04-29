
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.electricalkog.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.electricalkog.client.gui.Incubator50KLGUIScreen;
import net.mcreator.electricalkog.client.gui.FurniceGeneratorScreen;
import net.mcreator.electricalkog.client.gui.ElectricalFurniceguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElectricalkogModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ElectricalkogModMenus.FURNICE_GENERATOR.get(), FurniceGeneratorScreen::new);
			MenuScreens.register(ElectricalkogModMenus.INCUBATOR_50_KLGUI.get(), Incubator50KLGUIScreen::new);
			MenuScreens.register(ElectricalkogModMenus.ELECTRICAL_FURNICEGUI.get(), ElectricalFurniceguiScreen::new);
		});
	}
}
