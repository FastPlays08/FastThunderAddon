package com.fastaddon.modules;

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
        if (this.mc.player.getInventory().getArmorStack(2).getItem() == Items.ELYTRA && this.mc.player.isFallFlying()) {
            return;
        }
        this.mc.player.setPose(EntityPose.STANDING);
    }

}