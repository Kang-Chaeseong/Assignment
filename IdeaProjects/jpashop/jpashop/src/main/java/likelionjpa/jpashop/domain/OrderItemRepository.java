package likelionjpa.jpashop.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository
public class OrderItemRepository {
    @PersistenceContext
    private EntityManager em;

    public Long save(OrderItem orderItem){
        em.persist(orderItem);
        return orderItem.getId();
    }

    public OrderItem find(Long id){
        return em.find(OrderItem.class,id);
    }
}
