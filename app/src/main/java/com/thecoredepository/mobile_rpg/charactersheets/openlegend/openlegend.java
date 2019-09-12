package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

/* This class contains the player's character sheet.
// All of the player's values are stored here and should
// be saved often reduce the chance of lost data.
*/

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class openlegend
{
    //Values from the Open Legend Character Sheet
    private String playerName;
    private String charName;
    private String nickname;
    private int majorLvl;
    private int minorLvl;
    private int levelTotal;
    private String deity;

    private String[] languages = new String[10];
    private String bio;

    //Attributes
    private int attributePointsAvalible = 0;
    private int getAttributePointsUsed = 0;
    //PHYSICAL ATTRIBUTES
    private int agility = 0;
    private int fortitude = 0;
    private int might = 0;
    //MENTAL ATTRIBUTES
    private int learning = 0;
    private int logic = 0;
    private int perception = 0;
    private int will = 0;
    //SOCIAL ATTRIBUTES
    private int deception = 0;
    private int persuasion = 0;
    private int presence = 0;
    //EXTRAORDINARY ATTRIBUTES
    private int alteration = 0;
    private int creation = 0;
    private int energy = 0;
    private int entropy = 0;
    private int influence = 0;
    private int movement = 0;
    private int prescience = 0;
    private int protection = 0;

    //Stats
    private int toughness;
    private int guard;
    private int armor;
    private int resolve;
    private int hitpoints;
    private int damageTaken;
    private int speed;

    //Feats
    private int featPointsAvailable;
    private int featPointsUsed;

    //Perks/Flaws
    private String[] perks = new String[2];
    private String[] flaws = new String[2];

    //Inventory
    //Might use class for inventory
    //inventoryOL inventory = new inventoryOL();
    //Or just keep the values here
    private int inventorySize;
    private List items = new ArrayList<String>();
    private List itemInfo = new ArrayList<String>();
    private int wealth;

    //Banes/Boons
    private List Banes = new ArrayList<String>();
    private List Boons = new ArrayList<String>();

    //Define Player
    public static List<openlegend> sheets = new ArrayList<openlegend>();
    public static List<String> sheetList = new ArrayList<String>();
    public static openlegend player = new openlegend();

    //Getters and Setters


    @Override
    public String toString() {
        return "openlegend{" +
                "playerName='" + playerName + '\'' +
                ", charName='" + charName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", majorLvl=" + majorLvl +
                ", minorLvl=" + minorLvl +
                ", levelTotal=" + levelTotal +
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
                ", damageTaken=" + damageTaken +
                ", speed=" + speed +
                ", featPointsAvailable=" + featPointsAvailable +
                ", featPointsUsed=" + featPointsUsed +
                ", perks=" + Arrays.toString(perks) +
                ", flaws=" + Arrays.toString(flaws) +
                ", inventorySize=" + inventorySize +
                ", items=" + items +
                ", itemInfo=" + itemInfo +
                ", wealth=" + wealth +
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

    public int getLevelTotal()
    {
        return levelTotal;
    }

    public void setLevelTotal(int levelTotal)
    {
        this.levelTotal = levelTotal;
    }

    public void setLevel()
    {
        int Level = getLevelTotal();
        int RemainingXP = Level;
        int MajorLvl = 1;
        int MinorLvl = 0;
        int XPtoLevel = 3;

        while (RemainingXP > 0)
        {
            MinorLvl += 1;
            RemainingXP -= 1;
            if (MinorLvl == XPtoLevel)
            {
                MinorLvl = 0;
                MajorLvl += 1;
            }
        }

        setMajorLvl(MajorLvl);
        setMinorLvl(MinorLvl);
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

    public void addLanguages(String languages, int location) {
        this.languages[location] = languages;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAttributePointsAvailable() {
        return attributePointsAvalible;
    }

    public void setAttributePointsAvailable(String type) {
        if (type.equals("pc"))
        {
            this.attributePointsAvalible = (40 + (getLevelTotal() * 3));
        }
        else if (type.equals("ccI") || type.equals("ccII"))
        {
            this.attributePointsAvalible = (20 + (getLevelTotal() * 3));
        }
        else if (type.equals("ccIII"))
        {
            this.attributePointsAvalible = (30 + (getLevelTotal() * 3));
        }
        else
        {
            this.attributePointsAvalible = 0;
        }
    }

    public int getGetAttributePointsUsed() {
        return getAttributePointsUsed;
    }

    public void setGetAttributePointsUsed() {
        int points = 0;

        points += attributeCounter(getAgility());
        points += attributeCounter(getFortitude());
        points += attributeCounter(getMight());
        points += attributeCounter(getLearning());
        points += attributeCounter(getLogic());
        points += attributeCounter(getPerception());
        points += attributeCounter(getWill());
        points += attributeCounter(getDeception());
        points += attributeCounter(getPersuasion());
        points += attributeCounter(getPresence());
        points += attributeCounter(getAlteration());
        points += attributeCounter(getCreation());
        points += attributeCounter(getEnergy());
        points += attributeCounter(getEntropy());
        points += attributeCounter(getInfluence());
        points += attributeCounter(getMovement());
        points += attributeCounter(getPrescience());
        points += attributeCounter(getProtection());

        this.getAttributePointsUsed = points;
    }

    public int attributeCounter(int attribute)
    {
        int points = 0;
        points = ((attribute*(attribute+1))/2);
        Log.i("Attributes", "Points = " + points);
        return points;
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

    public void setGuard(int armor) {
        this.guard = (10 + agility + might + armor);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve() {
        this.resolve = (10 + presence + will);
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints() {
        this.hitpoints = ((2 * (fortitude + presence + will)) + 10);
    }

    public int getDamageTaken() {
        return (hitpoints - damageTaken);
    }

    public void setDamageTaken() {
        this.damageTaken = 0;
    }

    public void setDamageTaken(int damage) {
        this.damageTaken = this.damageTaken + damage;
    }

    public void damagedHealed(int heal)
    {
        this.damageTaken = this.damageTaken - heal;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFeatPointsAvailable() {
        return featPointsAvailable;
    }

    public void setFeatPointsAvailable() {
        this.featPointsAvailable = (6 + (minorLvl * 2) + (majorLvl * 2));
    }

    public int getFeatPointsUsed() {
        return featPointsUsed;
    }

    public void setFeatPointsUsed() {
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

    public List getAllItems() {
        return items;
    }

    public List getAllItemInfo() {
        return itemInfo;
    }

    public String getItemAt(int index)
    {
        return (String) this.items.get(index);
    }

    public String getItemInfoAt(int index)
    {
        return (String) this.itemInfo.get(index);
    }

    public void setItems(List items) {
        this.items = items;
    }

    public void setItemInfo(List itemInfo) {
        this.itemInfo = itemInfo;
    }

    public void addItem(String item, String itemInfo)
    {
        this. items.add(item);
        this.itemInfo.add(itemInfo);
        this.inventorySize += 1;
    }

    public void removeItem(String item)
    {
        //Remove item and description at same index
        int index = items.indexOf(item);
        this.items.remove(index);
        this.itemInfo.remove(index);
        this.inventorySize -= 1;
    }

    public String inventoryToString()
    {
        return "Inventory - {" +
            "Inventory=" + Arrays.toString(items.toArray())
                + "\nItem Info=" + Arrays.toString(itemInfo.toArray()) + "}";
    }

    public int getWealth()
    {
        return this.wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public void addWealth()
    {
        this.wealth = wealth += 1;
    }

    public void removeWealth()
    {
        this.wealth = wealth -= 1;
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

    public void setStats()
    {
        //This calculates values that aren't directly input.
        setToughness();
        setGuard(getArmor());
        setResolve();
        setHitpoints();
        setLevel();
    }

    public void generateRandomCharacter()
    {
        setPlayerName("Test Player");
        setCharName("Test Hero");
        setNickname("Hero");
        setMajorLvl(1);
        setMinorLvl(5);
        setDeity("Coder Lord");

        addLanguages("Basic", 0);
        setBio("Precoded Bio Here");

        setAgility(3);
        setFortitude(3);
        setMight(3);
        setLearning(3);
        setLogic(3);
        setPerception(2);
        setWill(2);
        setDeception(2);
        setPersuasion(1);

        setAttributePointsAvailable("pc");
        setGetAttributePointsUsed();
        setFeatPointsAvailable();
        setFeatPointsUsed();

        /*
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

         */
    }
}


