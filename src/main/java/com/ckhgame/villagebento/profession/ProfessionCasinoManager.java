package com.ckhgame.villagebento.profession;

import java.util.ArrayList;

import com.ckhgame.villagebento.entity.villager.EntityVBVillager;
import com.ckhgame.villagebento.util.data.VillagerChat;
import com.ckhgame.villagebento.villagercomponent.VillagerCompAbout;
import com.ckhgame.villagebento.villagercomponent.VillagerCompAction;
import com.ckhgame.villagebento.villagercomponent.VillagerComponent;
import com.ckhgame.villagebento.villagercomponent.villageraction.VillagerActionBet;

public class ProfessionCasinoManager extends Profession {

	@Override
	public String getProfessionName() {
		
		return "Casino Manager";
	}

	@Override
	public String getProfessionDescription() {
		
		return "Gambling is drug.";
	}
	
	@Override
	public Class<? extends EntityVBVillager> getEntityClass(){
		return EntityVBVillager.class;
	}
	
	@Override
	public boolean canSpawn() {
		
		return true;
	}

	
	
	@Override
	public void createVillagerComponents(ArrayList<VillagerComponent> components,EntityVBVillager villager) {

        components.add(new VillagerCompAbout(villager));
        
        //action
        VillagerCompAction compAction = new VillagerCompAction(villager);
        compAction.addAction(new VillagerActionBet("Today is a good day!(bet:10)", 0, new Object[]{10}));
        compAction.addAction(new VillagerActionBet("Test my luck(bet:50)", 1, new Object[]{50}));
        compAction.addAction(new VillagerActionBet("I'm a lucky guy!(bet:100)", 2, new Object[]{100}));
        components.add(compAction);

	}

	@Override
	public void initVillagerChat(VillagerChat villagerChat) {

		villagerChat.add(0, "Wanna have fun?");
		villagerChat.add(0, "Lost money does not means you lost everthing...");
		villagerChat.add(0, "It is a Win-Win!");
		
	}

	@Override
	public String getSkinName() {
		return "casinomanager";
	}
	
	@Override
	protected void setTimeSchedule(){
		timeSchedule.setWorkTime(0, new int[]{0, 4 ,18, 24});		//Monday
		timeSchedule.setWorkTime(1, new int[]{0, 4, 18, 24});		//Tuesday
		timeSchedule.setWorkTime(2, new int[]{0, 4});					//Wednesday
																								//Thursday
		timeSchedule.setWorkTime(4, new int[]{18, 24});				//Friday
		timeSchedule.setWorkTime(5, new int[]{0, 4, 18, 24});		//Saturday
		timeSchedule.setWorkTime(6, new int[]{0, 4, 18, 24});		//Sunday
		
		//sleeping
		timeSchedule.setSleeptime(new int[]{6, 14});
	}

}
