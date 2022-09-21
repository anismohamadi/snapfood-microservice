package com.kurdestanbootcamp.basketitemservice.basket_item;


import com.kurdestanbootcamp.basketitemservice.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "tbl_basket_item")
@Audited
@Entity
public class BasketItem  extends BaseEntity {

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "count")
    private  Integer count;

    @NotNull
    @Column(name = "basket_id")
    private Long basketId;

    @NotNull
    @Column(name = "item_id")
    private Long itemId;


}