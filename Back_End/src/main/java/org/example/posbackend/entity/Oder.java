package org.example.posbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/15/26 2:39 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@ToString
public class Oder {
    @Id
    private String oderId;

  @OneToMany(mappedBy="oder", cascade = CascadeType.ALL)
    private List<OderDeatiles>oderDeatilesLists;

  @ManyToOne
  Customer customer;

//    @ManyToOne
//    Item item;

    private String date;


}
