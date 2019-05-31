DELETE
FROM averagerent;

DELETE
FROM State;

INSERT INTO state (stateid, state, crimerating)
	VALUES (1, 'Alabama', '44'), (2, 'Alaska', '49'), (3, 'Arizona', '43'), (4, 'Arkansas', '46'),
           (5, 'California', '35'), (6, 'Colorado', '33'), (7, 'Connecticut', '8'),(8, 'Delaware', '34'),
           (9, 'Florida', '30'), (10, 'Georgia', '37'), (11, 'Hawaii', '25'), (12, 'Idaho', '5'),
           (13, 'Illinois', '23'), (14, 'Indiana', '27'), (15, 'Iowa', '17'), (16, 'Kansas', '39'),
           (17, 'Kentucky', '13'), (18, 'Louisiana', '48'), (19, 'Maine', '1'), (20, 'Maryland', '32'),
           (21, 'Massachusetts', '10'), (22, 'Michigan', '20'), (23, 'Minnesota', '15'), (24, 'Mississippi', '26'),
           (25, 'Missouri', '42'), (26, 'Montana', '29'), (27, 'Nebraska', '19'), (28, 'Nevada', '41'),
           (29, 'New Hampshire', '3'), (30, 'New Jersey', '4'), (31, 'New Mexico', '50'), (32, 'New York', '12'),
           (33, 'North Carolina', '28'), (34, 'North Dakota', '18'), (35, 'Ohio', '22'), (36, 'Oklahoma', '40'),
           (37, 'Oregon', '31'), (38, 'Pennsylvania', '11'), (39, 'Rhode Island', '7'), (40, 'South Carolina', '45'),
           (41, 'South Dakota', '21'), (42, 'Tennessee', '47'), (43, 'Texas', '36'), (44, 'Utah', '24'),
           (45, 'Vermont', '2'), (46, 'Virginia', '6'), (47, 'Washington', '38'), (48, 'West Virginia', '16'),
           (49, 'Wisconsin', '14'), (50, 'Wyoming', '9');

