-- Insert data into Restaurant table
INSERT INTO restaurant (id, name, address, cuisineType, rating) VALUES
(1, 'Fine Dining', '123 Main St', 'European', 5),
(2, 'Taco Bell', '456 Elm St', 'Fast Food', 3),
(3, 'Sushi Place', '789 Oak St', 'Japanese', 4);

-- Insert data into Chef table
INSERT INTO chef (id, firstName, lastName, expertise, experienceYears, restaurantId) VALUES
(1, 'John', 'Doe', 'Sous Chef', 5, 1),
(2, 'Jane', 'Doe', 'Pastry Chef', 7, 1),
(3, 'Mike', 'Smith', 'Head Chef', 10, 2),
(4, 'Emily', 'Johnson', 'Sushi Chef', 8, 3),
(5, 'Anna', 'Williams', 'Pastry Chef', 6, 3),
(6, 'Mark', 'Brown', 'Sous Chef', 4, 2);