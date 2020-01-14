SELECT title
FROM movies;

SELECT title, year_released
FROM movies
ORDER BY year_released DESC;

SELECT *
FROM directors
ORDER BY country ASC;

SELECT *
FROM directors
ORDER BY country ASC, last_name;

INSERT INTO directors (first_name, last_name, country)
VALUES ("Rob", "Reiner", "USA");

SELECT last_name,first_name, director_id
FROM directors
WHERE last_name = "Reiner" AND first_name = "Rob";

INSERT INTO movies (title, year_released, director_id)
VALUES ("The Princess Bride", 1987, 11);

SELECT movies.title, movies.year_released, directors.last_name
FROM movies
INNER JOIN directors ON movies.director_id = directors.director_id;

SELECT movies.title, movies.year_released, directors.first_name, directors.last_name
FROM movies
INNER JOIN directors ON movies.director_id = directors.director_id
ORDER BY directors.last_name ASC;

SELECT directors.first_name, directors.last_name, movies.title
FROM directors
/* WHERE movies.title = 'The Incredibles' AND movies.director_id = directors.director_id; */
INNER JOIN movies ON directors.director_id = directors.director_id
WHERE movies.title = 'The Incredibles';




