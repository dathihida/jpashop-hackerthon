package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {
    private final ItemRepository itemRepository;

    // save item
    @Transactional
    public Long saveItem(Item item){
        itemRepository.save(item);
        return item.getId();
    }

    @Transactional
    public void updateItem(Long itemId, String name, int price, int stockQuantity){
        Item item = itemRepository.findOne(itemId);
        item.setName(name);
        item.setPrice(price);
        item.setStockQuantity(stockQuantity);

    }

    // retrieve all item
    public List<Item> findItems(){
        return itemRepository.findAll();
    }

    //retrieve one item
    public Item findOne(Long itemId){
        return itemRepository.findOne(itemId);
    }
}
