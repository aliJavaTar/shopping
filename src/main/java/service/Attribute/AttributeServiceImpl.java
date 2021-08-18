package service.Attribute;

import entity.Attribute;
import repository.attributer.AttributeRepository;
import service.base.BaseServiceImpl;

public class AttributeServiceImpl extends BaseServiceImpl<Attribute,Long, AttributeRepository> {


    protected AttributeServiceImpl(AttributeRepository repository) {
        super(repository);
    }
}
