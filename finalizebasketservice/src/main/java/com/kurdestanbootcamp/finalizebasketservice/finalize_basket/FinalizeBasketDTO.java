package com.kurdestanbootcamp.finalizebasketservice.finalize_basket;

import com.kurdestanbootcamp.finalizebasketservice.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class FinalizeBasketDTO extends BaseDTO {

   @ApiModelProperty(required = true,hidden = false)
    private Status status;

    @ApiModelProperty(required = true,hidden = false)
    private  Double paidPrice;

    @ApiModelProperty(required = true,hidden = false)
    private Long userId;
}
