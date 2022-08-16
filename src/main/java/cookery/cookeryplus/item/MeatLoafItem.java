
package cookery.cookeryplus.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import cookery.cookeryplus.init.CookeryModTabs;

public class MeatLoafItem extends Item {
	public MeatLoafItem() {
		super(new Item.Properties().tab(CookeryModTabs.TAB_FOOD_COOKERY).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(20).saturationMod(21.5f)

						.meat().build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
