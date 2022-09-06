package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_yuser")
public class FaYuserEntity {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 电话
     */
    @Column(name = "tell")
    private String tell;

    /**
     * 姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 生日
     */
    @Column(name = "birthday")
    private String birthday;

    /**
     * 性别
     */
    @Column(name = "sex")
    private String sex;

    /**
     * 来源
     */
    @Column(name = "yly")
    private String yly;

    /**
     * 成为客户时间
     */
    @Column(name = "time")
    private String time;

    /**
     * 微信地域
     */
    @Column(name = "adr")
    private String adr;

    /**
     * 归属分店
     */
    @Column(name = "type")
    private String type;
}
