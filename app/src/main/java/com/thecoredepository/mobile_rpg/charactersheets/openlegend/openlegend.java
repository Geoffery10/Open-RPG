package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

/* This class contains the player's character sheet.
// All of the player's values are stored here and should
// be saved often reduce the chance of lost data.
*/

import java.util.ArrayList;
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

}
