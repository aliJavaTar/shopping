package repository.cartitem;

import entity.CartItem;
import repository.base.BaseRepositoryImpl;
import javax.persistence.EntityManager;


public class CartItemRepositoryImpl extends BaseRepositoryImpl<CartItem,Long> implements CartItemRepository{


    protected CartItemRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<CartItem> getEntityClass() {
        return CartItem.class;
    }
}
