package io.github.heartbeatmc.heartbeat.core.entity.player;

import io.github.heartbeatmc.heartbeat.core.entity.EntityEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;

public class PlayerEvent extends EntityEvents {
    private final Player entityPlayer;

    public PlayerEvent(Player player) {
        super(player);
        entityPlayer = player;
    }

    public Player getPlayer() {
        return entityPlayer;
    }

    public static class BreakSpeed extends PlayerEvent {
        private final BlockState state;
        private final float originalSpeed;
        private float newSpeed = 0.0f;
        private final BlockPos pos; // Y position of -1 notes unknown location

        public BreakSpeed(Player player, BlockState state, float original, BlockPos pos) {
            super(player);
            this.state = state;
            this.originalSpeed = original;
            this.setNewSpeed(original);
            this.pos = pos != null ? pos : new BlockPos(0, -1, 0);
        }

        public BlockState getState() {
            return state;
        }

        public float getOriginalSpeed() {
            return originalSpeed;
        }

        public float getNewSpeed() {
            return newSpeed;
        }

        public void setNewSpeed(float newSpeed) {
            this.newSpeed = newSpeed;
        }

        public BlockPos getPos() {
            return pos;
        }
    }
}