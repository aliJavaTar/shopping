package repository.product;


import entity.Product;
import repository.base.BaseRepositoryImpl;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductRepositoryImpl extends BaseRepositoryImpl<Product,Long> implements ProductRepository {


    protected ProductRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Product> getEntityClass() {
        return Product.class;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
