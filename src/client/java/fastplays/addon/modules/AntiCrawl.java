package fastplays.addon.modules;

import meteordevelopment.orbit.EventHandler;
import net.minecraft.item.Items;
import thunder.hack.features.modules.Module;
import thunder.hack.events.impl.EventTick;
import net.minecraft.entity.EntityPose;

public class AntiCrawl extends Module  {
    public AntiCrawl() {
        super("Anticrawl", Category.getCategory("FastAddon"));
    }

    @EventHandler
    public void onTick(EventTick event) {
        assert mc.player != null;
        if (mc.player.getInventory().getArmorStack(2).getItem() == Items.ELYTRA && mc.player.isFallFlying() || mc.player.isInSneakingPose()) {
            return;
        }
        mc.player.setPose(EntityPose.STANDING);
    }

}