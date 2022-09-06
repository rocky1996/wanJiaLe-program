package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_glist")
public class FaGlist {

    /**
     * id
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
    @Column(name = "fid")
    private Integer fid;

    /**
     * 缩略图
     */
    @Column(name = "image")
    private String image;

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
     * 跳转方式
     */
    @Column(name = "url_type")
    private String urlType;

    /**
     * 跳转APPID
     */
    @Column(name = "wxappid")
    private String wxAppid;

    /**
     * 跳转链接
     */
    @Column(name = "url")
    private String url;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 活动ID
     */
    @Column(name = "hid")
    private Integer hid;

    /**
     * 产品ID
     */
    @Column(name = "gid")
    private Integer gid;

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

    /**
     * 状态
     */
    @Column(name = "status")
    private String status;
}
