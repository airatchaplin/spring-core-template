package com.epam.edu.spring.core.template.repository;

import com.epam.edu.spring.core.template.entity.Item;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторий, основанный на классе ArrayList.
 * initialSequence должен браться из application.properties
 */
public class ArrayListItemRepository extends AbstractRepository<Item> implements ItemRepository {

    private List<Item> arrayList = new ArrayList<>();

    @Value("${initial.sequence}")
    private String initialSequenceOfProperties;

    @Override
    public Item getById(long id) {
        for (Item item : arrayList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean createItem(Item item) {
        setInitialSequence(Integer.parseInt(initialSequenceOfProperties));
        item.setId(initialSequence);
        if (getById(item.getId()) == null) {
            arrayList.add(item);
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
        holder = arrayList;
    }
}