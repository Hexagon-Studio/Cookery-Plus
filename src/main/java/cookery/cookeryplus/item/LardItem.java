
package cookery.cookeryplus.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import cookery.cookeryplus.init.CookeryModTabs;

public class LardItem extends Item {
	public LardItem() {
		super(new Item.Properties().tab(CookeryModTabs.TAB_FOOD_COOKERY).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(3f)

						.meat().build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
