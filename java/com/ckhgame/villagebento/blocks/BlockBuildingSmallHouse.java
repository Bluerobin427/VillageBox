package com.ckhgame.villagebento.blocks;

import com.ckhgame.villagebento.Main;
import com.ckhgame.villagebento.builders.BuildingBuilder;
import com.ckhgame.villagebento.data.BuildingData;
import com.ckhgame.villagebento.data.VillageBentoData;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockBuildingSmallHouse extends Block {

    protected BlockBuildingSmallHouse() {
        super(Material.wood);
        this.setBlockName("BlockBuildingSmallHouse");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName(Main.MODID + ":BlockBuildingSmallHouse");
      //  this.setHardness(2.0F);
       // this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        //this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeWood);
    }

    @SideOnly(Side.CLIENT)
    private VillageBentoData villageBentoData = null;
    
    @SideOnly(Side.CLIENT)
    private boolean villageOutlinesEnabled = false;
    
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		
		if(world.isRemote) return true;
		else{
			//destroy the village block
			world.func_147480_a(x, y, z, false);
			
			BuildingData bd = VillageBentoData.get(world).findBuildingData(x, z, y);

			
			return true;
		}	
	}
}