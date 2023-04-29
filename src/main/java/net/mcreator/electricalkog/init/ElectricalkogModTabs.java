
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.electricalkog.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ElectricalkogModTabs {
	public static CreativeModeTab TAB_ELECTRICALKOGTYV;

	public static void load() {
		TAB_ELECTRICALKOGTYV = new CreativeModeTab("tabelectricalkogtyv") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElectricalkogModItems.MULTIMETR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
