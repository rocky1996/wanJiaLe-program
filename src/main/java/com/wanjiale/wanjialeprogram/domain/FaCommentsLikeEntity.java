package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_comments_like")
public class FaCommentsLikeEntity {

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
     * 评论id
     */
    @Column(name = "cid")
    private Integer cid;

    /**
     * 日期
     */
    @Column(name = "createtime")
    private Long createTime;
}
