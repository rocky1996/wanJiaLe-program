DROP TABLE IF EXISTS `fa_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fa_config` (
 `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
 `name` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '变量名',
 `group` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '分组',
 `title` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '变量标题',
 `tip` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '变量描述',
 `type` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '类型:string,text,int,bool,array,datetime,date,file',
 `visible` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '可见条件',
 `value` text COLLATE utf8mb4_unicode_ci COMMENT '变量值',
 `content` text COLLATE utf8mb4_unicode_ci COMMENT '变量字典数据',
 `rule` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '验证规则',
 `extend` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '扩展属性',
 `setting` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '配置',
 PRIMARY KEY (`id`),
 UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统配置';
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `fa_config` WRITE;
/*!40000 ALTER TABLE `fa_config` DISABLE KEYS */;
INSERT INTO `fa_config` VALUES (1,'name','basic','Site name','请填写站点名称','string','','万家乐会员俱乐部管理后台','','required','',NULL),(2,'beian','basic','Beian','粤ICP备15000000号-1','string','','','','','',NULL),(3,'cdnurl','basic','Cdn url','如果全站静态资源使用第三方云储存请配置该值','string','','','','','',''),(4,'version','basic','Version','如果静态资源有变动请重新配置该值','string','','1.0.5','','required','',NULL),(5,'timezone','basic','Timezone','','string','','Asia/Shanghai','','required','',NULL),(6,'forbiddenip','basic','Forbidden ip','一行一条记录','text','','','','','',NULL),(7,'languages','basic','Languages','','array','','{\"backend\":\"zh-cn\",\"frontend\":\"zh-cn\"}','','required','',NULL),(8,'fixedpage','basic','Fixed page','请尽量输入左侧菜单栏存在的链接','string','','dashboard','','required','',NULL),(9,'categorytype','dictionary','Category type','','array','','{\"default\":\"默认\",\"page\":\"单页\",\"article\":\"文章\",\"test\":\"Test\"}','','','',NULL),(10,'configgroup','dictionary','Config group','','array','','{\"example\":\"小程序配置\",\"basic\":\"基础配置\",\"dictionary\":\"字典配置\"}','','','',NULL),(11,'mail_type','email','Mail type','选择邮件发送方式','select','','1','[\"请选择\",\"SMTP\"]','','',''),(12,'mail_smtp_host','email','Mail smtp host','错误的配置发送邮件会导致服务器超时','string','','smtp.qq.com','','','',''),(13,'mail_smtp_port','email','Mail smtp port','(不加密默认25,SSL默认465,TLS默认587)','string','','465','','','',''),(14,'mail_smtp_user','email','Mail smtp user','（填写完整用户名）','string','','10000','','','',''),(15,'mail_smtp_pass','email','Mail smtp password','（填写您的密码或授权码）','string','','password','','','',''),(16,'mail_verify_type','email','Mail vertify type','（SMTP验证方式[推荐SSL]）','select','','2','[\"无\",\"TLS\",\"SSL\"]','','',''),(17,'mail_from','email','Mail from','','string','','10000@qq.com','','','',''),(18,'attachmentcategory','dictionary','Attachment category','','array','','{\"category1\":\"分类一\",\"category2\":\"分类二\",\"custom\":\"自定义\"}','','','',NULL),(19,'wxname','example','小程序昵称','','string','','万家乐会员俱乐部','','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(24,'AppID','example','AppID','','string','','wx07b7a339bb2cf065','','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(25,'AppSecret','example','AppSecret','','string','','2d300a30f857f8c355a7443d68eac021','','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(28,'cjType','example','万-首页场景推荐','','radio','','1','{\"1\":\"模式1\",\"2\":\"模式2\"}','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(29,'txType','example','万-首页套系产品','','radio','','1','{\"1\":\"模式1\",\"2\":\"模式2\"}','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(30,'cpType','example','万-首页产品攻略','','radio','','2','{\"1\":\"模式1\",\"2\":\"模式2\"}','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(31,'agreement','example','用户协议','','text','','协议内容','','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(32,'j_num','example','家-首页推荐条数','','number','','20','','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(33,'wxappid','example','跳转appid','','select','','wx589cfb6a483924a1','{\"wx589cfb6a483924a1\":\"万家乐商城1 wx589cfb6a483924a1\"}','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}'),(35,'loginbg','example','小程序登录背景图','','image','','https://data.yuan.wiki/uploads/bg.png','','','','{\"table\":\"\",\"conditions\":\"\",\"key\":\"\",\"value\":\"\"}');
/*!40000 ALTER TABLE `fa_config` ENABLE KEYS */;
UNLOCK TABLES;