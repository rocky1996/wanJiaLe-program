package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_admin")
public class FaAdminEntity {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "username")
    public String username;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    public String nickname;

    /**
     * 密码
     */
    @Column(name = "password")
    public String password;

    /**
     * 密码盐
     */
    @Column(name = "salt")
    public String salt;

    /**
     * 头像
     */
    @Column(name = "avatar")
    public String avatar;

    /**
     * 电子邮箱
     */
    @Column(name = "email")
    public String email;

    /**
     * 手机号码
     */
    @Column(name = "mobile")
    public String mobile;

    /**
     * 失败次数
     */
    @Column(name = "loginfailure")
    public String loginFailure;

    /**
     * 登录时间
     */
    @Column(name = "logintime")
    public Long loginTime;

    /**
     * 登录IP
     */
    @Column(name = "loginip")
    public String loginIp;

    /**
     * 创建时间
     */
    @Column(name = "createtime")
    public Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "updatetime")
    public Long updateTime;

    /**
     * Session标识
     */
    @Column(name = "token")
    public String token;

    /**
     * 状态
     */
    @Column(name = "status")
    public String status;
}
