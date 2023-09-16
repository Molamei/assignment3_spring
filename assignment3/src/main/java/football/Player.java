package football;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Player {
    private String name;
    private int shirtNumber;
}
