package com.wheypoint.api.dto.common;

import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
public class ApiResponse<T> {

    private final String status;  // "SUCCESS" or "ERROR"
    private final String message; // 응답 메시지
    private final String code;    // 에러코드
    private final T data;         // 실제 데이터 (Generic)

    private ApiResponse(String status, String message, String code ,  T data) {
        this.status = status;
        this.message = message;
        this.code = code;
        this.data = data;

    }

    // 성공
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>("SUCCESS", "요청이 성공적으로 처리되었습니다.", null ,  data);
    }

    // 메시지
    public static <T> ApiResponse<T> success(String message, String code)
    {
        return new ApiResponse<>("SUCCESS", message, code , null);
    }

    // 실패
    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>("ERROR", message, "SYSTEM_ERROR" , null);
    }


}
