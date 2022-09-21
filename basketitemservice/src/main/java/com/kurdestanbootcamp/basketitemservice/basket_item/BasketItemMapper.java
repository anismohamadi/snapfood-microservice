package com.kurdestanbootcamp.basketitemservice.basket_item;


import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface BasketItemMapper {

    BasketItem toBasketItem(BasketItemDTO basketItemDTO);
    BasketItemDTO toBasketItemDTO(BasketItem basketItem);
    List<BasketItem> toBaskeItemtList(List<BasketItemDTO> basketItemDTOS);
    List<BasketItemDTO> toBasketItemDTOs(List<BasketItem> basketItemList);

}
