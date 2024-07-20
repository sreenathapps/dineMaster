-- Create Restaurant table
DROP TABLE IF EXISTS Chef;
DROP TABLE IF EXISTS Restaurant;

CREATE TABLE IF NOT EXISTS restaurant (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    address TEXT,
    cuisineType TEXT,
    rating INTEGER
);

-- Create Chef table
CREATE TABLE IF NOT EXISTS chef (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    firstName TEXT,
    lastName TEXT,
    expertise TEXT,
    experienceYears INTEGER,
    restaurantid INTEGER,
    FOREIGN KEY (restaurantid) REFERENCES restaurant(id) ON DELETE CASCADE
);
