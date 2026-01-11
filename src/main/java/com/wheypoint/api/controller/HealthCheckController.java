package com.wheypoint.api.controller;

import com.wheypoint.api.dto.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthCheckController {

    @GetMapping("/api/healthCheck")
    public ApiResponse<String> healthCheck() {

        return ApiResponse.success("WheyPoint Server is Running! (v1.0)");
    }

}
