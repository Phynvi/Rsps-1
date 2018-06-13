package com.rs.game.worldlist;

import java.util.HashMap;

public class WorldList {

	public static final HashMap<Integer, WorldEntry> WORLDS = new HashMap<Integer, WorldEntry>();

	//String activity, String ip, int countryId, String countryName, boolean members
	public static void init() {
		WORLDS.put(1, new WorldEntry("Main Server", "199.59.56.116", 1, "Main Server", true));
	}

	public static WorldEntry getWorld(int worldId) {
		return WORLDS.get(worldId);
	}

}