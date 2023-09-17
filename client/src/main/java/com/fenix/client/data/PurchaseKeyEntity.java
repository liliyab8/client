package com.fenix.client.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseKeyEntity implements Serializable {
    //@Column(name = "client_id")
    private String clientId;
    //@Column(name = "product_id")
    private String productId;
}
