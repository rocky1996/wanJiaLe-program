package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_sa")
public class FaSaEntity {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 栏目名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 广告图
     */
    @Column(name = "image")
    private String image;

    /**
     * 栏目描述
     */
    @Column(name = "des")
    private String des;

    /**
     * 栏目图片
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 权重
     */
    @Column(name = "weigh")
    private Integer weigh;

    /**
     * 产品推荐
     */
    @Column(name = "switched")
    private Integer switched;

    /**
     * 显示
     */
    @Column(name = "status")
    private String status;
}
