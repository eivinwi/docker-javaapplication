package main;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Hei!
 * Meningen er at du skal løse oppgavene uten å se i denne filen.
 * Ikke noe juks!
 */
@Controller
public class TeamController implements InitializingBean {

    //private Logger logger = LoggerFactory.getLogger(main.Main.class);

    @Value("${team.name}")
    private String teamName;
    //@Value("${server.url}")
    private String url;

    private String name;

    public void afterPropertiesSet() {
//        logger.debug("AfterPropertiesSet is reached");
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(HttpServletRequest request) {
/*        boolean test = taskChecker.inspectDockerImage(
            "testscripts",
            Arrays.asList("Config", "Entrypoint"),
            Arrays.asList("uname", "-a")
        );*/
        return "Application is working, your team-name is currently: " + teamName;
    }

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    public void apply(HttpServletRequest request) {
        name = (request.getParameter("name") != null) ? request.getParameter("name") : "";


    }


    @RequestMapping(value = "/teamName", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getTeamName() {
        return teamName;
    }

}

