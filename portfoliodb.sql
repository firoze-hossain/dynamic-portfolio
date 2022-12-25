-- MySQL dump 10.13  Distrib 8.0.31, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: portfoliodb
-- ------------------------------------------------------
-- Server version	8.0.31-0ubuntu0.22.04.1

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
-- Table structure for table `education`
--

DROP TABLE IF EXISTS `education`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `education` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `activity_and_society` varchar(2048) DEFAULT NULL,
  `degree` varchar(255) DEFAULT NULL,
  `description` varchar(2048) DEFAULT NULL,
  `end_year` date DEFAULT NULL,
  `field_of_study` varchar(255) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `school_name` varchar(255) DEFAULT NULL,
  `start_year` date DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKaw3ebf3585a1ndgqnk6k6hosc` (`user_id`),
  CONSTRAINT `FKaw3ebf3585a1ndgqnk6k6hosc` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `education`
--

LOCK TABLES `education` WRITE;
/*!40000 ALTER TABLE `education` DISABLE KEYS */;
INSERT INTO `education` VALUES (1,NULL,'2',NULL,NULL,'Science','5.00',NULL,'Ikkshu Gabeshawana High School',NULL,5),(2,NULL,'3',NULL,NULL,'Science','4.30',NULL,'Ishwardi Government College',NULL,5),(3,NULL,'6',NULL,NULL,'Computer Science and Engineering','3.16',NULL,'IUBAT - International University of Business Agriculture and Technology',NULL,5);
/*!40000 ALTER TABLE `education` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feature`
--

DROP TABLE IF EXISTS `feature`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feature` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `link` varchar(255) DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4ny1f5s9x5iicjpvoptw9t69w` (`user_id`),
  CONSTRAINT `FK4ny1f5s9x5iicjpvoptw9t69w` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feature`
--

LOCK TABLES `feature` WRITE;
/*!40000 ALTER TABLE `feature` DISABLE KEYS */;
INSERT INTO `feature` VALUES (1,'https://www.linkedin.com/in/firoze-hossain/',NULL,'LinkedIn',5),(2,'https://github.com/firoze-hossain',NULL,'GitHub',5),(3,'https://leetcode.com/firoze_hossain/',NULL,'LeetCode',5),(4,'https://firoze.vercel.app/',NULL,'Portfolio',5),(5,'https://www.codechef.com/users/firoze_hossain',NULL,'CodeChef',5),(6,'https://twitter.com/firoze_hossain3',NULL,'Twitter',5);
/*!40000 ALTER TABLE `feature` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `honour_award`
--

DROP TABLE IF EXISTS `honour_award`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `honour_award` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `associated_with` varchar(255) DEFAULT NULL,
  `description` varchar(2048) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `issuer` varchar(255) DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4hinjsfnbtiy5es6j80i2p3st` (`user_id`),
  CONSTRAINT `FK4hinjsfnbtiy5es6j80i2p3st` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `honour_award`
--

