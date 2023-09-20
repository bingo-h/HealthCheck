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
-- Table structure for table `checkitemdetailed`
--

DROP TABLE IF EXISTS `checkitemdetailed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkitemdetailed` (
  `cdId` int NOT NULL AUTO_INCREMENT COMMENT '检查项明细编号',
  `name` varchar(40) NOT NULL COMMENT '检查项细明名称',
  `unit` varchar(20) DEFAULT NULL COMMENT '检查项明细单位',
  `minrange` double DEFAULT NULL COMMENT '检查项细明正常值范围中的最小值',
  `maxrange` double DEFAULT NULL COMMENT '检查项细明正常值范围中的最大值',
  `normalValue` varchar(20) DEFAULT NULL COMMENT '检查项细明正常值（非数字型）',
  `normalValueString` varchar(20) DEFAULT NULL COMMENT '检查项验证范围说明文字',
  `type` int NOT NULL DEFAULT '1' COMMENT '检查项明细类型（1：数值围范验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）',
  `ciId` int NOT NULL COMMENT '所属检查项编号',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cdId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkitemdetailed`
--

LOCK TABLES `checkitemdetailed` WRITE;
/*!40000 ALTER TABLE `checkitemdetailed` DISABLE KEYS */;
INSERT INTO `checkitemdetailed` VALUES (1,'收缩压',NULL,0,140,NULL,'<140',1,1,NULL),(2,'舒张压',NULL,0,90,NULL,'<90',1,1,NULL),(3,'身高','cm',NULL,NULL,NULL,NULL,3,1,NULL),(4,'体重','kg',NULL,NULL,NULL,NULL,3,1,NULL),(5,'腰围','cm',NULL,NULL,NULL,NULL,3,1,NULL),(6,'臀围','cm',NULL,NULL,NULL,NULL,3,1,NULL),(7,'白细胞计数','10^9/L',4,10,NULL,'4-10',1,2,NULL),(8,'红细胞压值','%',36,50,NULL,'36-50',1,2,NULL),(9,'淋巴细胞计数百分比','%',18.3,47.9,NULL,'18.3-47.9',1,2,NULL),(10,'单核细胞计数百分比','%',4.2,15.2,NULL,'4.2-15.2',1,2,NULL),(11,'嗜酸性粒细胞计数百分比','%',0.2,7.6,NULL,'0.2-7.6',1,2,NULL),(12,'中性粒细胞计数绝对值','10^9/L',1.8,8.89,NULL,'1.8-8.89',1,2,NULL),(13,'血小板计数','10^9/L',100,300,NULL,'100-300',1,2,NULL),(14,'血红细胞计数','10^12/L',3.5,5.5,NULL,'3.5-5.5',1,2,NULL),(15,'尿白细胞','/ul',NULL,NULL,'-','-',2,3,NULL),(16,'尿亚硝酸盐',NULL,NULL,NULL,'-','-（阴性）',2,3,NULL),(17,'尿液酸碱度',NULL,5.5,6.5,NULL,'5.5-6.5',1,3,NULL),(18,'尿蛋白定性','g/L',NULL,NULL,'-','-',2,3,NULL),(19,'尿比重',NULL,1.015,1.025,NULL,'1.015-1.025',1,3,NULL),(20,'尿维生素','mmol/L',NULL,NULL,'0','0',2,3,NULL),(21,'血清肌酐','umol/L',41,111,NULL,'41-111',1,4,NULL),(22,'血尿素氮','mmol/L',2.85,7.14,NULL,'2.85-7.14',1,4,NULL),(23,'血尿酸','umol/L',208,428,NULL,'208-428',1,4,NULL),(24,'白蛋白','g/L',35,55,NULL,'35-55',1,5,NULL),(25,'血清谷草转氨酶','U/L',15,40,NULL,'15-40',1,5,NULL),(26,'血清谷丙转氨酶','U/L',9,50,NULL,'9-50',1,5,NULL),(27,'血清总胆红素','umol/L',0,20,NULL,'0-20',1,5,NULL),(28,'血清总蛋白','g/L',60,87,NULL,'60-87',1,5,NULL),(29,'盆腔检查',NULL,NULL,NULL,NULL,NULL,4,6,NULL),(30,'乳腺检查',NULL,NULL,NULL,NULL,NULL,4,6,NULL),(31,'子宫检查',NULL,NULL,NULL,NULL,NULL,4,6,NULL);
/*!40000 ALTER TABLE `checkitemdetailed` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-20 15:01:55
