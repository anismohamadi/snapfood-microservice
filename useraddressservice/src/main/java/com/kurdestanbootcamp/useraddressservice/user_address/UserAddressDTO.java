package com.kurdestanbootcamp.useraddressservice.user_address;


import com.kurdestanbootcamp.useraddressservice.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserAddressDTO extends BaseDTO {

   @ApiModelProperty(required = true,hidden = false)
    private  String title;

    @ApiModelProperty(required = true,hidden = false)
    private String address;

    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO locationDTO;

    @ApiModelProperty(required = true,hidden = false)
    private Long userId;
}
