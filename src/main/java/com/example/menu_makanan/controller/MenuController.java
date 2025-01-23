package com.example.menu_makanan.controller;

import com.example.menu_makanan.model.Menu;
import com.example.menu_makanan.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;

    // Get all menus
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    // Get menu by ID
    @GetMapping("/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get menu by type (makanan atau minuman)
    @GetMapping("/type/{type}")
    public List<Menu> getMenusByType(@PathVariable String type) {
        return menuService.getMenusByType(type);
    }

    @GetMapping("/menu/{name}")
    public List<Menu> getMenusByName(@PathVariable String name) {
        return menuService.getMenusByName(name);
    }


    // Create new menu
    @PostMapping
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    // Update menu
    @PutMapping("/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Long id, @RequestBody Menu menuDetails) {
        try {
            Menu updatedMenu = menuService.updateMenu(id, menuDetails);
            return ResponseEntity.ok(updatedMenu);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete menu
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
        return ResponseEntity.noContent().build();
    }
}
