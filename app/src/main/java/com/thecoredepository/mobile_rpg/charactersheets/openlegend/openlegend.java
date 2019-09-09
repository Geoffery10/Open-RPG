package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

/* This class contains the player's character sheet.
// All of the player's values are stored here and should
// be saved often reduce the chance of lost data.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class openlegend
{
    //Values from the Open Legend Character Sheet
    String playerName = "John Doe";
    String charName = "Lucifer";
    String nickname = "Lue";
    int majorLvl = 1;
    int minorLvl = 1;
    String deity = "God";

    String[] languages = new String[10];
    String bio = "Just a chill dude out to kill.";

    //Attributes
    int attributePointsAvalible;
    int getAttributePointsUsed;
    //PHYSICAL ATTRIBUTES
    int agility;
    int fortitude;
    int might;
    //MENTAL ATTRIBUTES
    int learning;
    int logic;
    int perception;
    int will;
    //SOCIAL ATTRIBUTES
    int deception;
    int persuasion;
    int presence;
    //EXTRAORDINARY ATTRIBUTES
    int alteration;
    int creation;
    int energy;
    int entropy;
    int influence;
    int movement;
    int prescience;
    int protection;

    //Stats
    int toughness;
    int guard;
    int armor;
    int resolve;
    int hitpoints;
    int speed;

    //Feats
    int featPointsAvaliable;
    int featPointsUsed;

    //Perks/Flaws
    String[] perks = new String[2];
    String[] flaws = new String[2];

    //Inventory
    //Might use class for inventory
    //inventoryOL inventory = new inventoryOL();
    //Or just keep the values here
    int inventorySize;
    List items = new ArrayList<String>();
    List itemInfo = new ArrayList<String>();

    //Banes/Boons
    List Banes = new ArrayList<String>();
    List Boons = new ArrayList<String>();


    //Getters and Setters


    @Override
    public String toString() {
        return "openlegend sheet - {" +
                "playerName='" + playerName + '\'' +
                ", charName='" + charName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", majorLvl=" + majorLvl +
                ", minorLvl=" + minorLvl +
                ", deity='" + deity + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", bio='" + bio + '\'' +
                ", attributePointsAvalible=" + attributePointsAvalible +
                ", getAttributePointsUsed=" + getAttributePointsUsed +
                ", agility=" + agility +
                ", fortitude=" + fortitude +
                ", might=" + might +
                ", learning=" + learning +
                ", logic=" + logic +
                ", perception=" + perception +
                ", will=" + will +
                ", deception=" + deception +
                ", persuasion=" + persuasion +
                ", presence=" + presence +
                ", alteration=" + alteration +
                ", creation=" + creation +
                ", energy=" + energy +
                ", entropy=" + entropy +
                ", influence=" + influence +
                ", movement=" + movement +
                ", prescience=" + prescience +
                ", protection=" + protection +
                ", toughness=" + toughness +
                ", guard=" + guard +
                ", armor=" + armor +
                ", resolve=" + resolve +
                ", hitpoints=" + hitpoints +
                ", speed=" + speed +
                ", featPointsAvaliable=" + featPointsAvaliable +
                ", featPointsUsed=" + featPointsUsed +
                ", perks=" + Arrays.toString(perks) +
                ", flaws=" + Arrays.toString(flaws) +
                ", inventorySize=" + inventorySize +
                ", items=" + items +
                ", itemInfo=" + itemInfo +
                ", Banes=" + Banes +
                ", Boons=" + Boons +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMajorLvl() {
        return majorLvl;
    }

    public void setMajorLvl(int majorLvl) {
        this.majorLvl = majorLvl;
    }

    public int getMinorLvl() {
        return minorLvl;
    }

    public void setMinorLvl(int minorLvl) {
        this.minorLvl = minorLvl;
    }

    public String getDeity() {
        return deity;
    }

    public void setDeity(String deity) {
        this.deity = deity;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAttributePointsAvalible() {
        return attributePointsAvalible;
    }

    public void setAttributePointsAvalible(int attributePointsAvalible) {
        this.attributePointsAvalible = attributePointsAvalible;
    }

    public int getGetAttributePointsUsed() {
        return getAttributePointsUsed;
    }

    public void setGetAttributePointsUsed(int getAttributePointsUsed) {
        this.getAttributePointsUsed = getAttributePointsUsed;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getMight() {
        return might;
    }

    public void setMight(int might) {
        this.might = might;
    }

    public int getLearning() {
        return learning;
    }

    public void setLearning(int learning) {
        this.learning = learning;
    }

    public int getLogic() {
        return logic;
    }

    public void setLogic(int logic) {
        this.logic = logic;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getDeception() {
        return deception;
    }

    public void setDeception(int deception) {
        this.deception = deception;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public int getAlteration() {
        return alteration;
    }

    public void setAlteration(int alteration) {
        this.alteration = alteration;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEntropy() {
        return entropy;
    }

    public void setEntropy(int entropy) {
        this.entropy = entropy;
    }

    public int getInfluence() {
        return influence;
    }

    public void setInfluence(int influence) {
        this.influence = influence;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getPrescience() {
        return prescience;
    }

    public void setPrescience(int prescience) {
        this.prescience = prescience;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness() {
        this.toughness = (10 + fortitude + will);
    }

    public int getGuard() {
        return guard;
    }

    public void setGuard(int guard) {
        this.guard = (10 + agility + might + armor);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.guard = armor;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = (10 + presence + will);
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = ((2 * (fortitude + presence + will)) + 10);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFeatPointsAvaliable() {
        return featPointsAvaliable;
    }

    public void setFeatPointsAvaliable(int featPointsAvaliable) {
        this.featPointsAvaliable = (6 + minorLvl);
    }

    public int getFeatPointsUsed() {
        return featPointsUsed;
    }

    public void setFeatPointsUsed(int featPointsUsed) {
        this.featPointsUsed = featPointsUsed;
    }

    public String[] getPerks() {
        return perks;
    }

    public void setPerks(String[] perks) {
        this.perks = perks;
    }

    public String[] getFlaws() {
        return flaws;
    }

    public void setFlaws(String[] flaws) {
        this.flaws = flaws;
    }

    public int getInventorySize() {
        return inventorySize;
    }

    public void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public List getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(List itemInfo) {
        this.itemInfo = itemInfo;
    }

    public List getBanes() {
        return Banes;
    }

    public void setBanes(List banes) {
        Banes = banes;
    }

    public List getBoons() {
        return Boons;
    }

    public void setBoons(List boons) {
        Boons = boons;
    }
}


