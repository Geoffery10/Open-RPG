package com.thecoredepository.mobile_rpg.backend;

/* This object class dictates the behaviors and traits of Dice.
*  Dice are able to explode when rolled to their max value. This means they can roll an additional
*  dice of that same value.
*/

public class Dice
{
    public static int d2()
    {
        return (int)(Math.random()*2) + 1;
    }
    public static int d4()
    {
        return (int)(Math.random()*4) + 1;
    }
    public static int d6()
    {
        return (int)(Math.random()*6) + 1;
    }
    public static int d8()
    {
        return (int)(Math.random()*8) + 1;
    }
    public static int d10()
    {
        return (int)(Math.random()*10) + 1;
    }
    public static int d20()
    {
        return (int)(Math.random()*20) + 1;
    }
    public static int custom(int custom)
    {
        return (int)((Math.random()*custom)+1);
    }
    
    public static int roll(int numOfDice, int valueOfDice)
    {
        int result = 0;
        for(int i = 0; i <= numOfDice; i++)
        {
            result += custom(valueOfDice);
        }
        return result;
    }

    //Changes attribute score to Dice string
    public static String attributeToDice(int attribute)
    {
        if (attribute == 1){
            return "1d4";
        }
        else if (attribute == 2){
            return "1d6";
        }
        else if (attribute == 3){
            return "1d8";
        }
        else if (attribute == 4){
            return "1d10";
        }
        else if (attribute == 5){
            return "2d6";
        }
        else if (attribute == 6){
            return "2d8";
        }
        else if (attribute == 7){
            return "2d10";
        }
        else if (attribute == 8){
            return "3d8";
        }
        else if (attribute == 9){
            return "3d10";
        }
        else if (attribute == 10){
            return "4d8";
        }
        else {
            return "NULL";
        }
    }
}
