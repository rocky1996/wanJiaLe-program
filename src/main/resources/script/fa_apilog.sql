DROP TABLE IF EXISTS `fa_apilog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_apilog` (
     `id` int(10) NOT NULL AUTO_INCREMENT,
     `api` varchar(255) NOT NULL DEFAULT '0',
     `code` varchar(255) NOT NULL DEFAULT '0',
     `errmsg` varchar(500) NOT NULL DEFAULT '0',
     `data` text,
     `time` varchar(50) DEFAULT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `fa_apilog` WRITE;
/*!40000 ALTER TABLE `fa_apilog` DISABLE KEYS */;
INSERT INTO `fa_apilog` VALUES (1,'wx/getcode','ok','','{\"session_key\":\"rjwBYLE\\/VQeE7sVewy58Xg==\",\"openid\":\"ocBex5C8R4yNtl6hJ1xVjegk2RQs\"}',NULL),(2,'wx/getcode','ok','','{\"session_key\":\"D66bOjnZ+GfACao17Gni4w==\",\"openid\":\"ocBex5C8R4yNtl6hJ1xVjegk2RQs\"}',NULL),(3,'wx/getcode','ok','','{\"session_key\":\"CBUfoV3a6cSeN5MvEHJyCA==\",\"openid\":\"ocBex5B3q0x5azoesVDqrlrE1rns\"}',NULL),(4,'wx/getcode','ok','','{\"session_key\":\"UjjERNM9tU76mvxLTtBWWw==\",\"openid\":\"ocBex5C8R4yNtl6hJ1xVjegk2RQs\"}',NULL),(5,'wx/getcode','ok','','{\"session_key\":\"tamUKOK0tLxCkPefC6vsWg==\",\"openid\":\"ocBex5K5Ou-7Z9EuPAtwsP4yvnQQ\"}',NULL),(78,'wx/getcode','40163','code been used, rid: 63102089-457f5a0e-187cf1a0','{\"errcode\":40163,\"errmsg\":\"code been used, rid: 63102089-457f5a0e-187cf1a0\"}',NULL),(79,'wx/getPhone','40029','','{\"errcode\":40029,\"errmsg\":\"invalid code hint: [ohAeTVNre-9] rid: 6311b0eb-79cfe4d7-4c39fc44\"}','1662103788'),(80,'wx/getPhone','40029','','{\"errcode\":40029,\"errmsg\":\"invalid code hint: [GIAesDOre-8x4Xfa] rid: 6311d76b-56e77f4e-1877d2b1\"}','1662113644');
/*!40000 ALTER TABLE `fa_apilog` ENABLE KEYS */;
UNLOCK TABLES;