package com.fenix.client;

import com.fenix.client.input.ClientDataInputDt;
import com.fenix.client.map.MapUtil;
import com.fenix.client.map.mappers.ClientMapper;
import com.fenix.client.services.ClientsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

@SpringBootTest
public class ClientTest {
    @InjectMocks
    private ClientsService clientsService;
    @InjectMocks
    private MapUtil mapUtil;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(clientsService, "mapUtil", mapUtil);
        ClientMapper clientMapper = Mappers.getMapper(ClientMapper.class); // Initialization of the mapper
        ReflectionTestUtils.setField(mapUtil, "clientMapper", clientMapper);
    }

    @Test
    public void clientCreated() {
        ClientDataInputDt client = ClientDataInputDt.builder().
                id("1").
                clientName("wew").
                contactMethodValue("tel").
                contactMethodValue("235346").
                build();

        Assert.assertEquals("A new client created.", clientsService.identifyClient(client));
    }
}
