package com.app.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("app-service-b")
public interface IServiceB extends com.app.service.IServiceB{

}
