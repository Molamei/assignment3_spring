package football;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class League {
    private String name;
    private Team team1;
    private Team team2;
}