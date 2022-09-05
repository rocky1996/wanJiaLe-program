DROP TABLE IF EXISTS `fa_sa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_sa` (
     `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
     `name` varchar(100) NOT NULL COMMENT '栏目名称',
     `image` varchar(100) DEFAULT NULL COMMENT '广告图',
     `des` varchar(255) DEFAULT NULL COMMENT '栏目描述',
     `avatar` varchar(200) DEFAULT NULL COMMENT '栏目图片',
     `weigh` int(10) NOT NULL DEFAULT '0' COMMENT '权重',
     `switch` tinyint(1) NOT NULL DEFAULT '0' COMMENT '产品推荐',
     `status` enum('normal','hidden') NOT NULL DEFAULT 'normal' COMMENT '显示',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='产品类目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fa_sa`
--

LOCK TABLES `fa_sa` WRITE;
/*!40000 ALTER TABLE `fa_sa` DISABLE KEYS */;
INSERT INTO `fa_sa` VALUES (2,'热水类','https://hy.chinamacro.com/uploads/20220816/f6f9e8cf0b27a20ce85068930c6f005c.png','万-产品推荐','https://hy.chinamacro.com/uploads/20220816/736dc69a398a0f0e26e9030c02726d01.png',5,1,'normal'),(3,'烟灶类','https://hy.chinamacro.com/uploads/20220816/627837f77c268c0e20612e83d6e171fd.png','万-产品推荐','https://hy.chinamacro.com/uploads/20220816/5def7fd541daa2d140d404d34837318c.png',4,1,'normal'),(4,'净水类','https://hy.chinamacro.com/uploads/20220816/d84383ac9558b6b1a3f045cf8658bd6f.png','万-产品推荐','https://hy.chinamacro.com/uploads/20220816/f5955645f82a0f61cf64f5ba055ba709.png',3,1,'normal'),(5,'更多','/uploads/20220812/7995efe2ac07341381e97b3151ae6ac2.jpeg','','',2,0,'normal');
/*!40000 ALTER TABLE `fa_sa` ENABLE KEYS */;
UNLOCK TABLES;
