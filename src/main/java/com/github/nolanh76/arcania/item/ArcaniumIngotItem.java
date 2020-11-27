
package com.github.nolanh76.arcania.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.github.nolanh76.arcania.itemgroup.ArcaniaItemsItemGroup;
import com.github.nolanh76.arcania.ArcaniaModElements;

@ArcaniaModElements.ModElement.Tag
public class ArcaniumIngotItem extends ArcaniaModElements.ModElement {
	@ObjectHolder("arcania:arcanium_ingot")
	public static final Item block = null;
	public ArcaniumIngotItem(ArcaniaModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ArcaniaItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("arcanium_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
