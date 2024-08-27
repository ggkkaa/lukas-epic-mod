package net.luka.lukamod.block;

import net.luka.lukamod.LukasEpicMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final Block CORITE_BLOCK = registerBlock("block_of_corite",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(4f).requiresTool().luminance(state -> 5)));

    public static final Block CORITE_ORE = registerBlock("corite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)
                    .strength(4f).requiresTool()));

    public static final Block DEEPSLATE_CORITE_ORE = registerBlock("deepslate_corite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)
                            .strength(6f).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LukasEpicMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LukasEpicMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        LukasEpicMod.LOGGER.info("Registering Blocks for " + LukasEpicMod.MOD_ID);
    }
}
