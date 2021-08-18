package entity.base;

import entity.Order;
import entity.Product;

import javax.persistence.*;

@Entity
@Table(name = "order_detalis")
public class OrderDetail extends BaseEntity<Long> {
    @Column(name = "order_number")
    private int orderNumber;
    @Column(name = "quantity_order")
    private int quantityOrder;
    @Column(name = "price_each")
    private int priceEach;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Order order;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public int getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(int priceEach) {
        this.priceEach = priceEach;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
