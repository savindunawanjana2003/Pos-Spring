package org.example.posbackend.service;

import org.example.posbackend.dto.CustomerDTO;
import org.example.posbackend.dto.ItemDto;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/14/26 4:09 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
public interface ItemServiceInterface {
    public String saveItem(ItemDto itemDto);

    public String updateItem(ItemDto itemDto);


    public List<ItemDto> getAll();

    public void deleteItems(String id);

    public Long getLastId();
}
