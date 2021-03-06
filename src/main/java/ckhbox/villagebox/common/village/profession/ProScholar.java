package ckhbox.villagebox.common.village.profession;

import java.util.ArrayList;

import ckhbox.villagebox.common.item.ModItems;
import ckhbox.villagebox.common.util.helper.PathHelper;
import ckhbox.villagebox.common.village.quest.Quest;
import ckhbox.villagebox.common.village.trading.TradingRecipe;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ProScholar extends Profession{

	@Override
	protected void initTradingRecipeList() {
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,20)},
				new ItemStack(Items.BOOK)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,3)},
				new ItemStack(Items.PAPER)));
		this.tradingRecipeList.add(new TradingRecipe(
				new ItemStack[]{new ItemStack(ModItems.silverCoin,1),new ItemStack(Items.PAPER)},
				new ItemStack(ModItems.resetScroll)));
	}


	@Override
	protected void initTexture() {
		this.createTextures("scholar");
	}

	@Override
	protected String getUnlocalized() {
		return PathHelper.full("profession.scholar");
	}

	@Override
	protected void initUpgradeOptions() {
		this.upgradeToCurentNeeds = new ItemStack[]{
				new ItemStack(Items.BOOK,1),
				new ItemStack(ModItems.silverCoin,1)
		};
		
		this.upgradeToNextOptionClasses = new Class[]{
				ProBookseller.class,
				ProMage.class,
				ProPainter.class
				};
	}
	
	@Override
	protected void initHoldItems() {
		this.holdItems = new ItemStack[]{
				new ItemStack(Items.BOOK),
				new ItemStack(ModItems.resetScroll)
		};
	}

	@Override
	protected void initQuests() {
		this.quests = new ArrayList<Quest>();	
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Items.BOOK,1)},
				new ItemStack[]{new ItemStack(ModItems.bronzeCoin,5)}));
		this.quests.add(new Quest(
				new ItemStack[]{new ItemStack(Items.BOOK,5)},
				new ItemStack[]{new ItemStack(ModItems.resetScroll,1)}));
	}
}
