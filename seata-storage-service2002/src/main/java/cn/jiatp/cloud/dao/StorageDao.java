package cn.jiatp.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: jiatp
 * @Date:2020/4/423:35
 * @ClassName: StorageDao
 * @Description:
 */
@Mapper
public interface StorageDao {
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}