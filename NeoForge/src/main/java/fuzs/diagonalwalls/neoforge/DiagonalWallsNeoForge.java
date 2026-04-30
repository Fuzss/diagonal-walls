package fuzs.diagonalwalls.neoforge;

import fuzs.diagonalwalls.common.DiagonalWalls;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.neoforged.fml.common.Mod;

@Mod(DiagonalWalls.MOD_ID)
public class DiagonalWallsNeoForge {

    public DiagonalWallsNeoForge() {
        ModConstructor.construct(DiagonalWalls.MOD_ID, DiagonalWalls::new);
    }
}
