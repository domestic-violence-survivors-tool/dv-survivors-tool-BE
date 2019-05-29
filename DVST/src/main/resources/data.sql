DELETE
FROM averagerent;

DELETE
FROM State;

INSERT INTO state (stateid, state)
	VALUES (1, 'Alabama'), (2, 'Alaska'), (3, 'Arizona'), (4, 'Arkansas'),
           (5, 'California'), (6, 'Colorado'), (7, 'Connecticut'),(8, 'Delaware'),
           (9, 'Florida'), (10, 'Georgia'), (11, 'Hawaii'), (12, 'Idaho'),
           (13, 'Illinois'), (14, 'Indiana'), (15, 'Iowa'), (16, 'Kansas'),
           (17, 'Kentucky'), (18, 'Louisiana'), (19, 'Maine'), (20, 'Maryland'),
           (21, 'Massachusetts'), (22, 'Michigan'), (23, 'Minnesota'), (24, 'Mississippi'),
           (25, 'Missouri'), (26, 'Montana'), (27, 'Nebraska'), (28, 'Nevada'),
           (29, 'New Hampshire'), (30, 'New Jersey'), (31, 'New Mexico'), (32, 'New York'),
           (33, 'North Carolina'), (34, 'North Dakota'), (35, 'Ohio'), (36, 'Oklahoma'),
           (37, 'Oregon'), (38, 'Pennsylvania'), (39, 'Rhode Island'), (40, 'South Carolina'),
           (41, 'South Dakota'), (42, 'Tennessee'), (43, 'Texas'), (44, 'Utah'),
           (45, 'Vermont'), (46, 'Virginia'), (47, 'Washington'), (48, 'West Virginia'),
           (49, 'Wisconsin'), (50, 'Wyoming');

INSERT INTO averagerent (rentid, sharedbedroomrent, studioroomapartmentrent, onebedroomapartmentrent, twobedroomapartmentrent, threebedroomapartmentrent, stateid)
    VALUES(51, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 1),
          (52, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 2),
          (53, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 3),
          (54, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 4),
          (55, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 5),
          (56, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 6),
          (57, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 7),
          (58, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 8),
          (59, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 9),
          (60, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 10),
          (61, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 11),
          (62, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 12),
          (63, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 13),
          (64, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 14),
          (65, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 15),
          (66, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 16),
          (67, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 17),
          (68, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 18),
          (69, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 19),
          (70, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 20),
          (71, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 21),
          (72, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 22),
          (73, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 23),
          (74, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 24),
          (75, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 25),
          (76, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 26),
          (77, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 27),
          (78, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 28),
          (79, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 29),
          (80, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 30),
          (81, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 31),
          (82, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 32),
          (83, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 33),
          (84, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 34),
          (85, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 35),
          (86, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 36),
          (87, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 37),
          (88, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 38),
          (89, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 39),
          (90, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 40),
          (91, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 41),
          (92, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 42),
          (93, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 43),
          (94, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 44),
          (95, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 45),
          (96, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 46),
          (97, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 47),
          (98, 'Charlie', 'Sally', 'Sally', 'Sally', 'Sally', 48),
          (99, 'Sally', 'Sally', 'Sally', 'Sally', 'Sally', 49),
          (100, 'Lucy', 'Sally', 'Sally', 'Sally', 'Sally', 50);





alter sequence hibernate_sequence restart with 20;