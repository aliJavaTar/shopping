package service.product;

import entity.Product;
import repository.product.ProductRepository;

import service.base.BaseServiceImpl;

import java.util.List;

public class productServiceImp extends BaseServiceImpl<Product, Long, ProductRepository> implements ProductService {
    protected productServiceImp(ProductRepository repository) {
        super(repository);
    }

    public void showProduct() {
        List<Product> products = findAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }


}
