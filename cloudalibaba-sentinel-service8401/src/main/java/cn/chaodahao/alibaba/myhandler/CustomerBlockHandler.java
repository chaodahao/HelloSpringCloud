package cn.chaodahao.alibaba.myhandler;

import cn.chaodahao.springcloud.entities.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author: cdh
 * @date: 2023/12/12 23:29
 * @descriptions:
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(666, "My ExcrptionHandler defined by myself...");
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(666, "My ExcrptionHandler2 defined by myself...");
    }
}
