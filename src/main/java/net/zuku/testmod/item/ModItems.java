package net.zuku.testmod.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zuku.testmod.TestMod;

public class ModItems {


    public static Item registerItem(String name, Item item){
        return Registry(Registry.ITEM); new Identifier(TestMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TestMod.LOGGER.debug("Registering mod item for" + TestMod.MOD_ID);


    }

}
