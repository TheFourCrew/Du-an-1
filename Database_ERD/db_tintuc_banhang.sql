-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: db_tintuc_banhang
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article` (
  `idarticle` int(11) NOT NULL AUTO_INCREMENT,
  `title_article` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `headline` varchar(150) CHARACTER SET utf8 NOT NULL,
  `created_date` datetime NOT NULL,
  `creater` int(11) NOT NULL,
  `modified_date` datetime DEFAULT NULL,
  `content` text CHARACTER SET utf8 NOT NULL,
  `thumbnail` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `public` bit(1) DEFAULT b'1',
  PRIMARY KEY (`idarticle`),
  UNIQUE KEY `idarticle_UNIQUE` (`idarticle`),
  KEY `user_idx` (`creater`),
  CONSTRAINT `user` FOREIGN KEY (`creater`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `article_tags`
--

DROP TABLE IF EXISTS `article_tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article_tags` (
  `idarticle_tags` int(11) NOT NULL AUTO_INCREMENT,
  `id_tag` int(11) NOT NULL,
  `id_article` int(11) NOT NULL,
  PRIMARY KEY (`idarticle_tags`),
  UNIQUE KEY `idarticle_tags_UNIQUE` (`idarticle_tags`),
  KEY `tag_idx` (`id_tag`),
  KEY `article_idx` (`id_article`),
  CONSTRAINT `article_tags` FOREIGN KEY (`id_article`) REFERENCES `article` (`idarticle`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tag` FOREIGN KEY (`id_tag`) REFERENCES `tags` (`idtags`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article_tags`
--

LOCK TABLES `article_tags` WRITE;
/*!40000 ALTER TABLE `article_tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `article_tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `idcomment` int(11) NOT NULL AUTO_INCREMENT,
  `name_user` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `id_article` int(11) NOT NULL,
  `date_comment` datetime DEFAULT NULL,
  `comment_reply` int(11) NOT NULL,
  `content` text CHARACTER SET utf8 NOT NULL,
  `ip` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idcomment`),
  UNIQUE KEY `idcomment_UNIQUE` (`idcomment`),
  KEY `article_idx` (`id_article`),
  KEY `article_cmt_idx` (`id_article`),
  CONSTRAINT `article_cmt` FOREIGN KEY (`id_article`) REFERENCES `article` (`idarticle`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_images`
--

DROP TABLE IF EXISTS `detail_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detail_images` (
  `iddetail_images` int(11) NOT NULL AUTO_INCREMENT,
  `image_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`iddetail_images`),
  UNIQUE KEY `iddetail_images_UNIQUE` (`iddetail_images`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_images`
--

LOCK TABLES `detail_images` WRITE;
/*!40000 ALTER TABLE `detail_images` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `like_dislike`
--

DROP TABLE IF EXISTS `like_dislike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `like_dislike` (
  `idlike` int(11) NOT NULL AUTO_INCREMENT,
  `id_article` int(11) NOT NULL,
  `like_or_dislike` bit(1) DEFAULT b'0',
  `ip` varchar(45) CHARACTER SET utf8 NOT NULL,
  `mac` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idlike`),
  UNIQUE KEY `idlike_UNIQUE` (`idlike`),
  KEY `article_like_idx` (`id_article`),
  CONSTRAINT `article_like` FOREIGN KEY (`id_article`) REFERENCES `article` (`idarticle`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `like_dislike`
--

LOCK TABLES `like_dislike` WRITE;
/*!40000 ALTER TABLE `like_dislike` DISABLE KEYS */;
/*!40000 ALTER TABLE `like_dislike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `idproduct` int(11) NOT NULL AUTO_INCREMENT,
  `product_number` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `product_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `price_per_unit` double NOT NULL DEFAULT '1',
  `bought_price` double NOT NULL,
  `product_quantity` int(11) NOT NULL DEFAULT '1',
  `unit` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `describe` text COLLATE utf8_unicode_ci,
  `idproduct_category` int(11) NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `creater` int(11) NOT NULL,
  `date_modified` datetime DEFAULT NULL,
  `product_image` varchar(60) CHARACTER SET utf8 DEFAULT NULL,
  `note` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idproduct`),
  UNIQUE KEY `idproduct_UNIQUE` (`idproduct`),
  KEY `loai_idx` (`idproduct_category`),
  KEY `user_product_idx` (`creater`),
  CONSTRAINT `loai` FOREIGN KEY (`idproduct_category`) REFERENCES `product_category` (`idproduct_category`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_product` FOREIGN KEY (`creater`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_category`
--

DROP TABLE IF EXISTS `product_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_category` (
  `idproduct_category` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `note` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idproduct_category`),
  UNIQUE KEY `idproduct_category_UNIQUE` (`idproduct_category`),
  UNIQUE KEY `category_name_UNIQUE` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_category`
--

LOCK TABLES `product_category` WRITE;
/*!40000 ALTER TABLE `product_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_detail_images`
--

DROP TABLE IF EXISTS `product_detail_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_detail_images` (
  `idproduct_detail_images` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` int(11) NOT NULL,
  `id_detail_image` int(11) NOT NULL,
  PRIMARY KEY (`idproduct_detail_images`),
  UNIQUE KEY `idarticle_detail_images_UNIQUE` (`idproduct_detail_images`),
  KEY `detail_idx` (`id_detail_image`),
  KEY `product_idx` (`id_product`),
  CONSTRAINT `detail` FOREIGN KEY (`id_detail_image`) REFERENCES `detail_images` (`iddetail_images`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_detail_images`
--

LOCK TABLES `product_detail_images` WRITE;
/*!40000 ALTER TABLE `product_detail_images` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_detail_images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_parameters`
--

DROP TABLE IF EXISTS `product_parameters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_parameters` (
  `idproduct_parameters` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` int(11) NOT NULL,
  `model` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `cpu` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ram` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `screen_resolution` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `screen_size` double DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `operating_system` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idproduct_parameters`),
  UNIQUE KEY `idproduct_size_UNIQUE` (`idproduct_parameters`),
  KEY `product_size_idx` (`id_product`),
  CONSTRAINT `product_size` FOREIGN KEY (`id_product`) REFERENCES `product` (`idproduct`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_parameters`
--

LOCK TABLES `product_parameters` WRITE;
/*!40000 ALTER TABLE `product_parameters` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_parameters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_rating`
--

DROP TABLE IF EXISTS `product_rating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_rating` (
  `idproduct_rating` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` int(11) NOT NULL,
  `id_rating` int(11) NOT NULL,
  PRIMARY KEY (`idproduct_rating`),
  UNIQUE KEY `idproduct_rating_UNIQUE` (`idproduct_rating`),
  KEY `product_rating_idx` (`id_product`),
  KEY `point_idx` (`id_rating`),
  CONSTRAINT `point` FOREIGN KEY (`id_rating`) REFERENCES `rating` (`idrating`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `product_rating` FOREIGN KEY (`id_product`) REFERENCES `product` (`idproduct`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_rating`
--

LOCK TABLES `product_rating` WRITE;
/*!40000 ALTER TABLE `product_rating` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_rating` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_tags`
--

DROP TABLE IF EXISTS `product_tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_tags` (
  `idproduct_tags` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` int(11) NOT NULL,
  `id_tag` int(11) NOT NULL,
  PRIMARY KEY (`idproduct_tags`),
  UNIQUE KEY `idproduct_tags_UNIQUE` (`idproduct_tags`),
  KEY `tag_name_idx` (`id_tag`),
  KEY `product_tag_idx` (`id_product`),
  CONSTRAINT `product_tag` FOREIGN KEY (`id_product`) REFERENCES `product` (`idproduct`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tag_name` FOREIGN KEY (`id_tag`) REFERENCES `tags` (`idtags`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_tags`
--

LOCK TABLES `product_tags` WRITE;
/*!40000 ALTER TABLE `product_tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `promotion` (
  `idpromotion` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` int(11) NOT NULL,
  `description` varchar(45) NOT NULL,
  `promotion_value` double NOT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime NOT NULL,
  PRIMARY KEY (`idpromotion`),
  UNIQUE KEY `idpromotion_UNIQUE` (`idpromotion`),
  KEY `sanpham_idx` (`id_product`),
  CONSTRAINT `sanpham` FOREIGN KEY (`id_product`) REFERENCES `product` (`idproduct`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion`
--

LOCK TABLES `promotion` WRITE;
/*!40000 ALTER TABLE `promotion` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rating`
--

DROP TABLE IF EXISTS `rating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rating` (
  `idrating` int(11) NOT NULL AUTO_INCREMENT,
  `name_user` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `rating_point` int(11) NOT NULL,
  `review` text CHARACTER SET utf8 NOT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`idrating`),
  UNIQUE KEY `idrating_UNIQUE` (`idrating`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rating`
--

LOCK TABLES `rating` WRITE;
/*!40000 ALTER TABLE `rating` DISABLE KEYS */;
/*!40000 ALTER TABLE `rating` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipt`
--

DROP TABLE IF EXISTS `receipt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receipt` (
  `idreceipt` int(11) NOT NULL AUTO_INCREMENT,
  `receipt_number` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `creater` int(11) NOT NULL,
  `buyer` int(11) NOT NULL,
  `total_price` double NOT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idreceipt`),
  UNIQUE KEY `idreceipt_UNIQUE` (`idreceipt`),
  UNIQUE KEY `receipt_phone_UNIQUE` (`receipt_number`),
  KEY `buyer_idx` (`buyer`),
  KEY `creater_receipt_idx` (`creater`),
  CONSTRAINT `buyer` FOREIGN KEY (`buyer`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `creater_receipt` FOREIGN KEY (`creater`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipt`
--

LOCK TABLES `receipt` WRITE;
/*!40000 ALTER TABLE `receipt` DISABLE KEYS */;
/*!40000 ALTER TABLE `receipt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipt_detail`
--

DROP TABLE IF EXISTS `receipt_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receipt_detail` (
  `idreceipt_detail` int(11) NOT NULL AUTO_INCREMENT,
  `id_receipt` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unit_price` double NOT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idreceipt_detail`),
  UNIQUE KEY `idreceipt_detail_UNIQUE` (`idreceipt_detail`),
  KEY `receipt_idx` (`id_receipt`),
  KEY `product_receipt_idx` (`id_product`),
  CONSTRAINT `product_receipt` FOREIGN KEY (`id_product`) REFERENCES `product` (`idproduct`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `receipt` FOREIGN KEY (`id_receipt`) REFERENCES `receipt` (`idreceipt`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipt_detail`
--

LOCK TABLES `receipt_detail` WRITE;
/*!40000 ALTER TABLE `receipt_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `receipt_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user`
--

DROP TABLE IF EXISTS `role_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_user` (
  `idrole_user` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idrole_user`),
  UNIQUE KEY `idrole_user_UNIQUE` (`idrole_user`),
  UNIQUE KEY `role_name_UNIQUE` (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user`
--

LOCK TABLES `role_user` WRITE;
/*!40000 ALTER TABLE `role_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tags`
--

DROP TABLE IF EXISTS `tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tags` (
  `idtags` int(11) NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idtags`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tags`
--

LOCK TABLES `tags` WRITE;
/*!40000 ALTER TABLE `tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `idrole_user` int(11) NOT NULL,
  `fullname` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `gender` bit(1) NOT NULL DEFAULT b'1',
  `user_phone` varchar(11) CHARACTER SET utf8 DEFAULT NULL,
  `address` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8 NOT NULL,
  `birthday` date NOT NULL,
  `image` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` bit(1) DEFAULT b'0',
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`iduser`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `iduser_UNIQUE` (`iduser`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `role_user_idx` (`idrole_user`),
  CONSTRAINT `role_user` FOREIGN KEY (`idrole_user`) REFERENCES `role_user` (`idrole_user`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor`
--

DROP TABLE IF EXISTS `vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor` (
  `id_vendor` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `phone_office` varchar(15) CHARACTER SET utf8 NOT NULL,
  `contact_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `contact_jobtitle` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `website` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `city` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_vendor`),
  UNIQUE KEY `id_dealer_UNIQUE` (`id_vendor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor`
--

LOCK TABLES `vendor` WRITE;
/*!40000 ALTER TABLE `vendor` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor_invoice`
--

DROP TABLE IF EXISTS `vendor_invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor_invoice` (
  `idvendor_invoice` int(11) NOT NULL AUTO_INCREMENT,
  `vendor_invoice_number` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `total_price` double NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `creater` int(11) NOT NULL,
  `id_vendor` int(11) NOT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idvendor_invoice`),
  UNIQUE KEY `idvendor_invoice_UNIQUE` (`idvendor_invoice`),
  KEY `vendor_idx` (`id_vendor`),
  KEY `creater_invoce_idx` (`creater`),
  CONSTRAINT `creater_invoce` FOREIGN KEY (`creater`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vendor` FOREIGN KEY (`id_vendor`) REFERENCES `vendor` (`id_vendor`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor_invoice`
--

LOCK TABLES `vendor_invoice` WRITE;
/*!40000 ALTER TABLE `vendor_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor_invoice_detail`
--

DROP TABLE IF EXISTS `vendor_invoice_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor_invoice_detail` (
  `idvendor_invoice_detail` int(11) NOT NULL AUTO_INCREMENT,
  `id_product` int(11) NOT NULL,
  `id_vendor_invoice` int(11) NOT NULL,
  `quanity` int(11) NOT NULL,
  `unit_price` double NOT NULL,
  `note` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idvendor_invoice_detail`),
  UNIQUE KEY `idsupplier_invoice_detail_UNIQUE` (`idvendor_invoice_detail`),
  KEY `vender_invoice_idx` (`id_vendor_invoice`),
  KEY `product_vendor_idx` (`id_product`),
  CONSTRAINT `product_vendor` FOREIGN KEY (`id_product`) REFERENCES `product` (`idproduct`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vender_invoice` FOREIGN KEY (`id_vendor_invoice`) REFERENCES `vendor_invoice` (`idvendor_invoice`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor_invoice_detail`
--

LOCK TABLES `vendor_invoice_detail` WRITE;
/*!40000 ALTER TABLE `vendor_invoice_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor_invoice_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-22  8:44:01
