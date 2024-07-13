package likelionjpa.jpashop.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository //데이터 접근 계층임을 나타냄
public class OrderRepository {

    @PersistenceContext
    private EntityManager em;


    public Long save(Order order){
        em.persist(order);
        return order.getId();
    }

    public Order find(Long id){
        return em.find(Order.class,id);
    }
}