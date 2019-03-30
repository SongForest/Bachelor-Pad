package jsdx.zjj.ssl.until;

import java.math.BigDecimal;

public class PayouUntil {
    private String payouType;

    private BigDecimal payouMoney;

    public String getPayouType() {
        return payouType;
    }

    public void setPayouType(String payouType) {
        this.payouType = payouType;
    }

    public BigDecimal getPayouMoney() {
        return payouMoney;
    }

    public void setPayouMoney(BigDecimal payouMoney) {
        this.payouMoney = payouMoney;
    }

    @Override
    public String toString() {
        return "\""+payouType+"\","+payouMoney;
    }
}
