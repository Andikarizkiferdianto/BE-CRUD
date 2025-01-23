package com.example.menu_makanan.service;

import com.example.menu_makanan.model.Menu;
import com.example.menu_makanan.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public Optional<Menu> getMenuById(Long id) {
        return menuRepository.findById(id);
    }

    public List<Menu> getMenusByType(String type) {
        return menuRepository.findByType(type);
    }
    public List<Menu> getMenusByName(String name) {
        return menuRepository.findByName(name);
    }

    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu updateMenu(Long id, Menu menuDetails) {
        Menu menu = menuRepository.findById(id).orElseThrow(() -> new RuntimeException("Menu not found"));
        menu.setName(menuDetails.getName());
        menu.setType(menuDetails.getType());
        menu.setPrice(menuDetails.getPrice());
        menu.setDeskripsi(menuDetails.getDeskripsi());
        menu.setLink_gambar(menuDetails.getLink_gambar());
        return menuRepository.save(menu);
    }

    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }
}

