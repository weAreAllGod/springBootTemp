package com.example.demo.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wfj
 * @since 2019-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GateNum对象", description="")
public class GateNum implements Serializable {

    private static final long serialVersionUID = 1L;

//    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String jwbh;

    private Float lng;

    private Float lat;


}
