package io.github.heartbeatmc.heartbeat.core.entity.player;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;

public class BowStopEvent extends PlayerEvent
{
    private final ItemStack bow;
    private final Level world;
    private final boolean hasAmmo;
    private int charge;

    public BowStopEvent(Player player, @NotNull ItemStack bow, Level world, int charge, boolean hasAmmo)
    {
        super(player);
        this.bow = bow;
        this.world = world;
        this.charge = charge;
        this.hasAmmo = hasAmmo;
    }

    @NotNull
    public ItemStack getBow() { return this.bow; }
    public Level getWorld() { return this.world; }
    public boolean hasAmmo() { return this.hasAmmo; }
    public int getCharge() { return this.charge; }
    public void setCharge(int charge) { this.charge = charge; }
}
