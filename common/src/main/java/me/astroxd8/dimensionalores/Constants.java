package me.astroxd8.dimensionalores;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Constants {
	String MOD_ID = "dimensionalores";
	String MOD_NAME = "Dimensional Ores";
	Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}