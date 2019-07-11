package com.example.demo.sys.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wfj
 * @since 2019-07-12
 */
@RestController
@RequestMapping("/sys/cars")
public class CarsController {
    @RequestMapping("/list")
    public void list(){

        System.out.println("大爷的，告诉我测试通了");
    }

}
