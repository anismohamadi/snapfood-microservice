package com.kurdestanbootcamp.basketitemservice.basket_item;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BasketItemRepository extends PagingAndSortingRepository<BasketItem,Long> , JpaSpecificationExecutor<BasketItem> {

    List<BasketItem> findAllByBasketId(Long basketId);
    List<BasketItem> findAllByItemId(Long itemId);
    Page<BasketItem> findAll(Pageable pageable);
    Page<BasketItem> findAll(Specification<BasketItem> specification, Pageable pageable);
    List<BasketItem> findAll(Specification<BasketItem> specification);
}
