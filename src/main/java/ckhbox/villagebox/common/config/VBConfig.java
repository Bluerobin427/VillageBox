package ckhbox.villagebox.common.config;

import java.io.File;

import ckhbox.villagebox.VillageBoxMod;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class VBConfig {
	//properties
	public static int[] proIDBanList;					//banned profession IDs
	public static boolean destroyBlocksDropCoins;		//true: destroy blocks can drop coins
	public static int coinChance;						//default: 5. The chance for coins to drop is 1/coinChance (default is 1/5)
	public static boolean killMobsDropCoins;			//true: kill mobs can drop coins
	public static boolean displayExtraInfo;				//true: will display extra information in game like the profession id
	public static boolean freeUpgrading;				//set to ture when you want nothing be cunsumed on upgrading villagers
	public static int reviveTicks;						//how many ticks to revive a villager
	public static boolean oneVillagerPerRoom;			//don't allow more than one villagers live in the same room
	public static int questFrequency;					//how fast the new quest appears.
														//e.g. 0 or a number less than 0 means no new quest,
														//24000 means one new quest per day in average, 
														//72000 means one new quest every three days in average
	public static int questLifetime;					//the life time of a quest. e.g. 48000 means the quest will exist 2 minecraft days
	
	public static void load(File file){
		Configuration conf = new Configuration(file, VillageBoxMod.VERSION);
		Property pt = null;
		
		conf.load();
		
		//profession ban list
		pt = conf.get(Configuration.CATEGORY_GENERAL, "BannedProIDList", new int[0]);
		pt.setComment("Banned profession IDs. One id per line, empty means no banned professions");
		proIDBanList = pt.getIntList();
		
		//coin earning options
		pt = conf.get(Configuration.CATEGORY_GENERAL, "DestroyBlocksDropCoins", true);
		pt.setComment("Does destroying blocks drop coins?");
		destroyBlocksDropCoins = pt.getBoolean();
		
		pt = conf.get(Configuration.CATEGORY_GENERAL, "CoinChance", 5);
		pt.setComment("Chance of coins dropping from block breaks. Chance of coins = 1/this number. Default value is 5, so the chance of coins is 1/5. Has no effect if DestroyBlocksDropCoins is false.");
		coinChance = pt.getInt();
		
		pt = conf.get(Configuration.CATEGORY_GENERAL, "KillMobsDropCoins", true);
		pt.setComment("Does killing mobs drop coins?");
		killMobsDropCoins = pt.getBoolean();
		
		//display extra information
		pt = conf.get(Configuration.CATEGORY_GENERAL, "displayExtraInfo", false);
		pt.setComment("Set to true when you want to view extra information such as the profession id of a villager");
		displayExtraInfo = pt.getBoolean();
		
		//villager revive ticks
		pt = conf.get(Configuration.CATEGORY_GENERAL, "ReviveTicks", 24000);
		pt.setComment("How many ticks until a dead villager revives again");
		reviveTicks = pt.getInt();
		
		//free upgrading
		pt = conf.get(Configuration.CATEGORY_GENERAL, "FreeUpgrading", false);
		pt.setComment("Set to true when you want nothing be consumed on upgrading villagers");
		freeUpgrading = pt.getBoolean();
		
		//one villager one room
		pt = conf.get(Configuration.CATEGORY_GENERAL, "OneVillagerPerRoom", false);
		pt.setComment("Set to true to disallow more than one villagers live in the same room");
		oneVillagerPerRoom = pt.getBoolean();
		
		//quest frequency
		pt = conf.get(Configuration.CATEGORY_GENERAL, "QuestFrequency", 24000);
		pt.setComment("How fast the new quest appears. e.g. 0 or a number less than 0 means no new quest, 24000 means one new quest per day in average, 72000 means one new quest every three days in average");
		questFrequency = pt.getInt();
		
		//quest lifetime
		pt = conf.get(Configuration.CATEGORY_GENERAL, "QuestLifetime", 48000);
		pt.setComment("The life time of a quest. e.g. 48000 means the quest will exist 2 minecraft days");
		questLifetime = pt.getInt();
		
		conf.save();
	}
}
