package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.services;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.clients.ReqResApi;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.PersonsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ReqResServiceImpl {

    @Lazy
    @Autowired
    private ReqResApi reqResApi;

    public PersonsDTO getPersons(){
        return reqResApi.getAllPersons();
    }
}
