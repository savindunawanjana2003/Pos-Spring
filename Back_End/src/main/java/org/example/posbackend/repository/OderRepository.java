package org.example.posbackend.repository;

import org.example.posbackend.entity.Customer;
import org.example.posbackend.entity.Oder;
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
public interface OderRepository extends JpaRepository<Oder,String> {
    @Query("SELECT MAX(o.oderId) FROM Oder o")
    String findLastOderId();
}
