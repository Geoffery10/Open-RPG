package com.thecoredepository.mobile_rpg.dice;

public class dice
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
}
