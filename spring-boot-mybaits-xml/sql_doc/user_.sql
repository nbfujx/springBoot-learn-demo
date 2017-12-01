/*
Navicat MySQL Data Transfer

Source Server         : mysqlimis
Source Server Version : 50151
Source Host           : 10.1.51.234:3306
Source Database       : jawavesys

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-12-01 11:18:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_
-- ----------------------------
DROP TABLE IF EXISTS `user_`;
CREATE TABLE `user_` (
  `id` varchar(100) NOT NULL,
  `emailAddress` varchar(100) NOT NULL,
  `company_id` varchar(100) NOT NULL,
  `groupId` int(11) DEFAULT NULL,
  `companyName` varchar(100) DEFAULT NULL,
  `firstName` varchar(100) DEFAULT NULL,
  `middleName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `nickName` varchar(100) NOT NULL,
  `password_` varchar(50) NOT NULL DEFAULT '',
  `birthday_` datetime DEFAULT NULL,
  `favoriteActivity` varchar(200) DEFAULT NULL,
  `favoriteFood` varchar(200) DEFAULT NULL,
  `favoriteMovie` varchar(200) DEFAULT NULL,
  `favoriteMusic` varchar(200) DEFAULT NULL,
  `greeting_` varchar(100) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `recycled_` char(1) DEFAULT 'N',
  `loginDate` datetime DEFAULT NULL,
  `lastLoginDate` datetime DEFAULT NULL,
  `loginIP` varchar(75) DEFAULT NULL,
  `lastLoginIP` varchar(75) DEFAULT NULL,
  `defaultTagId` varchar(100) DEFAULT NULL,
  `description_` text,
  `country_` varchar(50) DEFAULT NULL,
  `area_` varchar(30) DEFAULT NULL,
  `male_` varchar(2) DEFAULT NULL,
  `type_` varchar(50) DEFAULT NULL,
  `active_` int(11) DEFAULT NULL,
  `valid_` char(1) DEFAULT 'N',
  `mobilePhone` varchar(100) DEFAULT NULL,
  `Phone_` varchar(100) DEFAULT NULL,
  `leftmenu` text,
  `extuserid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ind_user_groupId` (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