INSERT INTO averagerent (rentid, renttype, rent, stateid)
    VALUES(51, 'Studio Apartment', 591, 1),
          (52, 'One Bedroom Apartment', 639, 1),
          (53, 'Two Bedroom Apartment', 772, 1),
          (54, 'Three Bedroom Apartment', 1021, 1),

          (55, 'Studio Apartment', 891, 2),
          (56, 'One Bedroom Apartment', 984, 2),
          (57, 'Two Bedroom Apartment', 1272, 2),
          (58, 'Three Bedroom Apartment', 1792, 2),

          (59, 'Studio Apartment', 701, 3),
          (60, 'One Bedroom Apartment', 806, 3),
          (61, 'Two Bedroom Apartment', 1011, 3),
          (62, 'Three Bedroom Apartment', 1454, 3),

          (63, 'Studio Apartment', 537, 4),
          (64, 'One Bedroom Apartment', 586, 4),
          (250, 'Two Bedroom Apartment', 736, 4),
          (65, 'Three Bedroom Apartment', 991, 4),

          (66, 'Studio Apartment', 1156, 5),
          (67, 'One Bedroom Apartment', 1358, 5),
          (68, 'Two Bedroom Apartment', 1723, 5),
          (69, 'Three Bedroom Apartment', 2375, 5),

          (70, 'Studio Apartment', 902, 6),
          (71, 'One Bedroom Apartment', 1040, 6),
          (72, 'Two Bedroom Apartment', 1306, 6),
          (73, 'Three Bedroom Apartment', 1839, 6),

          (74, 'Studio Apartment', 883, 7),
          (75, 'One Bedroom Apartment', 1066, 7),
          (76, 'Two Bedroom Apartment', 1327, 7),
          (77, 'Three Bedroom Apartment', 1685, 7),

          (78, 'Studio Apartment', 812, 8),
          (79, 'One Bedroom Apartment', 929, 8),
          (80, 'Two Bedroom Apartment', 1136, 8),
          (81, 'Three Bedroom Apartment', 1504, 8),

          (82, 'Studio Apartment', 832, 9),
          (83, 'One Bedroom Apartment', 945, 9),
          (84, 'Two Bedroom Apartment', 1174, 9),
          (85, 'Three Bedroom Apartment', 1584, 9),

          (86, 'Studio Apartment', 790, 10),
          (87, 'One Bedroom Apartment', 821, 10),
          (88, 'Two Bedroom Apartment', 958, 10),
          (89, 'Three Bedroom Apartment', 1256, 10),

          (90, 'Studio Apartment', 1274, 11),
          (91, 'One Bedroom Apartment', 1444, 11),
          (92, 'Two Bedroom Apartment', 1895, 11),
          (93, 'Three Bedroom Apartment', 2696, 11),

          (94, 'Studio Apartment', 542, 12),
          (95, 'One Bedroom Apartment', 626, 12),
          (96, 'Two Bedroom Apartment', 802, 12),
          (97, 'Three Bedroom Apartment', 1129, 12),

          (98, 'Studio Apartment', 793, 13),
          (99, 'One Bedroom Apartment', 901, 13),
          (100, 'Two Bedroom Apartment', 1074, 13),
          (101, 'Three Bedroom Apartment', 1381, 13),

          (102, 'Studio Apartment', 573, 14),
          (103, 'One Bedroom Apartment', 662, 14),
          (104, 'Two Bedroom Apartment', 825, 14),
          (105, 'Three Bedroom Apartment', 1084, 14),

          (106, 'Studio Apartment', 542, 15),
          (107, 'One Bedroom Apartment', 620, 15),
          (108, 'Two Bedroom Apartment', 793, 15),
          (109, 'Three Bedroom Apartment', 1062, 15),

          (110, 'Studio Apartment', 562, 16),
          (111, 'One Bedroom Apartment', 645, 16),
          (112, 'Two Bedroom Apartment', 821, 16),
          (113, 'Three Bedroom Apartment', 1106, 16),

          (114, 'Studio Apartment', 536, 17),
          (115, 'One Bedroom Apartment', 601, 17),
          (116, 'Two Bedroom Apartment', 760, 17),
          (117, 'Three Bedroom Apartment', 1028, 17),

          (118, 'Studio Apartment', 636, 18),
          (119, 'One Bedroom Apartment', 723, 18),
          (120, 'Two Bedroom Apartment', 868, 18),
          (121, 'Three Bedroom Apartment', 1130, 18),

          (122, 'Studio Apartment', 754, 19),
          (123, 'One Bedroom Apartment', 801, 19),
          (124, 'Two Bedroom Apartment', 1006, 19),
          (125, 'Three Bedroom Apartment', 1309, 19),

          (126, 'Studio Apartment', 1068, 20),
          (127, 'One Bedroom Apartment', 1199, 20),
          (128, 'Two Bedroom Apartment', 1435, 20),
          (129, 'Three Bedroom Apartment', 1870, 20),

          (130, 'Studio Apartment', 1139, 21),
          (131, 'One Bedroom Apartment', 1274, 21),
          (132, 'Two Bedroom Apartment', 1580, 21),
          (133, 'Three Bedroom Apartment', 1985, 21),

          (134, 'Studio Apartment', 603, 22),
          (135, 'One Bedroom Apartment', 697, 22),
          (136, 'Two Bedroom Apartment', 885, 22),
          (137, 'Three Bedroom Apartment', 1169, 22),

          (138, 'Studio Apartment', 677, 23),
          (139, 'One Bedroom Apartment', 800, 23),
          (140, 'Two Bedroom Apartment', 1014, 23),
          (141, 'Three Bedroom Apartment', 1417, 23),

          (142, 'Studio Apartment', 554, 24),
          (143, 'One Bedroom Apartment', 612, 24),
          (144, 'Two Bedroom Apartment', 746, 24),
          (145, 'Three Bedroom Apartment', 979, 24),

          (146, 'Studio Apartment', 569, 25),
          (147, 'One Bedroom Apartment', 650, 25),
          (148, 'Two Bedroom Apartment', 827, 25),
          (149, 'Three Bedroom Apartment', 1110, 25),

          (150, 'Studio Apartment', 566, 26),
          (151, 'One Bedroom Apartment', 641, 26),
          (152, 'Two Bedroom Apartment', 823, 26),
          (153, 'Three Bedroom Apartment', 1144, 26),

          (154, 'Studio Apartment', 560, 27),
          (155, 'One Bedroom Apartment', 655, 27),
          (156, 'Two Bedroom Apartment', 831, 27),
          (157, 'Three Bedroom Apartment', 1122, 27),

          (158, 'Studio Apartment', 646, 28),
          (159, 'One Bedroom Apartment', 783, 28),
          (160, 'Two Bedroom Apartment', 978, 28),
          (161, 'Three Bedroom Apartment', 1411, 28),

          (162, 'Studio Apartment', 839, 29),
          (163, 'One Bedroom Apartment', 942, 29),
          (164, 'Two Bedroom Apartment', 1204, 29),
          (165, 'Three Bedroom Apartment', 1595, 29),

          (166, 'Studio Apartment', 1032, 30),
          (167, 'One Bedroom Apartment', 1208, 30),
          (168, 'Two Bedroom Apartment', 1488, 30),
          (169, 'Three Bedroom Apartment', 1906, 30),

          (170, 'Studio Apartment', 597, 31),
          (171, 'One Bedroom Apartment', 693, 31),
          (172, 'Two Bedroom Apartment', 847, 31),
          (173, 'Three Bedroom Apartment', 1181, 31),

          (174, 'Studio Apartment', 1189, 32),
          (175, 'One Bedroom Apartment', 1291, 32),
          (176, 'Two Bedroom Apartment', 1528, 32),
          (177, 'Three Bedroom Apartment', 1948, 32),

          (178, 'Studio Apartment', 697, 33),
          (179, 'One Bedroom Apartment', 731, 33),
          (180, 'Two Bedroom Apartment', 875, 33),
          (181, 'Three Bedroom Apartment', 1172, 33),

          (182, 'Studio Apartment', 613, 34),
          (183, 'One Bedroom Apartment', 676, 34),
          (184, 'Two Bedroom Apartment', 857, 34),
          (185, 'Three Bedroom Apartment', 1196, 34),

          (186, 'Studio Apartment', 551, 35),
          (187, 'One Bedroom Apartment', 636, 35),
          (188, 'Two Bedroom Apartment', 811, 35),
          (189, 'Three Bedroom Apartment', 1067, 35),

          (190, 'Studio Apartment', 568, 36),
          (191, 'One Bedroom Apartment', 629, 36),
          (192, 'Two Bedroom Apartment', 801, 36),
          (193, 'Three Bedroom Apartment', 1083, 36),

          (194, 'Studio Apartment', 827, 37),
          (195, 'One Bedroom Apartment', 921, 37),
          (196, 'Two Bedroom Apartment', 1123, 37),
          (197, 'Three Bedroom Apartment', 1620, 37),

          (198, 'Studio Apartment', 700, 38),
          (199, 'One Bedroom Apartment', 807, 38),
          (200, 'Two Bedroom Apartment', 999, 38),
          (201, 'Three Bedroom Apartment', 1272, 38),

          (202, 'Studio Apartment', 794, 39),
          (203, 'One Bedroom Apartment', 896, 39),
          (204, 'Two Bedroom Apartment', 1077, 39),
          (205, 'Three Bedroom Apartment', 1367, 39),

          (206, 'Studio Apartment', 670, 40),
          (207, 'One Bedroom Apartment', 756, 40),
          (208, 'Two Bedroom Apartment', 891, 40),
          (209, 'Three Bedroom Apartment', 1183, 40),

          (210, 'Studio Apartment', 541, 41),
          (211, 'One Bedroom Apartment', 625, 41),
          (212, 'Two Bedroom Apartment', 794, 41),
          (213, 'Three Bedroom Apartment', 1070, 41),

          (214, 'Studio Apartment', 622, 42),
          (215, 'One Bedroom Apartment', 696, 42),
          (216, 'Two Bedroom Apartment', 852, 42),
          (217, 'Three Bedroom Apartment', 1134, 42),

          (218, 'Studio Apartment', 738, 43),
          (219, 'One Bedroom Apartment', 841, 43),
          (220, 'Two Bedroom Apartment', 1036, 43),
          (221, 'Three Bedroom Apartment', 1391, 43),

          (222, 'Studio Apartment', 639, 44),
          (223, 'One Bedroom Apartment', 766, 44),
          (224, 'Two Bedroom Apartment', 941, 44),
          (225, 'Three Bedroom Apartment', 1332, 44),

          (226, 'Studio Apartment', 772, 45),
          (227, 'One Bedroom Apartment', 872, 45),
          (228, 'Two Bedroom Apartment', 1089, 45),
          (229, 'Three Bedroom Apartment', 1414, 45),

          (230, 'Studio Apartment', 982, 46),
          (231, 'One Bedroom Apartment', 1030, 46),
          (232, 'Two Bedroom Apartment', 1209, 46),
          (233, 'Three Bedroom Apartment', 1614, 46),

          (234, 'Studio Apartment', 1011, 47),
          (235, 'One Bedroom Apartment', 1127, 47),
          (236, 'Two Bedroom Apartment', 1401, 47),
          (237, 'Three Bedroom Apartment', 2006, 47),

          (238, 'Studio Apartment', 556, 48),
          (239, 'One Bedroom Apartment', 606, 48),
          (240, 'Two Bedroom Apartment', 737, 48),
          (241, 'Three Bedroom Apartment', 937, 48),

          (242, 'Studio Apartment', 588, 49),
          (243, 'One Bedroom Apartment', 681, 49),
          (244, 'Two Bedroom Apartment', 856, 49),
          (245, 'Three Bedroom Apartment', 1137, 49),

          (246, 'Studio Apartment', 612, 50),
          (247, 'One Bedroom Apartment', 674, 50),
          (248, 'Two Bedroom Apartment', 852, 50),
          (249, 'Three Bedroom Apartment', 1165, 50);





alter sequence hibernate_sequence restart with 20;