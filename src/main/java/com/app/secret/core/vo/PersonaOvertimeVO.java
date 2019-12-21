package com.app.secret.core.vo;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

/**
 * 个人加班时长信息
 *
 * @author crsu 2019/12/21
 */
public class PersonaOvertimeVO {
    @ApiModelProperty("姓名")
    private String pname;
    @ApiModelProperty("工号")
    private String pcode;
    @ApiModelProperty("工作年份")
    private Integer workYear;
    @ApiModelProperty("工作月份")
    private Integer workMonth;
    @ApiModelProperty("加班时长")
    private java.sql.Timestamp totalOverTime;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public Integer getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    public Integer getWorkMonth() {
        return workMonth;
    }

    public void setWorkMonth(Integer workMonth) {
        this.workMonth = workMonth;
    }

    public Timestamp getTotalOverTime() {
        return totalOverTime;
    }

    public void setTotalOverTime(Timestamp totalOverTime) {
        this.totalOverTime = totalOverTime;
    }
}
