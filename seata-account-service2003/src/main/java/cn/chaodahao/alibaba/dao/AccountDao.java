package cn.chaodahao.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author cdh
 * @date 2023/12/17 15:34
 * @descriptions
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
