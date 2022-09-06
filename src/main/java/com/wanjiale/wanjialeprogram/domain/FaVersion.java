package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_version")
public class FaVersion {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 旧版本号
     */
    @Column(name = "oldversion")
    private String oldVersion;

    /**
     * 新版本号
     */
    @Column(name = "newversion")
    private String newVersion;

    /**
     * 包大小
     */
    @Column(name = "packagesize")
    private String packageSize;

    /**
     * 升级内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 下载地址
     */
    @Column(name = "downloadurl")
    private String downloadUrl;

    /**
     * 强制更新
     */
    @Column(name = "enforce")
    private Integer enforce;

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
