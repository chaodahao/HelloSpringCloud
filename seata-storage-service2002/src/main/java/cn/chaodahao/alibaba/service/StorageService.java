package cn.chaodahao.alibaba.service;

/**
 * @author cdh
 * @date 2023/12/16 21:38
 * @descriptions
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
