DROP TABLE IF EXISTS `fa_version`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_version` (
      `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
      `oldversion` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '旧版本号',
      `newversion` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '新版本号',
      `packagesize` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '包大小',
      `content` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '升级内容',
      `downloadurl` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '下载地址',
      `enforce` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '强制更新',
      `createtime` bigint(16) DEFAULT NULL COMMENT '创建时间',
      `updatetime` bigint(16) DEFAULT NULL COMMENT '更新时间',
      `weigh` int(10) NOT NULL DEFAULT '0' COMMENT '权重',
      `status` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '状态',
      PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='版本表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fa_version`
--

LOCK TABLES `fa_version` WRITE;
/*!40000 ALTER TABLE `fa_version` DISABLE KEYS */;
INSERT INTO `fa_version` VALUES (1,'1.1.1,2','1.2.1','20M','更新内容','https://www.example.com',1,1520425318,0,0,'normal');
/*!40000 ALTER TABLE `fa_version` ENABLE KEYS */;
UNLOCK TABLES;