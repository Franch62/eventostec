package com.eventostec.api.service;

import com.eventostec.api.domain.address.Address;
import com.eventostec.api.domain.address.AddressRequestDTO;
import com.eventostec.api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Address createAddress(AddressRequestDTO data){

        Address newAddress = new Address();
        newAddress.setCity(data.city());
        newAddress.setUf(data.uf());
        newAddress.setEvent(data.event());

        repository.save(newAddress);
        return newAddress;
    }
}
