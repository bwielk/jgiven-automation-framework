package api.clients;

import api.model.AssociatedSkillsDTO;
import api.model.JobDTO;
import api.model.SkillsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Service
@FeignClient(url = "http://api.dataatwork.org/v1", name="JobApi")
public interface JobApi {

    @RequestMapping(method = RequestMethod.GET, path="/jobs/autocomplete?contains={keyword}", produces = APPLICATION_JSON_VALUE)
    List<JobDTO> getJobsByAssociatedWork(@PathVariable String keyword);

    @RequestMapping(method = RequestMethod.GET, path ="/jobs/{jobUUID}/related_skills", produces = APPLICATION_JSON_VALUE)
    SkillsDTO getSkillsPerJobUUID(@PathVariable String jobUUID);

    @RequestMapping(method = RequestMethod.GET, path = "/skills/{skillUUID}/related_skills", produces = APPLICATION_JSON_VALUE)
    AssociatedSkillsDTO getAssociatedSkillsBySkillUUID(@PathVariable String skillUUID);
}
