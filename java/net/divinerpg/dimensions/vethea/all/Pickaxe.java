package net.divinerpg.dimensions.vethea.all;
import net.divinerpg.dimensions.vethea.IVetheanStructure;
import net.divinerpg.utils.blocks.VetheaBlocks;
import net.minecraft.block.Block;

public class Pickaxe implements IVetheanStructure {
	
	public void generate(Block[][][] chunk, int i, int j, int k) {
		chunk[i + 1][j + 3][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 1][j + 4][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 1][j + 5][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 2][j + 2][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 2][j + 3][k + 0] = VetheaBlocks.everstone;
		chunk[i + 2][j + 4][k + 0] = VetheaBlocks.everstone;
		chunk[i + 2][j + 5][k + 0] = VetheaBlocks.everstone;
		chunk[i + 2][j + 6][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 3][j + 3][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 3][j + 4][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 3][j + 5][k + 0] = VetheaBlocks.everstone;
		chunk[i + 3][j + 6][k + 0] = VetheaBlocks.everstone;
		chunk[i + 3][j + 7][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 4][j + 5][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 4][j + 6][k + 0] = VetheaBlocks.everstone;
		chunk[i + 4][j + 7][k + 0] = VetheaBlocks.everstone;
		chunk[i + 4][j + 8][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 5][j + 4][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 5][j + 5][k + 0] = VetheaBlocks.whiteEverstone;
		chunk[i + 5][j + 6][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 5][j + 7][k + 0] = VetheaBlocks.everstone;
		chunk[i + 5][j + 8][k + 0] = VetheaBlocks.everstone;
		chunk[i + 5][j + 9][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 6][j + 3][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 6][j + 4][k + 0] = VetheaBlocks.whiteEverstone;
		chunk[i + 6][j + 5][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 6][j + 7][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 6][j + 8][k + 0] = VetheaBlocks.everstone;
		chunk[i + 6][j + 9][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 7][j + 2][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 7][j + 3][k + 0] = VetheaBlocks.whiteEverstone;
		chunk[i + 7][j + 4][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 7][j + 7][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 7][j + 8][k + 0] = VetheaBlocks.everstone;
		chunk[i + 7][j + 9][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 8][j + 1][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 8][j + 2][k + 0] = VetheaBlocks.whiteEverstone;
		chunk[i + 8][j + 3][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 8][j + 8][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 9][j + 0][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 9][j + 1][k + 0] = VetheaBlocks.whiteEverstone;
		chunk[i + 9][j + 2][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 10][j + 0][k + 0] = VetheaBlocks.darkEverstone;
		chunk[i + 10][j + 1][k + 0] = VetheaBlocks.darkEverstone;
	}
}