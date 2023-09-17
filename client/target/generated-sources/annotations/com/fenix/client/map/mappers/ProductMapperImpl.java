package com.fenix.client.map.mappers;

import com.fenix.client.data.ProductEntity;
import com.fenix.client.input.ProductDataInputDt;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T16:54:30+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity mapProductDataInputDtToProductEntity(ProductDataInputDt productDataInputDt) {
        if ( productDataInputDt == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        if ( productDataInputDt.getId() != null ) {
            productEntity.setId( productDataInputDt.getId() );
        }
        if ( productDataInputDt.getProductName() != null ) {
            productEntity.setProductName( productDataInputDt.getProductName() );
        }

        return productEntity;
    }
}
