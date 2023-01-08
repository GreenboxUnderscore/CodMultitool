package net.codmultitool;

import net.codmultitool.items.tools.CodTool;
import net.codmultitool.items.tools.CodToolMaterials;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodMultitool implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("MODID");
	public static final String MODID = "codmultitool";

	public static final ItemGroup CODMULTITOOLGROUP =
			FabricItemGroup.builder(new Identifier(MODID, "codmultitool"))
					.icon(() -> new ItemStack(CodMultitool.COD_TOOL))
					.build();

	public static final Item COD_TOOL = new CodTool(CodToolMaterials.COD, 1, -3f, new Item.Settings());
	public static final Item COD_TOOL_2 = new CodTool(CodToolMaterials.COD, 1, -3f, new Item.Settings());
	@Override
	public void onInitialize() {

		LOGGER.info("Cod Multitool is now swimming up stream.");

		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_TOOL));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_TOOL_2));

		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_multitool"), COD_TOOL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_multitool_2"), COD_TOOL_2);
	}
}