DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `f_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `f_username` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `f_password` varchar(32) COLLATE utf8_unicode_ci COMMENT 'xml内容',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `f_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `f_role_name` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `f_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `f_user_id` bigint(32) COLLATE utf8_unicode_ci NOT NULL,
  `f_role_id` bigint(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

DROP TABLE IF EXISTS `t_person`;
CREATE TABLE `t_person` (
  `f_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `f_username` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `f_password` varchar(32) COLLATE utf8_unicode_ci COMMENT 'xml内容',
  `f_operate_date` datetime COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;