package com.wanjiale.wanjialeprogram.domain;

import jdk.nashorn.internal.ir.IdentNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_area")
public class FaArea {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父id
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 简称
     */
    @Column(name = "shortname")
    private String shortName;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 全称
     */
    @Column(name = "mergename")
    private String mergeName;

    /**
     * 层级:1=省,2=市,3=区/县
     */
    @Column(name = "level")
    private Integer level;

    /**
     * 拼音
     */
    @Column(name = "pinyin")
    private String pinyin;

    /**
     * 长途区号
     */
    @Column(name = "code")
    private String code;

    /**
     * 邮编
     */
    @Column(name = "zip")
    private String zip;

    /**
     * 首字母
     */
    @Column(name = "first")
    private String first;

    /**
     * 经度
     */
    @Column(name = "lng")
    private String lng;

    /**
     * 纬度
     */
    @Column(name = "lat")
    private String latg;
}
