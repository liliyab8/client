package com.fenix.client.controller;

import com.fenix.client.data.ClientEntity;
import com.fenix.client.data.ProductEntity;
import com.fenix.client.data.PurchaseEntity;
import com.fenix.client.input.ClientDataInputDt;
import com.fenix.client.input.ProductDataInputDt;
import com.fenix.client.input.PurchaseDataInputDt;
import com.fenix.client.services.ClientsService;
import com.google.gson.Gson;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ClientsController {
    @Autowired
    private ClientsService clientsService;
    public static Map<String, ClientEntity> clientsMap = new HashMap<>();
    public static List<PurchaseEntity> purchasesList = new ArrayList<>();
    public static Map<String, ProductEntity> productsMap = new HashMap<>();
    @Autowired
    Gson gson;

    @PostMapping(value = "/identifyClient", produces = "application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveClient(@Valid @RequestBody ClientDataInputDt clientDataInputDt) {
        return new ResponseEntity<String>(clientsService.identifyClient(clientDataInputDt), HttpStatus.OK);
    }

    @PostMapping(value = "/purchase", produces = "application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> buyProduct(@RequestBody PurchaseDataInputDt purchaseDataInputDt) {
        clientsService.buyProduct(purchaseDataInputDt);
        return new ResponseEntity<String>(gson.toJson(purchasesList), HttpStatus.OK);
    }

    @PostMapping(value = "/saveProduct", produces = "application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveProduct(@RequestBody ProductDataInputDt productDataInputDt) {
        return new ResponseEntity<String>(clientsService.saveProduct(productDataInputDt), HttpStatus.OK);
    }
}