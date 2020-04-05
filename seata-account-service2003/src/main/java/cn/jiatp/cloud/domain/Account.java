package cn.jiatp.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: jiatp
 * @Date:2020/4/511:18
 * @ClassName: Account
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;
    private Long userId;
    private Integer total;
    private Integer used;
    private Integer residue;
}