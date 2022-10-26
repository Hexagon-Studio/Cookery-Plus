
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cookery.cookeryplus.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CookeryModTabs {
	public static CreativeModeTab TAB_KITCHEN;
	public static CreativeModeTab TAB_FOOD_COOKERY;

	public static void load() {
		TAB_KITCHEN = new CreativeModeTab("tabkitchen") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CookeryModBlocks.CUTTING_BOARD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FOOD_COOKERY = new CreativeModeTab("tabfood_cookery") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CookeryModItems.MEAT_LOAF.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
