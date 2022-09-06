package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_user_score_log")
public class FaUserScoreLog {

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
    private Integer userId;

    /**
     * 变更积分
     */
    @Column(name = "score")
    private Integer score;

    /**
     * 变更前积分
     */
    @Column(name = "before")
    private Integer before;

    /**
     * 变更后积分
     */
    @Column(name = "after")
    private Integer after;

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
