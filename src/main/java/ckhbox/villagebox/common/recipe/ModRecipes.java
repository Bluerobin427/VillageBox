package ckhbox.villagebox.common.recipe;

import ckhbox.villagebox.common.block.ModBlocks;
import ckhbox.villagebox.common.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	
	public static void init(){
		//mailbox
		for(int i =0;i<6;i++){
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mailbox),new ItemStack(Items.PAPER), new ItemStack(Blocks.PLANKS,1,i));
		}
		//invitation
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.invitation),
				new ItemStack(Items.PAPER), new ItemStack(Items.FEATHER), new ItemStack(Items.DYE));
				
		//village book
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.villageBook),
				new ItemStack(Items.PAPER), new ItemStack(ModItems.bronzeCoin));
	}
}
