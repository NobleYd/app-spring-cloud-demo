package com.app.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("app-service-c")
public interface IServiceC extends com.app.service.IServiceC{

}
