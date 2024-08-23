package net.luka.lukamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.luka.lukamod.LukasEpicMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BANANAS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LukasEpicMod.MOD_ID, "itemgroup.lukamodgroup"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lukamodgroup"))
                    .icon(() -> new ItemStack(ModItems.CORITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BANANA);
                        entries.add(ModItems.BANANA_CHOCOLATE);
                        entries.add(ModItems.CORITE);
                        entries.add(ModItems.RAW_CORITE);
                    }).build());

    public static void registerItemGroups() {
        LukasEpicMod.LOGGER.info("Registering Item Groups for " + LukasEpicMod.MOD_ID);

    }
}
