package cn.chaodahao.alibaba.domain;

import lombok.Data;

/**
 * @author cdh
 * @date 2023/12/16 21:32
 * @descriptions
 */
@Data
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}
