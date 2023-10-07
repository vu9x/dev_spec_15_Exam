USE human_friends;

INSERT INTO animals (`animal_type`)
VALUES
	('pets'),
	('packs');

INSERT INTO pets (animal_id, pet_type)
VALUES
	(1, 'dogs'),
	(1, 'cats'),
	(1, 'hamsters');

INSERT INTO packs (animal_id, pack_type)
VALUES
	(2, 'horses'),
	(2, 'camels'),
	(2, 'donkeys');


# Insert pets
INSERT INTO dogs(pet_id, name, birthday, command)
VALUES
	(1, 'dog_name1', '2018.01.20', 'sit down'),
	(1, 'dog_name2', '2019.01.20', 'sit down'),
	(1, 'dog_name3', '2023.01.20', 'sit down');


INSERT INTO cats(pet_id, name, birthday, command)
VALUES
	(2, 'cat_name1', '2020.01.20', 'eat'),
	(2, 'cat_name2', '2022.01.20', 'eat'),
	(2, 'cat_name3', '2023.01.20', 'eat');

INSERT INTO hamsters (pet_id, name, birthday, command)
VALUES
	(3, 'hamster_name1', '2022.01.20', 'eat'),
	(3, 'hamster_name2', '2022.01.20', 'eat'),
	(3, 'hamster_name3', '2023.01.20', 'eat');


# Insert packs
INSERT INTO horses (pack_id, name, birthday, command)
VALUES
	(1, 'horse_name1', '2018.01.20', 'run'),
	(1, 'horse_name2', '2019.01.20', 'run'),
	(1, 'horse_name3', '2023.01.20', 'run');


INSERT INTO camels (pack_id, name, birthday, command)
VALUES
	(2, 'camel_name1', '2020.01.20', 'go'),
	(2, 'camel_name2', '2022.01.20', 'go'),
	(2, 'camel_name3', '2023.01.20', 'go');

INSERT INTO donkeys  (pack_id, name, birthday, command)
VALUES	
	(3, 'donkey_name1', '2022.01.20', 'ride'),
	(3, 'donkey_name2', '2022.01.20', 'ride'),
	(3, 'donkey_name3', '2023.01.20', 'ride');

select * from donkeys
