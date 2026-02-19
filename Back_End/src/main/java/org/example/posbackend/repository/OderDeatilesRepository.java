package org.example.posbackend.repository;

import org.example.posbackend.entity.OderDeatiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/15/26 8:29 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
public interface OderDeatilesRepository extends JpaRepository<OderDeatiles,String> {
    @Query("SELECT MAX(i.oderDeatiles_id) FROM OderDeatiles i")
    String findLastOderDeatilesId();
}
