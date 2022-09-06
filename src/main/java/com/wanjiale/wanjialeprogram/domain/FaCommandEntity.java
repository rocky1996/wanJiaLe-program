package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_command")
public class FaCommandEntity {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型
     */
    @Column(name = "type")
    private String type;

    /**
     * 参数
     */
    @Column(name = "params")
    private String params;

    /**
     * 命令
     */
    @Column(name = "command")
    private String command;

    /**
     * 返回结果
     */
    @Column(name = "content")
    private String content;

    /**
     * 执行时间
     */
    @Column(name = "executetime")
    private Long executeTime;

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
     * 状态
     */
    @Column(name = "status")
    private String status;
}
