package com.thecoredepository.mobile_rpg.backend.lists;

import java.util.Comparator;

public class OLItem
{
    private String title; //What it is called
    private String description; //What is the item
    private int quantity; //How many of said item
    private  String type; //Weapon, Armor, Item, Other
    private int diceType; //d20, d12, d6
    private int diceQuantity; // 5 Dice, 3 Dice, 1 Dice

    public OLItem()
    {
        this.title = "TEMP";
        this.description = "This Item has no info.";
        this.quantity = 1;
        this.type = "Other";
        this.diceType = 0;
        this.diceQuantity = 0;
    }

    public OLItem(String title, String description, int quantity, String type)
    {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.type = type;
        this.diceType = 0;
        this.diceQuantity = 0;
    }

    public OLItem(String title, String description, int quantity, int diceType, int diceQuantity, String type) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.type = type;
        this.diceType = diceType;
        this.diceQuantity = diceQuantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!(type.equals("Weapon") || type.equals("Armor") || type.equals("Item") || type.equals("Potion"))) {
            type = "Other";
        }
        this.type = type;
    }

    public int getDiceType() {
        return diceType;
    }

    public void setDiceType(int diceType) {
        this.diceType = diceType;
    }

    public int getDiceQuantity() {
        return diceQuantity;
    }

    public void setDiceQuantity(int diceQuantity) {
        this.diceQuantity = diceQuantity;
    }

    public static Comparator<OLItem> itemComparator = new Comparator<OLItem>() {

        public int compare(OLItem item_1, OLItem item_2) {
            String title_01 = item_1.getTitle().toUpperCase();
            String title_02 = item_2.getTitle().toUpperCase();

            //ascending order
            return title_01.compareTo(title_02);
        }};
    
    @Override
    public String toString() {
        return "OLItem{" +
                "\ntitle='" + title + '\'' +
                ", \ndescription='" + description + '\'' +
                ", \nquantity=" + quantity +
                ", \ntype=" + type +
                ", \ndiceType=" + diceType +
                ", \ndiceQuantity=" + diceQuantity +
                "\n}";
    }
}
