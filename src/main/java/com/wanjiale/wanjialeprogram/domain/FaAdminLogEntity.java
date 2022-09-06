package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_admin_log")
public class FaAdminLogEntity {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 管理员ID
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 管理员名字
     */
    @Column(name = "username")
    private String username;

    /**
     * 操作页面
     */
    @Column(name = "url")
    private String url;

    /**
     * 日志标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 内容
     */
    @Column(name = "content")
    private String content;

    /**
     * IP
     */
    @Column(name = "ip")
    private String ip;

    /**
     * User-Agent
     */
    @Column(name = "useragent")
    private String userAgent;

    /**
     * 操作时间
     */
    @Column(name = "createtime")
    private String createTime;
}
