
package com.github.nolanh76.arcania.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import com.github.nolanh76.arcania.itemgroup.ArcaniaBlocksItemGroup;
import com.github.nolanh76.arcania.ArcaniaModElements;

@ArcaniaModElements.ModElement.Tag
public class CrackedEumusBricksBlock extends ArcaniaModElements.ModElement {
	@ObjectHolder("arcania:cracked_eumus_bricks")
	public static final Block block = null;
	public CrackedEumusBricksBlock(ArcaniaModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ArcaniaBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(22.5f, 600f).lightValue(0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("cracked_eumus_bricks");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(CrackedEumusBricksBlock.block, (int) (1)));
		}
	}
}
