package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_user_rule")
public class FaUserRuleEntity {

    /**
     * id
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
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 是否菜单
     */
    @Column(name = "ismenu")
    private Integer isMenu;

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
