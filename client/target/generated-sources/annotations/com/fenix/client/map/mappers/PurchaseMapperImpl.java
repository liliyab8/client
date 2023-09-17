package com.fenix.client.map.mappers;

import com.fenix.client.data.PurchaseEntity;
import com.fenix.client.input.PurchaseDataInputDt;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T16:54:30+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class PurchaseMapperImpl implements PurchaseMapper {

    @Override
    public PurchaseEntity mapPurchaseDataInputDtToPurchaseEntity(PurchaseDataInputDt purchaseDataInputDt) {
        if ( purchaseDataInputDt == null ) {
            return null;
        }

        PurchaseEntity purchaseEntity = new PurchaseEntity();

        if ( purchaseDataInputDt.getClientId() != null ) {
            purchaseEntity.setClientId( purchaseDataInputDt.getClientId() );
        }
        if ( purchaseDataInputDt.getProductId() != null ) {
            purchaseEntity.setProductId( purchaseDataInputDt.getProductId() );
        }
        purchaseEntity.setFundAmount( purchaseDataInputDt.getFundAmount() );
        purchaseEntity.setPremiumAmount( purchaseDataInputDt.getPremiumAmount() );

        return purchaseEntity;
    }
}
