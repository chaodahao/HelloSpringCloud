package cn.chaodahao.alibaba.controller;

import cn.chaodahao.alibaba.domain.CommonResult;
import cn.chaodahao.alibaba.domain.Order;
import cn.chaodahao.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cdh
 * @date 2023/12/16 21:03
 * @descriptions
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
