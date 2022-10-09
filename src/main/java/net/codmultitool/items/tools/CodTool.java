package net.codmultitool.items.tools;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.tag.BlockTags;

public class CodTool extends PickaxeItem {
    public CodTool(ToolMaterial material) {
        super(material, 4, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    @Override
    public boolean isSuitableFor(BlockState blockstate) {
        int i = this.getMaterial().getMiningLevel();
        if (i < 3 && blockstate.isIn(BlockTags.NEEDS_DIAMOND_TOOL)) {
            return false;
        } else if (i < 2 && blockstate.isIn(BlockTags.NEEDS_IRON_TOOL)) {
            return false;
        } else {
            return (i < 1 || !blockstate.isIn(BlockTags.NEEDS_STONE_TOOL)) && (blockstate.isIn(BlockTags.AXE_MINEABLE) || blockstate.isIn(BlockTags.HOE_MINEABLE)
                    || blockstate.isIn(BlockTags.PICKAXE_MINEABLE) || blockstate.isIn(BlockTags.SHOVEL_MINEABLE));
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity entity, LivingEntity sourceentity){
        stack.damage(1, sourceentity, i -> i.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack itemstack, BlockState blockstate) {
        return 6f;
    }

}