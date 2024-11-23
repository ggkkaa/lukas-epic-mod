package net.luka.lukamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.luka.lukamod.LukasEpicMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BANANA = registerItem("banana",
            new Item(new Item.Settings()));
    public static final Item BANANA_CHOCOLATE = registerItem("banana_chocolate",
            new Item(new Item.Settings()));
    public static final Item COMMUNISM = registerItem("communist",
            new Item(new Item.Settings()));
    public static final Item CORITE = registerItem("corite",
            new Item(new Item.Settings()));
    public static final Item RAW_CORITE = registerItem("raw_corite",
            new Item(new Item.Settings()));
    public static final Item CORITE_CHAINSAW = registerItem("corite_chainsaw",
            new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LukasEpicMod.MOD_ID, name), item);
    }

    private static void customIngredientsTools(FabricItemGroupEntries entries) {
        entries.add(COMMUNISM);
    }

    public static void registerModItems() {
        LukasEpicMod.LOGGER.info("Registering Mod Items for " +  LukasEpicMod.MOD_ID);

        LukasEpicMod.LOGGER.info("Loading tools");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::customIngredientsTools);
    }
}
