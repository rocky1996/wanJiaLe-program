package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_shop")
public class FaShopEntity {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 电话
     */
    @Column(name = "tell")
    private String tell;

    /**
     * 简介
     */
    @Column(name = "des")
    private String des;

    /**
     * 省/市
     */
    @Column(name = "city")
    private String city;

    /**
     * 详细地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 经度
     */
    @Column(name = "lng")
    private String lng;

    /**
     * 纬度
     */
    @Column(name = "lat")
    private String lat;

    /**
     * 图片
     */
    @Column(name = "image")
    private String image;
}
