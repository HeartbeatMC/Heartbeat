package io.github.heartbeatmc.heartbeat.custom.tools;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class CustomToolMaterials implements Tier {
    private final String name;
    private final int harvestLevel;
    private final int durability;
    private final float damage;
    private final float speed;
    private final int enchantmentValue;
    private final Ingredient ingredient = null;

    public CustomToolMaterials(String name, int harvestLevel, int durability, float damage, float speed, int enchantmentValue) {
        this.name = name;
        this.harvestLevel = harvestLevel;
        this.durability = durability;
        this.damage = damage;
        this.speed = speed;
        this.enchantmentValue = enchantmentValue;
    }


    @Override
    public int getUses() {
        return durability;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ingredient == null ? Ingredient.EMPTY : ingredient;
    }
}
