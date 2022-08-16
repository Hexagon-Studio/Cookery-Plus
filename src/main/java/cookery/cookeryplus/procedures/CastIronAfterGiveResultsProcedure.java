package cookery.cookeryplus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import cookery.cookeryplus.init.CookeryModBlocks;

public class CastIronAfterGiveResultsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), CookeryModBlocks.EMPTY_CAST_IRON.get().defaultBlockState(), 3);
	}
}
