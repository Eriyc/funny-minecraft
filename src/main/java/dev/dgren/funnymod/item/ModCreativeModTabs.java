package dev.dgren.funnymod.item;

import dev.dgren.funnymod.FunnyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FunnyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FUNNYMOD_TAB = CREATIVE_MODE_TABS.register("funnymod_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.MONEY.get()))
            .title(Component.translatable("creativetab.funnymod_tab"))
            .displayItems(((pParameters, pOutput) -> {
                pOutput.accept(ModItems.MONEY.get());
                pOutput.accept(ModItems.SWMG_ROBE.get());
            }))
            .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
