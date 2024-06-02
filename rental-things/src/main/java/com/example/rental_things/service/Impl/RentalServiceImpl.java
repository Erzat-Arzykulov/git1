package com.example.rental_things.service.Impl;

import com.example.rental_things.models.Clients;
import com.example.rental_things.models.Operation;
import com.example.rental_things.models.OperationProducts;
import com.example.rental_things.models.Product;
import com.example.rental_things.models.dto.RentalDto;
import com.example.rental_things.repository.*;
import com.example.rental_things.service.RentalService;
import org.springframework.stereotype.Service;

@Service
public class RentalServiceImpl implements RentalService {


    ClientsRepo clientsRepo;

    OperationRepo operationRepo;

    OperationProductsRepo operationProductsRepo;

    ProductRepo productRepo;

    @Override
    public Operation save(RentalDto rentalDto) {

        Clients client = new Clients();
        client.setLastName(rentalDto.getLastName());
        client.setFirstName(rentalDto.getFirstName());
        client.setPatronymic(rentalDto.getPatronymic());
        client.setInn(rentalDto.getInn());
        client.setAddress(rentalDto.getAddress());

        client = clientsRepo.save(client);



        Product product = new Product();
        product.setInventoryNumber(rentalDto.getInventoryNumber());

        product = productRepo.save(product);



        Operation operation = new Operation();
        operation.setId_client(client.getId());
        operation.setStatus(200);
        operation.setTotalPrice(777777);
        operation.setStartDate(rentalDto.getStartDate());
        operation.setEndDate(rentalDto.getEndDate());

        Operation saveOperation = operationRepo.save(operation);


        OperationProducts operationProducts = new OperationProducts();

        operationProducts.setId_product(product.getId());
        operationProducts.setId_operation(operation.getId());




        return saveOperation;
    }





















//    @Override
//    public RentalServiceImpl save(RentalService rentalService) {
//        clients.setLastName(rentalDto.getLastName());
//        clients.setFirstName(rentalDto.getFirstName());
//        clients.setPatronymic(rentalDto.getPatronymic());
//        clients.setInn(rentalDto.getInn());
//        documents.setPassportSeries(rentalDto.getPassportSeries());
//        documents.setPassportNumber(rentalDto.getPassportNumber());
//        clients.setAddress(rentalDto.getAddress());
//        product.setInventoryNumber(rentalDto.getInventoryNumber());
//        operation.setStartDate(rentalDto.getStartDate());
//        operation.setEndDate(rentalDto.getEndDate());
//        return rentalRepo.save();
//    }
}
