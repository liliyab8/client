package com.fenix.client.map.mappers;

import com.fenix.client.data.ClientEntity;
import com.fenix.client.input.ClientDataInputDt;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T16:54:30+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientEntity mapPostClientDataInputDtToClientEntity(ClientDataInputDt clientDataInputDt) {
        if ( clientDataInputDt == null ) {
            return null;
        }

        ClientEntity clientEntity = new ClientEntity();

        if ( clientDataInputDt.getId() != null ) {
            clientEntity.setId( clientDataInputDt.getId() );
        }
        if ( clientDataInputDt.getClientName() != null ) {
            clientEntity.setClientName( clientDataInputDt.getClientName() );
        }
        if ( clientDataInputDt.getContactMethodType() != null ) {
            clientEntity.setContactMethodType( clientDataInputDt.getContactMethodType() );
        }
        if ( clientDataInputDt.getContactMethodValue() != null ) {
            clientEntity.setContactMethodValue( clientDataInputDt.getContactMethodValue() );
        }

        return clientEntity;
    }
}
