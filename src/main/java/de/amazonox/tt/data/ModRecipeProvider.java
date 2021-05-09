package de.amazonox.tt.data;

import de.amazonox.tt.TestMod;
import de.amazonox.tt.setup.ModBlocks;
import de.amazonox.tt.setup.ModItems;
import de.amazonox.tt.setup.ModTags;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator p_i48262_1_) {super(p_i48262_1_); }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.TITEM1.get(),9)
                .requires(ModBlocks.TBLOCK1.get())
                .unlockedBy("has_item",has(ModItems.TITEM1.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModBlocks.TBLOCK1.get())
                .define('#', ModTags.Items.INGOTS_TEST)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item",has(ModItems.TITEM1.get()))
                .save(consumer);

        CookingRecipeBuilder.smelting(Ingredient.of(ModTags.Items.ORES_TEST), ModItems.TITEM1.get(), 0.7f,200)
        .unlockedBy("has_item", has(ModTags.Items.ORES_TEST))
        .save(consumer, modId("test_ingot_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModTags.Items.ORES_TEST), ModItems.TITEM1.get(), 0.7f,100)
                .unlockedBy("has_item", has(ModTags.Items.ORES_TEST))
                .save(consumer, modId("test_ingot_blasting"));
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(TestMod.MOD_ID,path);
    }
}