LOCK TABLES `honour_award` WRITE;
/*!40000 ALTER TABLE `honour_award` DISABLE KEYS */;
/*!40000 ALTER TABLE `honour_award` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language`
--

DROP TABLE IF EXISTS `language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `language` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `language` varchar(255) DEFAULT NULL,
  `proficiency` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1dwpig7p1u4g31jv7xn6q8rky` (`user_id`),
  CONSTRAINT `FK1dwpig7p1u4g31jv7xn6q8rky` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language`
--

LOCK TABLES `language` WRITE;
/*!40000 ALTER TABLE `language` DISABLE KEYS */;
INSERT INTO `language` VALUES (1,'English','3',5),(2,'Bangla','4',5);
/*!40000 ALTER TABLE `language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `license_certification`
--

DROP TABLE IF EXISTS `license_certification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `license_certification` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `credentialid` varchar(255) DEFAULT NULL,
  `credentialurl` varchar(255) DEFAULT NULL,
  `expiration_date` date DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `issuing_organization` varchar(255) DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhmlgm5eds66emtx43xtvxsyga` (`user_id`),
  CONSTRAINT `FKhmlgm5eds66emtx43xtvxsyga` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `license_certification`
--

LOCK TABLES `license_certification` WRITE;
/*!40000 ALTER TABLE `license_certification` DISABLE KEYS */;
/*!40000 ALTER TABLE `license_certification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(2048) DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  `projecturl` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo06v2e9kuapcugnyhttqa1vpt` (`user_id`),
  CONSTRAINT `FKo06v2e9kuapcugnyhttqa1vpt` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publication`
--

DROP TABLE IF EXISTS `publication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publication` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(2048) DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `publication_date` date DEFAULT NULL,
  `publication_publisher` varchar(255) DEFAULT NULL,
  `publicationurl` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKq2ei3a07e3ln96uel4alss2u7` (`user_id`),
  CONSTRAINT `FKq2ei3a07e3ln96uel4alss2u7` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publication`
--

LOCK TABLES `publication` WRITE;
/*!40000 ALTER TABLE `publication` DISABLE KEYS */;
/*!40000 ALTER TABLE `publication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recommendation`
--

DROP TABLE IF EXISTS `recommendation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recommendation` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(2048) DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `referrer_name` varchar(255) DEFAULT NULL,
  `referrer_title` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8cjedlqgad0a04kgviq1godt0` (`user_id`),
  CONSTRAINT `FK8cjedlqgad0a04kgviq1godt0` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recommendation`
--

LOCK TABLES `recommendation` WRITE;
/*!40000 ALTER TABLE `recommendation` DISABLE KEYS */;
/*!40000 ALTER TABLE `recommendation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skill`
--

DROP TABLE IF EXISTS `skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `skill` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `skill_name` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlgluovqqqd34v705og915ryye` (`user_id`),
  CONSTRAINT `FKlgluovqqqd34v705og915ryye` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skill`
--

LOCK TABLES `skill` WRITE;
/*!40000 ALTER TABLE `skill` DISABLE KEYS */;
INSERT INTO `skill` VALUES (1,'Java',5),(2,'Spring Boot',5),(3,'Angular',5),(4,'DevOps',5),(5,'MySQL',5);
/*!40000 ALTER TABLE `skill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `admin` bit(1) NOT NULL,
  `birthday` date DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `headline` varchar(2048) DEFAULT NULL,
  `highest_education` int DEFAULT NULL,
  `industry` int DEFAULT NULL,
  `is_public` bit(1) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `postal_code` varchar(255) DEFAULT NULL,
  `profile_photo` varchar(2048) DEFAULT NULL,
  `summary` varchar(2048) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `working_year` int DEFAULT NULL,
  `current_education_id` bigint DEFAULT NULL,
  `current_position_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`),
  KEY `FKmq6stfgm496l9m1tlh7ah4i7f` (`current_education_id`),
  KEY `FK9cqi8si6q6gm7r0npqqiu2w8g` (`current_position_id`),
  CONSTRAINT `FK9cqi8si6q6gm7r0npqqiu2w8g` FOREIGN KEY (`current_position_id`) REFERENCES `work_experience` (`id`),
  CONSTRAINT `FKmq6stfgm496l9m1tlh7ah4i7f` FOREIGN KEY (`current_education_id`) REFERENCES `education` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (5,'Mirpur',_binary '','1995-06-25','Bangladesh','firoze.hossain01@yahoo.com','Md. Firoze',1,'Junior Software Engineer',6,19,_binary '','Hossain','$2a$10$GCrl9WjeXd4pbS.C9Qd6quZVdpSn3JGuZUWezy6h3Cl0S6jwDFQAC','01765002428','1229','http://localhost:8085/download/5/xy9ON0P-278191.jpg','Junior Software Engineer at LeadSoft Bangladesh Limited','firoze',NULL,NULL,1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volunteer_experience`
--

DROP TABLE IF EXISTS `volunteer_experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volunteer_experience` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cause` varchar(255) DEFAULT NULL,
  `description` varchar(2048) DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `organization_name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtpqssfh67fjbbjob4wwmkhuew` (`user_id`),
  CONSTRAINT `FKtpqssfh67fjbbjob4wwmkhuew` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteer_experience`
--

LOCK TABLES `volunteer_experience` WRITE;
/*!40000 ALTER TABLE `volunteer_experience` DISABLE KEYS */;
/*!40000 ALTER TABLE `volunteer_experience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_experience`
--

DROP TABLE IF EXISTS `work_experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `work_experience` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `company_name` varchar(255) DEFAULT NULL,
  `description` varchar(2048) DEFAULT NULL,
  `employment_type` varchar(255) DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `industry` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `media` varchar(2048) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhnxjamc0hrv0uok9w7aayk6kk` (`user_id`),
  CONSTRAINT `FKhnxjamc0hrv0uok9w7aayk6kk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_experience`
--

LOCK TABLES `work_experience` WRITE;
/*!40000 ALTER TABLE `work_experience` DISABLE KEYS */;
INSERT INTO `work_experience` VALUES (1,'LeadSoft Bangladesh Limited',NULL,'1',NULL,'19','M-20, LEADS TOWER, Main ROAD-1, Dhaka 1206',NULL,'2022-08-01','Junior Software Enginner',5);
/*!40000 ALTER TABLE `work_experience` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-25 16:35:16
