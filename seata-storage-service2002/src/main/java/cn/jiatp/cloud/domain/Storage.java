package cn.jiatp.cloud.domain;

/**
 * @Author: jiatp
 * @Date:2020/4/423:37
 * @ClassName: Storage
 * @Description:
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;

}