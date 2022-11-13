-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `username` varchar(25) NOT NULL,
  `password` varchar(225) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('Ajay121','1234');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `batch`
--

DROP TABLE IF EXISTS `batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `batch` (
  `batchid` varchar(25) NOT NULL,
  `courseid` int DEFAULT NULL,
  `facultyid` int DEFAULT NULL,
  `numberOfStudents` int DEFAULT NULL,
  `batchStartDate` date DEFAULT NULL,
  `durationInMonth` int DEFAULT NULL,
  PRIMARY KEY (`batchid`),
  KEY `courseid` (`courseid`),
  CONSTRAINT `batch_ibfk_1` FOREIGN KEY (`courseid`) REFERENCES `course` (`courseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
INSERT INTO `batch` VALUES ('web492',101,NULL,1800,'2022-02-02',7);
/*!40000 ALTER TABLE `batch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `courseid` int NOT NULL AUTO_INCREMENT,
  `courseName` varchar(225) NOT NULL,
  `fee` int DEFAULT NULL,
  `courseDescription` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`courseid`),
  UNIQUE KEY `courseName` (`courseName`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (101,'Web Development',300000,'In this Course We Teach JS HTML CSS'),(103,'UI/UX Designer',250000,'In This Course We Teach Adobe PS,LR'),(104,'Data Science',130000,'In this Course We teach Data teach like Python');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courseplan`
--

DROP TABLE IF EXISTS `courseplan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courseplan` (
  `planid` varchar(25) NOT NULL,
  `batchid` varchar(25) DEFAULT NULL,
  `dayNumber` int DEFAULT NULL,
  `topic` varchar(225) DEFAULT NULL,
  `status` enum('Complete','Pending') DEFAULT NULL,
  PRIMARY KEY (`planid`),
  KEY `batchid` (`batchid`),
  CONSTRAINT `courseplan_ibfk_1` FOREIGN KEY (`batchid`) REFERENCES `batch` (`batchid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courseplan`
--

LOCK TABLES `courseplan` WRITE;
/*!40000 ALTER TABLE `courseplan` DISABLE KEYS */;
INSERT INTO `courseplan` VALUES ('WEBPLAN101','web492',3,'Web Development','Pending');
/*!40000 ALTER TABLE `courseplan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `faculty` (
  `facultyid` int NOT NULL AUTO_INCREMENT,
  `facultyName` varchar(65) NOT NULL,
  `facultyAddress` varchar(225) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `email` varchar(75) DEFAULT NULL,
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`facultyid`)
) ENGINE=InnoDB AUTO_INCREMENT=11126 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (11125,'Veer','Neemuch','7770902034','Veer86023@gmail.com','Veer121','1234');
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-13 12:36:41
