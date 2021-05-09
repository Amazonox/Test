package de.amazonox.tt.setup;

import de.amazonox.tt.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static  final RegistryObject<Item> TITEM1 = Registration.ITEMS.register("titem1", ()->
            new Item(new Item.Properties().tab(TestMod.TAB_TEST)));

    static void register(){}
}
