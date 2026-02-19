package org.example.posbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/15/26 2:40 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OderDeatiles {
    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String oderDeatiles_id;
    private Long oderDeatiles_id;

    @ManyToOne
    private Oder oder;

    @ManyToOne
    Item item;

    private  String qty;

    private  String totlePrice;

}
