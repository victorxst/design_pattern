package com.example.design_pattern.pattern.structural.adapter.v2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","员工家庭电话");
        homeInfo.put("homeAddress","员工家庭地址");
        return homeInfo;
    }
}
