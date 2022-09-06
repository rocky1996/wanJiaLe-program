package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_gc")
public class FaGc {

    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * 广告名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 描述
     */
    @Column(name = "des")
    private String des;

    /**
     * 权重
     */
    @Column(name = "weigh")
    private Integer weigh;
}
