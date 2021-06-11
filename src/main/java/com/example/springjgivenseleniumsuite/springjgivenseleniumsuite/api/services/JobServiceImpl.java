package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.services;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.clients.JobApi;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.AssociatedSkillsDTO;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.JobDTO;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.model.SkillsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobServiceImpl {

    @Lazy
    @Autowired
    private JobApi jobApi;


    public List<JobDTO> getJobsAssociatedWithWord(String word){
        return jobApi.getJobsByAssociatedWork(word);
    }

    public SkillsDTO getSkillsAssociatedWithJob(String jobUUID){
        return jobApi.getSkillsPerJobUUID(jobUUID);
    }

    public AssociatedSkillsDTO getSkillsAssociatedWithASkillByUUID(String skillUUID){
        return jobApi.getAssociatedSkillsBySkillUUID(skillUUID);
    }
}
