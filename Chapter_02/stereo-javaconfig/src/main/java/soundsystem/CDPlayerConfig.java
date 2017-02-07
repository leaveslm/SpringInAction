package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc) {
//        CDPlayer cdPlayer = new CDPlayer();
//        cdPlayer.setCd(compactDisc);
//        return cdPlayer;
//    }

}
