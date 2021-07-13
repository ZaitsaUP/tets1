package firstspring;

import org.springframework.stereotype.Component;

@Component
public class AlternativeMusic implements Music {

    @Override
    public String getSong() {
        return "Braking Benjamine";
    }
}
