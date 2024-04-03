CREATE TABLE IF NOT EXISTS seeds (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    seedName VARCHAR(255),
    minPlantWeek INT,
    maxPlantWeek INT,
    spaceBtwLine INT,
    spaceBtwFeet INT
);