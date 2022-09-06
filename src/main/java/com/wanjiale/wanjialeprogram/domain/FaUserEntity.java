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
@Table(name = "fa_user")
public class FaUserEntity {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 组别ID
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 组别ID
     */
    @Column(name = "openid")
    private String openId;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 密码盐
     */
    @Column(name = "salt")
    private String salt;

    /**
     * 电子邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 手机号
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 等级
     */
    @Column(name = "level")
    private Integer level;

    /**
     * 性别
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;

    /**
     * 格言
     */
    @Column(name = "bio")
    private Date bio;

    /**
     * 余额
     */
    @Column(name = "money")
    private double money;

    /**
     * 积分
     */
    @Column(name = "score")
    private Integer score;

    /**
     * 连续登录天数
     */
    @Column(name = "successions")
    private Integer successions;

    /**
     * 最大连续登录天数
     */
    @Column(name = "maxsuccessions")
    private Integer maxSuccessions;

    /**
     * 上次登录时间
     */
    @Column(name = "prevtime")
    private Long prevTime;

    /**
     * 登录时间
     */
    @Column(name = "logintime")
    private Long loginTime;

    /**
     * 登录IP
     */
    @Column(name = "loginip")
    private String loginIp;

    /**
     * 失败次数
     */
    @Column(name = "loginfailure")
    private Integer loginFailure;

    /**
     * 加入IP
     */
    @Column(name = "joinip")
    private String joinIp;


    /**
     * 加入时间
     */
    @Column(name = "jointime")
    private Long joinTime;

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
     * Token
     */
    @Column(name = "token")
    private String token;

    /**
     * 状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 验证
     */
    @Column(name = "verification")
    private String verification;

    /**
     * 地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 购买的商品
     */
    @Column(name = "buygood")
    private String buyGood;

    /**
     * 省
     */
    @Column(name = "province")
    private String province;

    /**
     * 市
     */
    @Column(name = "city")
    private String city;

    /**
     * 区
     */
    @Column(name = "area")
    private String area;

    /**
     * 签到时间
     */
    @Column(name = "signtime")
    private Long signTime;

    /**
     * 推荐人ID
     */
    @Column(name = "fid")
    private String fid;

    /**
     * 是否为有赞会员
     */
    @Column(name = "isyz")
    private Integer isYz;

    /**
     * 有赞来源渠道
     */
    @Column(name = "yly")
    private String yly;

    /**
     * 有赞会员时间
     */
    @Column(name = "ytime")
    private String yTime;

    /**
     * 归属分店
     */
    @Column(name = "yshop")
    private String yShop;
}
