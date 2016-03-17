package ckhbox.villagebox.common.village.profession;

import ckhbox.villagebox.common.util.helper.PathHelper;
import ckhbox.villagebox.common.util.registry.IRegistrable;
import ckhbox.villagebox.common.util.registry.Registry;
import ckhbox.villagebox.common.village.trading.TradingRecipeList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public abstract class Profession implements IRegistrable{
	
	private int regID;
	//trading recipe list
	protected TradingRecipeList tradingRecipeList = new TradingRecipeList();
	//texture
	protected ResourceLocation texturem;
	protected ResourceLocation texturef;
	
	//what professions can upgrade from this profession
	protected Class<? extends Profession>[] upgradeToNextOptionClasses;
	protected Profession[] upgradeToNextOptions;//this will be automatically generated based on option classes
	//what items are needed to upgrade to this profession(usually only gems, maximum: 3 stacks)
	protected ItemStack[] upgradeToCurentNeeds;
	
	@Override
	public int getRegID() {
		return regID;
	}

	@Override
	public void setRegID(int regID) {
		this.regID = regID;
	}
	
	public Profession(){
		this.initTradingRecipeList();
		this.initTexture();
		this.initUpgradeOptions();
	}
	
	public Profession[] getUpgradeToNextOptions(){
		if(this.upgradeToNextOptions == null){
			if(this.upgradeToNextOptionClasses != null && this.upgradeToNextOptionClasses.length > 0){
				this.upgradeToNextOptions = new Profession[this.upgradeToNextOptionClasses.length];
				for(int i = 0;i<this.upgradeToNextOptionClasses.length;i++){
					this.upgradeToNextOptions[i] = Profession.registry.get(this.upgradeToNextOptionClasses[i]);
				}
			}
		}
		return this.upgradeToNextOptions;
	}
	
	public ItemStack[] getUpgradeToCurentNeeds(){
		return this.upgradeToCurentNeeds;
	}
	
	public ResourceLocation getTexture(boolean male){
		return male?this.texturem:this.texturef;
	}
	
	public TradingRecipeList getTradingRecipeList(){
		return this.tradingRecipeList;
	}
	
	public String getDisplayName(){
		return StatCollector.translateToLocal(this.getUnlocalized() + ".name");
	}
	
	public String getDescription(){
		return StatCollector.translateToLocal(this.getUnlocalized() + ".desc");
	}
	
	protected void createTextures(String name){
		this.texturem = new ResourceLocation(PathHelper.full("textures/entity/villager/" + name + "_m.png"));
		this.texturef = new ResourceLocation(PathHelper.full("textures/entity/villager/" + name + "_f.png"));
	}
	
	//abstract functions
	protected abstract void initTradingRecipeList();
	protected abstract void initTexture();
	protected abstract void initUpgradeOptions();
	protected abstract String getUnlocalized();
	
	
	//---------------------------------
	//registry
	public static Registry<Profession> registry = new Registry<Profession>();
	
	public static void init(){
		int id = 0;
		registry.register(id++, new ProVillager0());
		registry.register(id++, new ProVillager1());
		registry.register(id++, new ProVillager2());
		registry.register(id++, new ProPeasant());
		registry.register(id++, new ProMiner());
		registry.register(id++, new ProAlchemist());
		registry.register(id++, new ProShaman());
		registry.register(id++, new ProArmorsmith());
		registry.register(id++, new ProBlacksmith());
		registry.register(id++, new ProToolsmith());
		registry.register(id++, new ProBowmaker());
		registry.register(id++, new ProCarpenter());
		registry.register(id++, new ProCarpetMakerAdevanced());
		registry.register(id++, new ProCarpetMakerCartoony());
		registry.register(id++, new ProCarpetmaker());
		registry.register(id++, new ProFisherman());
		registry.register(id++, new ProFlorist());
		registry.register(id++, new ProFurnituremaker());
		registry.register(id++, new ProOrchardist());
		registry.register(id++, new ProPainter());
		registry.register(id++, new ProRancher());
		registry.register(id++, new ProScholar());
		registry.register(id++, new ProVintner());
		registry.register(id++, new ProWeaponsmith());
		registry.register(id++, new ProMage());
		registry.register(id++, new ProWorker());
		registry.register(id++, new ProCookAssistant());
		registry.register(id++, new ProFarmer());
		registry.register(id++, new ProBookseller());
		registry.register(id++, new ProBanker());
		registry.register(id++, new ProChef());
		registry.register(id++, new ProChefDessert());
		registry.register(id++, new ProBuilder());
	}

}