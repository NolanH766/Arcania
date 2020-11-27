package com.github.nolanh76.arcania.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.github.nolanh76.arcania.ArcaniaModElements;

@ArcaniaModElements.ModElement.Tag
public class PoisounousFluidMobplayerCollidesBlockProcedure extends ArcaniaModElements.ModElement {
	public PoisounousFluidMobplayerCollidesBlockProcedure(ArcaniaModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure PoisounousFluidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
