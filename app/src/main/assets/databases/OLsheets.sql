BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "player" (
	"_id"	INTEGER,
	"playerName"	TEXT,
	"type"	TEXT,
	"charName"	TEXT,
	"nickname"	TEXT,
	"levelTotal"	INTEGER,
	"deity"	TEXT,
	"languages"	TEXT,
	"bio"	TEXT,
	"agility"	INTEGER,
	"fortitude"	INTEGER,
	"might"	INTEGER,
	"learning"	INTEGER,
	"logic"	INTEGER,
	"perception"	INTEGER,
	"will"	INTEGER,
	"deception"	INTEGER,
	"persuasion"	INTEGER,
	"presence"	INTEGER,
	"alteration"	INTEGER,
	"creation"	INTEGER,
	"energy"	INTEGER,
	"entropy"	INTEGER,
	"influence"	INTEGER,
	"movement"	INTEGER,
	"prescience"	INTEGER,
	"protection"	INTEGER,
	"armor"	INTEGER,
	"damageTaken"	INTEGER,
	"speed"	INTEGER,
	"feats"	TEXT,
	"perks"	TEXT,
	"flaws"	TEXT,
	"inventorySize"	INTEGER,
	"items"	TEXT,
	"itemInfo"	TEXT,
	"wealth"	INTEGER,
	PRIMARY KEY("_id")
);
CREATE TABLE IF NOT EXISTS "android_metadata" (
	"locale"	TEXT DEFAULT 'en_US'
);
INSERT INTO "player" VALUES (1,'Geoffery Powell','pc','Tazmur','Taz',10,'Kalle Demos','["Gerudo", "Hylian", "Sheikah"]','Possibly an evil male Gerudo who wanders the land lacking any real home. In his travels he befriended an extremely magical cat named Noujou. It’s possible he has evil goals in life but he’s pretty chill.',2,2,0,2,0,2,2,0,0,2,6,0,4,0,0,4,0,0,1,0,30,'["N/A"]','["N/A"]','["N/A"]',NULL,'["Leather Armor", "Dagger", "Dagger", "Bow", "Creature Book", "Mask Collection (10)", "Magic Pearl"]','["(+1 Guard)", "Agility v. Guard - (Advantage 1 & Initiative + 1)", "Agility v. Guard - (Advantage 1 & Initiative + 1)", "Agility v. Guard - Range 125ft", "Advantage on Creature Knowledge", "Collection of Masks from the Happy Mask Sales Men", "Magic Peal with the power to stop the transformitive effects of the Dark World"]',3);
INSERT INTO "android_metadata" VALUES ('en_US');
COMMIT;