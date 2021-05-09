package de.amazonox.tt.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import de.amazonox.tt.setup.ModBlocks;
import de.amazonox.tt.setup.ModItems;
import de.amazonox.tt.setup.Registration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.item.Items;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator p_i50789_1_) {
        super(p_i50789_1_);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK)
        );
    }
    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validate(validationtracker, p_218436_2_, p_218436_3_));
    }

    public static class ModBlockLootTables extends BlockLootTables{
        @Override
        protected void addTables() {

                dropSelf(ModBlocks.TBLOCK1.get());
                dropSelf(ModBlocks.TBLOCK3.get());
                //dropOther(ModBlocks.TBLOCK2.get(), ModItems.TITEM1.get());
                this.add(ModBlocks.TBLOCK2.get(), (p_218568_0_) -> {
                    return createOreDrop(p_218568_0_, ModItems.TITEM1.get());
                });
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }
}
