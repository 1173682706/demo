package com.example.demo.service.strategy;

import com.example.demo.helper.annotation.Pattern;
import org.springframework.stereotype.Service;

/**
 * @author xin.wang
 * @version v1.0
 * @date 2022/8/24
 * @work
 */
@Service
@Pattern("PDD")
public class TestPDDStrategy implements ITestStrategy {
    @Override
    public String getOrder() {
        return "PDD的订单";
    }
}
