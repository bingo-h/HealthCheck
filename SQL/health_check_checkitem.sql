-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: health_check
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `checkitem`
--

DROP TABLE IF EXISTS `checkitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkitem` (
  `ciId` int NOT NULL AUTO_INCREMENT COMMENT '检查项编号',
  `ciName` varchar(30) NOT NULL COMMENT '检查项名称',
  `ciContent` varchar(200) NOT NULL COMMENT '检查项内容',
  `meaning` varchar(200) DEFAULT NULL COMMENT '检查项意义',
  `remarks` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ciId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkitem`
--

LOCK TABLES `checkitem` WRITE;
/*!40000 ALTER TABLE `checkitem` DISABLE KEYS */;
INSERT INTO `checkitem` VALUES (1,'一般检查','血压、身高、体重、腰围、臀围。','通过仪器测定人体基本健康指标。',NULL),(2,'血常规','血常规24项:\r\n                中性粒细胞计数绝对值、红细胞压值、血小板比容、单核细胞计数百分比、平均血小板体积、\r\n                大血小板比例、嗜碱性粒细胞计数百分比、平均血红蛋白含量等。','临床三大常规检测之一，是最基本的血液检验。通过观察血细胞的数量变化及形态分布，从而判断血液状况及相关疾病。',NULL),(3,'尿常规','尿维生素C测定、尿比重测定、尿液酮体测定、尿胆红素测定、尿亚硝酸盐测定、尿液颜色、尿白细胞计数、尿蛋白定性、\r\n                尿液镜检、尿葡萄糖测定、尿液隐血、尿液酸碱度、尿液清晰度、尿胆原。','临床三大常规检测之一，可反映机体的代谢状况，是很多疾病诊断的重要指标。',NULL),(4,'肾功能','肾功能（renal function）是指肾脏排泄体内代谢废物，维持机体钠、钾、钙等电解质的稳定及酸碱平衡的功能，肾功能检查包括血肌酐、血尿素氮、血及尿β2—微球蛋白、尿白蛋白、尿免疫球蛋白G、尿分泌型免疫球蛋白A等。','肾功能检查的临床意义用于急慢性肾炎、肾病、尿毒症、肾衰竭等疾病的检查。',NULL),(5,'肝功能','丙氨酸氨基转移酶（又称谷丙转氨酶，ALT）、门冬氨酸氨基转移酶（又称谷草转氨酶，AST）、碱性磷酸酶（ALP）、γ－谷氨酰转肽酶（γ－GT或GGT）。','肝功能检查的目的在于探测肝脏有无疾病、肝脏损害程度以及查明肝病原因、判断预后和鉴别发生黄疸的病因等。',NULL),(6,'妇科检查','全身检查、腹部检查和盆腔检查。检查外阴、阴道、子宫颈和子宫、输卵管、卵巢及宫旁组织和骨盆腔内壁。','主要作用是对一些妇科疾病作出早期诊断、预防以及早期治疗。',NULL);
/*!40000 ALTER TABLE `checkitem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-20 15:01:56
