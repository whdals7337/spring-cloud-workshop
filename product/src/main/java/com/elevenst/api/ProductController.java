package com.elevenst.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/products")
public class ProductController {

    @Value("${config.test.str}")
    public String test;

    @GetMapping(path = "{productId}")
    public String getProductInfo(@PathVariable String productId) {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "[product id = " + productId + " at " + System.currentTimeMillis() + "]" + test;
//        throw new RuntimeException("I/O Exception");
    }
}
