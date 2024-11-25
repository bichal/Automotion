package net.bichal.automotion.item;

import net.bichal.automotion.Automotion;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_MOLYBDENUM = registerItem("raw_molybdenum", new Item(new FabricItemSettings()));
    public static final Item MOLYBDENUM_INGOT = registerItem("molybdenum_ingot", new Item(new FabricItemSettings()));
    public static final Item MOLYBDENUM_NUGGET = registerItem("molybdenum_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_THORIUM = registerItem("raw_thorium", new Item(new FabricItemSettings()));
    public static final Item THORIUM_INGOT = registerItem("thorium_ingot", new Item(new FabricItemSettings()));
    public static final Item THORIUM_NUGGET = registerItem("thorium_nugget", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Automotion.MOD_ID, name), item);
    }

    public static void registerModItems() {
    }
}
