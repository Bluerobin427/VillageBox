package com.ckhgame.villagebento.villager;

import java.util.ArrayList;

import com.ckhgame.villagebento.block.ModBlocks;
import com.ckhgame.villagebento.villager.chat.VillagerChat;
import com.ckhgame.villagebento.villager.component.VillagerCompAbout;
import com.ckhgame.villagebento.villager.component.VillagerCompBuy;
import com.ckhgame.villagebento.villager.component.VillagerCompSell;
import com.ckhgame.villagebento.villager.component.VillagerComponent;

import net.minecraft.init.Items;

public class VillagerMerchant extends Villager {

	@Override
	public String getProfessionName() {
		// TODO Auto-generated method stub
		return "Potion Merchant";
	}

	@Override
	public String getProfessionDescription() {
		// TODO Auto-generated method stub
		return "It is a Deal!";
	}

	@Override
	public boolean canSpawn() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void createComponents(ArrayList<VillagerComponent> components) {

        components.add(new VillagerCompAbout());
        
        VillagerCompBuy compBuy = new VillagerCompBuy();
        compBuy.addItemBuy(Items.glass_bottle, 1, 10, 0);
        compBuy.addItemBuy(Items.potionitem, 1, 3, 3);
        compBuy.addItemBuy(Items.experience_bottle, 1, 1, 8);
        components.add(compBuy);

	}

	@Override
	public void initVillagerChat(VillagerChat villagerChat) {

		villagerChat.add(0, "Trying to buy somthing?");
		villagerChat.add(0, "You find everthing Ok?");
		villagerChat.add(0, "This is today's speacial!");
		
	}

	@Override
	public String getSkinName() {
		return "merchant";
	}

}
