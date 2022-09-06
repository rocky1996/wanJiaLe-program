package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_sms")
public class FaSms {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 事件
     */
    @Column(name = "event")
    private String event;

    /**
     * 手机号
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 验证码
     */
    @Column(name = "code")
    private String code;

    /**
     * 验证次数
     */
    @Column(name = "times")
    private Integer times;

    /**
     * IP
     */
    @Column(name = "ip")
    private String ip;

    /**
     * 创建时间
     */
    @Column(name = "createtime")
    private Long createTime;
}
