package jpabook.jpashop.service;

import jpabook.jpashop.domain.*;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import jpabook.jpashop.repository.MemberRepository;
import jpabook.jpashop.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class OrderService {
    private final OrderRepository orderRepository;
    private final MemberRepository memberRepository;
    private final ItemRepository itemRepository;

    //Register Order
    @Transactional
    public Long order(Long memberId, Long itemId, int count){
        //Retrieves Entities
        Member member = memberRepository.findOne(memberId);

        Item item = itemRepository.findOne(itemId);

        //create delivery info
        Delivery delivery = new Delivery();
        delivery.setAddress(member.getAddress());
        delivery.setDeliveryStatus(DeliveryStatus.READY);

        //create order item info
        OrderItem orderItem = OrderItem.createOrderItem(item, item.getPrice(), count);

        //create oder
        Order order = Order.createOrder(member, delivery, orderItem);

        //register order

        orderRepository.save(order);
        return order.getId();
    }

    //cancel Order

    @Transactional

    public void cancelOrder(Long orderId){
        //retrieve order entity
        Order order = orderRepository.findOne(orderId);

        //cancel order
        order.cancel();
    }

    public List<Order> findOrderSearch(OrderSearch orderSearch){
        return orderRepository.findAll(orderSearch);
    }
}
