package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_comments")
public class FaComments {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "uid")
    private Integer uid;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 活动ID
     */
    @Column(name = "clist_id")
    private Integer clistId;

    /**
     * 产品ID
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 日期
     */
    @Column(name = "createtime")
    private Long createTime;

    /**
     * 审核
     */
    @Column(name = "status")
    private String status;

    /**
     * 是否删除
     */
    @Column(name = "del")
    private Integer del;
}
