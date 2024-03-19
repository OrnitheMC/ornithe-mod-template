package com.example.example_mod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.example.example_mod.ExampleMod;

import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

	@Inject(method = "main", remap = false, at = @At("HEAD"))
	private static void exampleMod$onInit(CallbackInfo ci) {
		ExampleMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
