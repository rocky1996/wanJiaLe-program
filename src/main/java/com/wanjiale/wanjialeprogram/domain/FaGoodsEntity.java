package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_goods")
public class FaGoodsEntity {

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
     * 产品名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 栏目
     */
    @Column(name = "sc_id")
    private Integer scId;

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
     * 组图
     */
    @Column(name = "images")
    private String images;

    /**
     * 产品详情
     */
    @Column(name = "content")
    private String content;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

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
     * 场景推荐
     */
    @Column(name = "cjswitch")
    private Integer cjSwitch;

    /**
     * 套系产品
     */
    @Column(name = "txswitch")
    private Integer txSwitch;

    /**
     * 产品攻略
     */
    @Column(name = "cpswitch")
    private Integer cpSwitch;

    /**
     * 文件
     */
    @Column(name = "file")
    private String file;

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
