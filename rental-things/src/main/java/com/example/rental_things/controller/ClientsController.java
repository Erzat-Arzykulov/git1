package com.example.rental_things.controller;


import com.example.rental_things.models.Clients;
import com.example.rental_things.service.ClientsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
@AllArgsConstructor
public class ClientsController {

    private ClientsService clientsService;


    @PostMapping("/save")
    public ResponseEntity<Clients> saveClients(@RequestBody Clients clients){
        Clients clientsSaved = clientsService.save(clients);

        if (clientsSaved == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }else {
            return ResponseEntity.ok(clients);
        }
    }




}
