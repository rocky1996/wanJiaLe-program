package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_category")
public class FaCategory {

    /**
     * 会员ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父ID
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 栏目类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickName;

    /**
     * 昵称
     */
    @Column(name = "flag")
    private String flag;

    /**
     * 图片
     */
    @Column(name = "image")
    private String image;

    /**
     * 关键字
     */
    @Column(name = "keywords")
    private String keywords;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 自定义名称
     */
    @Column(name = "diyname")
    private String diyName;

    /**
     * 创建时间
     */
    @Column(name = "createtime")
    private Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "updatetime")
    private Long updateTime;

    /**
     * 权重
     */
    @Column(name = "weigh")
    private Integer weigh;

    /**
     * 状态
     */
    @Column(name = "status")
    private String status;
}
