package com.example.design_pattern.pattern.structural.adapter.v2;

public class test {
    public static void main(String[] args) {
        //外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        IUserInfo home = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
        home.getHomeTelNumber();
    }
}
