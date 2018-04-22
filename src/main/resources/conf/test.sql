/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50546
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50546
File Encoding         : 65001

Date: 2018-04-22 15:18:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for aaa
-- ----------------------------
DROP TABLE IF EXISTS `aaa`;
CREATE TABLE `aaa` (
  `timeline` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of aaa
-- ----------------------------

-- ----------------------------
-- Table structure for appplugin
-- ----------------------------
DROP TABLE IF EXISTS `appplugin`;
CREATE TABLE `appplugin` (
  `name` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `desc_info` text,
  `money` int(11) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `auto_install` tinyint(4) DEFAULT NULL,
  `is_debug` tinyint(4) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `enable` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appplugin
-- ----------------------------
INSERT INTO `appplugin` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `appplugin` VALUES ('app2', '2', '第二个版本', '10', 'www.image.com', '2', '2', '2', '1');

-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `id` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES ('1', '1班');
INSERT INTO `classes` VALUES ('2', '2班');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `CNo` varchar(10) NOT NULL DEFAULT '',
  `cName` varchar(50) DEFAULT NULL,
  `TcNo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`CNo`),
  KEY `Tcno` (`TcNo`),
  CONSTRAINT `Tcno` FOREIGN KEY (`TcNo`) REFERENCES `teacher` (`TcNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('c001', 'J2SE', 't002');
INSERT INTO `course` VALUES ('c002', 'Java Web', 't002');
INSERT INTO `course` VALUES ('c003', 'SSH', 't001');
INSERT INTO `course` VALUES ('c004', 'Oracle', 't001');
INSERT INTO `course` VALUES ('c005', 'SQL SERVER \r\n2005', 't003');
INSERT INTO `course` VALUES ('c006', 'C#', 't003');
INSERT INTO `course` VALUES ('c007', 'JavaScript', 't002');
INSERT INTO `course` VALUES ('c008', 'DIV+CSS', 't001');
INSERT INTO `course` VALUES ('c009', 'PHP', 't003');
INSERT INTO `course` VALUES ('c010', 'EJB3.0', 't002');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `ScNo` varchar(10) NOT NULL DEFAULT '',
  `cNo` varchar(10) DEFAULT NULL,
  `Score` double(4,0) DEFAULT NULL,
  PRIMARY KEY (`ScNo`),
  KEY `cNo` (`cNo`),
  CONSTRAINT `cNo` FOREIGN KEY (`cNo`) REFERENCES `course` (`CNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `class_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'zhangsan', '1', '13', '1');
INSERT INTO `student` VALUES ('3', 'lisi', '3', '4', '1');

-- ----------------------------
-- Table structure for targetapp
-- ----------------------------
DROP TABLE IF EXISTS `targetapp`;
CREATE TABLE `targetapp` (
  `package_name` varchar(255) DEFAULT NULL,
  `download_url` varchar(255) DEFAULT NULL,
  `target_version` varchar(24) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `desc_info` text,
  `icon` varchar(255) DEFAULT NULL,
  `is_include` tinyint(4) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `app_plugin_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pluginId` (`app_plugin_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of targetapp
-- ----------------------------
INSERT INTO `targetapp` VALUES ('2', '2', '2', '2', '2', '2', '1', '1', '1');
INSERT INTO `targetapp` VALUES ('3', '3', '3', '3', '3', '3', '3', '2', '1');
INSERT INTO `targetapp` VALUES ('4', 'www.baidu.com', '4', 'baidu', '百度的', 'http://www.image.com', '2', '3', '1');

-- ----------------------------
-- Table structure for tbl_base_count
-- ----------------------------
DROP TABLE IF EXISTS `tbl_base_count`;
CREATE TABLE `tbl_base_count` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `CAPTCHA` varchar(12) COLLATE utf8_bin NOT NULL,
  `PHONE` varchar(12) COLLATE utf8_bin NOT NULL,
  `SENDTIME` varchar(32) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of tbl_base_count
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `TcNo` varchar(10) NOT NULL DEFAULT '',
  `tcName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`TcNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('t001', '刘阳');
INSERT INTO `teacher` VALUES ('t002', '谌燕');
INSERT INTO `teacher` VALUES ('t003', '胡明星');

-- ----------------------------
-- Procedure structure for aaa_delete
-- ----------------------------
DROP PROCEDURE IF EXISTS `aaa_delete`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `aaa_delete`(IN date_inter int)
begin
    delete from aaa where (to_days(now())-to_days(timeline))>=date_inter;
    end
;;
DELIMITER ;

-- ----------------------------
-- Event structure for aaa_delete_event
-- ----------------------------
DROP EVENT IF EXISTS `aaa_delete_event`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` EVENT `aaa_delete_event` ON SCHEDULE EVERY 1 DAY STARTS '2016-08-16 16:34:08' ON COMPLETION NOT PRESERVE ENABLE DO call aaa_delete(1)
;;
DELIMITER ;

-- ----------------------------
-- Event structure for e_test_insert
-- ----------------------------
DROP EVENT IF EXISTS `e_test_insert`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` EVENT `e_test_insert` ON SCHEDULE EVERY 1 SECOND STARTS '2016-08-15 16:29:47' ON COMPLETION PRESERVE DISABLE DO INSERT INTO test.aaa VALUES (CURRENT_TIMESTAMP)
;;
DELIMITER ;
SET FOREIGN_KEY_CHECKS=1;
