package io.github.heartbeatmc.heartbeat.custom.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class CustomArmorMaterials implements ArmorMaterial {
    private final String name;
    private final int[] damageReduction;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final Ingredient ingredient = null;

    public CustomArmorMaterials(String name, int[] damageReduction, int enchantmentValue, SoundEvent sound, float toughness) {
        this.name = name;
        this.damageReduction = damageReduction;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
    }


    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return damageReduction[slot.getIndex()];
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.EMPTY;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
