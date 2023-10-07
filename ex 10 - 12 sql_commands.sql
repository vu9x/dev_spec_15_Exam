USE human_friends;

# 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
# питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

DROP TABLE IF EXISTS camels;


CREATE TEMPORARY TABLE packs_temp AS
	SELECT pack_id, name, birthday, command
	FROM horses

	UNION ALL
	
	SELECT pack_id, name, birthday, command
	FROM donkeys;

select * from packs_temp;


CREATE TEMPORARY TABLE pets_temp AS
	SELECT pet_id, name, birthday, command
	FROM dogs

	UNION ALL
	
	SELECT pet_id, name, birthday, command
	FROM cats
	
	UNION ALL 
	
	SELECT pet_id, name, birthday, command
	FROM hamsters;

select * from pets_temp;


# 11.Создать новую таблицу “молодые животные” в которую попадут все
# животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
# до месяца подсчитать возраст животных в новой таблице

CREATE TEMPORARY TABLE animals_all AS
	select packs_temp.pack_id, packs_temp.name, packs_temp.birthday, packs_temp.command, packs.id, animals.id as animalID, animals.animal_type, packs.pack_type
	from packs_temp
	INNER JOIN packs ON packs.id=packs_temp.pack_id
	INNER JOIN animals ON animals.id = packs.animal_id

	UNION ALL
	
	select pets_temp.pet_id, pets_temp.name, pets_temp.birthday, pets_temp.command, pets.id, animals.id as animalID, animals.animal_type, pets.pet_type 
	from pets_temp
	INNER JOIN pets ON pets.id=pets_temp.pet_id
	INNER JOIN animals ON animals.id = pets.animal_id;

SELECT * 
FROM animals_all
WHERE TIMESTAMPDIFF(MONTH, birthday, NOW()) > 12 AND TIMESTAMPDIFF(MONTH, birthday, NOW()) < 36;
