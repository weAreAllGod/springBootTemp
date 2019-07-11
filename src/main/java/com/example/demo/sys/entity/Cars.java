package com.example.demo.sys.entity;

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
@ApiModel(value="Cars对象", description="")
public class Cars implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer vehicleId;

    private Double gpsTime;

    private Double lat;

    private Double lng;


}
