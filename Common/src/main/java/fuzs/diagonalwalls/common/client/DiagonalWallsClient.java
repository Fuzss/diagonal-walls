package fuzs.diagonalwalls.common.client;

import fuzs.diagonalwalls.common.DiagonalWalls;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.common.api.config.v3.ConfigHolder;

public class DiagonalWallsClient implements ClientModConstructor {
    @Override
    public void onConstructMod() {
        ConfigHolder.registerConfigurationScreen(DiagonalWalls.MOD_ID, "diagonalblocks");
    }
}
