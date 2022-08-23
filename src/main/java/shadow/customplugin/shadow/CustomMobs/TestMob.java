package shadow.customplugin.shadow.CustomMobs;

import net.minecraft.server.v1_8_R3.EntityInsentient;
import net.minecraft.server.v1_8_R3.EntityZombie;
import net.minecraft.server.v1_8_R3.World;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.entity.Zombie;

public class TestMob extends EntityZombie {


    public TestMob(World world) {
        super(world);
    }
    public TestMob()
    {
        this(((CraftWorld) Bukkit.getWorlds().get(0)).getHandle());
    }



}
