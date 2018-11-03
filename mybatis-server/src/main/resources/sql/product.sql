/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : 127.0.0.1:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 03/11/2018 19:49:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `product_price` double(10, 2) NULL DEFAULT NULL,
  `product_category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `product_inventory` int(255) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `flag` int(4) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '大连娃娃', 899.00, '玩具', 143, '2018-10-26 18:04:14', 0);
INSERT INTO `product` VALUES (2, '飞利浦电动牙刷', 1999.00, '洗漱用品', 66, '2018-10-26 15:35:28', 0);
INSERT INTO `product` VALUES (3, '好舒服浴巾', 199.99, '洗漱品', 44, '2018-10-30 10:29:07', 0);
INSERT INTO `product` VALUES (4, '飞科剃须刀', 199.99, '洗漱用品', 31, '2018-10-26 12:33:16', 0);
INSERT INTO `product` VALUES (5, '水杯', 33.88, '生活用品', 11, '2018-10-30 15:13:40', 1);
INSERT INTO `product` VALUES (6, '西红柿', 1.23, '水果', 54, '2018-10-04 13:30:16', 0);

SET FOREIGN_KEY_CHECKS = 1;
