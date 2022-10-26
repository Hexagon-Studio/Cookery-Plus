
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package cookery.cookeryplus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import cookery.cookeryplus.client.gui.CuttingBoardGUIScreen;
import cookery.cookeryplus.client.gui.CraftOnWaterCastIronScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CookeryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CookeryModMenus.CUTTING_BOARD_GUI.get(), CuttingBoardGUIScreen::new);
			MenuScreens.register(CookeryModMenus.CRAFT_ON_WATER_CAST_IRON.get(), CraftOnWaterCastIronScreen::new);
		});
	}
}
