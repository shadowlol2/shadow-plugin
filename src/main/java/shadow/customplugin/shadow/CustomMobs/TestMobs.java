package shadow.customplugin.shadow.CustomMobs;

import net.minecraft.server.v1_8_R3.*;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.v1_8_R3.util.UnsafeList;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.CreatureSpawnEvent;
import shadow.customplugin.shadow.Color;


import java.lang.reflect.Field;
import java.util.List;

public class TestMobs extends EntityZombie {

        public TestMobs(org.bukkit.World world)
        {
            super(((CraftWorld)world).getHandle());
            List goalB = (List)getPrivateField("b", PathfinderGoalSelector.class, goalSelector); goalB.clear();
            List goalC = (List)getPrivateField("c", PathfinderGoalSelector.class, goalSelector); goalC.clear();
            List targetB = (List)getPrivateField("b", PathfinderGoalSelector.class, targetSelector); targetB.clear();
            List targetC = (List)getPrivateField("c", PathfinderGoalSelector.class, targetSelector); targetC.clear();

            this.goalSelector.a(0, new PathfinderGoalFloat(this));
            this.goalSelector.a(2, new PathfinderGoalMeleeAttack(this, EntityIronGolem.class, 1.0D, false));
            this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, EntitySpider.class, 1.0D, true));
            this.goalSelector.a(5, new PathfinderGoalMoveTowardsRestriction(this, 1.0D));
            this.goalSelector.a(6, new PathfinderGoalMoveThroughVillage(this, 1.0D, false));
            this.goalSelector.a(7, new PathfinderGoalRandomStroll(this, 1.0D));
            this.goalSelector.a(8, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 8.0F));
            this.goalSelector.a(8, new PathfinderGoalRandomLookaround(this));
            this.targetSelector.a(1, new PathfinderGoalHurtByTarget(this, true));
            this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, EntityZombie.class, 1.0D, true));
            this.setHealth(100000);
            this.setCustomName(Color.translate("&c&lShadow NMS") + "" + this.getHealth());
            this.setSize(100, 100);

        }
        public static Object getPrivateField(String fieldName, Class clazz, Object object)
        {
            Field field;
            Object o = null;
            try
            {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                o = field.get(object);
            }
            catch(NoSuchFieldException e)
            {
                e.printStackTrace();
            }
            catch(IllegalAccessException e)
            {
                e.printStackTrace();
            }
            return o;
        }
    }


