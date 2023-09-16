package football;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Team {
    private String name;
    private Player striker;
    private Player defender;
    private Player goalkeeper;
}
