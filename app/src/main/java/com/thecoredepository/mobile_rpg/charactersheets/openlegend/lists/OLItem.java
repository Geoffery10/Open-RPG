package com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists;

public class OLItem
{
    private String title; //What it is called
    private String description; //What is the item
    private int quantity; //How many of said item
    private  String type; //Weapon, Armor, Item, Other
    private int diceType; //d20, d12, d6
    private int diceQuantity; // 5 dice, 3 dice, 1 dice

    public OLItem()
    {
        setTitle("TEMP");
        setDescription("This Item has no info.");
        setQuantity(1);
        setType("Other");
        setDiceType(0);
        setDiceQuantity(0);
    }

    public OLItem(String title, String description, int quantity, String type)
    {
        setTitle(title);
        setDescription(description);
        setQuantity(quantity);
        setType(type);
        setDiceType(0);
        setDiceQuantity(0);
    }

    public OLItem(String title, String description, int quantity, int diceType, int diceQuantity, String type)
    {
        setTitle(title);
        setDescription(description);
        setQuantity(quantity);
        setType(type);
        setDiceType(diceType);
        setDiceQuantity(diceQuantity);
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
        if (!(type.equals("Weapon") || type.equals("Armor") || type.equals("Item") || type.equals("Other"))) {
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

    @Override
    public String toString() {
        return "OLItem{" +
                "\ntitle='" + title + '\'' +
                ", \ndescription='" + description + '\'' +
                ", \nquantity=" + quantity +
                ", \ndiceType=" + diceType +
                ", \ndiceQuantity=" + diceQuantity +
                "\n}";
    }
}
