package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_clist")
public class FaClistEntity {

    /**
     * 会员ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 栏目ID
     */
    @Column(name = "ca_id")
    private Integer caId;

    /**
     * 作者
     */
    @Column(name = "author")
    private String author;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 缩略图
     */
    @Column(name = "image")
    private String image;

    /**
     * 活动详情
     */
    @Column(name = "content")
    private String content;

    /**
     * 跳转类型
     */
    @Column(name = "url_type")
    private String urlType;

    /**
     * 小程序APPID
     */
    @Column(name = "wxappid")
    private String wxAppid;

    /**
     * 链接
     */
    @Column(name = "url")
    private String url;

    /**
     * 组图
     */
    @Column(name = "images")
    private String images;

    /**
     * 视频
     */
    @Column(name = "videofile")
    private String videoFile;

    /**
     * 首页推荐
     */
    @Column(name = "switched")
    private String switched;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "createtime")
    private Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "updatetime")
    private Long updateTime;

    /**
     * 权重
     */
    @Column(name = "weigh")
    private Integer weigh;
}
