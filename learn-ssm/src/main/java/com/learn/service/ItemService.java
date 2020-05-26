package com.learn.service;

import com.learn.model.Item;

public interface ItemService {
    int deleteByName(String name);

    int insert(Item item);

    Item selectByName(String name);

    int updateByName(Item item);
}
