package com.learn.service.impl;

import com.learn.dao.ItemMapper;
import com.learn.model.Item;
import com.learn.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    private ItemMapper itemMapper;

    public ItemMapper getItemMapper() {
        return itemMapper;
    }
    @Autowired
    public void setItemMapper(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }
    @Override
    public int deleteByName(String name) {
        return itemMapper.deleteByName(name);
    }

    @Override
    public int insert(Item item) {
        return itemMapper.insert(item);
    }

    @Override
    public Item selectByName(String name) {
        return itemMapper.selectByName(name);
    }

    @Override
    public int updateByName(Item item) {
        return itemMapper.updateByName(item);
    }
}
