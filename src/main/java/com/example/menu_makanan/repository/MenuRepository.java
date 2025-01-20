package com.example.menu_makanan.repository;

import com.example.menu_makanan.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByType(String type);
}
