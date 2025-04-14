

CREATE TABLE `wangque_magazine` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `index` bigint DEFAULT NULL COMMENT '期号',
  `image` varchar(500) DEFAULT NULL COMMENT '图片',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `type` int DEFAULT NULL COMMENT '期刊类型,1-电影,2-音乐,3-句子',
  `pubdate` datetime DEFAULT NULL COMMENT '发布日期',
  `fav_nums` int DEFAULT NULL COMMENT '点赞次数',
  `content` text  DEFAULT null COMMENT '期刊内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='期刊杂志表';

INSERT INTO wangque.wangque_magazine
(id, `index`, image, title, `type`, pubdate, fav_nums, content)
VALUES(2, 2, '/images/movie.7.png', '李安<<饮食男女>>', 1, CURRENT_DATE(), 1, '人生不能像做菜，把所有的料准备好才下锅');