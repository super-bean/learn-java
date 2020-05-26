package com.learn.dao;


import com.learn.model.Item;

public interface ItemMapper {
	int deleteByName(String name);

	int insert(Item item);

	Item selectByName(String name);

	int updateByName(Item item);

}