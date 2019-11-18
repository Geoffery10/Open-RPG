package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import java.util.ArrayList;

public class OLBanes
{
    public static ArrayList<OLBanes> baneList = new ArrayList<>();
    private String title;
    private String duration;
    private String description;
    private String effect;
    private int powerlvl;
    private String attributes;
    private String attack;
    private String special;

    public OLBanes copyFeat() {
        OLBanes newBane = new OLBanes();
        newBane.setTitle(this.title);
        newBane.setDuration(this.duration);
        newBane.setDescription(this.description);
        newBane.setEffect(this.effect);
        newBane.setPowerlvl(this.powerlvl);
        newBane.setAttributes(this.attributes);
        newBane.setAttack(this.attack);
        newBane.setSpecial(this.special);
        return newBane;
    }

    public static void setBaneList(ArrayList<OLBanes> baneList) {
        OLBanes.baneList = baneList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getPowerlvl() {
        return powerlvl;
    }

    public void setPowerlvl(int powerlvl) {
        this.powerlvl = powerlvl;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public static void baneList()
    {
        OLBanes Blind = new OLBanes();
        Blind.setTitle("Blind");
        Blind.setDuration("Resist ends (Fail x 3 = 1 minute)");
        Blind.setDescription("You blind your foe with anything from a massive explosion, to a handful of sand, to an arctic blast, to a dazzling flash of light. Pirates, snipers, rogues, and necromancers often make use of this bane in combat.\n");
        Blind.setEffect("The target cannot see as long as the effect persists. The target automatically fails any Perception rolls based solely on normal sight. Attack rolls and Perception rolls based partially on sight that can be supplemented by another sense suffer disadvantage 5. The target\'s Guard defense is reduced by 3.\n");
        Blind.setPowerlvl(5);
        Blind.setAttributes("Agility - Creation - Energy - Entropy");
        Blind.setAttack("Agility vs. Guard\nCreation vs. Guard\nEnergy vs. Guard\nEntropy vs. Toughness");
        Blind.setSpecial("N/A");

        baneList.add(Blind);
    }
}