package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_auth_group")
public class FaAuthGroupEntity {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父组别
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 组名
     */
    @Column(name = "name")
    private String name;

    /**
     * 规则ID
     */
    @Column(name = "rules")
    private String rules;

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
     * 状态
     */
    @Column(name = "status")
    private String status;
}
