package net.codmultitool;

import net.codmultitool.items.tools.CodTool;
import net.codmultitool.items.tools.CodToolMaterials;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodMultitool implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("MODID");
	public static final String MODID = "codmultitool";

	public static final Item COD_TOOL = new CodTool(CodToolMaterials.COD, 1, -3f, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item COD_TOOL_2 = new CodTool(CodToolMaterials.COD, 1, -3f, new Item.Settings().group(ItemGroup.TOOLS));
	@Override
	public void onInitialize() {

		LOGGER.info("Cod Multitool is now swimming up stream.");

		Registry.register(Registry.ITEM, new Identifier(MODID, "cod_multitool"), COD_TOOL);
		Registry.register(Registry.ITEM, new Identifier(MODID, "cod_multitool_2"), COD_TOOL_2);
	}
}