package com.kurdestanbootcamo.userservice.user;


import com.kurdestanbootcamo.userservice.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class UserDTO extends BaseDTO {


   @ApiModelProperty(required = true, hidden = false)
    private String name;

    @ApiModelProperty(required = true, hidden = false)
    private String family;

    @ApiModelProperty(required = true, hidden = false)
    private String phone;

    @ApiModelProperty(required = true, hidden = false)
    private LocationDTO locationDTO;


}
