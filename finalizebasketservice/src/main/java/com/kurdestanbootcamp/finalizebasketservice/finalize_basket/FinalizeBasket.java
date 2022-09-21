package com.kurdestanbootcamp.finalizebasketservice.finalize_basket;


import com.kurdestanbootcamp.finalizebasketservice.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "tbl_finalize_basket")
@Audited
public class FinalizeBasket extends BaseEntity {

    @NotNull
    @Column(name = "status")
    private Status status;

    @NotNull
    @Column(name = "paid_price")
    private  Double paidPrice;

    @NotNull
    @Column(name = "user_id")
    private Long userId;
}
