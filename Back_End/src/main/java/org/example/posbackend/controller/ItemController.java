package org.example.posbackend.controller;

import jakarta.validation.Valid;
import org.example.posbackend.Util2.APIRespons;
import org.example.posbackend.dto.ItemDto;
import org.example.posbackend.service.CustomerService;
import org.example.posbackend.service.ItemServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/14/26 3:05 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/Item")
public class ItemController {

    @Autowired
    private ItemServiceInterface itemServiceInterface;

    @PostMapping("saveItem")
    public ResponseEntity<APIRespons<String>> saveItem(@RequestBody @Valid ItemDto itemDto) {
        java.lang.String resp = itemServiceInterface.saveItem(itemDto);
//        if (resp.equals("saved")) {
//  return "save Success fully...";
//
//        }
//        return "save  UnSuccess fully !";
        return new ResponseEntity<>(new APIRespons<>(201,"Item Saved succses fully",null), HttpStatus.CREATED);

    }

    @GetMapping("getAll")
    public List<ItemDto> getAllItems() {
        List<ItemDto> itemDtosList = itemServiceInterface.getAll();
        return itemDtosList;
    }

    @PutMapping("updateItem")
    public ResponseEntity<APIRespons<String>> updateItem(@RequestBody @Valid ItemDto itemDto) {
        System.out.println("-------------------------------");
        System.out.println(itemDto.getItemId());
        System.out.println(itemDto.getItemName());
        System.out.println(itemDto.getPrice());
        System.out.println("-------------------------------");

        System.out.println("-------------------------");
        itemServiceInterface.updateItem(itemDto);
//
        return new ResponseEntity<>(new APIRespons<>(200,"Item update Succses fully...",null), HttpStatus.CREATED);

    }

    @GetMapping("getLastId")
    public String getLastId() {
        java.lang.Long lastId = itemServiceInterface.getLastId();

        Long lastNewId = lastId + 1;
        System.out.println("---------------------------------------");
        System.out.println(lastNewId);
        System.out.println("---------------------------------------");
        String lastIdAsstring = String.valueOf(lastNewId);

        return lastIdAsstring;
    }
    @DeleteMapping("deleteItem")
    public ResponseEntity<APIRespons<String>>  deleteItem(@RequestBody  @Valid ItemDto itemDto) {
        itemServiceInterface.deleteItems(String.valueOf(itemDto.getItemId()));
//        return "";
        return new ResponseEntity<>(new APIRespons<>(204,"Item Delete ...",null), HttpStatus.CREATED);
    }
}
