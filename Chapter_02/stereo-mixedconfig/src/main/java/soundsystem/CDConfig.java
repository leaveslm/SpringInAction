package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {

    @Bean(value = "compactDisc")
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

}