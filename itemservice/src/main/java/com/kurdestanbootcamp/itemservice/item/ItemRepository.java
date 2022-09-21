package com.kurdestanbootcamp.itemservice.item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ItemRepository extends PagingAndSortingRepository<Item,Long> , JpaSpecificationExecutor<Item> {
    List<Item> findAllBySupplierCategoryId(Long supplierCategoryId);
    Page<Item> findAll(Pageable pageable);
    Page<Item> findAll(Specification<Item> specification, Pageable pageable);
    List<Item> findAll(Specification<Item> specification);


}

