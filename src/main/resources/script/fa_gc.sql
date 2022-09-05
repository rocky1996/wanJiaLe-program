DROP TABLE IF EXISTS `fa_gc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_gc` (
     `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
     `name` varchar(100) NOT NULL COMMENT '广告名称',
     `des` varchar(255) DEFAULT NULL COMMENT '描述',
     `weigh` int(10) NOT NULL DEFAULT '0' COMMENT '权重',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `fa_gc` WRITE;
/*!40000 ALTER TABLE `fa_gc` DISABLE KEYS */;
INSERT INTO `fa_gc` VALUES (1,'家-热门推荐页-轮播图','首页轮播图',6),(2,'家--热门推荐页-活动精选','活动精选',5),(3,'家-热门推荐页-品牌故事','品牌故事',4),(4,'乐-惊喜专区','惊喜专区',1),(5,'家-内容活动页-轮播图','内容轮播图',3),(6,'家-内容活动页-品牌故事','品牌故事',2),(7,'万-首页-轮播图','产品轮播图',7);
/*!40000 ALTER TABLE `fa_gc` ENABLE KEYS */;
UNLOCK TABLES;