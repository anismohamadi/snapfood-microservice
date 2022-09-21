package com.kurdestanbootcamp.finalizebasketservice.finalize_basket;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FinalizeBasketRepository extends PagingAndSortingRepository<FinalizeBasket, Long> , JpaSpecificationExecutor<FinalizeBasket> {


    List<FinalizeBasket> findAllByUserId(Long userId);
    Page<FinalizeBasket> findAll(Pageable pageable);
    Page<FinalizeBasket> findAll(Specification<FinalizeBasket> specification, Pageable pageable);
    List<FinalizeBasket> findAll(Specification<FinalizeBasket> specification);

}
