package de.amazonox.tt.data.client;

import de.amazonox.tt.TestMod;
import de.amazonox.tt.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TestMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.TBLOCK1.get());
        simpleBlock(ModBlocks.TBLOCK2.get());
        simpleBlock(ModBlocks.TBLOCK3.get());

    }
}
