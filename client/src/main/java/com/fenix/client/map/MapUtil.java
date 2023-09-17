package com.fenix.client.map;

import com.fenix.client.data.ClientEntity;
import com.fenix.client.data.ProductEntity;
import com.fenix.client.data.PurchaseEntity;
import com.fenix.client.input.ClientDataInputDt;
import com.fenix.client.input.ProductDataInputDt;
import com.fenix.client.input.PurchaseDataInputDt;
import com.fenix.client.map.mappers.ClientMapper;
import com.fenix.client.map.mappers.ProductMapper;
import com.fenix.client.map.mappers.PurchaseMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class MapUtil {
    private ClientMapper clientMapper = Mappers.getMapper(ClientMapper.class);
    private PurchaseMapper purchaseMapper = Mappers.getMapper(PurchaseMapper.class);
    private ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);

    public ClientEntity mapClient(ClientDataInputDt clientDataInputDt) {
        return clientMapper.mapPostClientDataInputDtToClientEntity(clientDataInputDt);
    }

    public PurchaseEntity mapPurchase(PurchaseDataInputDt purchaseDataInputDt) {
        return purchaseMapper.mapPurchaseDataInputDtToPurchaseEntity(purchaseDataInputDt);
    }

    public ProductEntity mapProduct(ProductDataInputDt productDataInputDt) {
        return productMapper.mapProductDataInputDtToProductEntity(productDataInputDt);
    }
}
