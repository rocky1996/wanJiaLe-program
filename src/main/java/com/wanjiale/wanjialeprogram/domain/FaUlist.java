package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_ulist")
public class FaUlist {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 栏目ID
     */
    @Column(name = "uc_id")
    private Integer ucId;

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 缩略图
     */
    @Column(name = "image")
    private String image;

    /**
     * 跳转链接
     */
    @Column(name = "url")
    private String url;

    /**
     * 跳转方式:0=小程序内部,1=web-view,2=打开公众号,3=弹出图片
     */
    @Column(name = "typedata")
    private String typeData;

    /**
     * 图片
     */
    @Column(name = "picimage")
    private String picImage;

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

    /**
     * 状态
     */
    @Column(name = "status")
    private String status;
}
