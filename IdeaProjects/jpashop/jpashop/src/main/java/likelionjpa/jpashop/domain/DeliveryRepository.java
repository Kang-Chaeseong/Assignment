package likelionjpa.jpashop.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class DeliveryRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Delivery delivery){
        em.persist(delivery);
        return delivery.getId();
    }

    public Delivery find(Long id){
        return em.find(Delivery.class,id);
    }
}
