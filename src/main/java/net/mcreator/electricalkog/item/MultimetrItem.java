
package net.mcreator.electricalkog.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.electricalkog.procedures.MultimetrPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure;
import net.mcreator.electricalkog.init.ElectricalkogModTabs;

public class MultimetrItem extends Item {
	public MultimetrItem() {
		super(new Item.Properties().tab(ElectricalkogModTabs.TAB_ELECTRICALKOGTYV).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MultimetrPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
