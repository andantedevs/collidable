package me.andante.collidable.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Entity.class)
public class EntityMixin {
    /**
     * a very cringe, very destructive mixin, for the lols
     * @author andantedevs
     */
    @Overwrite
    public boolean isCollidable() {
        return true;
    }
}
