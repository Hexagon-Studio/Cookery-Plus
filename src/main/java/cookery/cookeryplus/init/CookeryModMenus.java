
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cookery.cookeryplus.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import cookery.cookeryplus.world.inventory.CuttingBoardGUIMenu;
import cookery.cookeryplus.world.inventory.CraftOnWaterCastIronMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CookeryModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CuttingBoardGUIMenu> CUTTING_BOARD_GUI = register("cutting_board_gui",
			(id, inv, extraData) -> new CuttingBoardGUIMenu(id, inv, extraData));
	public static final MenuType<CraftOnWaterCastIronMenu> CRAFT_ON_WATER_CAST_IRON = register("craft_on_water_cast_iron",
			(id, inv, extraData) -> new CraftOnWaterCastIronMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
