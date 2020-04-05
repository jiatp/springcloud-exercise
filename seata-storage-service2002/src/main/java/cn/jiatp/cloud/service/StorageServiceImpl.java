package cn.jiatp.cloud.service;

import cn.jiatp.cloud.dao.StorageDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: jiatp
 * @Date:2020/4/423:39
 * @ClassName: StorageServiceImpl
 * @Description:
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }

}