package com.technisoft.tablemingle.factory;

import com.technisoft.tablemingle.dto.MenuDTO;
import com.technisoft.tablemingle.model.Menu;
import org.springframework.stereotype.Component;

@Component
public class MenuFactoryService {

    public Menu createMenu(MenuDTO menuDTO) {
        return new Menu(menuDTO.getNombre(), menuDTO.getDescripcion(), menuDTO.getPrecio());
    }

    public MenuDTO createMenuDTO(Menu menu) {
        return new MenuDTO(menu.getId(), menu.getNombre(), menu.getDescripcion(), menu.getPrecio());
    }
}