/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.23 : Database - family
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`family` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `family`;

/*Table structure for table `t_circle` */

DROP TABLE IF EXISTS `t_circle`;

CREATE TABLE `t_circle` (
  `circleid` int(32) NOT NULL AUTO_INCREMENT,
  `author` int(32) NOT NULL,
  `date` datetime NOT NULL,
  `message` varchar(250) NOT NULL,
  PRIMARY KEY (`circleid`),
  KEY `fk_1` (`author`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_circle` */

/*Table structure for table `t_family` */

DROP TABLE IF EXISTS `t_family`;

CREATE TABLE `t_family` (
  `familyid` int(32) NOT NULL AUTO_INCREMENT,
  `familyname` varchar(32) NOT NULL,
  `address` varchar(40) NOT NULL,
  `familyphone` varchar(32) NOT NULL,
  PRIMARY KEY (`familyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_family` */

/*Table structure for table `t_person` */

DROP TABLE IF EXISTS `t_person`;

CREATE TABLE `t_person` (
  `personid` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `age` varchar(32) NOT NULL,
  `nature` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `phone` varchar(32) NOT NULL,
  `family` int(32) NOT NULL,
  PRIMARY KEY (`personid`),
  KEY `family` (`family`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_person` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
