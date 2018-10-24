package com.labs.game.cartservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItem {
    private Integer id;
    private String customer;
    private String product;
    private int quantity;
    public CartItem(int id_i,String customer_i,String product_i,int quantity_i)
    {
        id=id_i;
        customer=customer_i;
        product=product_i;
        quantity=quantity_i;
    }
}