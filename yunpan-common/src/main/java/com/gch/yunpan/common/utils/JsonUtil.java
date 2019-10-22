package com.gch.yunpan.common.utils;

import com.alibaba.fastjson.JSONObject;
import java.util.List;

public class JsonUtil {

    public static String createSuccessResponse() {
        JSONObject result = new JSONObject();
        result.put("response", "Success");
        return result.toJSONString();
    }

    public static String createSuccessResponse(Object data) {
        JSONObject result = new JSONObject();
        result.put("response", "Success");
        result.put("data", data);
        return result.toJSONString();
    }

    public static String createSuccessResponse(List<?> list) {
        JSONObject result = new JSONObject();
        result.put("response", "Success");
        result.put("data", list);
        result.put("total", list.size());
        return result.toJSONString();
    }

    public static String createFailResponse(String msg) {
        JSONObject result = new JSONObject();
        result.put("response", "Fail");
        result.put("message", msg);
        return result.toJSONString();
    }

}
