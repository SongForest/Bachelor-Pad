package jsdx.zjj.ssl.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TPayou {
    private Integer tableId;

    private String payouName;

    private String payouType;

    private BigDecimal payouMoney;

    private Date payouTime;

    private String payouPerson;

    private String adminAccout;

    private String payouDescrib;

    private Integer createMan;

    private Date createDate;

    private Integer updateMan;

    private Date updateDate;

    private String remark;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getPayouName() {
        return payouName;
    }

    public void setPayouName(String payouName) {
        this.payouName = payouName == null ? null : payouName.trim();
    }

    public String getPayouType() {
        return payouType;
    }

    public void setPayouType(String payouType) {
        this.payouType = payouType == null ? null : payouType.trim();
    }

    public BigDecimal getPayouMoney() {
        return payouMoney;
    }

    public void setPayouMoney(BigDecimal payouMoney) {
        this.payouMoney = payouMoney;
    }

    public Date getPayouTime() {
        return payouTime;
    }

    public void setPayouTime(Date payouTime) {
        this.payouTime = payouTime;
    }

    public String getPayouPerson() {
        return payouPerson;
    }

    public void setPayouPerson(String payouPerson) {
        this.payouPerson = payouPerson == null ? null : payouPerson.trim();
    }

    public String getAdminAccout() {
        return adminAccout;
    }

    public void setAdminAccout(String adminAccout) {
        this.adminAccout = adminAccout == null ? null : adminAccout.trim();
    }

    public String getPayouDescrib() {
        return payouDescrib;
    }

    public void setPayouDescrib(String payouDescrib) {
        this.payouDescrib = payouDescrib == null ? null : payouDescrib.trim();
    }

    public Integer getCreateMan() {
        return createMan;
    }

    public void setCreateMan(Integer createMan) {
        this.createMan = createMan;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(Integer updateMan) {
        this.updateMan = updateMan;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }
}