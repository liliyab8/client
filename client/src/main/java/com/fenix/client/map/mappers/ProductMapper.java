package com.fenix.client.map.mappers;

import com.fenix.client.data.ProductEntity;
import com.fenix.client.input.ProductDataInputDt;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ProductMapper {

    ProductEntity mapProductDataInputDtToProductEntity(ProductDataInputDt productDataInputDt);
}

