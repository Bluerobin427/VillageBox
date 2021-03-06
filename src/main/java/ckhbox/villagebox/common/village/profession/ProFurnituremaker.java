package ckhbox.villagebox.common.village.profession;

import java.util.ArrayList;

import ckhbox.villagebox.common.block.ModBlocks;
import ckhbox.villagebox.common.item.ModItems;
import ckhbox.villagebox.common.util.helper.PathHelper;
import ckhbox.villagebox.common.village.quest.Quest;
import ckhbox.villagebox.common.village.trading.TradingRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ProFurnituremaker extends Profession{

	@Override
	protected void initTradingRecipeList() {
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,2)},
				new ItemStack(ModBlocks.tableAcacia)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,2)},
				new ItemStack(ModBlocks.tableBirch)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,2)},
				new ItemStack(ModBlocks.tableDarkOak)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,2)},
				new ItemStack(ModBlocks.tableJungle)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,2)},
				new ItemStack(ModBlocks.tableOak)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,2)},
				new ItemStack(ModBlocks.tableSpruce)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.chairAcacia)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.chairBirch)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.chairDarkOak)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.chairJungle)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.chairOak)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.chairSpruce)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.benchAcacia)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.benchBirch)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.benchDarkOak)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.benchJungle)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.benchOak)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1)},
				new ItemStack(ModBlocks.benchSpruce)));
	}


	@Override
	protected void initTexture() {
		this.createTextures("furnituremaker");
	}

	@Override
	protected String getUnlocalized() {
		return PathHelper.full("profession.furnituremaker");
	}

	@Override
	protected void initUpgradeOptions() {
		this.upgradeToCurentNeeds = new ItemStack[]{
				new ItemStack(Blocks.PLANKS,64),
				new ItemStack(ModItems.silverCoin,10)
		};
		
		this.upgradeToNextOptions = null;
	}
	
	@Override
	protected void initHoldItems() {
		this.holdItems = new ItemStack[]{
				new ItemStack(Blocks.PLANKS),
				new ItemStack(ModBlocks.chairOak)
		};
	}
	
	@Override
	protected void initQuests() {
		this.quests = new ArrayList<Quest>();	
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Blocks.PLANKS,32,0)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,16)}));
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Blocks.PLANKS,32,1)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,16)}));
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Blocks.PLANKS,32,2)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,16)}));
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Blocks.PLANKS,32,3)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,16)}));
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Blocks.PLANKS,32,4)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,16)}));
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Blocks.PLANKS,32,5)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,16)}));
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Blocks.PLANKS,32,0)},
				new ItemStack[]{new ItemStack(ModBlocks.chairOak,1)}));
	}
}
