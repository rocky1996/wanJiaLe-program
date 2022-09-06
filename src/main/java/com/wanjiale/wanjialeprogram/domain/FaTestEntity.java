package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_test")
public class FaTestEntity {

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
     * 管理员ID
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 分类ID(单选)
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 分类ID(多选)
     */
    @Column(name = "category_ids")
    private String categoryIds;

    /**
     * 标签
     */
    @Column(name = "tags")
    private String tags;

    /**
     * 星期(单选):monday=星期一,tuesday=星期二,wednesday=星期三
     */
    @Column(name = "week")
    private String week;

    /**
     * 标志(多选):hot=热门,index=首页,recommend=推荐
     */
    @Column(name = "flag")
    private String flag;

    /**
     * 性别(单选):male=男,female=女
     */
    @Column(name = "genderdata")
    private String genderData;

    /**
     * 爱好(多选):music=音乐,reading=读书,swimming=游泳
     */
    @Column(name = "hobbydata")
    private String hobbyData;

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 图片
     */
    @Column(name = "image")
    private String image;

    /**
     * 图片组
     */
    @Column(name = "images")
    private String images;

    /**
     * 附件
     */
    @Column(name = "attachfile")
    private String attachFile;

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
     * 省市
     */
    @Column(name = "city")
    private String city;

    /**
     * 配置:key=名称,value=值
     */
    @Column(name = "json")
    private String json;

    /**
     * 二维数组:title=标题,intro=介绍,author=作者,age=年龄
     */
    @Column(name = "multiplejson")
    private String multipleJson;

    /**
     * 价格
     */
    @Column(name = "price")
    private double price;

    /**
     * 点击
     */
    @Column(name = "views")
    private Integer views;

    /**
     * 时间区间
     */
    @Column(name = "workrange")
    private String workRange;

    /**
     * 开始日期
     */
    @Column(name = "startdate")
    private Date startDate;

    /**
     * 活动时间(datetime)
     */
    @Column(name = "activitytime")
    private Date activityTime;

    /**
     * 年
     */
    @Column(name = "year")
    private String year;

    /**
     * 时间
     */
    @Column(name = "times")
    private Date times;

    /**
     * 刷新时间
     */
    @Column(name = "refreshtime")
    private Long refreshTime;

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
     * 删除时间
     */
    @Column(name = "deletetime")
    private Long deleteTime;

    /**
     * 权重
     */
    @Column(name = "weigh")
    private Integer weigh;

    /**
     * 开关
     */
    @Column(name = "switched")
    private Integer switched;

    /**
     * 状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 状态值:0=禁用,1=正常,2=推荐
     */
    @Column(name = "state")
    private String state;
}
