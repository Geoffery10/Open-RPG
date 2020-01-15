package com.thecoredepository.mobile_rpg.charactersheets.openlegend.lists;

public class OLItem
{
    private String title; //What it is called
    private String description; //What is the item
    private int quantity; //How many of said item
    private int diceType; //d20, d12, d6
    private int diceQuantity; // 5 dice, 3 dice, 1 dice

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
        if (diceQuantity < 1) {
            diceQuantity = 1;
        }
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
