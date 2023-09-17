package com.fenix.client.map.mappers;

import com.fenix.client.data.PurchaseEntity;
import com.fenix.client.input.PurchaseDataInputDt;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PurchaseMapper {
    PurchaseEntity mapPurchaseDataInputDtToPurchaseEntity(PurchaseDataInputDt purchaseDataInputDt);
}
