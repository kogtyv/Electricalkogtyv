
package net.mcreator.electricalkog.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.electricalkog.init.ElectricalkogModTabs;

public class MediumCoperTenItem extends Item {
	public MediumCoperTenItem() {
		super(new Item.Properties().tab(ElectricalkogModTabs.TAB_ELECTRICALKOGTYV).stacksTo(64).rarity(Rarity.COMMON));
	}
}
