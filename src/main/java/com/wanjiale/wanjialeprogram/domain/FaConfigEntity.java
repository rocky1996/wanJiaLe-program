package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_config")
public class FaConfigEntity {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 变量名
     */
    @Column(name = "name")
    private String name;

    /**
     * 分组
     */
    @Column(name = "group")
    private String group;

    /**
     * 变量标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 变量描述
     */
    @Column(name = "tip")
    private String tip;

    /**
     * 可见条件
     */
    @Column(name = "visible")
    private String visible;

    /**
     * 变量值
     */
    @Column(name = "value")
    private String value;

    /**
     * 变量字典数据
     */
    @Column(name = "content")
    private String content;

    /**
     * 变量字典数据
     */
    @Column(name = "rule")
    private String rule;

    /**
     * 扩展属性
     */
    @Column(name = "extend")
    private String extend;

    /**
     * 配置
     */
    @Column(name = "setting")
    private String setting;
}
