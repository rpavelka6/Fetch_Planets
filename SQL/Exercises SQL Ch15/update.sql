UPDATE seeds
SET use_by = 2025
WHERE seed_id = 1;

SELECT *
FROM seeds;

UPDATE seeds
SET use_by = 2050, seed_id = 55
WHERE seed_id = 4;

SELECT *
FROM seeds;