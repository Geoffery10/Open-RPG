package com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists;

import java.util.ArrayList;

public class OLBoons
{
    public static ArrayList<OLBoons> boonList = new ArrayList<>();
    private String title;
    private String duration;
    private String description;
    private String effect;
    private int minLvl;
    private int powerlvl;
    private String attributes;
    private String attack;
    private String special;

    public OLBoons copyFeat() {
        OLBoons newBoon = new OLBoons();
        newBoon.setTitle(this.title);
        newBoon.setDuration(this.duration);
        newBoon.setDescription(this.description);
        newBoon.setEffect(this.effect);
        newBoon.setMinLvl(this.minLvl);
        newBoon.setPowerlvl(this.powerlvl);
        newBoon.setAttributes(this.attributes);
        newBoon.setAttack(this.attack);
        newBoon.setSpecial(this.special);
        return newBoon;
    }

    public static void setBoonList(ArrayList<OLBoons> boonList) {
        OLBoons.boonList = boonList;
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

    public int getMinLvl() {
        return minLvl;
    }

    public void setMinLvl(int minLvl) {
        this.minLvl = minLvl;
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

    public static void boonList()
    {
        OLBoons Blind = new OLBoons();
        Blind.setTitle("Blind");
        Blind.setDuration("Resist ends (Fail x 3 = 1 minute)");
        Blind.setDescription("You blind your foe with anything from a massive explosion, to a handful of sand, to an arctic blast, to a dazzling flash of light. Pirates, snipers, rogues, and necromancers often make use of this boon in combat.\n");
        Blind.setEffect("The target cannot see as long as the effect persists. The target automatically fails any Perception rolls based solely on normal sight. Attack rolls and Perception rolls based partially on sight that can be supplemented by another sense suffer disadvantage 5. The target\'s Guard defense is reduced by 3.\n");
        Blind.setPowerlvl(5);
        Blind.setAttributes("Agility - Creation - Energy - Entropy");
        Blind.setAttack("Agility vs. Guard\nCreation vs. Guard\nEnergy vs. Guard\nEntropy vs. Toughness");
        Blind.setSpecial("N/A");

        boonList.add(Blind);
    }
}
