package com.wanjiale.wanjialeprogram.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fa_apilog")
public class FaApiLogEntity {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    /**
     * api地址
     */
    @Column(name = "api")
    private String api;

    /**
     * code值
     */
    @Column(name = "code")
    private String code;

    /**
     * errMsg
     */
    @Column(name = "errmsg")
    private String errMsg;

    /**
     * data
     */
    @Column(name = "data")
    private String data;

    /**
     * time
     */
    @Column(name = "time")
    private String time;
}
