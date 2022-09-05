DROP TABLE IF EXISTS `fa_command`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_command` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `type` varchar(30) NOT NULL DEFAULT '' COMMENT '类型',
  `params` varchar(1500) NOT NULL DEFAULT '' COMMENT '参数',
  `command` varchar(1500) NOT NULL DEFAULT '' COMMENT '命令',
  `content` text COMMENT '返回结果',
  `executetime` bigint(16) unsigned DEFAULT NULL COMMENT '执行时间',
  `createtime` bigint(16) unsigned DEFAULT NULL COMMENT '创建时间',
  `updatetime` bigint(16) unsigned DEFAULT NULL COMMENT '更新时间',
  `status` enum('successed','failured') NOT NULL DEFAULT 'failured' COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8 COMMENT='在线命令表';
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `fa_command` WRITE;
/*!40000 ALTER TABLE `fa_command` DISABLE KEYS */;
INSERT INTO `fa_command` VALUES (74,'crud','[\"--force=1\",\"--table=fa_goods\",\"--relation=fa_sc\",\"--relationmode=belongsto\",\"--relationforeignkey=sc_id\",\"--relationprimarykey=id\",\"--relationfields=name\"]','php think crud --force=1 --table=fa_goods --relation=fa_sc --relationmode=belongsto --relationforeignkey=sc_id --relationprimarykey=id --relationfields=name','Build Successed',1661344514,1661344514,1661344514,'successed'),(75,'crud','[\"--force=1\",\"--table=fa_sc\",\"--relation=fa_sa\",\"--relationmode=belongsto\",\"--relationforeignkey=sa_id\",\"--relationprimarykey=id\",\"--relationfields=name\"]','php think crud --force=1 --table=fa_sc --relation=fa_sa --relationmode=belongsto --relationforeignkey=sa_id --relationprimarykey=id --relationfields=name','Build Successed',1661347620,1661347620,1661347620,'successed'),(76,'crud','[\"--force=1\",\"--table=fa_sc\",\"--relation=fa_sa\",\"--relationmode=belongsto\",\"--relationforeignkey=sa_id\",\"--relationprimarykey=id\",\"--relationfields=name\"]','php think crud --force=1 --table=fa_sc --relation=fa_sa --relationmode=belongsto --relationforeignkey=sa_id --relationprimarykey=id --relationfields=name','Build Successed',1661347848,1661347848,1661347848,'successed'),(77,'crud','[\"--force=1\",\"--table=fa_sc\",\"--relation=fa_sa\",\"--relationmode=belongsto\",\"--relationforeignkey=sa_id\",\"--relationprimarykey=id\",\"--relationfields=name\"]','php think crud --force=1 --table=fa_sc --relation=fa_sa --relationmode=belongsto --relationforeignkey=sa_id --relationprimarykey=id --relationfields=name','Build Successed',1661412626,1661412626,1661412626,'successed');
/*!40000 ALTER TABLE `fa_command` ENABLE KEYS */;
UNLOCK TABLES;
