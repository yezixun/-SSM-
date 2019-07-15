package com.yezixun.service.impl;

import com.yezixun.dao.ItemMapper;
import com.yezixun.domain.Item;
import com.yezixun.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item findById(Integer id) {
        return itemMapper.findById(id);
    }


    public static void main(String[] args) {
        System.out.println("hello,world!");
    }
}
