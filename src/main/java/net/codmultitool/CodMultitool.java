package net.codmultitool;

import net.codmultitool.items.tools.CodTool;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodMultitool implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("MODID");
	public static final String MODID = "codmultitool";

	@Override
	public void onInitialize() {

		LOGGER.info("Cod Multitool is now swimming up stream.");

		Registry.register(Registry.ITEM, new Identifier(MODID, "cod_multitool"), new CodTool(ToolMaterials.IRON));
		Registry.register(Registry.ITEM, new Identifier(MODID, "cod_multitool_2"), new CodTool(ToolMaterials.IRON));
	}
}
