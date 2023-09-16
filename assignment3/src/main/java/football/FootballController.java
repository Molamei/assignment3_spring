package football;


import football.services.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballController {

    @Autowired
    private FootballService footballService;

    @GetMapping("/playMatch")
    public String playMatch() {
        footballService.playMatch();
        return "Match played! Check the logs for match details.";
    }
}
