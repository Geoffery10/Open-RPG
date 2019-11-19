package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

/* This class contains the player's character sheet.
// All of the player's values are stored here and should
// be saved often reduce the chance of lost data.
*/

import android.util.Log;

import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLBanes;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLBoons;
import com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists.OLFeats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class openlegend
{
    //Values from the Open Legend Character Sheet
    private String playerName;
    private String type;
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
	private int lethalDamage;

    //Feats
    private int featPointsAvailable;
    private int featPointsUsed;
    private ArrayList<OLFeats> feats = new ArrayList<>();

    //Perks/Flaws
    private String[] perks = new String[2];
    private String[] flaws = new String[2];

    //Inventory
    //Might use class for inventory
    //inventoryOL inventory = new inventoryOL();
    //Or just keep the values here
    private int inventorySize;
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<String> itemInfo = new ArrayList<String>();
    private int wealth;

    //Banes/Boons
    private ArrayList<OLBanes> banes = new ArrayList<>();
    private ArrayList<OLBoons> boons = new ArrayList<>();
    private ArrayList Banes = new ArrayList<String>();
    private ArrayList Boons = new ArrayList<String>();

    //ArrayLists
    private ArrayList AllBanes = new ArrayList<String>();
    private ArrayList AllBoons = new ArrayList<String>();

    private ArrayList AvailableBanes = new ArrayList<String>();
    private ArrayList AvailableBoons = new ArrayList<String>();

    private ArrayList AvailableWeaponAttackTypes = new ArrayList<String>();
    private ArrayList Attributes = new ArrayList<String>();
    private ArrayList AttackTypes = new ArrayList<String>();


    //Define Player
    public static ArrayList<openlegend> sheets = new ArrayList<openlegend>(); //Sheets
    public static ArrayList<String> sheetList = new ArrayList<String>(); //List of Sheet Names
    public static openlegend player = new openlegend(); //Current Sheets

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
	
	public int getlLethalDamage() {
		return lethalDamage;
	}
	
	public void setLethalDamage() {
		this.lethalDamage = 0;
	}
	
	public void setLethalDamage(int lethalDamage) {
		if (lethalDamage >= 0) {
			this.lethalDamage = 0;
		}
		else if (lethalDamage > getHitpoints()){
			this.lethalDamage += lethalDamage;
		}
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

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return this.type;
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

        majorLvl = levelTotal / 3 + 1;
        minorLvl = levelTotal % 3;

        Log.i("Level", "Major - " + majorLvl);
        Log.i("Level", "Minor - " + minorLvl);
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

    public String getLanguage(int index) {
        return languages[index];
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setLanguage(String language, int index) {
        this.languages[index] = language;
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
        if (agility >= 0) {
            this.agility = agility;
        }
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        if (fortitude >= 0) {
            this.fortitude = fortitude;
        }
    }

    public int getMight() {
        return might;
    }

    public void setMight(int might) {
        if (might >= 0) {
            this.might = might;
        }
    }

    public int getLearning() {
        return learning;
    }

    public void setLearning(int learning) {
        if (learning >= 0) {
            this.learning = learning;
        }
    }

    public int getLogic() {
        return logic;
    }

    public void setLogic(int logic) {
        if (logic >= 0) {
            this.logic = logic;
        }
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        if (perception >= 0) {
            this.perception = perception;
        }
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        if (will >= 0) {
            this.will = will;
        }
    }

    public int getDeception() {
        return deception;
    }

    public void setDeception(int deception) {
        if (deception >= 0) {
            this.deception = deception;
        }
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        if (persuasion >= 0) {
            this.persuasion = persuasion;
        }
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        if (presence >= 0) {
            this.presence = presence;
        }
    }

    public int getAlteration() {
        return alteration;
    }

    public void setAlteration(int alteration) {
        if (alteration >= 0) {
            this.alteration = alteration;
        }
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        if (creation >= 0) {
            this.creation = creation;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy >= 0) {
            this.energy = energy;
        }
    }

    public int getEntropy() {
        return entropy;
    }

    public void setEntropy(int entropy) {
        if (entropy >= 0) {
            this.entropy = entropy;
        }
    }

    public int getInfluence() {
        return influence;
    }

    public void setInfluence(int influence) {
        if (influence >= 0) {
            this.influence = influence;
        }
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        if (movement >= 0) {
            this.movement = movement;
        }
    }

    public int getPrescience() {
        return prescience;
    }

    public void setPrescience(int prescience) {
        if (prescience >= 0) {
            this.prescience = prescience;
        }
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        if (protection >= 0) {
            this.protection = protection;
        }
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
        this.hitpoints = ((2 * (fortitude + presence + will)) + 10 - this.lethalDamage);
    }


    public int getDamageTaken() {
        return (hitpoints - damageTaken);
    }

    public void setDamageTaken() {
        this.damageTaken = this.hitpoints;
    }

    public void setDamageTaken(int damage) {
        this.damageTaken = this.damageTaken + damage;
    }

    public void setDamagedHealed(int heal)
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
        if (type.equals("pc")) {
            this.featPointsAvailable = (6 + levelTotal);
        }
        else if (type.equals("ccII") || type.equals("ccIII")) {
            this.featPointsAvailable = 3;
        }
        else {
            this.featPointsAvailable = 0;
        }

    }

    public int getFeatPointsUsed() {
        return featPointsUsed;
    }

    public void setFeatPointsUsed() {
        int used = 0;
        Iterator<OLFeats> iterator = feats.iterator();
        while (iterator.hasNext()) {
            OLFeats feat = iterator.next();
            used += feat.getLevel() * feat.getFeatCost();
        }
        this.featPointsUsed = used;
    }

    public ArrayList<OLFeats> getFeats() {
        return feats;
    }

    public OLFeats getFeat(int index) {
        return feats.get(index);
    }

    public int getFeatIndex(OLFeats feat) {
        int index = 0;
        if (feats.contains(feat)) {
            index = feats.indexOf(feat);
        }
        else {
            Log.d("getFeatIndex", "Feat not found");
        }
        return index;
    }

    public int getFeatLevel(OLFeats feat)
    {
        int index;
        int level = 0;
        if (feats.contains(feat)) {
            index = feats.indexOf(feat);
            feat = (feats.get(index));
            level = feat.getLevel();
        }
        else {
            Log.d("getFeatLevel", "Feat not found");
        }
        return level;
    }

    public int getFeatCount() {
        return feats.size();
    }

    public String getFeatsList() {
        String featsStringList = "";
        Log.i("Feats", "Running getFeatsList()");
        Iterator<OLFeats> iterator = feats.iterator();
        while (iterator.hasNext()) {
            OLFeats feat = iterator.next();
            Log.i("Feats", feat.getTitle());
            if (feat.getConnection() != null)
            {
                featsStringList += feat.getTitle() + " " + feat.getLevel() + " - " + feat.getConnection() + "\n";
            }
            else
            {
                featsStringList += feat.getTitle() + " " + feat.getLevel() + "\n";
            }
        }
        return featsStringList;
    }

    public ArrayList<String> getFeatConnections() {
        //THIS MIGHT BE OBSOLETE
        ArrayList<String> featConnections = new ArrayList<>();
        Iterator<OLFeats> iterator = feats.iterator();
        while (iterator.hasNext()) {
            OLFeats feat = iterator.next();
            Log.i("Feats", feat.getTitle());
            if (feat.getConnection() != null)
            {
                featConnections.add(feat.getConnection());
            }
        }
        return featConnections;
    }

    public ArrayList<String> getFeatConnectionsBoons() {
        //THIS MIGHT BE OBSOLETE
        ArrayList<String> featConnections = new ArrayList<>();
        featConnections = AllBanes;
        return featConnections;
    }

    public void addFeat(OLFeats feat) {
        this.feats.add(feat);
    }

    public void removeFeat(OLFeats feat) {
        int index;
        if (feats.contains(feat)) {
            index = feats.indexOf(feat);
            feats.remove(index);
        }
        else {
            Log.d("removeFeat", "Feat not found");
        }
    }

    public void setFeats(ArrayList<OLFeats> feats) {
        this.feats = feats;
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

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public void setItemInfo(ArrayList<String> itemInfo) {
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

    public ArrayList getBanes() {
        return Banes;
    }

    public void setAllBanes() {
        Log.i("Setting Banes/Boons", "Setting Banes");
        AllBanes.clear();
        AllBanes.add("Blinded");
        AllBanes.add("Charmed");
        AllBanes.add("Deafened");
        AllBanes.add("Death");
        AllBanes.add("Demoralized");
        AllBanes.add("Disarmed");
        AllBanes.add("Dominated");
        AllBanes.add("Fatigued");
        AllBanes.add("Fear");
        AllBanes.add("Forced Move");
        AllBanes.add("Immobile");
        AllBanes.add("Incapacitated");
        AllBanes.add("Knockdown");
        AllBanes.add("Memory Alteration");
        AllBanes.add("Mind Dredge");
        AllBanes.add("Nullify");
        AllBanes.add("Persistent Damage");
        AllBanes.add("Phantasm");
        AllBanes.add("Polymorph");
        AllBanes.add("Provoked");
        AllBanes.add("Spying");
        AllBanes.add("Sickened");
        AllBanes.add("Silenced");
        AllBanes.add("Slowed");
        AllBanes.add("Stunned");
        AllBanes.add("Stupefied");
        AllBanes.add("Charmed");
        AllBanes.add("Truthfulness");
    }

    public void setAvaliableBanes() {
        Log.i("Setting Banes/Boons", "Setting Banes");
        AvailableBanes.clear();
        if(alteration >= 5 || creation >= 5 || energy >= 5 || entropy >= 5) {
            AvailableBanes.add("Blinded");
        }
        if(influence >= 3) {
            AvailableBanes.add("Charmed");
        }
        if(agility >= 4 || energy >= 4 || entropy >= 4) {
            AvailableBanes.add("Deafened");
        }
        if(agility >= 9 || entropy >= 9) {
            AvailableBanes.add("Death");
        }
        if(agility >= 3 || energy >= 3 || entropy >= 3 || influence >= 3 || might >= 3 || persuasion >= 3 || presence >= 3) {
            AvailableBanes.add("Demoralized");
        }
        if(agility >= 3 || alteration >= 3 || energy >= 3 || entropy >= 3 || influence >= 3 || might >= 3 || movement >= 3) {
            AvailableBanes.add("Disarmed");
        }
        if(influence >= 5) {
            AvailableBanes.add("Dominated");
        }
        if(entropy >= 5) {
            AvailableBanes.add("Fatigued");
        }
        if(creation >= 5 || entropy >= 5 || influence >= 5 || might >= 5) {
            AvailableBanes.add("Fear");
        }
        if(agility >= 2 || energy >= 2 || might >= 2 || movement >= 2) {
            AvailableBanes.add("Forced Move");
        }
        if(agility >= 1 || alteration >= 1 || creation >= 1 || energy >= 1 || entropy >= 1 || influence >= 1 || might >= 1 || movement >= 1) {
            AvailableBanes.add("Immobile");
        }
        if(agility >= 5 || entropy >= 5 || influence >= 5) {
            AvailableBanes.add("Incapacitated");
        }
        if(agility >= 1 || energy >= 1 || might >= 1 || movement >= 1) {
            AvailableBanes.add("Knockdown");
        }
        if(influence >= 5) {
            AvailableBanes.add("Memory Alteration");
        }
        if(prescience >= 2) {
            AvailableBanes.add("Mind Dredge");
        }
        if(protection >= 1) {
            AvailableBanes.add("Nullify");
        }
        if(agility >= 2 || energy >= 2 || entropy >= 2) {
            AvailableBanes.add("Persistent Damage");
        }
        if(influence >= 1) {
            AvailableBanes.add("Phantasm");
        }
        if(alteration >= 5) {
            AvailableBanes.add("Polymorph");
        }
        if(agility >= 4 || creation >= 4 || deception >= 4 || energy >= 4 || influence >= 4 || might >= 4 || persuasion >= 4 || prescience >= 4) {
            AvailableBanes.add("Provoked");
        }
        if(prescience >= 5) {
            AvailableBanes.add("Spying");
        }
        if(entropy >= 5) {
            AvailableBanes.add("Sickened");
        }
        if(agility >= 2 || alteration >= 2 || entropy >= 2 || might >= 2) {
            AvailableBanes.add("Silenced");
        }
        if(agility >= 1 || energy >= 1 || entropy >= 1 || might >= 1 || movement >= 1) {
            AvailableBanes.add("Slowed");
        }
        if(agility >= 4 || energy >= 4 || entropy >= 4 || might >= 4) {
            AvailableBanes.add("Stunned");
        }
        if(influence >= 7) {
            AvailableBanes.add("Stupefied");
        }
        if(influence >= 5) {
            AvailableBanes.add("Truthfulness");
        }
    }

    public ArrayList<String> getAllBanes() {
        return AllBanes;
    }

    public ArrayList<String> getAvailableBanes() {
        return AvailableBanes;
    }

    public void setAllBoons() {
        Log.i("Setting Banes/Boons", "Setting Boons");
        AllBoons.clear();
        AllBoons.add("Absorb Object");
        AllBoons.add("Animation");
        AllBoons.add("Aura");
        AllBoons.add("Barrier");
        AllBoons.add("Blindsight");
        AllBoons.add("Bolster");
        AllBoons.add("Darkness");
        AllBoons.add("Detection");
        AllBoons.add("Flight");
        AllBoons.add("Genesis");
        AllBoons.add("Haste");
        AllBoons.add("Heal");
        AllBoons.add("Insubstantial");
        AllBoons.add("Invisible");
        AllBoons.add("Life Drain");
        AllBoons.add("Light");
        AllBoons.add("Precognition");
        AllBoons.add("Reading");
        AllBoons.add("Regeneration");
        AllBoons.add("Resistance");
        AllBoons.add("Restoration");
        AllBoons.add("Seeing");
        AllBoons.add("Shapeshift");
        AllBoons.add("Summon Creature");
        AllBoons.add("Sustenance");
        AllBoons.add("Telekinesis");
        AllBoons.add("Telepathy");
        AllBoons.add("Teleport");
        AllBoons.add("Tongues");
        AllBoons.add("Transmutation");
        AllBoons.add("Truesight");
    }

    public void setAvaliableBoons() {
        Log.i("Setting Banes/Boons", "Setting Boons");
        AvailableBoons.clear();
        AvailableBoons.add("Absorb Object");
        AvailableBoons.add("Animation");
        AvailableBoons.add("Aura");
        AvailableBoons.add("Barrier");
        AvailableBoons.add("Blindsight");
        AvailableBoons.add("Bolster");
        AvailableBoons.add("Darkness");
        AvailableBoons.add("Detection");
        AvailableBoons.add("Flight");
        AvailableBoons.add("Genesis");
        AvailableBoons.add("Haste");
        AvailableBoons.add("Heal");
        AvailableBoons.add("Insubstantial");
        AvailableBoons.add("Invisible");
        AvailableBoons.add("Life Drain");
        AvailableBoons.add("Light");
        AvailableBoons.add("Precognition");
        AvailableBoons.add("Reading");
        AvailableBoons.add("Regeneration");
        AvailableBoons.add("Resistance");
        AvailableBoons.add("Restoration");
        AvailableBoons.add("Seeing");
        AvailableBoons.add("Shapeshift");
        AvailableBoons.add("Summon Creature");
        AvailableBoons.add("Sustenance");
        AvailableBoons.add("Telekinesis");
        AvailableBoons.add("Telepathy");
        AvailableBoons.add("Teleport");
        AvailableBoons.add("Tongues");
        AvailableBoons.add("Transmutation");
        AvailableBoons.add("Truesight");
    }

    public ArrayList<String> getAllBoons() {
        return AllBoons;
    }

    public void setBanes(ArrayList banes) {
        Banes = banes;
    }

    public ArrayList getBoons() {
        return Boons;
    }

    public void setBoons(ArrayList boons) {
        Boons = boons;
    }

    public ArrayList getAvailableWeaponAttackTypes() {
        return AvailableWeaponAttackTypes;
    }

    public void setAvailableWeaponAttackTypes(ArrayList availableWeaponAttackTypes) {
        AvailableWeaponAttackTypes = availableWeaponAttackTypes;
    }

    public ArrayList getAttributes() {
        return Attributes;
    }

    public void setAttributes(ArrayList attributes) {
        Attributes = attributes;
    }

    public ArrayList getAttackTypes() {
        return AttackTypes;
    }

    public void setAttackTypes(ArrayList attackTypes) {
        AttackTypes = attackTypes;
    }

    public static ArrayList<openlegend> getSheets() {
        return sheets;
    }

    public static void setSheets(ArrayList<openlegend> sheets) {
        openlegend.sheets = sheets;
    }

    public static ArrayList<String> getSheetList() {
        return sheetList;
    }

    public static void setSheetList(ArrayList<String> sheetList) {
        openlegend.sheetList = sheetList;
    }

    public void setStats()
    {
        //This calculates values that aren't directly input.
        setToughness();
        setGuard(getArmor());
        setResolve();
        setHitpoints();
        setDamageTaken(0);
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

    public openlegend loadCharacterSheet(String selected)
    {
        player = sheets.get(sheetList.indexOf(selected));
        return player;
    }

    public void newCharacter(String playerName, String type, String charName, String nickname, int majorLvl, int minorLvl, int levelTotal, String deity, String[] languages, String bio, int attributePointsAvalible, int getAttributePointsUsed, int agility, int fortitude, int might, int learning, int logic, int perception, int will, int deception, int persuasion, int presence, int alteration, int creation, int energy, int entropy, int influence, int movement, int prescience, int protection, int toughness, int guard, int armor, int resolve, int hitpoints, int damageTaken, int speed, int featPointsAvailable, int featPointsUsed, String[] perks, String[] flaws, int inventorySize, ArrayList items, ArrayList itemInfo, int wealth, ArrayList banes, ArrayList boons) {
        openlegend newChar = new openlegend();

        newChar.playerName = playerName;
        newChar.type = type;
        newChar.charName = charName;
        newChar.nickname = nickname;
        newChar.majorLvl = getMajorLvl();
        newChar.minorLvl = getMinorLvl();
        newChar.levelTotal = levelTotal;
        newChar.deity = deity;
        newChar.languages = languages;
        newChar.bio = bio;
        newChar.getAttributePointsUsed = getAttributePointsUsed;
        setAttributePointsAvailable(type);
        newChar.agility = agility;
        newChar.fortitude = fortitude;
        newChar.might = might;
        newChar.learning = learning;
        newChar.logic = logic;
        newChar.perception = perception;
        newChar.will = will;
        newChar.deception = deception;
        newChar.persuasion = persuasion;
        newChar.presence = presence;
        newChar.alteration = alteration;
        newChar.creation = creation;
        newChar.energy = energy;
        newChar.entropy = entropy;
        newChar.influence = influence;
        newChar.movement = movement;
        newChar.prescience = prescience;
        newChar.protection = protection;
        newChar.toughness = toughness;
        newChar.guard = guard;
        newChar.armor = armor;
        newChar.resolve = resolve;
        newChar.hitpoints = hitpoints;
        newChar.damageTaken = damageTaken;
        newChar.speed = speed;
        newChar.featPointsAvailable = featPointsAvailable;
        newChar.featPointsUsed = featPointsUsed;
        newChar.perks = perks;
        newChar.flaws = flaws;
        newChar.inventorySize = inventorySize;
        newChar.items = items;
        newChar.itemInfo = itemInfo;
        newChar.wealth = wealth;
        Banes = banes;
        Boons = boons;

        if (sheetList.contains(newChar.getCharName()) == false)
        {
            sheetList.add(newChar.getCharName());
            sheets.add(newChar);
            Log.i("Sheets", "Character Created");
        }
        else
        {
            Log.i("Sheets", "Character Already Exists");
        }
    }

    public static void HARDCODEDSHEETS()
    {

        if (sheetList.contains("Tazmur") == false)
        {
            openlegend tazmur = new openlegend();
            tazmur.setType("pc");
            tazmur.setCharName("Tazmur");
            tazmur.setNickname("Taz");
            tazmur.setDeity("Kalle Demos");
            String[] lang = new String[10];
            lang[0] = "Gerudo";
            lang[1] = "Hylian";
            lang[2] = "Sheikah";
            tazmur.setLanguages(lang);
            tazmur.setBio("Possibly an evil male Gerudo who wanders the land lacking any real home. In his travels he befriended an extremely magical cat named Noujou. It’s possible he has evil goals in life but he’s pretty chill. ");
            tazmur.setFortitude(3);
            tazmur.setPresence(2);
            tazmur.setPerception(2);
            tazmur.setAlteration(7);
            tazmur.setMovement(4);
            tazmur.setEnergy(5);
            tazmur.setAgility(2);
            tazmur.setLearning(2);
            tazmur.setWill(2);
            tazmur.setArmor(1);
            tazmur.setLevelTotal(12);
            tazmur.setSpeed(30);

            tazmur.setStats();
            tazmur.setGetAttributePointsUsed();
            tazmur.setAttributePointsAvailable(tazmur.getType());

            tazmur.setWealth(3);
            tazmur.addItem("Leather Armor", "(+1 Guard)");
            tazmur.addItem("Dagger", "Agility v. Guard - (Advantage 1 & Initiative + 1)");
            tazmur.addItem("Dagger", "Agility v. Guard - (Advantage 1 & Initiative + 1)");
            tazmur.addItem("Bow", "Agility v. Guard - Range 125ft");
            tazmur.addItem("Creature Book", "Advantage on Creature Knowledge");
            tazmur.addItem("Mask Collection (10)", "Collection of Masks from the Happy Mask Sales Men");
            tazmur.addItem("Magic Pearl", "Magic Peal with the power to stop the transformitive effects of the Dark World");

            if (tazmur.getType().equals("pc") || tazmur.getType().equals("ccII") || tazmur.getType().equals("ccIII"))
            {
                Log.i("Feats", "Adding Feats");
                Iterator<OLFeats> iterator = OLFeats.featList.iterator();
                while (iterator.hasNext()) {
                    OLFeats feat = iterator.next();
                    if (feat.getTitle().equals("Superior Concentration")) {
                        feat.setLevel(1);
                        tazmur.feats.add(feat.copyFeat());
                        Log.i("Feats", "added Superior Concentration");
                    }
                    if (feat.getTitle().equals("Boon Focus")) {
                        feat.setLevel(1);
                        feat.setConnection("Aura");
                        tazmur.feats.add(feat.copyFeat());
                        Log.i("Feats", "added Boon Focus - Aura");
                    }
                    if (feat.getTitle().equals("Boon Focus")) {
                        feat.setLevel(1);
                        feat.setConnection("Invisible");
                        tazmur.feats.add(feat.copyFeat());
                        Log.i("Feats", "added Boon Focus - Invisible");
                    }
                    if (feat.getTitle().equals("Boon Focus")) {
                        feat.setLevel(1);
                        feat.setConnection("Haste");
                        tazmur.feats.add(feat.copyFeat());
                        Log.i("Feats", "added Boon Focus - Haste");
                    }
                    if (feat.getTitle().equals("Companion")) {
                        feat.setLevel(3);
                        feat.setConnection("Nightmare");
                        tazmur.feats.add(feat.copyFeat());
                        Log.i("Feats", "added Companion");
                    }
                }
            }
            sheetList.add(tazmur.getCharName());
            sheets.add(tazmur);
        }

        //==========================================================================================

        if (sheetList.contains("Nightmare") == false)
        {
            openlegend nightmare = new openlegend();
            nightmare.setType("ccIII");
            nightmare.setCharName("Nightmare");
            nightmare.setNickname("Spirit");
            nightmare.setDeity("Kalle Demos");
            String[] lang = new String[10];
            lang[0] = "Gerudo";
            lang[1] = "Hylian";
            lang[2] = "Demon";
            nightmare.setLanguages(lang);
            nightmare.setBio("A flamboyant, seemingly calm, overconfident opponent whose only goal is to revive Demise, his master. His spirit is bound to Tazmur and is unable to leave him.");
            nightmare.setEntropy(6);
            nightmare.setAlteration(5);
            nightmare.setProtection(7);
            nightmare.setLevelTotal(12);
            nightmare.setSpeed(0);

            nightmare.setStats();
            nightmare.setGetAttributePointsUsed();
            nightmare.setAttributePointsAvailable(nightmare.getType());

            if (nightmare.getType().equals("pc") || nightmare.getType().equals("ccII") || nightmare.getType().equals("ccIII"))
            {
                Iterator<OLFeats> iterator = OLFeats.featList.iterator();
                while (iterator.hasNext()) {
                    OLFeats feat = iterator.next();
                    if (feat.getTitle().equals("Bane Focus")) {
                        feat.setLevel(1);
                        feat.setConnection("Fatigue");
                        nightmare.feats.add(feat.copyFeat());
                    }
                }
            }
            sheetList.add(nightmare.getCharName());
            sheets.add(nightmare);
        }

        //==========================================================================================

        if (sheetList.contains("Mazok") == false)
        {
            openlegend mazok = new openlegend();
            mazok.setType("pc");
            mazok.setCharName("Mazok");
            mazok.setNickname("Maz");
            mazok.setDeity("N/A");
            String[] lang = new String[10];
            lang[0] = "Wild";
            lang[1] = "Hylian";
            lang[2] = "Sheikah";
            mazok.setLanguages(lang);
            mazok.setBio("Born sixteen years ago to a savage Rito tribe, Mazok ran away early in his life.  Since then he met Aderinus, a Labrynnian who saved him from the dark magic of the Lost Woods.  With jet black feathers and pure white eyes, he’s abnormal looking compared to the normally colorful Rito.  As a result, he was the laughing stock of his tribe, which leads to him holding a bitter resentment for them to this day.  He is also slow to trust and not very talkative.");
            mazok.setAgility(6);
            mazok.setMight(7);
            mazok.setPerception(3);
            mazok.setWill(4);
            mazok.setFortitude(3);
            mazok.setPresence(2);
            mazok.setLearning(2);
            mazok.setArmor(1);
            mazok.setLevelTotal(12);
            mazok.setSpeed(30);

            mazok.setStats();
            mazok.setGetAttributePointsUsed();
            mazok.setAttributePointsAvailable(mazok.getType());

            mazok.setWealth(1);

            mazok.addItem("Leather Armor", "(+1 Guard)");
            mazok.addItem("Longbow", "");
            mazok.addItem("Dagger", "Agility v. Guard - (Advantage 1 & Initiative + 1)");
            mazok.addItem("Dagger", "Agility v. Guard - (Advantage 1 & Initiative + 1)");
            mazok.addItem("Rope 50", "");
            mazok.addItem("Lockpicks", "");
            mazok.addItem("Deku Mask", "");

            if (mazok.getType().equals("pc") || mazok.getType().equals("ccII") || mazok.getType().equals("ccIII"))
            {
                Iterator<OLFeats> iterator = OLFeats.featList.iterator();
                while (iterator.hasNext()) {
                    OLFeats feat = iterator.next();
                    if (feat.getTitle().equals("Companion")) {
                        feat.setLevel(3);
                        feat.setConnection("Ookami");
                        mazok.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("Flying")) {
                        feat.setLevel(1);
                        mazok.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("")) {
                        feat.setLevel(1);
                        feat.setConnection("Longshot");
                        mazok.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("Untrackable")) {
                        feat.setLevel(1);
                        mazok.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("Brutal Intimidation")) {
                        feat.setLevel(1);
                        mazok.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("Boon Access")) {
                        feat.setLevel(1);
                        feat.setConnection("Detection");
                        mazok.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("Combat Momentum")) {
                        feat.setLevel(1);
                        mazok.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("Multi-Target Attack Specialist")) {
                        feat.setLevel(1);
                        mazok.feats.add(feat.copyFeat());
                    }
                }
            }
            sheetList.add(mazok.getCharName());
            sheets.add(mazok);
        }


        //==========================================================================================


        if (sheetList.contains("Ookami") == false)
        {
            openlegend ookami = new openlegend();
            ookami.setType("ccIII");
            ookami.setCharName("Ookami");
            ookami.setNickname("");
            ookami.setDeity("Lesser God/Spirit");
            String[] lang = new String[10];
            lang[0] = "Wild";
            ookami.setLanguages(lang);
            ookami.setBio("Ookami is a lesser God/Spirit that aid's Mazok.");
            ookami.setFortitude(6);
            ookami.setPerception(1);
            ookami.setMight(5);
            ookami.setAgility(6);
            ookami.setPresence(1);
            ookami.setWill(1);
            ookami.setArmor(0);
            ookami.setLevelTotal(12);
            ookami.setSpeed(35);

            ookami.setStats();
            ookami.setGetAttributePointsUsed();
            ookami.setAttributePointsAvailable(ookami.getType());

            ookami.setWealth(0);

            if (ookami.getType().equals("pc") || ookami.getType().equals("ccII") || ookami.getType().equals("ccIII"))
            {
                Iterator<OLFeats> iterator = OLFeats.featList.iterator();
                while (iterator.hasNext()) {
                    OLFeats feat = iterator.next();
                    if (feat.getTitle().equals("Fleet of Foot")) {
                        feat.setLevel(1);
                        ookami.feats.add(feat.copyFeat());
                    }
                    if (feat.getTitle().equals("Great Leap")) {
                        feat.setLevel(1);
                        ookami.feats.add(feat.copyFeat());
                    }
                }
            }
            sheetList.add(ookami.getCharName());
            sheets.add(ookami);
        }


        //==========================================================================================


        if (sheetList.contains("Noujou") == false)
        {
            openlegend Noujou = new openlegend();
            Noujou.setType("pc");
            Noujou.setCharName("Noujou");
            Noujou.setNickname("Noujou");
            Noujou.setDeity("Kalle Demos");
            String[] lang = new String[10];
            lang[0] = "Hylian";
            lang[1] = "Sheikah";
            lang[2] = "Fiendish";
            Noujou.setLanguages(lang);
            Noujou.setBio("The demon lords had been slumbering for too long and a few foolish heroes were needed to upset the balance. This unassuming white house cat was set on turning the gears of fate. Passion burns in those sapphire eyes. Black veins of unholy power stir. Hidden below short white fur.");
            Noujou.setAgility(6);
            Noujou.setFortitude(3);
            Noujou.setMight(3);
            Noujou.setPerception(3);
            Noujou.setPresence(3);
            Noujou.setWill(3);
            Noujou.setEntropy(6);
            Noujou.setPersuasion(6);
            Noujou.setDeception(1);
            Noujou.setLogic(1);
            Noujou.setLevelTotal(10);
            Noujou.setSpeed(30);
            Noujou.setArmor(1);

            Noujou.setStats();
            Noujou.setGetAttributePointsUsed();
            Noujou.setAttributePointsAvailable(Noujou.getType());

            Noujou.setWealth(3);

            Noujou.addItem("Claws", "Agility(Entropy) v. Guard");
            Noujou.addItem("Health Potion", "");
            Noujou.addItem("Broad Sword", "Might v. Guard");

            if (Noujou.getType().equals("pc") || Noujou.getType().equals("ccII") || Noujou.getType().equals("ccIII"))
            {
                OLFeats.featList();
            }
            sheetList.add(Noujou.getCharName());
            sheets.add(Noujou);
        }
    }

    public static openlegend blankChar(openlegend blank) {
        blank.playerName = "";
        blank.type = "";
        blank.charName = "";
        blank.nickname = "";
        blank.majorLvl = 0;
        blank.minorLvl = 0;
        blank.levelTotal = 0;
        blank.deity = "";
        for (int i = 0; i < 10; i++)
        {
            blank.setLanguage("", i);
        }
        blank.bio = "";
        blank.attributePointsAvalible = 0;
        blank.getAttributePointsUsed = 0;
        blank.agility = 0;
        blank.fortitude = 0;
        blank.might = 0;
        blank.learning = 0;
        blank.logic = 0;
        blank.perception = 0;
        blank.will = 0;
        blank.deception = 0;
        blank.persuasion = 0;
        blank.presence = 0;
        blank.alteration = 0;
        blank.creation = 0;
        blank.energy = 0;
        blank.entropy = 0;
        blank.influence = 0;
        blank.movement = 0;
        blank.prescience = 0;
        blank.protection = 0;
        blank.toughness = 0;
        blank.guard = 0;
        blank.armor = 0;
        blank.resolve = 0;
        blank.hitpoints = 0;
        blank.damageTaken = 0;
        blank.speed = 0;
        blank.featPointsAvailable = 0;
        blank.featPointsUsed = 0;
        blank.perks = null;
        blank.flaws = null;
        blank.inventorySize = 0;
        blank.items.clear();
        blank.itemInfo.clear();
        blank.wealth = 0;
        blank.Banes.clear();
        blank.Boons.clear();
        return blank;
    }
}


