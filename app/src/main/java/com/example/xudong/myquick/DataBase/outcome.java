package com.example.xudong.myquick.DataBase;
import com.google.gson.Gson;
public class outcome {
    public int id;   //支出编号
    public String income_type;//支出类型 分alipay（支付宝）,wechatpay（微信支付）,cash（现金支付）,card（银行卡转账）
    public double cash1; //支出金额
    public String date;//支出日期


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return id == ((user) o).id;
    }
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
