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
    private String connection; //What companion name, bane/boon, or other connected string
    private Boolean canBeTakenMoreThanOnce = false;

    public OLFeats copyFeat() {
        OLFeats newFeat = new OLFeats();
        newFeat.setTitle(this.title);
        newFeat.setMaxLevel(this.maxLevel);
        newFeat.setLevel(this.level);
        newFeat.setFeatCost(this.featCost);
        newFeat.setFeatCostTotal(this.featCostTotal);
        newFeat.setDescription(this.description);
        newFeat.setPrerequisites(this.prerequisites);
        newFeat.setEffects(this.effects);
        newFeat.setSpecial(this.special);
        newFeat.setConnection(this.connection);
        return newFeat;
    }

    public OLFeats getFeatPosition(int index) {
        return featList.get(index);
    }

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

    public static ArrayList<OLFeats> getFeatList() {
        return featList;
    }

    public static void setFeatList(ArrayList<OLFeats> featList) {
        OLFeats.featList = featList;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public Boolean getCanBeTakenMoreThanOnce() {
        return canBeTakenMoreThanOnce;
    }

    public void setCanBeTakenMoreThanOnce(Boolean canBeTakenMoreThanOnce) {
        this.canBeTakenMoreThanOnce = canBeTakenMoreThanOnce;
    }

    public static void featList()
    {
        OLFeats Alternate_Form = new OLFeats();
        Alternate_Form.setTitle("Alternate Form");
        Alternate_Form.setMaxLevel(2);
        Alternate_Form.setFeatCost(3);
        Alternate_Form.setDescription("You have the ability to transform from one persona to another, whether that be through bodily transformation like a werewolf or through exterior mechanisms, such as a cybernetically enhanced soldier who can call forth a symbiotic mech suit.");
        Alternate_Form.setPrerequisites("None");
        Alternate_Form.setEffects("Upon taking this feat, you build a single alternate form using the normal character creation rules, though your attribute and feat points are determined by your tier in this feat:\n" +
                "\n\tTier 1 - Half of your primary form's attribute points (rounded up), and 3 feat points.\n" +
                "\n\tTier 2 - Same attribute points as your primary form, and 3 feat points less than your primary form.\n" +
                "Whenever your primary form gains new attribute points or levels up, your alternate form also gains points according to the above formulas. As a focus action, you may change between any two forms (including your primary form or any alternate form). You maintain this capability in all of your forms. Each form is treated as a completely different character for mechanical purposes - possessing different attributes, feats, perks, flaws, and other defining characteristics. Your alternate form does, however, retain the ability to transform back into your primary form. In order to keep track of hit points, you should always record the total damage that your character has suffered. When transforming, your damage remains with you even if your maximum hit points change. For example, Dr. Jekyll has a max HP of 15 and Mr. Hyde has a max HP of 30. During combat, Mr. Hyde suffers 10 damage. When he later transforms back into Dr. Jekyll, the 10 damage remains and is subtracted from his new maximum, leaving the doctor with 5 out of 15 hit points. Additionally, when changing forms, if your hit points would be reduced to less than 1, your hit point total becomes 1 instead.");
        Alternate_Form.setSpecial("When selecting feats for your alternate form, you may not select the Alternate Form feat. With GM approval, you may take this feat multiple times. If you do, you get access to an additional form. Multiple Alternate Forms can be a powerful way of accumulating new feat points and attributes. The GM should prevent players from exploiting the feat to create an overly powerful character.");
        Alternate_Form.setCanBeTakenMoreThanOnce(true);

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
        Armor_Mastery.setDescription("Whether unloading your assault rifle on full-automatic or hurling a ball of flame, you are exceptionally precise at choosing targets for area attacks, allowing you to avoid allies who would otherwise be caught in the line of fire.");
        Armor_Mastery.setPrerequisites("None");
        Armor_Mastery.setEffects("Your training allows you to sleep in armor without gaining one level of the fatigued bane. In addition, while wearing armor, you gain the following benefits:\n\tTier 1 - The Fortitude prerequisite for wearing armor is reduced by 1. When wearing armor, you get a +1 armor bonus to your Guard defense.\n\tTier 2 - The Fortitude prerequisite for wearing armor is reduced by 2. When wearing armor, you get a +2 armor bonus to your Guard defense. Any movement penalty is reduced by 5'.");
        Armor_Mastery.setSpecial("None");

        featList.add(Armor_Mastery);

        OLFeats Attack_Redirection = new OLFeats();
        Attack_Redirection.setTitle("Attack Redirection");
        Attack_Redirection.setMaxLevel(1);
        Attack_Redirection.setFeatCost(3);
        Attack_Redirection.setDescription("Whether you are a heavily armored mechanized knight or a nimble rogue in studded leather, you and your armor are one. Your training and experience at wearing armor allows you to maximize its protection and minimize its drawbacks.");
        Attack_Redirection.setPrerequisites("Defensive Reflexes II");
        Attack_Redirection.setEffects("When you make a defend action and your roll exceeds the attacker's action roll, you can choose to redirect the attack to a target that is neither you, nor the attacker. The original attack roll does not change, only the target. If the attack was a melee attack, you can redirect it to anyone within 5' of you (as opposed to within 5' of the attacker).");
        Attack_Redirection.setSpecial("None");

        featList.add(Attack_Redirection);

        OLFeats Attack_Specialization = new OLFeats();
        Attack_Specialization.setTitle("Attack Specialization");
        Attack_Specialization.setMaxLevel(9);
        Attack_Specialization.setFeatCost(3);
        Attack_Specialization.setDescription("You are adept at redirecting your enemy's attacks. Whether using fancy footwork, magical force, or tactical superiority, you know how to force your enemy to attack unintended targets.");
        Attack_Specialization.setPrerequisites("Tier 1: Agility or Might or Any Extraordinary - 3\nTier 4: Agility or Might or Any Extraordinary - 5\nTier 7: Agility or Might or Any Extraordinary - 7");
        Attack_Specialization.setEffects("When you take this feat, select one weapon or attack type. You gain advantage 1 per tier of this feat for any damaging attack made with your chosen attack type. This bonus does not apply to bane attacks or boon invocations. Examples of attack types you can choose to specialize in include fire, cold, lightning, acid, poison, entropy, and force - though this list is not exhaustive.");
        Attack_Specialization.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new weapon or attack type each time. Your total advantage to an attack is equal to your tier for that particular weapon or attack type. For example, a character might have Attack Specialization II (Fire) for fire attacks and Attack Specialization IV (Longsword) for longsword attacks.");
        Attack_Specialization.setCanBeTakenMoreThanOnce(true);

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
        Bane_Focus.setCanBeTakenMoreThanOnce(true);

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
        Boon_Access.setCanBeTakenMoreThanOnce(true);

        featList.add(Boon_Access);

        OLFeats Boon_Focus = new OLFeats();
        Boon_Focus.setTitle("Boon Focus");
        Boon_Focus.setMaxLevel(3);
        Boon_Focus.setFeatCost(3);
        Boon_Focus.setDescription("You are specialized in the use a particular boon that is iconic to your character. Examples of this feat in action include a druid who can shapechange at-will, a combat medic who can tend the wounds of many with expert skill, and a mad scientist who can animate mechanical minions effortlessly.");
        Boon_Focus.setPrerequisites("Ability to invoke the chosen boon");
        Boon_Focus.setEffects("Choose a single boon that you can invoke. You gain benefits with that boon according to your tier in this feat.\n\tTier 1 - When you invoke the chosen boon on a single target, you succeed automatically and do not need to make an action roll. You can invoke the boon at any of the power levels you could access via your other means. If the invocation is not a single target, success is not automatic, but you get advantage 2 on the action roll to invoke the boon.\n\tTier 2 - You gain advantage 3 on your action roll to invoke the boon if you are not single-targeting. Additionally, you may invoke the boon one time increment faster, as follows: If the invocation time is a major action or move action, it becomes a minor action. If the invocation time is 1 focus action, it becomes 1 major action. If the invocation time is 1 minute, it becomes 1 focus action. If the invocation time is 10 minutes, it becomes 1 minute. If the invocation time is 1 hour, it becomes 10 minutes. If the invocation time is 8 hours, it becomes 1 hour. If the invocation time for a boon is 1 minor action, it can be invoked only once as a minor action. Beyond that it can be invoked by expending a move or major action.\n\tTier 3 - The effect at tier 3 varies based on the duration of the boon:\nIf the chosen boon has a duration of \"sustain persists\", you gain advantage 4 on your action roll to invoke if you are not single-targeting. Additionally, one instance of the boon can be sustained each round as a free action, rather than a minor action. If the boon is somehow temporarily canceled, in the absence of other rules, you can invoke it again as a free action. If targeted by the nullify bane, this effect can only be canceled by a power level 6 or greater invocation of that bane.");
        Boon_Focus.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new boon each time. Your tier of this feat is independent for each boon.");
        Boon_Focus.setCanBeTakenMoreThanOnce(true);

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
        Companion.setCanBeTakenMoreThanOnce(true);

        featList.add(Companion);

        OLFeats Craft_Mundane_Item = new OLFeats();
        Craft_Mundane_Item.setTitle("Craft Mundane Item");
        Craft_Mundane_Item.setMaxLevel(2);
        Craft_Mundane_Item.setFeatCost(2);
        Craft_Mundane_Item.setDescription("You have mastered a particular craft, and given proper time and materials, you can create items related to that craft. You might be an expert blacksmith, professional engineer, master alchemist, or any similar manner of professional craftsman.");
        Craft_Mundane_Item.setPrerequisites("Learning or Logic - 3 or Knowledge I");
        Craft_Mundane_Item.setEffects("Choose a specific craft or profession. You can create items that are relevant to your chosen craft, and your GM will determine the speed at which you craft based on the nature of the item and the materials you have access to. Your tier in the Craft Mundane Item feat determines the maximum wealth level of the items you can craft. Unlike acquiring items by using your wealth (described in Chapter 5), crafting does not limit your ability to acquire additional goods.\n\tTier 1 - You can craft items equal to your wealth level.\n\tTier 2 - You can craft items equal to your wealth level + 1.\nCraft Examples (This list is not exhaustive, and you can work with your GM to come up with other suitable crafts):\n\tAlchemy - acid, chemicals, non-magical tinctures, incense, reagents.\n\tArcane - magical ingredients, inks, scrolls, exotic components.\n\tBlacksmithing - metal, leather, weapons, armor, wheels, horseshoes.\n\tChemistry - acid, explosives, narcotics.\n\tEngineering - machines, wheels, gears, guns, vehicles.\n\tGeography - maps, cartography, instruments of navigation.\n\tHerbalism - poultices, natural remedies, stimulants, brewing.\n\tMedicine - medical tools, tonics, tinctures, pain relievers, anti-toxins.");
        Craft_Mundane_Item.setSpecial("In addition to taking multiple tiers of this feat, you may take this feat multiple times and select a new craft or profession each time.");
        Craft_Mundane_Item.setCanBeTakenMoreThanOnce(true);

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
        Energy_Resistance.setCanBeTakenMoreThanOnce(true);

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
        Extraordinary_Focus.setCanBeTakenMoreThanOnce(true);

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

        OLFeats Hospitaler = new OLFeats();
        Hospitaler.setTitle("Hospitaler");
        Hospitaler.setMaxLevel(1);
        Hospitaler.setFeatCost(2);
        Hospitaler.setDescription("Through inspiring words, magical healing, or advanced medical technique, you are exceptionally skilled at helping others shake off baneful afflictions. Paladins, bards, and combat medics are all typical examples of characters who are masters of this feat.");
        Hospitaler.setPrerequisites("Creation or Presence or Protection - 4");
        Hospitaler.setEffects("You can use a major action to give an ally an immediate resist roll (a free action for the ally) with advantage 1. Additionally, you gain advantage 1 any time you attempt to invoke the restoration boon.");
        Hospitaler.setSpecial("None");

        featList.add(Hospitaler);

        OLFeats Impervious_Trance = new OLFeats();
        Impervious_Trance.setTitle("Impervious Trance");
        Impervious_Trance.setMaxLevel(1);
        Impervious_Trance.setFeatCost(3);
        Impervious_Trance.setDescription("In the heightened focus of battle, your will becomes indomitable. Like a monk with unflinching mental focus or a berserker who is too bloodthirsty to be stopped, you cannot be thwarted by fear, charm, or similar attempts to overcome your willpower.");
        Impervious_Trance.setPrerequisites("Will - 7 and Battle Trance");
        Impervious_Trance.setEffects("While you are in a battle trance, you are immune to banes that target your Resolve. If you were already under the effect of such a bane, it is negated for the duration of your battle trance and returns when your battle trance ends.");
        Impervious_Trance.setSpecial("None");

        featList.add(Impervious_Trance);

        OLFeats Indomitable_Endurance = new OLFeats();
        Indomitable_Endurance.setTitle("Indomitable Endurance");
        Indomitable_Endurance.setMaxLevel(5);
        Indomitable_Endurance.setFeatCost(2);
        Indomitable_Endurance.setDescription("Your endurance and willpower are legendary, allowing you to push on when others would keel over from exhaustion. A barbarian able to recover their wind after a mighty frenzy, or a computer hacker capable of routinely going for days without sleep while focused on a singular objective are good examples of this feat in action.");
        Indomitable_Endurance.setPrerequisites("Fortitude or Will - 5");
        Indomitable_Endurance.setEffects("You are able to shrug off the effects of the fatigued bane. For each tier you possess in this feat, treat your fatigue level as one lower than it actually is for the purposes of determining the bane's effects.");
        Indomitable_Endurance.setSpecial("None");

        featList.add(Indomitable_Endurance);

        OLFeats Indomitable_Resolve = new OLFeats();
        Indomitable_Resolve.setTitle("Indomitable Resolve");
        Indomitable_Resolve.setMaxLevel(3);
        Indomitable_Resolve.setFeatCost(1);
        Indomitable_Resolve.setDescription("Your resolve is exceptional, making your more resilient to mental effects that would overwhelm those of lesser mettle. A keen-minded space captain and a wizened mage are both exemplars of this feat in action.");
        Indomitable_Resolve.setPrerequisites("Tier 1: Presence or Will - 3\nTier 2: Presence or Will - 4\nTier 3: Presence or Will - 5");
        Indomitable_Resolve.setEffects("For each tier you possess in this feat, your Resolve defense is increased by 1.");
        Indomitable_Resolve.setSpecial("None");

        featList.add(Indomitable_Resolve);

        OLFeats Inspiring_Champion = new OLFeats();
        Inspiring_Champion.setTitle("Inspiring Champion");
        Inspiring_Champion.setMaxLevel(3);
        Inspiring_Champion.setFeatCost(2);
        Inspiring_Champion.setDescription("You fight with such bravery, heroism, or bravado that your allies are inspired to fight beyond their usual mettle. Common examples of characters who typify this feat include a shining knight, a fearless platoon leader, and a heroic bard.");
        Inspiring_Champion.setPrerequisites("Tier 1: Presence - 4\nTier 2: Presence - 5\nTier 3: Presence - 6");
        Inspiring_Champion.setEffects("Once per round, when your roll for a damaging attack exceeds an enemy's defense by 10 or more, you can grant healing to your allies as outlined below. In order to gain this healing, allies must be within a range of 5' times your Presence score.\n\tTier 1 - A single ally that can see the attack heals 1d4 HP.\n\tTier 2 - A number of allies equal to your Presence score who can see the attack heal 1d4 HP.\n\tTier 3 - All allies who can see the attack heal 2d4 HP.");
        Inspiring_Champion.setSpecial("None");

        featList.add(Inspiring_Champion);

        OLFeats Knowledge = new OLFeats();
        Knowledge.setTitle("Knowledge");
        Knowledge.setMaxLevel(3);
        Knowledge.setFeatCost(2);
        Knowledge.setDescription("Whether through extensive study or years of first hand experience, you have knowledge of a particular subject which far surpasses your general intelligence. A navigator well versed in the galactic map, a barbarian warlord with years of experience with military strategy, and a professor of the paranormal are all examples of this feat in play.");
        Knowledge.setPrerequisites("None");
        Knowledge.setEffects("When you take this feat, choose a sphere of knowledge from the list below or, with the GM's approval, create a new one.\nExample spheres of knowledge include alchemy, anatomy, arcane, computers, explosives, engineering, geography, herbalism, history, location (must specify), medicine, military strategy, supernatural, and wilderness.\nYour tier in this feat determines how knowledgeable you are within your chosen sphere.\n\tTier 1 - You automatically succeed on any action roll related to your chosen sphere of knowledge with a CR of 16 or lower. For higher CRs, your Learning attribute is considered to be 3 for the action roll unless your Learning score is already 3 or higher, in which case you gain advantage 1 on the roll.\n\tTier 2 - You automatically succeed on any action roll related to your chosen sphere of knowledge with a CR of 22 or lower. For higher CRs, your Learning attribute is considered to be 6 for the action roll unless your Learning score is already 6 or higher, in which case you gain advantage 1 on the roll.\n\tTier 3 - You automatically succeed on any action roll related to your chosen sphere of knowledge with a CR of 26 or lower. For higher CRs, your Learning attribute is considered to be 8 for the action roll unless your Learning score is already 8 or higher, in which case you gain advantage 1 on the roll.");
        Knowledge.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new sphere of knowledge each time. Purchasing this feat in this way confers no benefit on other spheres of knowledge.");
        Knowledge.setCanBeTakenMoreThanOnce(true);

        featList.add(Knowledge);

        OLFeats Lethal_Strike = new OLFeats();
        Lethal_Strike.setTitle("Your tier in this feat determines how knowledgeable you are within your chosen sphere.Lethal Strike");
        Lethal_Strike.setMaxLevel(9);
        Lethal_Strike.setFeatCost(3);
        Lethal_Strike.setDescription("Like a highly trained sniper, a ninja of legend, or a feinting melee dervish, you can devastate your foes with an expertly placed attack when you catch them off guard.");
        Lethal_Strike.setPrerequisites("Tier 1: Agility - 3\nTier 4: Agility - 5\nTier 7: Agility - 7");
        Lethal_Strike.setEffects("Your attacks are considered lethal strikes whenever you fulfill one of the following conditions:\n\tYour target is caught off guard or otherwise unaware of the attack, such as when you are hidden from them, disguised as a friend, or have successfully deceived them.\n\tYour target is within melee attack range of an ally.\nYou gain advantage on lethal strikes equal to your tier in this feat. Additionally, a certain portion of the damage (not to exceed the total damage dealt) is considered lethal damage, which is more difficult to heal from (see Chapter 7: Combat).\n\tTier 1 - Advantage 1. Up to 5 lethal damage.\n\tTier 2 - Advantage 2. Up to 5 lethal damage.\n\tTier 3 - Advantage 3. Up to 10 lethal damage.\n\tTier 4 - Advantage 4. Up to 10 lethal damage.\n\tTier 5 - Advantage 5. Up to 15 lethal damage.\n\tTier 6 - Advantage 6. Up to 20 lethal damage.\n\tTier 7 - Advantage 7. Up to 20 lethal damage.\n\tTier 8 - Advantage 8. Up to 25 lethal damage.\n\tTier 9 - Advantage 9. Up to 25 lethal damage.");
        Lethal_Strike.setSpecial("None");

        featList.add(Lethal_Strike);

        OLFeats Lightning_Reflexes = new OLFeats();
        Lightning_Reflexes.setTitle("Lightning Reflexes");
        Lightning_Reflexes.setMaxLevel(5);
        Lightning_Reflexes.setFeatCost(1);
        Lightning_Reflexes.setDescription("You are always ready for danger, allowing you to easily get the drop on your foes. A highly trained gunslinger with a vigilant trigger finger and a covert operative always prepared for ambush are good examples of this feat in action.");
        Lightning_Reflexes.setPrerequisites("Tier 1: Agility or Prescience - 2\nTier 3: Agility or Prescience - 4");
        Lightning_Reflexes.setEffects("For each tier you possess in this feat, you gain advantage 1 on all initiative rolls.");
        Lightning_Reflexes.setSpecial("None");

        featList.add(Lightning_Reflexes);

        OLFeats Longshot = new OLFeats();
        Longshot.setTitle("Longshot");
        Longshot.setMaxLevel(1);
        Longshot.setFeatCost(1);
        Longshot.setDescription("Your expertise with a particular ranged weapon or extraordinary power enables you to strike targets at extreme distances that others would find impossible. This feat is common among snipers, fighter pilots, and war wizards.");
        Longshot.setPrerequisites("Agility or Might or Any Extraordinary - 5");
        Longshot.setEffects("When you take this feat, select one weapon or attack type. Examples of attack types you include fire, cold, lightning, acid, poison, entropy, creation, and force - though this list is not exhaustive. With the chosen weapon or attack type, your range with that weapon or attribute is doubled.");
        Longshot.setSpecial("You may take this feat multiple times. If you do, select a new weapon or attack type each time.");
        Longshot.setCanBeTakenMoreThanOnce(true);

        featList.add(Longshot);

        OLFeats Silencing_Strike = new OLFeats();
        Silencing_Strike.setTitle("Silencing Strike");
        Silencing_Strike.setMaxLevel(1);
        Silencing_Strike.setFeatCost(3);
        Silencing_Strike.setDescription("Like an expert assassin or ninja, you can render your foes completely unable to alert others of your presence. This might take the form of a dart to the larynx, a garrote around the throat, or simply a sturdy covering of the mouth.");
        Silencing_Strike.setPrerequisites("Agility - 4");
        Silencing_Strike.setEffects("Whenever you deal damage using a weapon with the precise property to a target that is caught off guard or otherwise unaware of the attack, such as when you are hidden from them, disguised as a friend, or have successfully deceived them, the target is afflicted with the silenced bane.");
        Silencing_Strike.setSpecial("None");

        featList.add(Silencing_Strike);

        OLFeats Martial_Focus = new OLFeats();
        Martial_Focus.setTitle("Martial Focus");
        Martial_Focus.setMaxLevel(1);
        Martial_Focus.setFeatCost(3);
        Martial_Focus.setDescription("Like a kensai warrior devoted to mastery of their katana or an assassin who exclusively wields their favored pistols, your training is hyper-focused on a single style of combat to the exclusion of all others.");
        Martial_Focus.setPrerequisites("Agility or Might - 1");
        Martial_Focus.setEffects("Choose a single weapon (or choose unarmed combat), and specify the attribute that your martial focus relies upon: Agility or Might. When making attacks using your chosen weapon, your attribute is considered 1 greater for the purposes of determining attribute dice. Your attribute is not changed for purposes of feats, banes, boons, or similar items. Because of your intense focus on a single combat style, any attacks that you make without your martial focus suffer disadvantage 1.");
        Martial_Focus.setSpecial("None");

        featList.add(Martial_Focus);

        OLFeats Master_Tracker = new OLFeats();
        Master_Tracker.setTitle("Master Tracker");
        Master_Tracker.setMaxLevel(1);
        Master_Tracker.setFeatCost(1);
        Master_Tracker.setDescription("You were made for the hunt. Whether you gained this ability through years of practice or possess it through heightened senses, the effect is the same: once you've picked up a trail, you almost never lose track of your quarry.");
        Master_Tracker.setPrerequisites("Perception - 4");
        Master_Tracker.setEffects("Unless blinded or thwarted through extraordinary means, you always know the direction of true north. In addition, once you successfully locate the trail of a target, you automatically succeed at all tracking attempts to continue following that trail for 7 days after the time you first picked it up. Only extraordinary concealment, targets in flight, or similarly exceptional cases can cause you to lose your mark.");
        Master_Tracker.setSpecial("None");

        featList.add(Master_Tracker);

        OLFeats Mimic = new OLFeats();
        Mimic.setTitle("Mimic");
        Mimic.setMaxLevel(1);
        Mimic.setFeatCost(2);
        Mimic.setDescription("You have honed your shapeshifting abilities to be able to not only change your form, but to even imitate specific creatures. Your powers may stem from studying the arts of deceptive magic, from a gene mutation, or even from innate extraordinary abilities.");
        Mimic.setPrerequisites("Alteration - 4 and Deception - 3");
        Mimic.setEffects("When you use the shapeshift boon, you may take on the features of a specific creature. For example, instead of merely transforming into an elf, you can assume the guise of Galdion the elven king. The disguise is near perfect for those examining you visually. If your behavior or other signs provide reasonable suspicion, an onlooker can attempt a Perception roll with a Challenge Rating equal to 10 + triple your Alteration or Deception score, whichever is higher. If they succeed, they will recognize your disguise.");
        Mimic.setSpecial("None");

        featList.add(Mimic);

        OLFeats Multi_Attack_Specialist = new OLFeats();
        Multi_Attack_Specialist.setTitle("Multi-Attack Specialist");
        Multi_Attack_Specialist.setMaxLevel(6);
        Multi_Attack_Specialist.setFeatCost(3);
        Multi_Attack_Specialist.setDescription("Whether you are delivering a flurry of blows, wielding two weapons, or calling a chain of lightning bolts from the sky, you have mastered the art of delivering multiple attacks.");
        Multi_Attack_Specialist.setPrerequisites("None");
        Multi_Attack_Specialist.setEffects("At the start of your turn, you may declare that you are multi-attacking. You must state how many extra attacks you would like to make. You receive a corresponding number of additional major actions, which can only be used for attacks. All of your attacks this round suffer disadvantage equal to 3 times the number of additional attacks you declare (i.e., if you make 2 attacks, you suffer disadvantage 3; 3 attacks suffers disadvantage 6). For each tier of this feat that you possess, reduce the disadvantage penalty by 1. You may use your attacks to make any combination of bane or damaging attacks, but you may not invoke boons. Resolve each attack individually, applying any other multi-targeting options as you wish. You can move between each of these attacks and they can be used to target the same creature more than once. The number of additional attacks you can make with this feat is limited to 1 + half your level, rounded up. Thus, the limit is 2 additional attacks at 1st level, 3 additional attacks at 3rd level, and 6 additional attacks at 9th level. Example - Vax the Deathbringer has Multi-Attack Specialist (Tier III). He declares that he will be making three attacks this round (two additional attacks). Therefore, all of his attacks suffer disadvantage 3 (3 x 2 = 6, minus 3 for feat tier 3). His first attack is a necromantic burst targeting a 10'-cube. Because of the area of effect, Vax suffers an additional disadvantage 2, making his total disadvantage for that attack 5. For his second attack, Vax casts a spell of blindness on a single foe, making an action roll at disadvantage 3. For his final attack, Vax moves in to melee and uses his touch of death on three foes. Targeting 3 foes incurs an additional disadvantage 3, making his final attack roll suffer a total of disadvantage 6.");
        Multi_Attack_Specialist.setSpecial("None");

        featList.add(Multi_Attack_Specialist);

        OLFeats Multi_Bane_Specialist = new OLFeats();
        Multi_Bane_Specialist.setTitle("Multi-Bane Specialist");
        Multi_Bane_Specialist.setMaxLevel(1);
        Multi_Bane_Specialist.setFeatCost(3);
        Multi_Bane_Specialist.setDescription("You have mastered a signature attack that allows you to invoke two banes at once. A blast of ice that blinds and slows your enemy, a thunderous shotgun blast that hurls foes back and knocks them to the ground, and a wormtongue song that puts targets to sleep and alters their memory are all examples of a signature attack that could be created with this feat.");
        Multi_Bane_Specialist.setPrerequisites("Able to inflict both banes (see description)");
        Multi_Bane_Specialist.setEffects("Choose two banes that you are able to inflict and that share a common prerequisite attribute. You are able to inflict both banes with a single attack. The required attribute score for combining the banes is equal to the sum of their power levels (e.g., combining knockdown and slowed, both power level 1, would require an attribute score of 2). If the banes target different defenses, you choose which defense your attack targets. On a successful attack roll, the target is inflicted with both banes. They each persist independently of one another and must be resisted separately.");
        Multi_Bane_Specialist.setSpecial("In order to benefit from the bane focus feat when using a multi-bane attack, you must possess bane focus for both banes. You may take this feat more than once. If you do, you must choose a different pair of banes for the new instance of the feat.");

        featList.add(Multi_Bane_Specialist);

        OLFeats Multi_Target_Attack_Specialist = new OLFeats();
        Multi_Target_Attack_Specialist.setTitle("Multi-Target Attack Specialist");
        Multi_Target_Attack_Specialist.setMaxLevel(5);
        Multi_Target_Attack_Specialist.setFeatCost(2);
        Multi_Target_Attack_Specialist.setDescription("You are a master of wreaking havoc on many foes at once, whether it be with a whirlwind of your twin blades, a hail of gun fire, a massive wave of psionic energy, or a devastating ball of flame.");
        Multi_Target_Attack_Specialist.setPrerequisites("None");
        Multi_Target_Attack_Specialist.setEffects("When you choose this feat, you must decide to focus in area, ranged, or melee attacks. For each tier, you reduce the disadvantage penalty associated with multi-targeting for your chosen attack type by 1.");
        Multi_Target_Attack_Specialist.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new multi-target mode (area, ranged, or melee) each time. Track your feat tier separately for each targeting mode that you select for this feat.");
        Multi_Target_Attack_Specialist.setCanBeTakenMoreThanOnce(true);

        featList.add(Multi_Target_Attack_Specialist);

        OLFeats Multi_Target_Boon_Expert = new OLFeats();
        Multi_Target_Boon_Expert.setTitle("Multi-Target Boon Expert");
        Multi_Target_Boon_Expert.setMaxLevel(1);
        Multi_Target_Boon_Expert.setFeatCost(3);
        Multi_Target_Boon_Expert.setDescription("You have so mastered the art of aiding groups of allies that you can invoke certain boons effortlessly. A healing nova, a supernatural wind that gives flight to a group, and a time dilation that hastens a group of allies are all examples of this feat in action.");
        Multi_Target_Boon_Expert.setPrerequisites("Boon Focus and Multi-Target Boon Specialist II");
        Multi_Target_Boon_Expert.setEffects("When multi-targeting a boon for which you have the Boon Focus feat, you do not need to make an action roll if the disadvantage normally incurred from multi-targeting is completely negated by your Multi-Target Boon Specialist feat. Your invocation automatically succeeds.");
        Multi_Target_Boon_Expert.setSpecial("None");

        featList.add(Multi_Target_Boon_Expert);

        OLFeats Multi_Target_Boon_Specialist = new OLFeats();
        Multi_Target_Boon_Specialist.setTitle("Multi-Target Boon Specialist");
        Multi_Target_Boon_Specialist.setMaxLevel(9);
        Multi_Target_Boon_Specialist.setFeatCost(2);
        Multi_Target_Boon_Specialist.setDescription("You are a master of invoking boons for more than one target. A mass dimensional shift to an intermediary plane and a mass manifestation of entropic life draining are some examples of what this might look like in play.");
        Multi_Target_Boon_Specialist.setPrerequisites("None");
        Multi_Target_Boon_Specialist.setEffects("For each tier of this feat, you reduce the disadvantage penalty associated with invoking boons for multiple targets by 1.");
        Multi_Target_Boon_Specialist.setSpecial("None");

        featList.add(Multi_Target_Boon_Specialist);

        OLFeats Natural_Defense = new OLFeats();
        Natural_Defense.setTitle("Natural Defense");
        Natural_Defense.setMaxLevel(3);
        Natural_Defense.setFeatCost(2);
        Natural_Defense.setDescription("Whether through draconic heritage, a cyborg exoskeleton, or just a lifetime of conditioning, your skin is tough as nails, allowing your body to deflect blows that would cripple others.");
        Natural_Defense.setPrerequisites("Tier 1: None\nTier 2: Fortitude - 1\nTier 3: Fortitude - 2");
        Natural_Defense.setEffects("When you are not wearing armor, you gain a bonus to your Guard and Toughness defenses. Your bonus is determined by your tier in this feat:\n\tTier 1 - +1 bonus to Guard and Toughness.\n\tTier 2 - +2 bonus to Guard and Toughness.\n\tTier 3 - +3 bonus to Guard and Toughness.");
        Natural_Defense.setSpecial("None");

        featList.add(Natural_Defense);

        OLFeats Overpowering_Strike = new OLFeats();
        Overpowering_Strike.setTitle("Overpowering Strike");
        Overpowering_Strike.setMaxLevel(1);
        Overpowering_Strike.setFeatCost(2);
        Overpowering_Strike.setDescription("In combat, you are like a wrecking ball that clears the battlefield of your foes. The sheer force of your attacks is so great that you send opponents flying. A half-ogre wielding a massive tree branch and a super soldier trained to use the enemy's weight against themself are both examples of this feat in play.");
        Overpowering_Strike.setPrerequisites("Might - 4");
        Overpowering_Strike.setEffects("Each time you deal damage using a weapon that has the forceful property, you can choose to push the target five feet away from you.");
        Overpowering_Strike.setSpecial("None");

        featList.add(Overpowering_Strike);

        OLFeats Potent_Bane = new OLFeats();
        Potent_Bane.setTitle("Potent Bane");
        Potent_Bane.setMaxLevel(1);
        Potent_Bane.setFeatCost(3);
        Potent_Bane.setDescription("You are so adept at a particular form of attack that your foes struggle to shake off the effects. Perhaps the flames of your fireballs burn hotter. Or maybe you've developed a special chemical to mix in with your blinding powder. Whatever the source and whatever the effect, most enemies are incapable of recovering from your legendary attack.");
        Potent_Bane.setPrerequisites("Ability to invoke the chosen bane");
        Potent_Bane.setEffects("Choose one bane that you can invoke that has a duration of \"resist ends\". When a target makes a resist roll to shake off your invocation of the chosen bane, they have disadvantage 1.");
        Potent_Bane.setSpecial("You may select this feat multiple times. Each time you take it, choose a different bane.");

        featList.add(Potent_Bane);

        OLFeats Reactionary_Trance = new OLFeats();
        Reactionary_Trance.setTitle("Reactionary Trance");
        Reactionary_Trance.setMaxLevel(1);
        Reactionary_Trance.setFeatCost(2);
        Reactionary_Trance.setDescription("Your intense focus never lapses, allowing you to tap into your heightened battle trance at a moment's notice. Examples of this feat in play include a hulking brute who snaps into a rage at the first sign of danger and a trained gunslinger who is always ready for a fight.");
        Reactionary_Trance.setPrerequisites("Will - 6 and Battle Trance");
        Reactionary_Trance.setEffects("You can enter a battle trance (as per the Battle Trance feat) as a free action even when it is not your turn. You may choose to do so in reaction to another action, such as an enemy's attack, spell, or insult. You may even declare your intent to enter a battle trance after the action has been resolved (such as after the attack has already been rolled). The benefits granted from your battle trance take place before the triggering action is resolved, potentially negating damage or harmful effects that you would have otherwise incurred.");
        Reactionary_Trance.setSpecial("None");

        featList.add(Reactionary_Trance);

        OLFeats Reckless_Attack = new OLFeats();
        Reckless_Attack.setTitle("Reckless Attack");
        Reckless_Attack.setMaxLevel(1);
        Reckless_Attack.setFeatCost(3);
        Reckless_Attack.setDescription("By willingly punishing your own body in the heat of battle, you launch a relentless flurry of attacks that physically drains you but devastates your foes. A super soldier activating a stim pack and a berserker pushing their muscles to the breaking point are examples of this feat in action.");
        Reckless_Attack.setPrerequisites("Battle Trance");
        Reckless_Attack.setEffects("While you are in a battle trance, on your turn you may choose to inflict 5 hit points of damage on yourself to make an attack as a minor action. Effects that prevent or reduce damage cannot affect this self-inflicted damage. You suffer the damage before making your extra attack, so you must be able to remain conscious after the damage is dealt in order to benefit from your extra attack.");
        Reckless_Attack.setSpecial("None");

        featList.add(Reckless_Attack);

        OLFeats Resilient = new OLFeats();
        Resilient.setTitle("Resilient");
        Resilient.setMaxLevel(1);
        Resilient.setFeatCost(3);
        Resilient.setDescription("Whether through luck, extraordinary will, or exceptional courage, you are able to shake off banes quicker than others. This feat can fit almost any character concept: a halfling who always has luck shining on him, a sorceress with an aura of protection, a paladin blessed by a deity, or an absent-minded professor who has no time to let disturbances get in the way of study.");
        Resilient.setPrerequisites("Fortitude or Presence or Will - 3");
        Resilient.setEffects("Any time you make a resist roll, you have advantage 1 on the roll.");
        Resilient.setSpecial("None");

        featList.add(Resilient);

        OLFeats Sentinel = new OLFeats();
        Sentinel.setTitle("Sentinel");
        Sentinel.setMaxLevel(3);
        Sentinel.setFeatCost(3);
        Sentinel.setDescription("Your heightened awareness on the battlefield means that you are nearly impossible to catch flat-footed and are always prepared to defend yourself or allies. This feat is typified by such character concepts as the bodyguard, the abjurer, and the psychic defender.");
        Sentinel.setPrerequisites("Agility or Might or Any Extraordinary - 5");
        Sentinel.setEffects("Once per round, after you have expended your next major action to perform a defend action, you get an additional major action that must be spent before the start of your next turn to make another defend action. Multiple tiers of this feat grant additional major actions usable only for defend actions.");
        Sentinel.setSpecial("None");

        featList.add(Sentinel);

        OLFeats Skill_Specialization = new OLFeats();
        Skill_Specialization.setTitle("Skill Specialization");
        Skill_Specialization.setMaxLevel(5);
        Skill_Specialization.setFeatCost(2);
        Skill_Specialization.setDescription("You have the eyes of an eagle, the endurance of an ox, the guile of a fox, or some similarly exceptional non-combat talent. It might come from intense training, prolonged study, or even an inherent natural talent.");
        Skill_Specialization.setPrerequisites("None");
        Skill_Specialization.setEffects("Choose one attribute. Any time you make a roll using the chosen attribute that is not for initiative, attacks, invocations, or the defend action, you gain advantage 1 on the roll per tier of this feat you possess for that attribute.");
        Skill_Specialization.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new attribute each time. Track your feat tier separately for each attribute that you choose for this feat.");
        Skill_Specialization.setCanBeTakenMoreThanOnce(true);

        featList.add(Skill_Specialization);

        OLFeats Superior_Concentration = new OLFeats();
        Superior_Concentration.setTitle("Superior Concentration");
        Superior_Concentration.setMaxLevel(3);
        Superior_Concentration.setFeatCost(3);
        Superior_Concentration.setDescription("Your powers of focus are exceptionally honed, allowing you to maintain concentration on multiple extraordinary effects at once. This feat is typical among character concepts built to enhance themselves or their allies, such as bards, platoon leaders, or engineers.");
        Superior_Concentration.setPrerequisites("None");
        Superior_Concentration.setEffects("When you take the sustain a boon minor action, you may sustain one additional boon per tier of this feat which you possess.");
        Superior_Concentration.setSpecial("None");

        featList.add(Superior_Concentration);


        OLFeats Swimming = new OLFeats();
        Swimming.setTitle("Swimming");
        Swimming.setMaxLevel(1);
        Swimming.setFeatCost(1);
        Swimming.setDescription("You are made for the water and can swim at surprising speeds with the aptitude of a fish. This might be the result of hard core training, or it may stem from a racial trait, such as webbed feet and hands.");
        Swimming.setPrerequisites("None");
        Swimming.setEffects("You gain a swimming speed equal to your base speed and do not need to make any special action rolls to maintain this base speed.");
        Swimming.setSpecial("None");

        featList.add(Swimming);

        OLFeats Sworn_Enemy = new OLFeats();
        Sworn_Enemy.setTitle("Sworn Enemy");
        Sworn_Enemy.setMaxLevel(9);
        Sworn_Enemy.setFeatCost(1);
        Sworn_Enemy.setDescription("You are expertly focused on dealing with a particular species, race, or faction. Perhaps your family was slain by werewolves, and you have devoted your life to studying their mannerisms in order to hunt them down. Or maybe you were raised in a prison on the third moon of Vogax Prime, and you know the Vogans better than they know themselves.");
        Sworn_Enemy.setPrerequisites("None");
        Sworn_Enemy.setEffects("Choose a species, race, or faction (e.g., dragons, Void Templars, gnolls, or vampires). You learn the primary conversational language of that species, and at the GM's discretion, you may have some level of access to other special forms of communication (such as thieves' cant or secret hand signals). Furthermore, you gain advantage 1 per tier of this feat to all Mental attribute rolls (Learning, Logic, Perception, and Will) pertaining to your chosen group.");
        Sworn_Enemy.setSpecial("In addition to purchasing multiple tiers of this feat, you may take this feat multiple times and select a new group each time. Your total advantage on Mental attribute rolls is equal to your tier for that particular group. For example, a character might have Sworn Enemy II (Void Templars) and Sworn Enemy IV (Werewolves).");
        Sworn_Enemy.setCanBeTakenMoreThanOnce(true);

        featList.add(Sworn_Enemy);

        OLFeats Tough_as_Nails = new OLFeats();
        Tough_as_Nails.setTitle("Tough as Nails");
        Tough_as_Nails.setMaxLevel(2);
        Tough_as_Nails.setFeatCost(2);
        Tough_as_Nails.setDescription("You have a remarkable ability to shrug off pain and punishment that would take down lesser heroes. This power might stem from your rocky carapace, extreme combat training, or simply an extra dose of grit that you acquired from a hard life.");
        Tough_as_Nails.setPrerequisites("Tier 1: Fortitude - 3\nTier 2: Fortitude - 5");
        Tough_as_Nails.setEffects("You permanently gain 5 extra hit points per tier of this feat you possess.");
        Tough_as_Nails.setSpecial("None");

        featList.add(Tough_as_Nails);

        OLFeats Two_Weapon_Brute = new OLFeats();
        Two_Weapon_Brute.setTitle("Two Weapon Brute");
        Two_Weapon_Brute.setMaxLevel(1);
        Two_Weapon_Brute.setFeatCost(3);
        Two_Weapon_Brute.setDescription("Being both physically powerful and incredibly agile, you are able to wield a weapon in one-hand that requires two hands for others. Good examples of this feat in action include an orcish barbarian wielding a great axe and shield and a survivor in the zombie apocalypse wielding two chainsaws.");
        Two_Weapon_Brute.setPrerequisites("Agility - 4 and Might - 5 and Multi-Attack Specialist");
        Two_Weapon_Brute.setEffects("You can wield weapons with the two-handed property in one hand and you gain the benefits of both the two-handed and one-handed property while doing so. This means that you gain a total of advantage 2 when wielding a two-handed weapon in each hand, advantage 1 from the power of a two-handed weapon plus advantage 1 from having one weapon in each hand.");
        Two_Weapon_Brute.setSpecial("None");

        featList.add(Two_Weapon_Brute);

        OLFeats Two_Weapon_Defense = new OLFeats();
        Two_Weapon_Defense.setTitle("Two Weapon Defense");
        Two_Weapon_Defense.setMaxLevel(1);
        Two_Weapon_Defense.setFeatCost(2);
        Two_Weapon_Defense.setDescription("Your mastery of two weapon fighting allows you not only to come at your foes with a flurry of attacks, but also to shield yourself exceptionally well by deflecting incoming attacks with your weapons. Duelists, rangers, and space pirates are all concepts that could make use of this feat.");
        Two_Weapon_Defense.setPrerequisites("Agility - 4 and Attack Specialization");
        Two_Weapon_Defense.setEffects("When you wield a weapon you've taken the Attack Specialization feat for in each hand, you gain a +1 armor bonus to your Guard defense.");
        Two_Weapon_Defense.setSpecial("None");

        featList.add(Two_Weapon_Defense);

        OLFeats Unending_Charm = new OLFeats();
        Unending_Charm.setTitle("Unending Charm");
        Unending_Charm.setMaxLevel(1);
        Unending_Charm.setFeatCost(3);
        Unending_Charm.setDescription("Whether you are an enchanter, psychic, or mad scientist, you have mastered the art of enthralling others. Your charms are so potent that your victims may fall permanently under your compulsion.");
        Unending_Charm.setPrerequisites("Influence - 4");
        Unending_Charm.setEffects("When you invoke the charmed bane, targets who do not make their resist roll within 24 hours of being afflicted become permanently affected by the bane. They do not receive any more resist rolls to shake themselves free of the effect. Other extraordinary effects like a nullify bane can still end the effect (and other methods may work at the GM's discretion).");
        Unending_Charm.setSpecial("None");

        featList.add(Unending_Charm);

        OLFeats Untrackable = new OLFeats();
        Untrackable.setTitle("Untrackable");
        Untrackable.setMaxLevel(1);
        Untrackable.setFeatCost(1);
        Untrackable.setDescription("Whether this power manifests itself as vines that grow in your wake, a magical ward against detection, or an illusory veil, the effect is the same: you are protected from being tracked.");
        Untrackable.setPrerequisites("Agility or Alteration or Influence - 3");
        Untrackable.setEffects("Your travel is veiled by special means that conceal your tracks and any evidence of your passage even after you are far away. It is impossible to follow your tracks except by extraordinary means.");
        Untrackable.setSpecial("None");

        featList.add(Untrackable);

        OLFeats Vicious_Strike = new OLFeats();
        Vicious_Strike.setTitle("Vicious Strike");
        Vicious_Strike.setMaxLevel(1);
        Vicious_Strike.setFeatCost(2);
        Vicious_Strike.setDescription("Whether through brute force, lethal precision, or volatile magic, a deadly attack delivered by you is exceptionally vicious. Berserkers, assassins, and superheroes of exceptional combat skill are all good examples of this feat in play.");
        Vicious_Strike.setPrerequisites("None");
        Vicious_Strike.setEffects("Any time you roll a natural 20 on the d20 for an attack action roll, you get advantage 1 on all subsequent d20 re-rolls granted by dice explosions.");
        Vicious_Strike.setSpecial("None");

        featList.add(Vicious_Strike);

        OLFeats Wealthy = new OLFeats();
        Wealthy.setTitle("Wealthy");
        Wealthy.setMaxLevel(1);
        Wealthy.setFeatCost(3);
        Wealthy.setDescription("Whether you were born into nobility, come from old money, are heir to a great treasure, or simply a well-established merchant, you are wealthier than the average adventurer.");
        Wealthy.setPrerequisites("None");
        Wealthy.setEffects("Your wealth score is increased by 1.");
        Wealthy.setSpecial("None");

        featList.add(Wealthy);

        OLFeats Well_Rounded = new OLFeats();
        Well_Rounded.setTitle("Well-Rounded");
        Well_Rounded.setMaxLevel(1);
        Well_Rounded.setFeatCost(2);
        Well_Rounded.setDescription("You have a versatile education, a wide range of experiences, or just plain old good luck. The result is that you're pretty good at things you're not specialized in.");
        Well_Rounded.setPrerequisites("None");
        Well_Rounded.setEffects("Any time you use an attribute with a score of 2 or less to make an action roll outside of combat that is not a bane or boon invocation, you gain advantage 1 to the roll.");
        Well_Rounded.setSpecial("None");

        featList.add(Well_Rounded);
    }
}