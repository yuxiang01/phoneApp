SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

CREATE DATABASE team;

USE team;

DROP TABLE IF EXISTS `handset`;
CREATE TABLE `handset` (
  `hsId` int(11) NOT NULL AUTO_INCREMENT,
  `nameType` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  `networkMode` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `facade` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '外观设计',
  `screenSize` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '触摸屏',
  PRIMARY KEY (`hsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `handset` (`hsId`, `nameType`, `price`, `networkMode`, `facade`, `screenSize`) VALUES (1, '三星9300 GALAXY', 4150, '4G全网通', '直板', '5.5英寸直屏');
INSERT INTO `handset` (`hsId`, `nameType`, `price`, `networkMode`, `facade`, `screenSize`) VALUES (2, '华为mate40', 3799, '4G全网通', '曲面屏', '6.2英寸全面屏');


