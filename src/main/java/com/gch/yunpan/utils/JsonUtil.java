package com.gch.yunpan.utils;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {

    public static String createSuccessResponse(Object data) {
        JSONObject result = new JSONObject();
        result.put("res", "Success");
        if(data != null) {
            result.put("data", data);
        }
        return result.toJSONString();
    }

}
