package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.clients;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.PersonsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Service
@FeignClient(url = "https://reqres.in", name= "ReqResApi")
public interface ReqResApi {

    @RequestMapping(method = RequestMethod.GET, path = "/api/users", produces = APPLICATION_JSON_VALUE)
    PersonsDTO getAllPersons();
}
