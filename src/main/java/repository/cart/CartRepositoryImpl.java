package repository.cart;

import entity.Cart;
import repository.base.BaseRepositoryImpl;

import javax.persistence.EntityManager;


public class CartRepositoryImpl extends BaseRepositoryImpl<Cart, Long> implements CartRepository {


    protected CartRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Cart> getEntityClass() {
        return Cart.class;
    }
}
