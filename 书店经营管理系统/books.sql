/*
Navicat MySQL Data Transfer

Source Server         : Java
Source Server Version : 80014
Source Host           : localhost:3306
Source Database       : books

Target Server Type    : MYSQL
Target Server Version : 80014
File Encoding         : 65001

Date: 2024-06-02 21:32:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `num` int(5) NOT NULL,
  `name` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `price` float(5,2) NOT NULL,
  `publisher` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '《三体》', '科幻类', '刘慈欣', '124.80', '重庆出版社');
INSERT INTO `book` VALUES ('2', '《活着》', '文学作品', '余华', '24.30', '北京出版社');
INSERT INTO `book` VALUES ('3', '《朝花夕拾》', '散文', '鲁迅', '50.60', '北京未名社');
INSERT INTO `book` VALUES ('4', '平凡的世界', '小说', '路遥', '52.00', '北京十月文艺出版社');
INSERT INTO `book` VALUES ('5', '西游记', '小说', '吴承恩', '55.50', '上海世界书局');

-- ----------------------------
-- Table structure for borrowbook
-- ----------------------------
DROP TABLE IF EXISTS `borrowbook`;
CREATE TABLE `borrowbook` (
  `readername` varchar(255) NOT NULL,
  `booknum` int(5) NOT NULL,
  `bookname` varchar(255) NOT NULL,
  `borrowdate` varchar(255) NOT NULL,
  `returndate` varchar(255) DEFAULT NULL,
  `status` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of borrowbook
-- ----------------------------
INSERT INTO `borrowbook` VALUES ('张三', '1', '三体', '2022-12-19', '2022-12-27', '已归还');
INSERT INTO `borrowbook` VALUES ('李华', '2', '活着', '2022-12-26', '2022-12-29', '已归还');
INSERT INTO `borrowbook` VALUES ('王丽', '3', '朝花夕拾', '2022-12-27', '2022-12-29', '已归还');
INSERT INTO `borrowbook` VALUES ('李四', '4', '平凡的世界', '2022-12-29', null, '借阅中');
INSERT INTO `borrowbook` VALUES ('王五', '6', '西游记', '2022-12-30', '2022-12-30', '已归还');

-- ----------------------------
-- Table structure for reader
-- ----------------------------
DROP TABLE IF EXISTS `reader`;
CREATE TABLE `reader` (
  `userid` int(255) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phonenumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) NOT NULL,
  `reputation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reader
-- ----------------------------
INSERT INTO `reader` VALUES ('1001', '王丽', '女', '4521369849', '3654@163.com', '优秀');
INSERT INTO `reader` VALUES ('1002', '张三', '男', '5487951123', '5641844@163.com', '良好');
INSERT INTO `reader` VALUES ('1003', '李四', '男', '2546987465', '352698461@qq.com', '优秀');
INSERT INTO `reader` VALUES ('1004', '李华', '男', '98745621', '2365245@qq.com', '良好');
INSERT INTO `reader` VALUES ('1005', '王五', '男', '18762010380', '132654@163.com', '优秀');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123456');
INSERT INTO `user` VALUES ('2', 'apple', '13579');
