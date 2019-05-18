package org.bryson.singledatabasemultitenant.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.bryson.singledatabasemultitenant.service.OrgDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Api(tags = "HelloWorldController", description = "hello world测试")
public class HelloWorldController {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    OrgDataService orgDataService;

//    @ApiOperation(value = "getHelloworld测试")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getHelloworld() {
        System.out.println("ns hello world");
        return  ResponseEntity.ok("helloworld");
    }

    @ApiOperation(value = "测试多租户数据库，使用ren_capability表测试，返回全部ren_capability表的内容 ")
    @RequestMapping(value = "/multi-test", method = RequestMethod.POST)
    public ResponseEntity<?> testMultiTenant(@RequestParam("tenantId") String tenantId) {
        HashMap<String, Object> result = orgDataService.retrieveAllCapability();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
