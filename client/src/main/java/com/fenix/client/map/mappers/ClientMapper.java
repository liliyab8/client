package com.fenix.client.map.mappers;

import com.fenix.client.data.ClientEntity;
import com.fenix.client.input.ClientDataInputDt;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ClientMapper {
    ClientEntity mapPostClientDataInputDtToClientEntity(ClientDataInputDt clientDataInputDt);
}
