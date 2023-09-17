package com.fenix.client.services;

import com.fenix.client.data.*;
import com.fenix.client.input.ClientDataInputDt;
import com.fenix.client.input.ProductDataInputDt;
import com.fenix.client.input.PurchaseDataInputDt;
import com.fenix.client.map.MapUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.fenix.client.controller.ClientsController.*;
@Service
public class ClientsService {
    /* @Autowired
     private ClientsRepository clientsRepository;
     @Autowired
     private PurchaseRepository purchaseRepository;
     @Autowired
     private ProductRepository productRepository;*/
    @Autowired
    private MapUtil mapUtil;
    @Autowired
    Gson gson;

    public String identifyClient(ClientDataInputDt clientInput) {
        ClientEntity client = mapUtil.mapClient(clientInput);

        if (clientsMap.containsKey(client.getId())) {
            if (clientsMap.get(client.getId()).equals(client)) {
                return gson.toJson(getAllPurchases(client.getId()));
            } else {
                return "An error happened when identifying client.";
            }
        }
        saveClient(clientInput);
        return "A new client created.";
    }

    public void saveClient(ClientDataInputDt clientInput) {
        ClientEntity client = mapUtil.mapClient(clientInput);
        //clientsRepository.save(client);
        clientsMap.put(client.getId(), client);
    }

    public List<PurchaseEntity> getAllPurchases(String clientId) {
        return purchasesList.stream().filter(p -> p.getClientId().equals(clientId)).collect(Collectors.toList());
    }

    public void buyProduct(PurchaseDataInputDt purchaseDataInputDt) {
        //PurchaseKeyEntity purchaseKey = new PurchaseKeyEntity(purchaseDataInputDt.getClient().getId(), purchaseDataInputDt.getProduct().getId());
        //PurchaseEntity purchase = new PurchaseEntity(purchaseKey, purchaseDataInputDt.getPurchaseData().getFundAmount(), purchaseDataInputDt.getPurchaseData().getPremiumAmount());
        //purchaseRepository.save(purchase);
        PurchaseEntity purchaseEntity = mapUtil.mapPurchase(purchaseDataInputDt);
        purchasesList.add(purchaseEntity);
    }

    public String saveProduct(ProductDataInputDt productDataInputDt) {
        ProductEntity productEntity = mapUtil.mapProduct(productDataInputDt);
        productsMap.put(productEntity.getId(), productEntity);
        return gson.toJson(productsMap);
    }
}
