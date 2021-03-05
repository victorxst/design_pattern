package com.example.design_pattern.pattern.structural.adapter.v2;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","职位");
        officeInfo.put("officeTelNumber","员工的办公电话");
        return officeInfo;
    }
}
