DROP TABLE IF EXISTS `fa_sc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_sc` (
     `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
     `sa_id` int(8) NOT NULL COMMENT '栏目ID',
     `name` varchar(100) NOT NULL COMMENT '栏目名称',
     `image` varchar(100) DEFAULT NULL COMMENT '广告图',
     `des` varchar(255) DEFAULT NULL COMMENT '栏目描述',
     `avatar` varchar(200) DEFAULT NULL COMMENT '栏目图片',
     `gid` varchar(50) DEFAULT '' COMMENT '跳转商品ID',
     `weigh` int(10) NOT NULL DEFAULT '0' COMMENT '权重',
     `switch` tinyint(1) NOT NULL DEFAULT '0' COMMENT 'PDF',
     `status` enum('normal','hidden') NOT NULL DEFAULT 'normal' COMMENT '显示',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='产品分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fa_sc`
--

LOCK TABLES `fa_sc` WRITE;
/*!40000 ALTER TABLE `fa_sc` DISABLE KEYS */;
INSERT INTO `fa_sc` VALUES (1,2,'燃热','https://data.yuan.wiki/uploads/20220830/e6b38c7eec2ab6ec0fe3cc5e346093f0.jpg','','','65',11,0,'normal'),(2,5,'热水类','','','','',3,1,'normal'),(3,5,'烟灶类','','','','',2,1,'normal'),(5,2,'电热','https://data.yuan.wiki/uploads/20220830/69856ea7a0e2e56a9aa4331f31a5353e.jpg','','','43',10,0,'normal'),(6,3,'灶具','https://data.yuan.wiki/uploads/20220830/610219d97fa0fae203d10b5353400642.jpg','','','79',8,0,'normal'),(7,4,'净水','https://data.yuan.wiki/uploads/20220830/8287c4fec5d3f53f5edfbb661a331684.jpg','','','51',7,0,'normal'),(10,3,'烟机','https://data.yuan.wiki/uploads/20220830/dcf334c2bbbb9b38c82c9755a717f078.jpg','','','70',9,0,'normal'),(11,5,'净水类','','','','',1,1,'normal'),(12,5,'隐藏','','','','',12,0,'hidden');
/*!40000 ALTER TABLE `fa_sc` ENABLE KEYS */;
UNLOCK TABLES;