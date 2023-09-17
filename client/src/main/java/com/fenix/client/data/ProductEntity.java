package com.fenix.client.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name="products")
public class ProductEntity {

    @Id
    private String id;

    @Column(name = "product_name")
    private String productName;

    /*@ManyToMany(mappedBy = "products")
    private Set<Client> clients;

    @OneToMany(mappedBy = "products")
    private Set<Purchase> purchases;*/
}
