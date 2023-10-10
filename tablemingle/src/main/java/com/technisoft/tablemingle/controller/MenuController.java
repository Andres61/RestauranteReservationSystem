package com.technisoft.tablemingle.controller;

import com.technisoft.tablemingle.dto.MenuDTO;
import com.technisoft.tablemingle.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations/v.1/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/all")
    public List<MenuDTO> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/{id}")
    public MenuDTO getMenuById(@PathVariable Integer id) {
        return menuService.getMenuById(id);
    }

    @PostMapping
    public MenuDTO createMenu(@RequestBody MenuDTO menuDTO) {
        return menuService.createMenu(menuDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Integer id) {
        menuService.deleteMenu(id);
    }
}