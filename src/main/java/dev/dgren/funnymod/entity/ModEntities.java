package dev.dgren.funnymod.entity;

import dev.dgren.funnymod.FunnyMod;
import dev.dgren.funnymod.entity.custom.ShadowWizardEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister
            .create(ForgeRegistries.ENTITY_TYPES, FunnyMod.MOD_ID);

    public static final RegistryObject<EntityType<ShadowWizardEntity>> SHADOW_WIZARD =
            ENTITY_TYPES.register("shadow_wizard", () -> EntityType.Builder.of(ShadowWizardEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build("shadow_wizard"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
