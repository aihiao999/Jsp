/*
Navicat MySQL Data Transfer

Source Server         : CentOS7_Mysql8
Source Server Version : 80017
Source Host           : 192.168.25.130:3306
Source Database       : StudentManager

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-09-25 23:37:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gender` char(8) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `hobby` varchar(128) DEFAULT NULL,
  `info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', '马超', '男', '15088888880', '旅游,美食,游泳,唱歌', '大将军, 有小吕之称。', '2000-09-25 19:10:36');
INSERT INTO `t_student` VALUES ('2', '王昭君', '女', '15036960661', '美食,游泳,唱歌', '四大美女之一。', '2019-09-25 19:10:52');
INSERT INTO `t_student` VALUES ('3', '吕布', '男', '15036966520', '旅游,美食', '我是战神。', '1990-12-02 12:30:59');
INSERT INTO `t_student` VALUES ('4', '貂蝉', '女', '15036366521', '旅游,美食,游泳,唱歌', '我是美女。', '1980-12-02 02:30:59');
INSERT INTO `t_student` VALUES ('6', '张飞', '男', '15036966520', '旅游,美食', '暴躁的男人。', '2000-09-25 19:10:36');
INSERT INTO `t_student` VALUES ('7', '杜十娘', '女', '15036366521', '美食,游泳', '才女一枚。', '1990-12-02 12:30:59');
INSERT INTO `t_student` VALUES ('8', '潘金莲', '女', '15036966520', '美食,唱歌', '武大郎老婆。', '1990-12-02 12:30:59');
INSERT INTO `t_student` VALUES ('9', '武则天', '女', '15036366521', '美食', '女皇啊。', '1990-12-02 12:30:59');
INSERT INTO `t_student` VALUES ('10', '穆桂英', '女', '15036366521', '唱歌', '女将军。', '1990-12-02 12:30:59');
INSERT INTO `t_student` VALUES ('11', '上官婉儿', '女', '15036966520', '美食', '女官。', '1990-12-02 12:30:59');
INSERT INTO `t_student` VALUES ('12', '王英', '男', '15036966520', '唱歌', '矮脚虎。', '2000-09-25 19:10:36');
INSERT INTO `t_student` VALUES ('13', '武松', '男', '15036966520', '游泳,唱歌', '打虎英雄。', '2000-09-25 19:10:36');
