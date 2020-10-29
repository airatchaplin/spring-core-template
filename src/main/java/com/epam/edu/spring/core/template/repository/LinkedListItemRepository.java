package com.epam.edu.spring.core.template.repository;

import com.epam.edu.spring.core.template.entity.Item;

import java.util.LinkedList;
import java.util.List;

/**
 * Репозиторий, основанный на классе LinkedList.
 * initialSequence должен случайно генерироваться из диапазона от 1 до 100
 */
public class LinkedListItemRepository extends AbstractRepository<Item> implements ItemRepository {

    private List<Item> linkedList = new LinkedList<>();

    @Override
    public Item getById(long id) {
        for (Item item : linkedList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean createItem(Item item) {
        setInitialSequence((int) (Math.random() * 100));
        item.setId(initialSequence);
        if (getById(item.getId()) == null) {
            linkedList.add(item);
            return true;
        } else
            return false;
    }

    void setInitialSequence(int val) {
        //TODO
        this.initialSequence = val;
    }

    void setHolder() {
        //TODO
        holder = linkedList;
    }
}