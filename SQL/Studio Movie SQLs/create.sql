CREATE TABLE directors (
director_id INTEGER PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
country VARCHAR(80)
);

CREATE TABLE movies (
movie_id INTEGER PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(150),
year_released INTEGER,
director_id INTEGER,
FOREIGN KEY (director_id) REFERENCES directors(director_id)
);

