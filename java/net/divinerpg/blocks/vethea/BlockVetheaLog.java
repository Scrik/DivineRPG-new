package net.divinerpg.blocks.vethea;

import java.util.Random;

import net.divinerpg.blocks.base.BlockModLog;
import net.divinerpg.entities.vethea.EntityEnt;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class BlockVetheaLog extends BlockModLog {

    private Random rand = new Random();
    
    public BlockVetheaLog(String name) {
        super(name);
        setCreativeTab(DivineRPGTabs.vethea);
    }
    
    @Override
    public void breakBlock(World w, int x, int y, int z, Block broken, int meta) {
        super.breakBlock(w, x, y, z, broken, meta);
        if(!w.isRemote && this.rand.nextInt(5)==0) {
            EntityEnt e = new EntityEnt(w);
            e.setLocationAndAngles(x, y, z, 0, 0);
            w.spawnEntityInWorld(e);
        }
    }

}
