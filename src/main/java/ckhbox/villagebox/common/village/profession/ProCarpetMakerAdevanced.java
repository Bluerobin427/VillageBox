package ckhbox.villagebox.common.village.profession;

import java.util.ArrayList;

import ckhbox.villagebox.common.block.ModBlocks;
import ckhbox.villagebox.common.item.ModItems;
import ckhbox.villagebox.common.util.helper.PathHelper;
import ckhbox.villagebox.common.village.quest.Quest;
import ckhbox.villagebox.common.village.trading.TradingRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ProCarpetMakerAdevanced extends Profession{

	@Override
	protected void initTradingRecipeList() {
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet20)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet21)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet22)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet23)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet24)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet25)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet26)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet27)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet28)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet29)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet30)));
		this.tradingRecipeList.add(new TradingRecipe(new ItemStack[]{new ItemStack(ModItems.bronzeCoin,40),new ItemStack(ModItems.ballOfWool,2)},new ItemStack(ModBlocks.carpet31)));
	}


	@Override
	protected void initTexture() {
		this.createTextures("carpetmakeradv");
	}

	@Override
	protected String getUnlocalized() {
		return PathHelper.full("profession.carpetmakeradv");
	}
	
	@Override
	protected void initUpgradeOptions() {
		this.upgradeToCurentNeeds = new ItemStack[]{
				new ItemStack(ModItems.ballOfWool,10),
				new ItemStack(ModItems.silverCoin,10)
		};
		
		this.upgradeToNextOptions = null;
	}
	
	@Override
	protected void initHoldItems() {
		this.holdItems = new ItemStack[]{
				new ItemStack(ModItems.ballOfWool)
		};
	}
	
	@Override
	protected void initQuests() {
		this.quests = new ArrayList<Quest>();		
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(ModItems.ballOfWool,3)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,24)}));
	}
	
}
