package com.ckhgame.villagebento.villager;

import java.util.ArrayList;

import com.ckhgame.villagebento.villager.chat.VillagerChat;
import com.ckhgame.villagebento.villager.component.VillagerCompAbout;
import com.ckhgame.villagebento.villager.component.VillagerCompSell;
import com.ckhgame.villagebento.villager.component.VillagerComponent;

public class VillagerCasinoDealer extends Villager {

	@Override
	public String getProfessionName() {
		// TODO Auto-generated method stub
		return "Casino Dealer";
	}

	@Override
	public String getProfessionDescription() {
		// TODO Auto-generated method stub
		return "See what we got...";
	}

	@Override
	public boolean canSpawn() {
		// TODO Auto-generated method stub
		return true;
	}

	
	
	@Override
	public void createComponents(ArrayList<VillagerComponent> components) {

        components.add(new VillagerCompAbout());

	}

	@Override
	public void initVillagerChat(VillagerChat villagerChat) {

		villagerChat.add(0, "Double or not?");
		villagerChat.add(0, "Split? may be not?");
		villagerChat.add(0, "Good luck!");
		
	}

	@Override
	public String getSkinName() {
		return "casinodealer";
	}

}
