package com.example.design_pattern.pattern.structural.adapter.v2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    //用户基本信息
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName","张三");
        baseInfoMap.put("mobileNumber","1318888");
        return baseInfoMap;
    }
}
