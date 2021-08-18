package entity;

import entity.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart extends BaseEntity<Long> implements Serializable {
    @Column(name = "capacity")
    int capacity = 5;

    @OneToMany(mappedBy = "cart",cascade= CascadeType.ALL)
    private List<CartItem> cartItems;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public User getUser() {
        return user;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
