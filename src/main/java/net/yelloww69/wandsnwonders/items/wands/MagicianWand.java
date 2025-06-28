package net.yelloww69.wandsnwonders.items.wands;

import io.redspace.ironsspellbooks.api.item.weapons.ExtendedSwordItem;
import io.redspace.ironsspellbooks.api.spells.IPresetSpellContainer;
import io.redspace.ironsspellbooks.item.weapons.StaffItem;
import io.redspace.ironsspellbooks.util.ItemPropertiesHelper;

public class MagicianWand extends StaffItem implements IPresetSpellContainer {

    public MagicianWand() {
        super(
                ItemPropertiesHelper.equipment().fireResistant().stacksTo(1).rarity(Rarity.EPIC).attributes(ExtendedSwordItem.createAttributes(WeaponTiers.VOID_STAFF))
        );
    }


}