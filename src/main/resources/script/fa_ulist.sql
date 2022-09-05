DROP TABLE IF EXISTS `fa_ulist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_ulist` (
    `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `title` varchar(200) NOT NULL COMMENT '标题',
    `uc_id` int(10) NOT NULL COMMENT '栏目ID',
    `image` varchar(200) DEFAULT NULL COMMENT '缩略图',
    `url` text COMMENT '跳转链接',
    `typedata` enum('0','1','2') NOT NULL DEFAULT '0' COMMENT '跳转方式:0=小程序内部,1=web-view,2=打开公众号,3=弹出图片',
    `picimage` varchar(200) DEFAULT NULL COMMENT '图片',
    `description` varchar(255) DEFAULT NULL COMMENT '描述',
    `createtime` bigint(16) DEFAULT NULL COMMENT '创建时间',
    `updatetime` bigint(16) DEFAULT NULL COMMENT '更新时间',
    `weigh` int(10) NOT NULL DEFAULT '0' COMMENT '权重',
    `status` enum('normal','hidden') DEFAULT 'normal' COMMENT '状态',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='跳转列表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fa_ulist`
--

LOCK TABLES `fa_ulist` WRITE;
/*!40000 ALTER TABLE `fa_ulist` DISABLE KEYS */;
INSERT INTO `fa_ulist` VALUES (1,'11',1,'','','0','','',1660112464,1660113890,1,'normal');
/*!40000 ALTER TABLE `fa_ulist` ENABLE KEYS */;
UNLOCK TABLES;