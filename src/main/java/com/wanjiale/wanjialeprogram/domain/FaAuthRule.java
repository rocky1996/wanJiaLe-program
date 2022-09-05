package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_auth_rule")
public class FaAuthRule {

    /**
     * 会员ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * menu为菜单,file为权限节点
     */
    @Column(name = "type")
    private String type;

    /**
     * 父ID
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 规则名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 规则名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 图标
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 规则URL
     */
    @Column(name = "url")
    private String url;

    /**
     * 条件
     */
    @Column(name = "condition")
    private String condition;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 是否为菜单
     */
    @Column(name = "ismenu")
    private String isMenu;

    /**
     * 菜单类型
     */
    @Column(name = "menutype")
    private Integer menuType;

    /**
     * 扩展属性
     */
    @Column(name = "extend")
    private String extend;

    /**
     * 拼音首字母
     */
    @Column(name = "py")
    private String py;

    /**
     * 拼音
     */
    @Column(name = "pinyin")
    private String pinyin;

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
