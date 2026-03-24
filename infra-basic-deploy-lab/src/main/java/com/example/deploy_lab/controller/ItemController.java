package com.example.deploy_lab.controller;


import org.springframework.web.bind.annotation.*;

import com.example.deploy_lab.entity.Item;
import com.example.deploy_lab.entity.ItemRepository;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // 전체 조회
    @GetMapping
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    // 등록
    @PostMapping
    public Item save(@RequestParam String name) {
        return itemRepository.save(new Item(name));
    }
}