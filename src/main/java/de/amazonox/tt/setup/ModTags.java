package de.amazonox.tt.setup;

import de.amazonox.tt.TestMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks{
        public static final ITag.INamedTag<Block> ORES_TEST = forge("ores/test");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_TEST = forge("storage_blocks/test");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(TestMod.MOD_ID, path).toString());
        }
    }
    public static final class Items{
        public static final ITag.INamedTag<Item> ORES_TEST = forge("ores/test");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_TEST = forge("storage_blocks/test");

        public static final ITag.INamedTag<Item> INGOTS_TEST = forge("ingots/test");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(TestMod.MOD_ID, path).toString());
        }
    }
}
