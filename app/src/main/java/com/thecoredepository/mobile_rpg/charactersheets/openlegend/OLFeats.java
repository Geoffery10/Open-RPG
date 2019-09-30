package com.thecoredepository.mobile_rpg.charactersheets.openlegend;

import java.util.ArrayList;

public class OLFeats
{
    public static ArrayList<OLFeats> featList = new ArrayList<>();
    private String title;
    private int maxLevel;
    private int level;
    private int featCost;
    private int featCostTotal;
    private String description;
    private String prerequisites;
    private String effects;
    private String special;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFeatCost() {
        return featCost;
    }

    public void setFeatCost(int featCost) {
        this.featCost = featCost;
    }

    public int getFeatCostTotal() {
        return featCostTotal;
    }

    public void setFeatCostTotal(int featCostTotal) {
        this.featCostTotal = featCostTotal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public static void featList()
    {
        OLFeats Alternate_Form = new OLFeats();
        Alternate_Form.setTitle("Alternate Form");
        Alternate_Form.setMaxLevel(2);
        Alternate_Form.setFeatCost(3);
        Alternate_Form.setDescription("None");
        Alternate_Form.setPrerequisites("None");
        Alternate_Form.setEffects("Upon taking this feat, you build a single alternate form using the normal character creation rules, though your attribute and feat points are determined by your tier in this feat:\n" +
                "\n\tTier 1 - Half of your primary form's attribute points (rounded up), and 3 feat points.\n" +
                "\n\tTier 2 - Same attribute points as your primary form, and 3 feat points less than your primary form.\n" +
                "Whenever your primary form gains new attribute points or levels up, your alternate form also gains points according to the above formulas. As a focus action, you may change between any two forms (including your primary form or any alternate form). You maintain this capability in all of your forms. Each form is treated as a completely different character for mechanical purposes - possessing different attributes, feats, perks, flaws, and other defining characteristics. Your alternate form does, however, retain the ability to transform back into your primary form. In order to keep track of hit points, you should always record the total damage that your character has suffered. When transforming, your damage remains with you even if your maximum hit points change. For example, Dr. Jekyll has a max HP of 15 and Mr. Hyde has a max HP of 30. During combat, Mr. Hyde suffers 10 damage. When he later transforms back into Dr. Jekyll, the 10 damage remains and is subtracted from his new maximum, leaving the doctor with 5 out of 15 hit points. Additionally, when changing forms, if your hit points would be reduced to less than 1, your hit point total becomes 1 instead.");
        Alternate_Form.setSpecial("When selecting feats for your alternate form, you may not select the Alternate Form feat. With GM approval, you may take this feat multiple times. If you do, you get access to an additional form. Multiple Alternate Forms can be a powerful way of accumulating new feat points and attributes. The GM should prevent players from exploiting the feat to create an overly powerful character.");

        featList.add(Alternate_Form);

        OLFeats Area_Manipulation = new OLFeats();
        Area_Manipulation.setTitle("Area Manipulation");
        Area_Manipulation.setMaxLevel(5);
        Area_Manipulation.setFeatCost(1);
        Area_Manipulation.setDescription("None");
        Area_Manipulation.setPrerequisites("None");
        Area_Manipulation.setEffects("For each tier of this feat you possess, you can omit a single 5-foot square from being targeted as part of an area attack.");
        Area_Manipulation.setSpecial("None");

        featList.add(Area_Manipulation);

        OLFeats Armor_Mastery = new OLFeats();
        Armor_Mastery.setTitle("Armor Mastery");
        Armor_Mastery.setMaxLevel(2);
        Armor_Mastery.setFeatCost(3);
        Armor_Mastery.setDescription("None");
        Armor_Mastery.setPrerequisites("None");
        Armor_Mastery.setEffects("Your training allows you to sleep in armor without gaining one level of the fatigued bane. In addition, while wearing armor, you gain the following benefits:\n\tTier 1 - The Fortitude prerequisite for wearing armor is reduced by 1. When wearing armor, you get a +1 armor bonus to your Guard defense.\n\tTier 2 - The Fortitude prerequisite for wearing armor is reduced by 2. When wearing armor, you get a +2 armor bonus to your Guard defense. Any movement penalty is reduced by 5'.");
        Armor_Mastery.setSpecial("None");

        featList.add(Armor_Mastery);

        OLFeats Attack_Redirection = new OLFeats();
        Attack_Redirection.setTitle("Attack Redirection");
        Attack_Redirection.setMaxLevel(1);
        Attack_Redirection.setFeatCost(3);
        Attack_Redirection.setDescription("None");
        Attack_Redirection.setPrerequisites("Defensive Reflexes II");
        Attack_Redirection.setEffects("When you make a defend action and your roll exceeds the attacker's action roll, you can choose to redirect the attack to a target that is neither you, nor the attacker. The original attack roll does not change, only the target. If the attack was a melee attack, you can redirect it to anyone within 5' of you (as opposed to within 5' of the attacker).");
        Attack_Redirection.setSpecial("None");

        featList.add(Attack_Redirection);

        OLFeats Attack_Specialization = new OLFeats();
        Attack_Specialization.setTitle("Attack Specialization");
        Attack_Specialization.setMaxLevel(9);
        Attack_Specialization.setFeatCost(3);
        Attack_Specialization.setDescription("None");
        Attack_Specialization.setPrerequisites("Tier 1: Agility or Might or Any Extraordinary - 3\nTier 4: Agility or Might or Any Extraordinary - 5\nTier 7: Agility or Might or Any Extraordinary - 7");
        Attack_Specialization.setEffects("When you take this feat, select one weapon or attack type. You gain advantage 1 per tier of this feat for any damaging attack made with your chosen attack type. This bonus does not apply to bane attacks or boon invocations. Examples of attack types you can choose to specialize in include fire, cold, lightning, acid, poison, entropy, and force - though this list is not exhaustive.");
        Attack_Specialization.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new weapon or attack type each time. Your total advantage to an attack is equal to your tier for that particular weapon or attack type. For example, a character might have Attack Specialization II (Fire) for fire attacks and Attack Specialization IV (Longsword) for longsword attacks.");

        featList.add(Attack_Specialization);

        OLFeats Attribute_Substitution = new OLFeats();
        Attribute_Substitution.setTitle("Attribute Substitution");
        Attribute_Substitution.setMaxLevel(2);
        Attribute_Substitution.setFeatCost(2);
        Attribute_Substitution.setDescription("Your prowess in an extraordinary, mental, or social attribute is linked in a way that empowers another attribute of your character, allowing you to use that attribute for tasks normally reserved for another. Examples of Attribute Substitution in play include a martial artist who is physically weak but capable of using internal chi to throw and disable opponents, an anatomical genius who uses logic to make vital strikes rather than their agility, or a gunslinger whose deadshot aim is the result of a dark pact.");
        Attribute_Substitution.setPrerequisites("None");
        Attribute_Substitution.setEffects("When you take this feat, you create a permanent link between two attributes: one stronger (the primary attribute) and one weaker (the dependent attribute). You may use your primary attribute in place of the dependent attribute for different purposes depending on which tier of the feat you have:\n\tTier 1\n\t\tMaking non-attack, non-defend, non-invocation action rolls\n\t\tCalculating hit points, defenses, and other secondary statistics\n\t\tMeeting feat prerequisites\n\t\tOther situations at the GM's discretion\n\tTier 2\n\t\tMaking attack and defend action rolls\n\t\tInvoking banes and boons\nThe relationship formed by your two attributes is subject to case-by-case approval and must be approved by the GM first. The link must be logical and consistent with the story you are trying to tell. For example, a brawler who substitutes their Logic for their Might to represent their ability to use leverage in grappling rather than strength would likely not get to use their Logic score for an attempt to bend the bars on a prison cell. Furthermore, the GM should prevent players from creating illogical substitutions that are purely aimed at making their characters unreasonably powerful. Two examples of proper uses of this feat include a calculating warrior who studies angles, leverage, and physics to substitute Logic for Might, or a gunslinger who channels dark energy, giving her deadshot accuracy and substituting Entropy for Agility.");
        Attribute_Substitution.setSpecial("None");

        featList.add(Attribute_Substitution);

        OLFeats Bane_Focus = new OLFeats();
        Bane_Focus.setTitle("Bane Focus");
        Bane_Focus.setMaxLevel(1);
        Bane_Focus.setFeatCost(3);
        Bane_Focus.setDescription("You are specialized in the use of a particular bane that is iconic to your character. Perhaps you are a martial artist known for your stunning strikes, a sniper who knows how to slow a target's escape, or a fire mage who sets enemies ablaze with persistent burning damage.");
        Bane_Focus.setPrerequisites("Ability to invoke the chosen bane");
        Bane_Focus.setEffects("Choose a bane that you can invoke. When your roll on a damaging attack exceeds the target's defense by 5 or more (as opposed to the usual 10), you can inflict this bane for free. Each attack is still only capable of inflicting a single bane. Furthermore, when making a bane attack to inflict your chosen bane, you gain advantage 2 on the bane attack roll.");
        Bane_Focus.setSpecial("You may take this feat multiple times. Each time you do, choose a different bane.");

        featList.add(Bane_Focus);

        OLFeats Battle_Trance = new OLFeats();
        Battle_Trance.setTitle("Battle Trance");
        Battle_Trance.setMaxLevel(1);
        Battle_Trance.setFeatCost(3);
        Battle_Trance.setDescription("You can enter a heightened mental state of combat readiness, in which your body is strengthened and your mind transcends fear and pain. Examples include a raging barbarian or an unstoppable samurai with laser focus in the heat of battle.");
        Battle_Trance.setPrerequisites("Fortitude or Will - 3");
        Battle_Trance.setEffects("As a free action on your turn, you may enter a battle trance. While entranced, you have advantage 1 on all attacks. Additionally, your Toughness and Resolve defenses are increased by 3. If your total armor bonus is less than 3, it becomes 3. If you take three consecutive turns without making an attack roll against an enemy creature, the battle trance ends. When the battle trance ends, you automatically suffer 1 level of the fatigue bane.");
        Battle_Trance.setSpecial("None");

        featList.add(Battle_Trance);

        OLFeats Battlefield_Opportunist = new OLFeats();
        Battlefield_Opportunist.setTitle("Battlefield Opportunist");
        Battlefield_Opportunist.setMaxLevel(5);
        Battlefield_Opportunist.setFeatCost(2);
        Battlefield_Opportunist.setDescription("Your battlefield prowess allows you to capitalize on windows of opportunity that others don't notice, making you far more deadly in melee combat. Whether you wield an axe, plasmablade, or your bare fists, foes struggle to maneuver around or away from you.");
        Battlefield_Opportunist.setPrerequisites("Agility or Might - 4");
        Battlefield_Opportunist.setEffects("You may make an additional opportunity attack per round for each tier of this feat you possess. You can only make one opportunity attack per triggering action (e.g., you cannot make multiple attacks against the same foe when they leave your threatened space).");
        Battlefield_Opportunist.setSpecial("None");

        featList.add(Battlefield_Opportunist);

        OLFeats Battlefield_Punisher = new OLFeats();
        Battlefield_Punisher.setTitle("Battlefield Punisher");
        Battlefield_Punisher.setMaxLevel(1);
        Battlefield_Punisher.setFeatCost(3);
        Battlefield_Punisher.setDescription("Not only can you deal out retributive damage, you can devastate your opponents with a signature secondary effect. Examples of this feat in action include a stalwart paladin who knocks foes prone, a ninja who blinds enemies, or a telekinetic psychic who hurls attacks away.");
        Battlefield_Punisher.setPrerequisites("Agility or Might or Any Extraordinary - 5 and Battlefield Retribution");
        Battlefield_Punisher.setEffects("Choose a bane you can inflict. Any time you use the defend action with an attribute that could inflict the chosen bane and deal 10 damage via the Battlefield Retribution feat, you may choose to automatically afflict the attacker with the chosen bane.");
        Battlefield_Punisher.setSpecial("None");

        featList.add(Battlefield_Punisher);

        OLFeats Battlefield_Retribution = new OLFeats();
        Battlefield_Retribution.setTitle("Battlefield Retribution");
        Battlefield_Retribution.setMaxLevel(1);
        Battlefield_Retribution.setFeatCost(2);
        Battlefield_Retribution.setDescription("You are a master of the counter attack. This might take the form of deftly redirecting a strike back upon the attacker or even energetic feedback from an extraordinary barrier that damages the attacker. Your prowess on the battlefield allows you to not only intercept attacks but also decimate your foes with retributive damage.");
        Battlefield_Retribution.setPrerequisites("Agility or Might or Any Extraordinary - 4");
        Battlefield_Retribution.setEffects("When you use the defend interrupt action, you also deal damage to the attacker equal to the amount by which your action roll exceeds the attacker's roll.");
        Battlefield_Retribution.setSpecial("None");

        featList.add(Battlefield_Retribution);

        OLFeats Boon_Access = new OLFeats();
        Boon_Access.setTitle("Boon Access");
        Boon_Access.setMaxLevel(1);
        Boon_Access.setFeatCost(1);
        Boon_Access.setDescription("You have a special gift: it might be the result of your heritage, a close encounter with magical energy, or the result of years of training with a master. In any case, although you do not necessarily possess the aptitude to work extraordinary powers for yourself or create a desired effect with your physical capabilities alone, you are able to reliably replicate a single boon.");
        Boon_Access.setPrerequisites("None");
        Boon_Access.setEffects("When you choose this feat, choose one boon that you do not have the requisite attribute to invoke. The cost of this feat is equal to the power level of the chosen boon. You can invoke the chosen boon despite lacking the necessary attribute. For invocation rolls, treat your attribute score as the power level of the boon. If the boon has multiple attribute prerequisite options, you choose one attribute when you take this feat. Additionally, you count as having access to the chosen boon for the purpose of meeting feat prerequisites, and your attribute for meeting such prerequisites is equal to the power level of the boon. The Boon Access feat bypasses the normal attribute score restrictions based on character level, so a first level character could spend all 6 of their feat points to begin play with access to a power level 6 boon. You may acquire this feat multiple times. Each time, select a new boon.");
        Boon_Access.setSpecial("You may take this feat multiple times. Each time you do, choose a new boon to gain access to. Note that this feat can give access to high-powered boons with a potential for very dramatic impact on the storyline of a game. As such, using this feat to access a boon of power level 6 or higher should be approved by the GM before using it in a game. If you ever meet the attribute prerequisite for the chosen boon, you may choose at that time to lose this feat and regain the feat points spent. Re-allocate them as you choose.");

        featList.add(Boon_Access);

        OLFeats Boon_Focus = new OLFeats();
        Boon_Focus.setTitle("Boon Focus");
        Boon_Focus.setMaxLevel(3);
        Boon_Focus.setFeatCost(3);
        Boon_Focus.setDescription("You are specialized in the use a particular boon that is iconic to your character. Examples of this feat in action include a druid who can shapechange at-will, a combat medic who can tend the wounds of many with expert skill, and a mad scientist who can animate mechanical minions effortlessly.");
        Boon_Focus.setPrerequisites("Ability to invoke the chosen boon");
        Boon_Focus.setEffects("Choose a single boon that you can invoke. You gain benefits with that boon according to your tier in this feat.\n\tTier 1 - When you invoke the chosen boon on a single target, you succeed automatically and do not need to make an action roll. You can invoke the boon at any of the power levels you could access via your other means. If the invocation is not a single target, success is not automatic, but you get advantage 2 on the action roll to invoke the boon.\n\tTier 2 - You gain advantage 3 on your action roll to invoke the boon if you are not single-targeting. Additionally, you may invoke the boon one time increment faster, as follows: If the invocation time is a major action or move action, it becomes a minor action. If the invocation time is 1 focus action, it becomes 1 major action. If the invocation time is 1 minute, it becomes 1 focus action. If the invocation time is 10 minutes, it becomes 1 minute. If the invocation time is 1 hour, it becomes 10 minutes. If the invocation time is 8 hours, it becomes 1 hour. If the invocation time for a boon is 1 minor action, it can be invoked only once as a minor action. Beyond that it can be invoked by expending a move or major action.\n\tTier 3 - The effect at tier 3 varies based on the duration of the boon:\nIf the chosen boon has a duration of \"sustain persists\", you gain advantage 4 on your action roll to invoke if you are not single-targeting. Additionally, one instance of the boon can be sustained each round as a free action, rather than a minor action. If the boon is somehow temporarily canceled, in the absence of other rules, you can invoke it again as a free action. If targeted by the nullify bane, this effect can only be canceled by a power level 6 or greater invocation of that bane.");
        Boon_Focus.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new boon each time. Your tier of this feat is independent for each boon.");

        featList.add(Boon_Focus);

        OLFeats Breakfall = new OLFeats();
        Breakfall.setTitle("Breakfall");
        Breakfall.setMaxLevel(2);
        Breakfall.setFeatCost(2);
        Breakfall.setDescription("You are as graceful as a swan. Like the martial artists and swashbucklers of legendary tales, your agility enables you to fall from deadly heights unharmed.");
        Breakfall.setPrerequisites("Agility - 4");
        Breakfall.setEffects("Tier 1 - As long as you are conscious and able to act, reduce all falling damage by half.\nTier 2 - As long as you are conscious and able to act, you do not suffer falling damage.");
        Breakfall.setSpecial("None");

        featList.add(Breakfall);

        OLFeats Brutal_Intimidation = new OLFeats();
        Brutal_Intimidation.setTitle("Brutal Intimidation");
        Brutal_Intimidation.setMaxLevel(1);
        Brutal_Intimidation.setFeatCost(1);
        Brutal_Intimidation.setDescription("Your powers of persuasion stem from application of brute force rather than your social grace. When you smash a table, brandish your blade, or flex your muscles, people stop what they are doing and listen to you.");
        Brutal_Intimidation.setPrerequisites("Might - 2");
        Brutal_Intimidation.setEffects("If you're able to make a show of physical force, you can use your Might attribute in place of Persuasion for the action roll.");
        Brutal_Intimidation.setSpecial("None");

        featList.add(Brutal_Intimidation);

        OLFeats Climbing = new OLFeats();
        Climbing.setTitle("Climbing");
        Climbing.setMaxLevel(1);
        Climbing.setFeatCost(1);
        Climbing.setDescription("You gain the ability to climb or parkour perfectly, akin to certain vampires, aberrant creatures, ninjas, and insects.");
        Climbing.setPrerequisites("None");
        Climbing.setEffects("You gain a climb speed equal to your base speed and can scale horizontal and vertical surfaces, even climb upside-down, with no fear of falling.");
        Climbing.setSpecial("None");

        featList.add(Climbing);

        OLFeats Combat_Follow_through = new OLFeats();
        Combat_Follow_through.setTitle("Combat Follow-through");
        Combat_Follow_through.setMaxLevel(1);
        Combat_Follow_through.setFeatCost(2);
        Combat_Follow_through.setDescription("You are able to decimate many enemies in quick succession. Like a legendary Samurai warrior or matchless elven archer, your foes fall in waves before you.");
        Combat_Follow_through.setPrerequisites("None");
        Combat_Follow_through.setEffects("Every time you bring an enemy to zero hit points with a Might or Agility attack, you can immediately make an extra attack as a free action.");
        Combat_Follow_through.setSpecial("None");

        featList.add(Combat_Follow_through);

        OLFeats Combat_Momentum = new OLFeats();
        Combat_Momentum.setTitle("Combat Momentum");
        Combat_Momentum.setMaxLevel(1);
        Combat_Momentum.setFeatCost(1);
        Combat_Momentum.setDescription("Whether through brute strength or lightning reflexes, you are able to use the momentum of combat to maneuver around the battlefield with ease.");
        Combat_Momentum.setPrerequisites("None");
        Combat_Momentum.setEffects("Every time you bring an enemy to zero hit points with a Might or Agility attack, you can immediately move up to your normal speed as a free action.");
        Combat_Momentum.setSpecial("If you have access to the teleport boon, you may use it instead of a normal move.");

        featList.add(Combat_Momentum);

        OLFeats Companion = new OLFeats();
        Companion.setTitle("Companion");
        Companion.setMaxLevel(3);
        Companion.setFeatCost(2);
        Companion.setDescription("Whether a hired bodyguard, a loyal animal sidekick, or a sibling that follows you everywhere, you have the constant and unflinching loyalty of one particular companion character.");
        Companion.setPrerequisites("None");
        Companion.setEffects("You gain a companion character that acts independently from you. During combat, your companion acts on its own initiative count and gains the usual assortment of actions, which you may choose. You also get to assign your companion's attributes. Whenever you gain a level or purchase a new tier in this feat, you may reassign your companion's attributes and feats.\n\tTier 1 - Your companion has a total of 20 attribute points plus 4 per level of your character.\n\tTier 2 - Your companion receives 3 feat points.\n\tTier 3 - Your companion has a total of 30 attribute points plus 6 per level of your character. In addition, you can optionally grant feats to your companion. In order to do so, you spend your own feat points and the companion receives the feat instead of you. The companion, not you, must meet all feat prerequisites. Any math related to these feats are calculated based on the companion's attributes, feats, etc. If you have spent feat points this way and would gain feat points from any other effect, those feat points are reduced by the number of feat points you have granted to your companion.");
        Companion.setSpecial("If you ever lose your companion, voluntarily or involuntarily, you regain the feat points that you have spent on this feat and any of the companion's feats, and may spend them as usual. In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new companion each time.");

        featList.add(Companion);

        OLFeats Craft_Mundane_Item = new OLFeats();
        Craft_Mundane_Item.setTitle("Craft Mundane Item");
        Craft_Mundane_Item.setMaxLevel(2);
        Craft_Mundane_Item.setFeatCost(2);
        Craft_Mundane_Item.setDescription("You have mastered a particular craft, and given proper time and materials, you can create items related to that craft. You might be an expert blacksmith, professional engineer, master alchemist, or any similar manner of professional craftsman.");
        Craft_Mundane_Item.setPrerequisites("Learning or Logic - 3 or Knowledge I");
        Craft_Mundane_Item.setEffects("Choose a specific craft or profession. You can create items that are relevant to your chosen craft, and your GM will determine the speed at which you craft based on the nature of the item and the materials you have access to. Your tier in the Craft Mundane Item feat determines the maximum wealth level of the items you can craft. Unlike acquiring items by using your wealth (described in Chapter 5), crafting does not limit your ability to acquire additional goods.\n\tTier 1 - You can craft items equal to your wealth level.\n\tTier 2 - You can craft items equal to your wealth level + 1.\nCraft Examples (This list is not exhaustive, and you can work with your GM to come up with other suitable crafts):\n\tAlchemy - acid, chemicals, non-magical tinctures, incense, reagents.\n\tArcane - magical ingredients, inks, scrolls, exotic components.\n\tBlacksmithing - metal, leather, weapons, armor, wheels, horseshoes.\n\tChemistry - acid, explosives, narcotics.\n\tEngineering - machines, wheels, gears, guns, vehicles.\n\tGeography - maps, cartography, instruments of navigation.\n\tHerbalism - poultices, natural remedies, stimulants, brewing.\n\tMedicine - medical tools, tonics, tinctures, pain relievers, anti-toxins.");
        Craft_Mundane_Item.setSpecial("In addition to taking multiple tiers of this feat, you may take this feat multiple times and select a new craft or profession each time.");

        featList.add(Craft_Mundane_Item);

        OLFeats Craft_Extraordinary_Item = new OLFeats();
        Craft_Extraordinary_Item.setTitle("Craft Extraordinary Item");
        Craft_Extraordinary_Item.setMaxLevel(3);
        Craft_Extraordinary_Item.setFeatCost(3);
        Craft_Extraordinary_Item.setDescription("You are studied in the ways of imbuing magical items, building futuristic technology, brewing potions, or crafting extraordinary devices. Their power is permanent but varies depending on your skill.");
        Craft_Extraordinary_Item.setPrerequisites("Any Extraordinary or Learning or Logic - 5");
        Craft_Extraordinary_Item.setEffects("Provided you have the appropriate working space and materials (as determined by the GM), you can create extraordinary items (as detailed in Chapter 9: Special Equipment). You can only imbue an item with attributes, banes, and boons that you can access. For example, in order to create a sword with Energy 5, you must possess an Energy score of 5 or higher. The only exception to this is if you possess the Creation, Learning, or Logic attributes. These allow you to imbue items with any attribute, bane, or boon as long as their value is less than or equal to your attribute score. The GM may rule that certain uses of Creation, Learning, or Logic are unreasonable when it comes to crafting extraordinary items. Your tier in this feat determines the maximum wealth level of the items you can create, based on the attribute you are using to craft:\n\tTier 1 - Maximum wealth level equals attribute minus 2\n\tTier 2 - Maximum wealth level equals attribute minus 1\n\tTier 3 - Maximum wealth level equals attribute\nFor example, a character with Creation 5 and tier 1 in this feat could create items up to wealth level 3. You can determine the wealth level of the item you want to create by consulting the sample items in Chapter 9: Special Equipment or by developing a custom item using the rules for Building Your Own Extraordinary Items in that chapter. Creating an item with the consumable or expendable property requires one full 8-hour day of uninterrupted work. Other items require a duration of uninterrupted work based on their wealth level, as follows:\n\tWealth Level 1 - 3: Two days per wealth level.\n\tWealth Level 4 - 5: Four days per wealth level.\n\tWealth Level 6 - 7: One week per wealth level.\n\tWealth Level 8 - 9: One month per wealth level.\nAt the end of this time, your item is created. Crafting an item still counts as an expenditure of wealth, so you must have a sufficient wealth score to purchase the item, following all the rules for spending wealth provided in Chapter 5: Wealth & Equipment. The GM may waive some or all of the costs associated with an item if you possess special materials for the crafting of your item. For example, if you have recently collected the hide of a slain red dragon and decide to make a suit of Armor of Fire Resistance, the GM may decide that the dragon’s hide is enough to make up most of the costs of the armor, so the armor’s wealth level is reduced by 3 for purposes of determining crafting costs.");
        Craft_Extraordinary_Item.setSpecial("None");

        featList.add(Craft_Extraordinary_Item);

        OLFeats Crushing_Blow = new OLFeats();
        Crushing_Blow.setTitle("Crushing Blow");
        Crushing_Blow.setMaxLevel(1);
        Crushing_Blow.setFeatCost(3);
        Crushing_Blow.setDescription("Like a reckless ogre wading through combat, your relentless blows not only knock your opponents back, but also knock them off their feet completely.");
        Crushing_Blow.setPrerequisites("Might - 6 and Overpowering Strike");
        Crushing_Blow.setEffects("Any time that you deal damage to an enemy, in addition to pushing them 5 feet (if you choose) from the Overpowering Strike feat, you can also knock them down in the space where the forced move ends; the target suffers the effects of the knockdown bane.");
        Crushing_Blow.setSpecial("None");

        featList.add(Crushing_Blow);

        OLFeats Death_Blow = new OLFeats();
        Death_Blow.setTitle("Death Blow");
        Death_Blow.setMaxLevel(2);
        Death_Blow.setFeatCost(3);
        Death_Blow.setDescription("You are able to quickly finish off enemies that are near death and silence them before they cry out. This attack is one that is commonly seen used by rogues, assassins, and snipers who can silently eliminate weaker enemies without being detected.");
        Death_Blow.setPrerequisites("Tier 1: Agility - 6 and Lethal Strike I\nTier 2: Agility - 7 and Lethal Strike III");
        Death_Blow.setEffects("\tTier 1 - If you damage an enemy with a Lethal Strike and their total HP is 5 or less after the attack, then you can choose to reduce them to zero HP instead. In addition, you can choose to silence any enemy reduced to zero hit points by an attack from you.\n\tTier 2 - Your death blow HP threshold increases from 5 to 10. In addition, on a successful Lethal Strike, the stunned bane is automatically inflicted without counting against your usual 1 bane per attack limit.");
        Death_Blow.setSpecial("None");

        featList.add(Death_Blow);

        OLFeats Deathless_Trance = new OLFeats();
        Deathless_Trance.setTitle("Deathless Trance");
        Deathless_Trance.setMaxLevel(1);
        Deathless_Trance.setFeatCost(3);
        Deathless_Trance.setDescription("Whether you are a berserker of the icy north, a hulking superhero of unstoppable might, or a cybernetically enhanced soldier, your battle fury is legendary. You possess the rare ability to fight on long after your body should have given up.");
        Deathless_Trance.setPrerequisites("Fortitude - 7 and Battle Trance");
        Deathless_Trance.setEffects("While in a battle trance you cannot be knocked unconscious. All damage dealt to you should be recorded, possibly resulting in a negative hit point total. Despite any amount of damage, you remain conscious for as long as you can sustain the battle trance. When the battle trance ends, if your hit points are below zero, you collapse unconscious. If you are not healed to zero or more hit points within 1 round of your battle trance ending, you die.");
        Deathless_Trance.setSpecial("None");

        featList.add(Deathless_Trance);

        OLFeats Defensive_Mastery = new OLFeats();
        Defensive_Mastery.setTitle("Defensive Mastery");
        Defensive_Mastery.setMaxLevel(1);
        Defensive_Mastery.setFeatCost(3);
        Defensive_Mastery.setDescription("You know how to turn a strong offense into an even stronger defense. Your special training or experience with defensive implements and shields allows you to capitalize on their defensive benefits far beyond the average wielder. Examples include a martial artist's defensive kata or a soldier equipped with a riot shield.");
        Defensive_Mastery.setPrerequisites("None");
        Defensive_Mastery.setEffects("When wielding a weapon or implement with the defensive property, you gain an additional +1 armor bonus. In addition, the defensive value of the item is increased by 1 when you wield it. So defensive 1 becomes defensive 2 and defensive 2 becomes defensive 3.");
        Defensive_Mastery.setSpecial("None");

        featList.add(Defensive_Mastery);

        OLFeats Defensive_Reflexes = new OLFeats();
        Defensive_Reflexes.setTitle("Defensive Reflexes");
        Defensive_Reflexes.setMaxLevel(9);
        Defensive_Reflexes.setFeatCost(2);
        Defensive_Reflexes.setDescription("You are a paragon of defensive fighting, able to masterfully thwart enemy attacks. By predicting your opponents' movements, strikes, or shots, you can cut them off before they are a threat.");
        Defensive_Reflexes.setPrerequisites("Tier 1: Agility - 3\n Tier 4: Agility - 5\n Tier 7: Agility - 7 ");
        Defensive_Reflexes.setEffects("Any time you use the defend action, you gain advantage 1 on the action roll per tier you possess of this feat.");
        Defensive_Reflexes.setSpecial("None");

        featList.add(Defensive_Reflexes);

        OLFeats Destructive_Trance = new OLFeats();
        Destructive_Trance.setTitle("Destructive Trance");
        Destructive_Trance.setMaxLevel(1);
        Destructive_Trance.setFeatCost(3);
        Destructive_Trance.setDescription("In the heat of combat, you become a destructive force to be reckoned with. Whether a raging barbarian or a hyper-focused intergalactic knight, your attacks become particularly ferocious when you enter your battle trance.");
        Destructive_Trance.setPrerequisites("Agility or Might or Energy or Entropy - 7 and Battle Trance");
        Destructive_Trance.setEffects("When you make an attack roll in a battle trance, all of the dice in your dice pool explode on either maximum or the number 1 below maximum (though the total is still the number rolled). This means that d4s explode on a 3 or 4, d6s explode on a 5 or 6, d8s explode on a 7 or 8, and so on.");
        Destructive_Trance.setSpecial("None");

        featList.add(Destructive_Trance);

        OLFeats Diehard = new OLFeats();
        Diehard.setTitle("Diehard");
        Diehard.setMaxLevel(1);
        Diehard.setFeatCost(2);
        Diehard.setDescription("Whether luck shines upon you or you're just really hard to kill, you have a knack for staying in the fight when others would tap out. You might be a plucky rogue who always finds a safe nook to duck into or a veteran marine specially trained to grit your teeth and buck up when things look grim.");
        Diehard.setPrerequisites("Presence or Fortitude - 3");
        Diehard.setEffects("Once per day, an attack that would reduce you to less than 1 HP, reduces you to 1 HP instead.");
        Diehard.setSpecial("None");

        featList.add(Diehard);

        OLFeats Energy_Resistance = new OLFeats();
        Energy_Resistance.setTitle("Energy Resistance");
        Energy_Resistance.setMaxLevel(4);
        Energy_Resistance.setFeatCost(2);
        Energy_Resistance.setDescription("Whether due to inherited racial traits, specialization in a particular type of energy, or inherent extraordinary protection, you are resistant to a specific type of energy. A fiery sorceress immune to the hottest blaze or a biologically anomalous alien race that is immune to poison are both examples of this feat in play.");
        Energy_Resistance.setPrerequisites("None");
        Energy_Resistance.setEffects("Choose from the following energy types: fire, cold, lightning, acid, poison, or another at the GM's discretion. When you are attacked with that energy type, you gain resistance to the attack as follows:\n\tTier 1 - Your defense scores are increased by 3 against the chosen energy type.\n\tTier 2 - Your defense scores are increased by 6 against the chosen energy type.\n\tTier 3 - Your defense scores are increased by 9 against the chosen energy type.\n\tTier 4 - You are immune to damage and harmful effects from the chosen energy type.");
        Energy_Resistance.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new energy type each time.");

        featList.add(Energy_Resistance);

        OLFeats Extraordinary_Defense = new OLFeats();
        Extraordinary_Defense.setTitle("Extraordinary Defense");
        Extraordinary_Defense.setMaxLevel(3);
        Extraordinary_Defense.setFeatCost(3);
        Extraordinary_Defense.setDescription("Whether by a magical barrier of force, foresight into the future, or preternatural speed, you are gifted with extraordinary protection from harm. Attacks are less likely to strike you, and when they do, they aren't as damaging as they would be to others.");
        Extraordinary_Defense.setPrerequisites("Tier 1: Movement or Prescience or Protection - 2\nTier 2: Movement or Prescience or Protection - 3\nTier 3: Movement or Prescience or Protection - 4");
        Extraordinary_Defense.setEffects("You gain a +1 bonus to all defenses for each tier you have in this feat. This increases your Toughness, Guard, and Resolve defenses.");
        Extraordinary_Defense.setSpecial("None");

        featList.add(Extraordinary_Defense);

        OLFeats Extraordinary_Focus = new OLFeats();
        Extraordinary_Focus.setTitle("Extraordinary Focus");
        Extraordinary_Focus.setMaxLevel(1);
        Extraordinary_Focus.setFeatCost(3);
        Extraordinary_Focus.setDescription("Your extraordinary power stems from your connection with a particular focus, such as a wand, digital psi amplifier, holy symbol, or spellbook. When this focus item is in your hands, you are a force to be reckoned with compared to others with similar powers.");
        Extraordinary_Focus.setPrerequisites("Any Extraordinary - 1");
        Extraordinary_Focus.setEffects("With the approval of your GM, choose a focus from which your power with a single extraordinary attribute stems. Some possibilities include a wand, a digital psi amplifier, a crystal ball, a spell book, a holy symbol, a weapon, your voice, or an animal familiar. You cannot use the selected extraordinary attribute without your focus. The focus heightens your power and for the purposes of determining your attribute dice for action rolls, you treat the chosen attribute as if it was one greater. For all purposes outside of attribute dice, your ability score remains unchanged (feats, banes, boons, etc.).");
        Extraordinary_Focus.setSpecial("If you ever lose your extraordinary focus, voluntarily or involuntarily, you regain the feat points that you have spent on this feat and may spend them as usual. You may take this feat multiple times. If you do, select a new attribute not chosen previously. For each instance of this feat, you may choose an existing focus or select a new one.");

        featList.add(Extraordinary_Focus);

        OLFeats Extraordinary_Healing = new OLFeats();
        Extraordinary_Healing.setTitle("Extraordinary Healing");
        Extraordinary_Healing.setMaxLevel(1);
        Extraordinary_Healing.setFeatCost(3);
        Extraordinary_Healing.setDescription("Whether you summon priestly magics, utilize advanced technologies, or apply alchemical concoctions, your mastery of extraordinary healing is such that you are able to cure mortal wounds that are beyond the power of the average healer.");
        Extraordinary_Healing.setPrerequisites("Creation - 5");
        Extraordinary_Healing.setEffects("When invoking the heal boon, you can choose to take one hour instead of the usual invocation time. If you do, you heal an amount of lethal damage equal to the total healing from the successful boon invocation. This lethal damage is healed in addition to the normal hit point damage that your boon heals.");
        Extraordinary_Healing.setSpecial("None");

        featList.add(Extraordinary_Healing);

        OLFeats Fast_Draw = new OLFeats();
        Fast_Draw.setTitle("Fast Draw");
        Fast_Draw.setMaxLevel(1);
        Fast_Draw.setFeatCost(1);
        Fast_Draw.setDescription("Whether you're a samurai warrior, the fastest draw in the West, or a flawlessly trained interstellar soldier, you can get to your weapon faster than your opponent can blink.");
        Fast_Draw.setPrerequisites("Agility - 1");
        Fast_Draw.setEffects("Once per round, you can draw one additional weapon and sheathe another as a free action. Alternately, you could do the same with any small sized object in your possession.");
        Fast_Draw.setSpecial("None");

        featList.add(Fast_Draw);

        OLFeats Fast_Tracker = new OLFeats();
        Fast_Tracker.setTitle("Fast Tracker");
        Fast_Tracker.setMaxLevel(1);
        Fast_Tracker.setFeatCost(2);
        Fast_Tracker.setDescription("Following a trail is an everyday part of your life, and as such it is no more taxing than breathing or blinking. Whether you are an experienced woodsman, a bounty hunter for the Galactic Senate, or a humanoid cat creature with heightened senses, your expertise at tracking allows you to get it done faster than the average hunter.");
        Fast_Tracker.setPrerequisites("Agility - 5 and Perception - 5");
        Fast_Tracker.setEffects("You move unhindered and at full speed when tracking your quarry.");
        Fast_Tracker.setSpecial("None");

        featList.add(Fast_Tracker);

        OLFeats Ferocious_Minions = new OLFeats();
        Ferocious_Minions.setTitle("Ferocious Minions");
        Ferocious_Minions.setMaxLevel(3);
        Ferocious_Minions.setFeatCost(2);
        Ferocious_Minions.setDescription("Whether you are a necromancer who summons hordes of undead, an inventor who crafts autonomous defense droids, or a psychic capable of bending others to your will, minions are exceptionally strong under your command.");
        Ferocious_Minions.setPrerequisites("Tier 1: Alteration or Creation or Entropy or Energy or Influence - 4\nTier 2: Alteration or Creation or Entropy or Energy or Influence - 5\nTier 3: Alteration or Creation or Entropy or Energy or Influence - 7");
        Ferocious_Minions.setEffects("Creatures under the effects of your charmed or dominated banes, or those created by your invocation of the summon creature boon, gain advantage 1 on all attack rolls to protect you or act in your favor for each tier of this feat you possess.");
        Ferocious_Minions.setSpecial("None");

        featList.add(Ferocious_Minions);

        OLFeats Fleet_of_Foot = new OLFeats();
        Fleet_of_Foot.setTitle("Fleet of Foot");
        Fleet_of_Foot.setMaxLevel(3);
        Fleet_of_Foot.setFeatCost(2);
        Fleet_of_Foot.setDescription("Whether through cybernetic implants, telekinetic propulsion, or simply hardcore training, you are faster than most. This feat is common to swashbucklers, martial artists, super soldiers, and psychic warriors.");
        Fleet_of_Foot.setPrerequisites("Tier 1: Agility or Fortitude or Movement - 2\nTier 2: Agility or Fortitude or Movement - 4\nTier 3: Agility or Fortitude or Movement - 6");
        Fleet_of_Foot.setEffects("Your speed is permanently increased by 5' per tier of this feat.");
        Fleet_of_Foot.setSpecial("None");

        featList.add(Fleet_of_Foot);

        OLFeats Flying = new OLFeats();
        Flying.setTitle("Flying");
        Flying.setMaxLevel(1);
        Flying.setFeatCost(3);
        Flying.setDescription("Whether through a pair of celestial or infernal wings, an inherent telekinetic force, or mutant super powers, you possess the ability to fly.");
        Flying.setPrerequisites("None");
        Flying.setEffects("You gain a flight speed equal to your normal speed. At the GM's discretion, certain hostile actions may be capable of canceling your flight, sending you hurtling to your doom. If your flight is anatomical, the immobile bane might render your wings immovable. If telekinetic, an application of the nullify bane may cancel your flight.");
        Flying.setSpecial("None");

        featList.add(Flying);

        OLFeats Great_Leap = new OLFeats();
        Great_Leap.setTitle("Great Leap");
        Great_Leap.setMaxLevel(1);
        Great_Leap.setFeatCost(1);
        Great_Leap.setDescription("Through extraordinary power or exceptional agility, you can jump much farther than the average creature. A telekinetic superhero and an insectoid race of bipedal cricket-like beings are both examples of this feat in play.");
        Great_Leap.setPrerequisites("Tier 1: Movement or Agility - 2\nTier 2: Movement or Agility - 4\nTier 3: Movement or Agility - 6");
        Great_Leap.setEffects("You can use your Movement or Agility score instead of your Might score when determining how far you can jump. In addition, you gain advantage 1 per tier on action rolls to jump.");
        Great_Leap.setSpecial("None");

        featList.add(Great_Leap);

        OLFeats Hallucination = new OLFeats();
        Hallucination.setTitle("Hallucination");
        Hallucination.setMaxLevel(2);
        Hallucination.setFeatCost(3);
        Hallucination.setDescription("You are able to use your powers of illusion to not only create phantasmal figments, but to completely dominate the sensory perceptions of individual targets. Such power is wielded by the likes of legendary enchanters, psychics, and shamans. Those who can master such powers are often capable of neutralizing angry mobs without shedding a drop of blood.");
        Hallucination.setPrerequisites("Tier 1: Influence - 5\nTier 2: Influence - 7");
        Hallucination.setEffects("\tTier 1 - When you invoke the phantasm bane, you may choose to create a hallucination within a single target's mind instead of an illusion that is perceptible to everyone. You gain complete control over the target's senses (as granted by the power level of your bane), and thus the hallucination is not restricted by size or area. Your hallucination may only target a single creature and is not eligible for multi-targeting attacks. In addition, unless the target is damaged, they suffer disadvantage on resist rolls against the bane.\n\tTier 2 - When you invoke the hallucination form of the phantasm bane, you may target additional creatures within range as determined by your Influence score. This does not count as a multi-target attack and thus does not incur disadvantage on your action roll.\n\t\tInfluence 7 - 5 targets\n\t\tInfluence 8 - 10 targets\n\t\tInfluence 9 - 50 targets");
        Hallucination.setSpecial("None");

        featList.add(Hallucination);

        OLFeats Heightened_Invocation = new OLFeats();
        Heightened_Invocation.setTitle("Heightened Invocation");
        Heightened_Invocation.setMaxLevel(3);
        Heightened_Invocation.setFeatCost(2);
        Heightened_Invocation.setDescription("By channeling your extraordinary powers through extended research or extensive rituals, such as meditation, fasting, blood letting, or sacrifices, you are able to increase the strength of your invocations. This feat is common among wizards, inventors, mad scientists, and similar characters who use extraordinary abilities to achieve great deeds.");
        Heightened_Invocation.setPrerequisites("Tier 1: Any Extraordinary - 4\nTier 2: Any Extraordinary - 6\nTier 3: Any Extraordinary - 9");
        Heightened_Invocation.setEffects("When invoking a bane or boon, you may choose to do so as a heightened invocation. The invocation time for a heightened invocation is one increment higher than usual as follows:\n\t1 action becomes 1 minute\n\t1 minute becomes 10 minutes\n\t10 minutes becomes 1 hour\n\t1 hour becomes 8 hours\n\t8 hours becomes 24 hours\nTier 1 - When performing a heightened invocation, you may choose one of the following effects to empower your bane or boon:\n\tIncrease the range of the effect as follows: Attribute 5 = 500ft\n\t\tAttribute 6 = 1/2 mile\n\t\tAttribute 7 = 1 mile\n\t\tAttribute 8 = 10 miles\n\t\tAttribute 9 = 100 miles\n\tNegate two levels of disadvantage caused by multi-targeting (e.g., target 2 creatures or a 10' square for free instead of disadvantage 2).\n\tFor your action roll, treat your attribute score as if it was one greater for purposes of determining attribute dice. Note that this doesn't grant access to banes or boons you could not normally access. It only increases the dice used for the action roll.\nTier 2 - You gain the following options when you perform a heightened invocation:\n\tYou can lead others to join you in group invocation as long as they are also able to invoke the bane or boon at the same power level that you are invoking it at. At the conclusion of the group invocation, each contributor may choose one of the effects granted by Tier 1 of this feat.\n\tYou gain the following additional options to choose from when empowering your invocations with heightened invocation:\n\t\tCause a boon to persist for 1 minute automatically without needing to use a sustain action. Furthermore, enemies cannot end the boon through use of a disrupting attack (though the nullify bane still works).\n\t\tTargets may not make resist rolls against a bane for one minute after it is invoked.\nTier 3 - You gain the ability to permanently bestow or dispel banes and boons. In order to bestow the bane or boon, you must rigorously attend to the invocation process for a number of days equal to the power level of the bane or boon to be invoked or nullified. During that time you can eat, sleep, and act normally with two exceptions: 1) You must work actively on the invocation and with minimal interruption for 8 hours out of each day. 2) You can leave the area and move about freely during the down time each day, but for the 8 hours of active heightened invocation you must be in the same physical or geographic location where the invocation was initiated. When the invocation time is completed, make an action roll as follows:\n\tBestow Boon - Make an action roll to invoke the boon as usual. If successful, you cause a non-instantaneous & non-permanent boon to permanently affect the target. The target can thereafter invoke the boon at will with a free action, without requiring an action roll to do so. The target does not need to use a sustain action to persist the effect, and the effect can only be nullified either temporarily with the nullify bane, or permanently with the Heightened Invocation feat (see the Dispel Boon entry that follows).\n\tBestow Bane - Make an action roll to invoke the bane as usual. If successful, you cause a non-instantaneous & non-permanent bane to permanently affect the target. The bane persists indefinitely and does not allow resist rolls to end its effects. The effect can be canceled either temporarily with the nullify bane, or permanently with the Heightened Invocation feat (see the Dispel Bane entry that follows).\n\tDispel Boon - Make an Entropy roll with a Challenge Rating equal to 10 + twice the power level of the boon you are attempting to dispel. If successful, you cause a permanent boon to be forever stripped from the target, causing them to lose the ability to invoke the boon automatically.\n\tDispel Bane - Make a Protection roll with a Challenge Rating equal to 10 + twice the power level of the bane you are attempting to dispel. If successful, you break the curse of a permanent bane afflicting the target, though your target gains no special immunity to it.");
        Heightened_Invocation.setSpecial("Permanently bestowing banes or boons via this feat can dramatically impact the mechanical balance of a story. Just as with other permanent effects like Extraordinary Item creation, the invocation of permanent banes or boons is subject to GM's discretion, and using this feat in a way that makes one particular character overly powerful should be prohibited.");

        featList.add(Heightened_Invocation);

        
    }
}