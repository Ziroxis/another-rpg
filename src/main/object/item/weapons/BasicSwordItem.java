package main.object.item.weapons;

import main.GamePanel;
import main.api.DamageCalculation;
import main.object.item.Item;

public class BasicSwordItem extends Item {

    public BasicSwordItem(GamePanel gp)
    {
        super(gp);
        this.name = "Basic sword";
        // 1D2
        this.attackAmount = 1;
        this.attackDice = 2;
        this.description = "Just a basic sword";
        down = setup("sword_normal", "weapons");
    }
}
