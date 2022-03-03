package com.afterqcd.linux_opti;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuchangdong
 * @Type DemoController
 * @Desc 。
 * @date 2022-03-03 16:54:02
 */
@RestController
public class DemoController {
    @GetMapping("/user_cpu")
    public String userCpu() {
        for (int i = 0; i < 10000; i++) {
            Math.sqrt(10000D);
        }
        return "ok";
    }
}
