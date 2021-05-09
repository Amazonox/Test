package de.amazonox.tt.setup;

import de.amazonox.tt.TestMod;
import de.amazonox.tt.block.metalpress.MetalPressBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> TBLOCK1 = register("tblock1", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3, 3)
                    .sound(SoundType.ANCIENT_DEBRIS)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TBLOCK2 = register("tblock2", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .strength(2, 1)
                    .sound(SoundType.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(3)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TBLOCK3 = register("tblock3", () ->
            new Block(AbstractBlock.Properties.of(Material.WOOD)
                    .strength(1, 1)
                    .sound(SoundType.WOOD)
                    .harvestTool(ToolType.AXE)));
    public static final RegistryObject<MetalPressBlock> METAL_PRESS = register("metal_press", ()->
            new MetalPressBlock(AbstractBlock.Properties.of(Material.METAL)
            .strength(4,20)
            .sound(SoundType.METAL)));


    static void register() {
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(TestMod.TAB_TEST)));
        return ret;
    }
}
