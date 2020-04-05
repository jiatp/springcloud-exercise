package cn.jiatp.cloud.service;

import java.math.BigDecimal;

/**
 * @Author: jiatp
 * @Date:2020/4/511:19
 * @ClassName: AccountService
 * @Description:
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
