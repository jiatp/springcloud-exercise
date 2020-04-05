package cn.jiatp.cloud.service;

/**
 * @Author: jiatp
 * @Date:2020/4/423:38
 * @ClassName: StorageService
 * @Description:
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
