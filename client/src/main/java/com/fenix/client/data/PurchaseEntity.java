package com.fenix.client.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name="purchases")
public class PurchaseEntity {
    /*@EmbeddedId
    PurchaseKeyEntity id;
    @ManyToOne
    @MapsId("client_id")
    @JoinColumn(name = "client_id")
    private Client clients;
    @ManyToOne
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private Product products;*/

    private String clientId;
    private String productId;
    private int fundAmount;
    private int premiumAmount;
}
