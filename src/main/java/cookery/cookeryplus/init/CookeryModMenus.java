
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package cookery.cookeryplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import cookery.cookeryplus.world.inventory.CuttingBoardGUIMenu;
import cookery.cookeryplus.world.inventory.CraftOnWaterCastIronMenu;
import cookery.cookeryplus.CookeryMod;

public class CookeryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CookeryMod.MODID);
	public static final RegistryObject<MenuType<CuttingBoardGUIMenu>> CUTTING_BOARD_GUI = REGISTRY.register("cutting_board_gui",
			() -> IForgeMenuType.create(CuttingBoardGUIMenu::new));
	public static final RegistryObject<MenuType<CraftOnWaterCastIronMenu>> CRAFT_ON_WATER_CAST_IRON = REGISTRY.register("craft_on_water_cast_iron",
			() -> IForgeMenuType.create(CraftOnWaterCastIronMenu::new));
}
