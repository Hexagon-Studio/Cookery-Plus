
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cookery.cookeryplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import cookery.cookeryplus.item.RawBarbecueItem;
import cookery.cookeryplus.item.LardItem;
import cookery.cookeryplus.item.BarbecueWithLardItem;
import cookery.cookeryplus.item.BarbecueItem;
import cookery.cookeryplus.CookeryMod;

public class CookeryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CookeryMod.MODID);
	public static final RegistryObject<Item> CUTTING_BOARD = block(CookeryModBlocks.CUTTING_BOARD, CookeryModTabs.TAB_KITCHEN);
	public static final RegistryObject<Item> EMPTY_CAST_IRON = block(CookeryModBlocks.EMPTY_CAST_IRON, CookeryModTabs.TAB_KITCHEN);
	public static final RegistryObject<Item> WATER_CAST_IRON = block(CookeryModBlocks.WATER_CAST_IRON, CookeryModTabs.TAB_KITCHEN);
	public static final RegistryObject<Item> RAW_BARBECUE = REGISTRY.register("raw_barbecue", () -> new RawBarbecueItem());
	public static final RegistryObject<Item> BARBECUE = REGISTRY.register("barbecue", () -> new BarbecueItem());
	public static final RegistryObject<Item> LARD = REGISTRY.register("lard", () -> new LardItem());
	public static final RegistryObject<Item> BARBECUE_WITH_LARD = REGISTRY.register("barbecue_with_lard", () -> new BarbecueWithLardItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
