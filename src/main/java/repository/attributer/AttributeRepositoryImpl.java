package repository.attributer;

import entity.Attribute;
import repository.base.BaseRepositoryImpl;

import javax.persistence.EntityManager;
import java.util.List;

public class AttributeRepositoryImpl extends
        BaseRepositoryImpl<Attribute, Long> implements AttributeRepository {


    protected AttributeRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Attribute> getEntityClass() {
        return Attribute.class;
    }
}
