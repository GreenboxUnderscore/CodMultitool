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
					.icon(() -> new ItemStack(CodMultitool.COD_IRON_TOOL))
					.build();

	public static final Item COD_IRON_TOOL = new CodTool(CodToolMaterials.COD_IRON, 1, -2.5f, new Item.Settings());
	public static final Item COD_IRON_TOOL_2 = new CodTool(CodToolMaterials.COD_IRON, 1, -2.5f, new Item.Settings());
	public static final Item COD_GOLD_TOOL = new CodTool(CodToolMaterials.COD_GOLD, 1, -2.5f, new Item.Settings());
	public static final Item COD_GOLD_TOOL_2 = new CodTool(CodToolMaterials.COD_GOLD, 1, -2.5f, new Item.Settings());
	public static final Item COD_DIAMOND_TOOL = new CodTool(CodToolMaterials.COD_DIAMOND, 1, -2.5f, new Item.Settings());
	public static final Item COD_DIAMOND_TOOL_2 = new CodTool(CodToolMaterials.COD_DIAMOND, 1, -2.5f, new Item.Settings());
	public static final Item COD_NETHERITE_TOOL = new CodTool(CodToolMaterials.COD_NETHERITE, 1, -2.5f, new Item.Settings());
	public static final Item COD_NETHERITE_TOOL_2 = new CodTool(CodToolMaterials.COD_NETHERITE, 1, -2.5f, new Item.Settings());
	public static final Item COD_GOLD_ITEM = new Item(new Item.Settings());
	public static final Item COD_DIAMOND_ITEM = new Item(new Item.Settings());
	@Override
	public void onInitialize() {

		LOGGER.info("Cod Multitool is now swimming up stream.");

		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_IRON_TOOL));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_IRON_TOOL_2));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_GOLD_TOOL));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_GOLD_TOOL_2));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_DIAMOND_TOOL));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_DIAMOND_TOOL_2));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_NETHERITE_TOOL));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_NETHERITE_TOOL_2));

		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_GOLD_ITEM));
		ItemGroupEvents.modifyEntriesEvent(CODMULTITOOLGROUP).register(entries -> entries.add(COD_DIAMOND_ITEM));

		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_multitool"), COD_IRON_TOOL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_multitool_2"), COD_IRON_TOOL_2);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_gold_tool"), COD_GOLD_TOOL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_gold_tool_2"), COD_GOLD_TOOL_2);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_diamond_tool"), COD_DIAMOND_TOOL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_diamond_tool_2"), COD_DIAMOND_TOOL_2);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_netherite_tool"), COD_NETHERITE_TOOL	);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_netherite_tool_2"), COD_NETHERITE_TOOL_2);

		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_gold_item"), COD_GOLD_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MODID, "cod_diamond_item"), COD_DIAMOND_ITEM);

	}
}