package com.kurdestanbootcamp.itemservice.item;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface ItemMapper {

    Item toItem(ItemDTO itemDTO);
    ItemDTO toItemDTO(Item item);
    List<Item> toItemList(List<ItemDTO> itemDTOS);
    List<ItemDTO> toItemDTOs(List<Item> itemList);

}
