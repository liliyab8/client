package com.fenix.client.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name="clients")
public class ClientEntity {

    @Id
    private String id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "contact_method_type")
    private String contactMethodType;

    @Column(name = "contact_method_value")
    private String contactMethodValue;

   /* @ManyToMany
    @JoinTable(
            name = "purchases",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;

    @OneToMany(mappedBy = "clients")
    private Set<Purchase> purchases;*/
}