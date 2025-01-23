package com.example.menu_makanan.repository;

import com.example.menu_makanan.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByType(String type);
    List<Menu> findByName(String name);
}
