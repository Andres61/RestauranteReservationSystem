package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.MenuDTO;
import com.technisoft.tablemingle.model.Menu;
import com.technisoft.tablemingle.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<MenuDTO> getAllMenus() {
        List<Menu> menus = menuRepository.findAll();
        return menus.stream()
                .map(menu -> new MenuDTO(menu.getId(), menu.getNombre(), menu.getDescripcion(), menu.getPrecio()))
                .collect(Collectors.toList());
    }

    public MenuDTO getMenuById(Integer id) {
        Menu menu = menuRepository.findById(id).orElse(null);
        if (menu != null) {
            return new MenuDTO(menu.getId(), menu.getNombre(), menu.getDescripcion(), menu.getPrecio());
        } else {
            return null;
        }
    }

    public MenuDTO createMenu(MenuDTO menuDTO) {
        Menu menu = new Menu(menuDTO.getNombre(), menuDTO.getDescripcion(), menuDTO.getPrecio());
        menu = menuRepository.save(menu);
        return new MenuDTO(menu.getId(), menu.getNombre(), menu.getDescripcion(), menu.getPrecio());
    }

    public void deleteMenu(Integer id) {
        menuRepository.deleteById(id);
    }
}