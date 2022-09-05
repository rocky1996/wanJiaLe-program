package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_attachment")
public class FaAttachment {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类别
     */
    @Column(name = "category")
    private String category;

    /**
     * 管理员ID
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 会员ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 物理路径
     */
    @Column(name = "url")
    private String url;

    /**
     * 宽度
     */
    @Column(name = "imagewidth")
    private String imageWidth;

    /**
     * 高度
     */
    @Column(name = "imageheight")
    private String imageHeight;

    /**
     * 图片类型
     */
    @Column(name = "imagetype")
    private String imageType;

    /**
     * 图片帧数
     */
    @Column(name = "imageframes")
    private Integer imageFrames;

    /**
     * 文件名称
     */
    @Column(name = "filename")
    private String fileName;

    /**
     * 文件大小
     */
    @Column(name = "filesize")
    private Integer fileSize;

    /**
     * mime类型
     */
    @Column(name = "mimetype")
    private String mimeType;

    /**
     * 透传数据
     */
    @Column(name = "extparam")
    private String extParam;

    /**
     * 创建日期
     */
    @Column(name = "createtime")
    private Long createTime;

    /**
     * 更新时间
     */
    @Column(name = "updatetime")
    private Long updateTime;

    /**
     * 上传时间
     */
    @Column(name = "uploadtime")
    private Long uploadTime;

    /**
     * 存储位置
     */
    @Column(name = "storage")
    private String storage;

    /**
     * sha1编码
     */
    @Column(name = "sha1")
    private String sha1;
}
