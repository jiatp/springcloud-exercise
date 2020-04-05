package cn.jiatp.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author: jiatp
 * @Date:2020/4/511:17
 * @InterfaceName: AccountDao
 * @Description:
 */
@Mapper
public interface AccountDao {
    int decrease(@Param("userId") Long userId,
                 @Param("money") BigDecimal money);
}
