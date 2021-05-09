package de.amazonox.tt.data;

import de.amazonox.tt.TestMod;
import de.amazonox.tt.setup.ModItems;
import de.amazonox.tt.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(DataGenerator p_i232552_1_, BlockTagsProvider p_i232552_2_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_i232552_1_, p_i232552_2_, TestMod.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(){
        copy(ModTags.Blocks.ORES_TEST, ModTags.Items.ORES_TEST);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_TEST, ModTags.Items.STORAGE_BLOCKS_TEST);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.INGOTS_TEST).add(ModItems.TITEM1.get());
        tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_TEST);
    }
}
