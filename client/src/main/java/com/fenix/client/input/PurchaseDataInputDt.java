package com.fenix.client.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDataInputDt {
    /*private String id;
    ClientEntity client;
    ProductEntity product;
    PurchaseDataEntity purchaseData;*/

    private String clientId;
    private String productId;
    private int fundAmount;
    private int premiumAmount;
}
