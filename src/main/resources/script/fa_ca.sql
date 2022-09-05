DROP TABLE IF EXISTS `fa_ca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_ca` (
     `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
     `name` varchar(100) NOT NULL COMMENT '栏目名称',
     `image` varchar(100) DEFAULT NULL COMMENT '广告图',
     `des` varchar(255) DEFAULT NULL COMMENT '栏目描述',
     `avatar` varchar(200) DEFAULT NULL COMMENT '栏目图片',
     `weigh` int(10) NOT NULL DEFAULT '0' COMMENT '权重',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `fa_ca` WRITE;
/*!40000 ALTER TABLE `fa_ca` DISABLE KEYS */;
INSERT INTO `fa_ca` VALUES (3,'周末食光','','家-内容活动','',4),(4,'小乐课堂','','家-内容活动','',5),(5,'单页','','','',3);
/*!40000 ALTER TABLE `fa_ca` ENABLE KEYS */;
UNLOCK TABLES;