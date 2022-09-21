package com.kurdestanbootcamp.itemservice.item;


import com.kurdestanbootcamp.itemservice.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@Audited
@Table(name = "tbl_item")
@Entity
public class Item extends BaseEntity {


    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "price")
    private Double price;

    @NotNull
    @Column(name = "image")
    private String image;

    @NotNull
    @Column(name = "supplier_category_id")
    private Long supplierCategoryId;


}
