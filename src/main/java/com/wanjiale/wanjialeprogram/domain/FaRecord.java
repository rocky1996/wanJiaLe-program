package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_record")
public class FaRecord {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "uid")
    private Integer uid;

    /**
     * 活动ID
     */
    @Column(name = "hid")
    private Integer hid;

    /**
     * 产品ID
     */
    @Column(name = "gid")
    private Integer gid;

    /**
     * 创建时间
     */
    @Column(name = "createtime")
    private Long createTime;

    /**
     * 删除
     */
    @Column(name = "del")
    private Integer del;
}
