INSERT INTO UTILISATEUR (date_de_naissance, dtype, adresse_email, mot_de_passe, nom, prenom)
VALUES ('1990-01-01', 'test', 'exemple@example.com', 'motdepasse', 'Doe', 'John');

INSERT INTO RECETTE(jardinier_id, contenu, intitule) VALUES (1, 'Description recette...', 'Pâtes au légumes');

INSERT INTO FAMILLE (couleurrgb, nom) VALUES ('col1', 'Fruit');
INSERT INTO FAMILLE (couleurrgb, nom) VALUES ('col2', 'Legume');

INSERT INTO TYPE_DE_GRAINE (seed_name, min_Plant_Week, max_Plant_Week, space_Btw_Line, space_Btw_Feet, famille_id)
VALUES ('Carotte', 13, 14, 60, 5, 2);
INSERT INTO TYPE_DE_GRAINE (seed_name, min_Plant_Week, max_Plant_Week, space_Btw_Line, space_Btw_Feet, famille_id)
VALUES ('Courgette', 22, 23, 120, 75, 2);
INSERT INTO TYPE_DE_GRAINE (seed_name, min_Plant_Week, max_Plant_Week, space_Btw_Line, space_Btw_Feet, famille_id)
VALUES ('Haricot', 22, 23, 100, 15, 2);
INSERT INTO TYPE_DE_GRAINE (seed_name, min_Plant_Week, max_Plant_Week, space_Btw_Line, space_Btw_Feet, famille_id)
VALUES ('Laitue pommée', 13, 14, 55, 25, 2);
INSERT INTO TYPE_DE_GRAINE (seed_name, min_Plant_Week, max_Plant_Week, space_Btw_Line, space_Btw_Feet, famille_id)
VALUES ('Oignon', 14, 14, 40, 8, 2);
INSERT INTO TYPE_DE_GRAINE (seed_name, min_Plant_Week, max_Plant_Week, space_Btw_Line, space_Btw_Feet, famille_id)
VALUES ('Radis', 14, 16, 45, 2.5, 2);
INSERT INTO TYPE_DE_GRAINE (seed_name, min_Plant_Week, max_Plant_Week, space_Btw_Line, space_Btw_Feet, famille_id)
VALUES ('Tomate', 21, 24, 90, 80, 1);

INSERT INTO TYPE_DE_GRAINE_RECETTE (recette_id, type_de_graine_id) VALUES (1, 2);
INSERT INTO TYPE_DE_GRAINE_RECETTE (recette_id, type_de_graine_id) VALUES (1, 7);
INSERT INTO TYPE_DE_GRAINE_RECETTE (recette_id, type_de_graine_id) VALUES (1, 3);