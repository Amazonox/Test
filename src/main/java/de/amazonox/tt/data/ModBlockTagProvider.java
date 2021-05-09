package de.amazonox.tt.data;


import de.amazonox.tt.TestMod;
import de.amazonox.tt.setup.ModBlocks;
import de.amazonox.tt.setup.ModItems;
import de.amazonox.tt.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static de.amazonox.tt.setup.ModTags.*;

public class ModBlockTagProvider extends BlockTagsProvider {


    public ModBlockTagProvider(DataGenerator p_i48256_1_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_i48256_1_, TestMod.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags() {
        tag(ModTags.Blocks.ORES_TEST).add(ModBlocks.TBLOCK2.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_TEST);
        tag(ModTags.Blocks.STORAGE_BLOCKS_TEST).add(ModBlocks.TBLOCK3.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(Blocks.STORAGE_BLOCKS_TEST);
    }
}
