package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import java.util.ArrayList;

public class OLFeats
{
    public static ArrayList<OLFeats> featList = new ArrayList<>();
    private String title;
    private int maxLevel;
    private int level;
    private int featCost;
    private int featCostTotal;
    private String description;
    private String prerequisites;
    private String effects;
    private String special;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFeatCost() {
        return featCost;
    }

    public void setFeatCost(int featCost) {
        this.featCost = featCost;
    }

    public int getFeatCostTotal() {
        return featCostTotal;
    }

    public void setFeatCostTotal(int featCostTotal) {
        this.featCostTotal = featCostTotal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public static void featList()
    {
        OLFeats Alternate_Form = new OLFeats();
        Alternate_Form.setTitle("Alternate Form");
        Alternate_Form.setMaxLevel(2);
        Alternate_Form.setFeatCost(3);
        Alternate_Form.setPrerequisites("None");
        Alternate_Form.setEffects("Upon taking this feat, you build a single alternate form using the normal character creation rules, though your attribute and feat points are determined by your tier in this feat:\n" +
                "\n\tTier 1 - Half of your primary form's attribute points (rounded up), and 3 feat points.\n" +
                "\n\tTier 2 - Same attribute points as your primary form, and 3 feat points less than your primary form.\n" +
                "Whenever your primary form gains new attribute points or levels up, your alternate form also gains points according to the above formulas. As a focus action, you may change between any two forms (including your primary form or any alternate form). You maintain this capability in all of your forms. Each form is treated as a completely different character for mechanical purposes - possessing different attributes, feats, perks, flaws, and other defining characteristics. Your alternate form does, however, retain the ability to transform back into your primary form. In order to keep track of hit points, you should always record the total damage that your character has suffered. When transforming, your damage remains with you even if your maximum hit points change. For example, Dr. Jekyll has a max HP of 15 and Mr. Hyde has a max HP of 30. During combat, Mr. Hyde suffers 10 damage. When he later transforms back into Dr. Jekyll, the 10 damage remains and is subtracted from his new maximum, leaving the doctor with 5 out of 15 hit points. Additionally, when changing forms, if your hit points would be reduced to less than 1, your hit point total becomes 1 instead.");
        Alternate_Form.setSpecial("When selecting feats for your alternate form, you may not select the Alternate Form feat. With GM approval, you may take this feat multiple times. If you do, you get access to an additional form. Multiple Alternate Forms can be a powerful way of accumulating new feat points and attributes. The GM should prevent players from exploiting the feat to create an overly powerful character.");

        featList.add(Alternate_Form);

        OLFeats Area_Manipulation = new OLFeats();
        Area_Manipulation.setTitle("Area Manipulation");
        Area_Manipulation.setMaxLevel(5);
        Area_Manipulation.setFeatCost(1);
        Area_Manipulation.setPrerequisites("None");
        Area_Manipulation.setEffects("For each tier of this feat you possess, you can omit a single 5-foot square from being targeted as part of an area attack.");
        Area_Manipulation.setSpecial("None");

        featList.add(Area_Manipulation);

        OLFeats Armor_Mastery = new OLFeats();
        Armor_Mastery.setTitle("Armor Mastery");
        Armor_Mastery.setMaxLevel(2);
        Armor_Mastery.setFeatCost(3);
        Armor_Mastery.setPrerequisites("None");
        Armor_Mastery.setEffects("Your training allows you to sleep in armor without gaining one level of the fatigued bane. In addition, while wearing armor, you gain the following benefits:\n\tTier 1 - The Fortitude prerequisite for wearing armor is reduced by 1. When wearing armor, you get a +1 armor bonus to your Guard defense.\n\tTier 2 - The Fortitude prerequisite for wearing armor is reduced by 2. When wearing armor, you get a +2 armor bonus to your Guard defense. Any movement penalty is reduced by 5'.");
        Armor_Mastery.setSpecial("None");

        featList.add(Armor_Mastery);

        OLFeats Attack_Redirection = new OLFeats();
        Attack_Redirection.setTitle("Attack Redirection");
        Attack_Redirection.setMaxLevel(1);
        Attack_Redirection.setFeatCost(3);
        Attack_Redirection.setPrerequisites("Defensive Reflexes II");
        Attack_Redirection.setEffects("When you make a defend action and your roll exceeds the attacker's action roll, you can choose to redirect the attack to a target that is neither you, nor the attacker. The original attack roll does not change, only the target. If the attack was a melee attack, you can redirect it to anyone within 5' of you (as opposed to within 5' of the attacker).");
        Attack_Redirection.setSpecial("None");

        featList.add(Attack_Redirection);

        OLFeats Attack_Specialization = new OLFeats();
        Attack_Specialization.setTitle("Attack Specialization");
        Attack_Specialization.setMaxLevel(9);
        Attack_Specialization.setFeatCost(3);
        Attack_Specialization.setPrerequisites("Tier 1: Agility or Might or Any Extraordinary - 3\nTier 4: Agility or Might or Any Extraordinary - 5\nTier 7: Agility or Might or Any Extraordinary - 7");
        Attack_Specialization.setEffects("When you take this feat, select one weapon or attack type. You gain advantage 1 per tier of this feat for any damaging attack made with your chosen attack type. This bonus does not apply to bane attacks or boon invocations. Examples of attack types you can choose to specialize in include fire, cold, lightning, acid, poison, entropy, and force - though this list is not exhaustive.");
        Attack_Specialization.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new weapon or attack type each time. Your total advantage to an attack is equal to your tier for that particular weapon or attack type. For example, a character might have Attack Specialization II (Fire) for fire attacks and Attack Specialization IV (Longsword) for longsword attacks.");

        featList.add(Attack_Specialization);
    }
}