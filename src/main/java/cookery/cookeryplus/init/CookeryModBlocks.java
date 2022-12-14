
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cookery.cookeryplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import cookery.cookeryplus.block.WaterCastIronBlock;
import cookery.cookeryplus.block.EmptyCastIronBlock;
import cookery.cookeryplus.block.CuttingBoardBlock;
import cookery.cookeryplus.CookeryMod;

public class CookeryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CookeryMod.MODID);
	public static final RegistryObject<Block> CUTTING_BOARD = REGISTRY.register("cutting_board", () -> new CuttingBoardBlock());
	public static final RegistryObject<Block> EMPTY_CAST_IRON = REGISTRY.register("empty_cast_iron", () -> new EmptyCastIronBlock());
	public static final RegistryObject<Block> WATER_CAST_IRON = REGISTRY.register("water_cast_iron", () -> new WaterCastIronBlock());
}
