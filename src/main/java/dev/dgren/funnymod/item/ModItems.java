package dev.dgren.funnymod.item;

import dev.dgren.funnymod.FunnyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FunnyMod.MOD_ID);

    public static RegistryObject<Item> SWMG_ROBE = ITEMS.register("swmg_robe",
            () -> new Item(new Item.Properties()));

    public static RegistryObject<Item> MONEY = ITEMS.register("money",
            () -> new Item(new Item.Properties()));


}
