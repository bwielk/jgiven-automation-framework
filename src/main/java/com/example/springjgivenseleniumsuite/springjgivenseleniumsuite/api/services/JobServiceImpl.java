package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.services;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.clients.JobApi;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.AssociatedSkillsDTO;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.JobDTO;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.SkillsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class JobServiceImpl {

    @Lazy
    @Autowired
    private JobApi jobApi;


    public List<JobDTO> getJobsAssociatedWithWord(String word){
        log.info(String.format("getJobsAssociatedWithWord - getting job associated with a word '%s'", word));
        return jobApi.getJobsByAssociatedWork(word);
    }

    public SkillsDTO getSkillsAssociatedWithJob(String jobUUID){
        log.info(String.format("getSkillsAssociatedWithJob - getting skills associated with a job of UUID '%s'", jobUUID));
        return jobApi.getSkillsPerJobUUID(jobUUID);
    }

    public AssociatedSkillsDTO getSkillsAssociatedWithASkillByUUID(String skillUUID){
        log.info(String.format("getSkillsAssociatedWithASkillByUUID - getting skills associated with a skill of" +
                " UUID '%s'", skillUUID));
        return jobApi.getAssociatedSkillsBySkillUUID(skillUUID);
    }
}
