DROP TABLE IF EXISTS `fa_uc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_uc` (
     `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
     `name` varchar(100) NOT NULL COMMENT '广告名称',
     `des` varchar(255) DEFAULT NULL COMMENT '描述',
     `weigh` int(10) NOT NULL DEFAULT '0' COMMENT '权重',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='跳转分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fa_uc`
--

LOCK TABLES `fa_uc` WRITE;
/*!40000 ALTER TABLE `fa_uc` DISABLE KEYS */;
INSERT INTO `fa_uc` VALUES (1,'家-首页顶部跳转','小程序首页广告',1),(2,'首页中间广告位','小程序端',2);
/*!40000 ALTER TABLE `fa_uc` ENABLE KEYS */;
UNLOCK TABLES;