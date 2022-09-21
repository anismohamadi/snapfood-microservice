package com.kurdestanbootcamp.finalizebasketservice.finalize_basket;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface FinalizeBasketMapper {

    FinalizeBasket toFinalizeBasket(FinalizeBasketDTO finalizeBasketDTO);
    FinalizeBasketDTO toFinalizeBasketDTO(FinalizeBasket finalizeBasket);
    List<FinalizeBasket> toFinalizeBasketList(List<FinalizeBasketDTO> finalizeBasketDTOS);
    List<FinalizeBasketDTO> toFinalizeBasketDTOs(List<FinalizeBasket> finalizeBasketList);
}
