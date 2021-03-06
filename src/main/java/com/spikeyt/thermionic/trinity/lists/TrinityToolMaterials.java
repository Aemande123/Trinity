 package com.spikeyt.thermionic.trinity.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum TrinityToolMaterials implements IItemTier {
	spearwoodmat(2.8f, 1.0f, 69, 0, 42, TrinityItems.spear_head_wood),
	
	speargoldmat(2.8f, 1.0f, 42, 0, 42, TrinityItems.spear_head_gold),
	
	spearstonemat(3f, 1.0f, 141, 0, 42, TrinityItems.spear_head_stone),
	
	spearironmat(3.5f, 1.0f, 260, 0, 42, TrinityItems.spear_head_iron),
	
	speardiamondmat(4.5f, 1.0f, 1571, 0, 42, TrinityItems.spear_head_diamond),
	
	woodbattleaxemat(5.1f, 2.0f, 135, 0, 42, TrinityItems.spear_head_wood),
	
	goldbattleaxemat(5.1f, 10.0f, 48, 0, 42, TrinityItems.spear_head_gold),
	
	stonebattleaxemat(6.5f, 4.0f, 147, 0, 42, TrinityItems.spear_head_stone),
	
	ironbattleaxemat(7.8f, 6.0f, 266, 0, 42, TrinityItems.spear_head_iron),
		
	diamondbattleaxemat(8.8f, 8.0f, 1577, 0, 42, TrinityItems.spear_head_diamond),
	
	woodwarhammermat(4.8f, 1.0f, 72, 0, 42, TrinityItems.war_hammer_head_wood),
	
	goldwarhammermat(4.8f, 1.0f, 45, 0, 42, TrinityItems.war_hammer_head_gold),
	
	stonewarhammermat(5.4f, 1.0f, 144, 0, 42, TrinityItems.war_hammer_head_stone),
	
	ironwarhammermat(6.7f, 1.0f, 263, 0, 42, TrinityItems.war_hammer_head_iron),
	
	diamondwarhammermat(7f, 1.0f, 1574, 0, 42, TrinityItems.war_hammer_head_diamond),
	
	woodkatanamat(5f, 1.0f, 75, 0, 42, TrinityItems.katana_wood),
	
	goldkatanamat(5f, 1.0f, 48, 0, 42, TrinityItems.katana_gold),
	
	stonekatanamat(6.2f, 1.0f, 147, 0, 42, TrinityItems.katana_stone),
	
	ironkatanamat(7f, 1.0f, 266, 0, 42, TrinityItems.katana_iron),
	
	diamondkatanamat(7.8f, 1.0f, 1577, 0, 42, TrinityItems.katana_diamond),
	
	woodknifemat(2.7f, 1.0f, 65, 0, 42, TrinityItems.knife_wood),
	
	goldknifemat(2.7f, 1.0f, 38, 0, 42, TrinityItems.knife_gold),
	
	stoneknifemat(3.2f, 1.0f, 137, 0, 42, TrinityItems.knife_stone),
	
	ironknifemat(4.8f, 1.0f, 256, 0, 42, TrinityItems.knife_iron),
	
	diamondknifemat(5.4f, 1.0f, 1567, 0, 42, TrinityItems.knife_diamond),
	
	woodhalberdmat(3.7f, 1.0f, 67, 0, 42, TrinityItems.halberd_wood),
	
	goldhalberdmat(3.7f, 1.0f, 40, 0, 42, TrinityItems.halberd_gold),
	
	stonehalberdmat(4.3f, 1.0f, 139, 0, 42, TrinityItems.halberd_stone),
	
	ironhalberdmat(6.0f, 1.0f, 258, 0, 42, TrinityItems.halberd_iron),
	
	diamondhalberdmat(7.6f, 1.0f, 1569, 0, 42, TrinityItems.halberd_diamond),
	
	wooddaggermat(1.7f, 1.0f, 58, 0, 42, TrinityItems.knife_wood),
	
	golddaggermat(1.7f, 1.0f, 31, 0, 42, TrinityItems.knife_gold),
	
	stonedaggermat(2.2f, 1.0f, 130, 0, 42, TrinityItems.knife_stone),
	
	irondaggermat(3.2f, 1.0f, 249, 0, 42, TrinityItems.knife_iron),
	
	diamonddaggermat(4.5f, 1.0f, 1560, 0, 42, TrinityItems.knife_diamond),
	
	woodlancemat(2.5f, 1.0f, 75, 0, 42, TrinityItems.lance_wood),
	
	goldlancemat(2.5f, 1.0f, 48, 0, 42, TrinityItems.lance_gold),
	
	stonelancemat(3.8f, 1.0f, 147, 0, 42, TrinityItems.lance_stone),
	
	ironlancemat(4.5f, 1.0f, 249, 0, 42, TrinityItems.lance_iron),
	
	diamondlancemat(5.5f, 1.0f, 1570, 0, 42, TrinityItems.lance_diamond),
	
	woodguisarmemat(3.5f, 1.0f, 60, 0, 42, TrinityItems.guisarme_wood),
	
	goldguisarmemat(3.5f, 1.0f, 33, 0, 42, TrinityItems.guisarme_gold),
	
	stoneguisarmemat(4.5f, 1.0f, 132, 0, 42, TrinityItems.guisarme_stone),
	
	ironguisarmemat(5.4f, 1.0f, 251, 0, 42, TrinityItems.guisarme_iron),
	
	diamondguisarmemat(6.3f, 1.0f, 1570, 0, 42, TrinityItems.guisarme_diamond),
	
	woodlucernemat(2.5f, 1.0f, 70, 0, 42, TrinityItems.lucerne_hammer_wood),
	
	goldlucernemat(2.5f, 1.0f, 43, 0, 42, TrinityItems.lucerne_hammer_gold),
	
	stonelucernemat(3.5f, 1.0f, 142, 0, 42, TrinityItems.lucerne_hammer_stone),
	
	ironlucernemat(4.5f, 1.0f, 261, 0, 42, TrinityItems.lucerne_hammer_iron),
	
	diamondlucernemat(6.5f, 1.0f, 1580, 0, 42, TrinityItems.lucerne_hammer_diamond),
	
	woodquarterstaffmat(1.5f, 1.0f, 58, 0, 42, TrinityItems.quarterstaff_wood),
	
	goldquarterstaffmat(1.5f, 1.0f, 38, 0, 42, TrinityItems.quarterstaff_gold),
	
	stonequarterstaffmat(1.8f, 1.0f, 137, 0, 42, TrinityItems.quarterstaff_stone),
	
	ironquarterstaffmat(2.5f, 1.0f, 275, 0, 42, TrinityItems.quarterstaff_iron),
	
	diamondquarterstaffmat(3.5f, 1.0f, 1569, 0, 42, TrinityItems.quarterstaff_diamond);
	
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private TrinityToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
	
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial  = repairMaterial;
		
	}

	@Override
	public float getAttackDamage() {
		
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() {
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}

}
