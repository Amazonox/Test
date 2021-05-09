package de.amazonox.tt.setup;

import de.amazonox.tt.TestMod;
import de.amazonox.tt.crafting.recipe.PressingRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModRecipes {
    public static class Types{
        public static final IRecipeType<PressingRecipe> PRESSING = IRecipeType.register(TestMod.MOD_ID+"pressing");
    }

    public static class Serializers{
        public static final RegistryObject<IRecipeSerializer<?>> PRESSING = Registration.RECIPE_SERIALIZER.register(
                "pressing", PressingRecipe.Serializer::new);

        /*private static <T extends IRecipe<?>>RegistryObject<IRecipeSerializer<T>> register(String name, Supplier<IRecipeSerializer<T>> serializer){
            return Registration.RECIPE_SERIALIZER.register(name, serializer);
        }*/
    }

    static void register() {}
}
