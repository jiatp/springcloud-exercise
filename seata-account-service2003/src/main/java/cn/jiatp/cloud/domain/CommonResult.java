package cn.jiatp.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: jiatp
 * @Date:2020/3/2623:07
 * @ClassName: CommonResult
 * @Description: 返回给前端的json
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    private Integer code; //404 \200 \500 状态码
    private String message;  //success faile
    private T   data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
