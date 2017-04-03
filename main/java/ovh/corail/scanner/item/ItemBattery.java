package ovh.corail.scanner.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ovh.corail.scanner.core.Helper;
import ovh.corail.scanner.core.Main;

public class ItemBattery extends Item {
	private static final String name = "battery";
	
	public ItemBattery() {
		super();
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.tabScanner);
		setMaxStackSize(64);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
		list.add(TextFormatting.WHITE + Helper.getTranslation("item." + name + ".desc"));
	}
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		//TODO playerIn.addStat(Main.achievementXYZ, 1);
	}
}
