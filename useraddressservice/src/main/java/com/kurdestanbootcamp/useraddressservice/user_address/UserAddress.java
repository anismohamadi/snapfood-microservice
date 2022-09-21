package com.kurdestanbootcamp.useraddressservice.user_address;

import com.kurdestanbootcamp.useraddressservice.common.BaseEntity;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Audited
@Table(name= "tbl_user_address")
@Data
public class UserAddress extends BaseEntity {

    @NotNull
    @Column(name = "title")
    private  String title;

    @NotNull
    @Column(name = "address")
    private String address;

    @NotNull
    @Column(name = "location")
    private Point<G2D> location;

    @NotNull
    @Column(name = "user_id")
    private Long userId;




}



