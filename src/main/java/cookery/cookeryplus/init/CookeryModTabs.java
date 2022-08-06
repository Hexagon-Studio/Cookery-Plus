
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
	}
}
