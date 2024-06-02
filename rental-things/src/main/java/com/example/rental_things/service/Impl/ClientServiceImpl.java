package com.example.rental_things.service.Impl;

import com.example.rental_things.models.Clients;
import com.example.rental_things.repository.ClientsRepo;
import com.example.rental_things.service.ClientsService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientsService {

    private ClientsRepo clientsRepo;

    public ClientServiceImpl(ClientsRepo clientsRepo) {
        this.clientsRepo = clientsRepo;
    }


    @Override
    public Clients save(Clients clients) {
        return clientsRepo.save(clients);
    }
}
