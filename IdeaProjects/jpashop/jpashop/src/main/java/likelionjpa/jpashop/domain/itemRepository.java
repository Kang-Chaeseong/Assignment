package likelionjpa.jpashop.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class itemRepository {
    @PersistenceContext
    private EntityManager em;

    public Long save (Item item){
        em.persist(item);
        return item.getId();
    }
    public Item find(Long id){
        return em.find(Item.class,id);
    }
}
