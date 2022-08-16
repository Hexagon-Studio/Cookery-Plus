
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cookery.cookeryplus.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FOOD_COOKERY = new CreativeModeTab("tabfood_cookery") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CookeryModItems.MEAT_LOAF.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
