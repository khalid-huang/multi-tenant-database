-- ----------------------------
-- Table structure for `ren_capability`
-- ----------------------------
DROP TABLE IF EXISTS `ren_capability`;
CREATE TABLE `ren_capability` (
  `id` varchar(64) NOT NULL,
  `name` text,
  `description` text,
  `note` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;