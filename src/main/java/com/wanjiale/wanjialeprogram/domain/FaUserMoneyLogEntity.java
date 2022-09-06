package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_user_money_log")
public class FaUserMoneyLogEntity {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 会员ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 变更余额
     */
    @Column(name = "money")
    private double money;

    /**
     * 变更前余额
     */
    @Column(name = "before")
    private double before;

    /**
     * 变更后余额
     */
    @Column(name = "after")
    private double after;

    /**
     * 备注
     */
    @Column(name = "memo")
    private String memo;

    /**
     * 创建时间
     */
    @Column(name = "createtime")
    private Long createTime;
}
