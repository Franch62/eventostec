package com.eventostec.api.domain.address;

import com.eventostec.api.domain.event.Event;

import java.util.UUID;

public record AddressRequestDTO(String city, String uf, Event event){
}
