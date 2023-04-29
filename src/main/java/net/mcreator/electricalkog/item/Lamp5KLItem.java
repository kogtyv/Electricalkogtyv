
package net.mcreator.electricalkog.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.electricalkog.init.ElectricalkogModTabs;

public class Lamp5KLItem extends Item {
	public Lamp5KLItem() {
		super(new Item.Properties().tab(ElectricalkogModTabs.TAB_ELECTRICALKOGTYV).stacksTo(64).rarity(Rarity.COMMON));
	}
}
