package com.kurdestanbootcamo.userservice.user;


import com.kurdestanbootcamo.userservice.common.BaseEntity;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Audited
@Table(name = "tbl_user")
@Entity
public class User extends BaseEntity {

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "lastname")
    private String family;

    @NotNull
    @Column(name = "phone")
    private String phone;

    @Column(name = "location")
    private Point<G2D> location;



}
