package io.github.heartbeatmc.heartbeat.core.entity.player;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;


public class BowStartEvent extends PlayerEvent
{
    private final ItemStack bow;
    private final InteractionHand hand;
    private final Level world;
    private final boolean hasAmmo;
    private InteractionResultHolder<ItemStack> action;

    public BowStartEvent(Player player, @NotNull ItemStack item, InteractionHand hand, Level world, boolean hasAmmo)
    {
        super(player);
        this.bow = item;
        this.hand = hand;
        this.world = world;
        this.hasAmmo = hasAmmo;
    }

    @NotNull
    public ItemStack getBow() { return this.bow; }
    public Level getWorld() { return this.world; }
    public InteractionHand getHand() { return this.hand; }
    public boolean hasAmmo() { return this.hasAmmo; }
    public InteractionResultHolder<ItemStack> getAction()
    {
        return this.action;
    }

    public void setAction(InteractionResultHolder<ItemStack> action)
    {
        this.action = action;
    }
}
