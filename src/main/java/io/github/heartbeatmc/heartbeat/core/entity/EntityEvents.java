package io.github.heartbeatmc.heartbeat.core.entity;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public class EntityEvents extends EntityEvent
{
    private final LivingEntity entityLiving;
    public EntityEvents(LivingEntity entity)
    {
        entityLiving = entity;
    }

    public LivingEntity getEntityLiving()
    {
        return entityLiving;
    }

    public static class EntityUpdateEvent extends EntityEvents
    {
        public EntityUpdateEvent(LivingEntity e){ super(e); }
    }


    public static class EntityJumpEvent extends EntityEvents
    {
        public EntityJumpEvent(LivingEntity e){ super(e); }
    }

    public static class EntityVisibilityEvent extends EntityEvents
    {
        private double visibilityModifier;
        @Nullable
        private final Entity lookingEntity;

        public EntityVisibilityEvent(LivingEntity livingEntity, @Nullable Entity lookingEntity, double originalMultiplier)
        {
            super(livingEntity);
            this.visibilityModifier = originalMultiplier;
            this.lookingEntity = lookingEntity;
        }

        public void modifyVisibility(double mod)
        {
            visibilityModifier *= mod;
        }

        public double getVisibilityModifier()
        {
            return visibilityModifier;
        }

        @Nullable
        public Entity getLookingEntity()
        {
            return lookingEntity;
        }
    }
}