package dev.dgren.funnymod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod.EventBusSubscriber
public class ModCustomEvents {
    private final Logger LOGGER = LogUtils.getLogger();
    public static void init() {

    }


    @SubscribeEvent
    public void onSwimEvent(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        boolean isUnderWater = player.isUnderWater();
        if (isUnderWater) {
            LOGGER.info("Player is underwater");
            player.setSwimming(false);
        }


    }

}

