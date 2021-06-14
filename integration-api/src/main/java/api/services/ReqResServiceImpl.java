package api.services;

import api.clients.ReqResApi;
import api.model.PersonsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReqResServiceImpl {

    @Lazy
    @Autowired
    private ReqResApi reqResApi;

    public PersonsDTO getPersons(){
        log.info("getPersons - getting all the personal data available");
        return reqResApi.getAllPersons();
    }
}
