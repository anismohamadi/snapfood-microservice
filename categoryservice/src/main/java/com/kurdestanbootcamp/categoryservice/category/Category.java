package com.kurdestanbootcamp.categoryservice.category;


import com.kurdestanbootcamp.categoryservice.common.BaseEntity;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Audited
@Table(name = "tbl_category")
@Entity
public class Category extends BaseEntity {

    @NotNull
    @Column(name = "title")
    private String  title;

    @NotNull
    @Column(name = "image")
    private String  image ;

    @NotNull
    @Enumerated
    @Column(name = "type")
    private  Type type;





}
