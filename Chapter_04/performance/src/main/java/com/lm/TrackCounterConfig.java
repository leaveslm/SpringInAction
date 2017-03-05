package com.lm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Version:
 * Created by Leaves on 2017/3/5.
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("title");
        cd.setArtist("artist");
        List<String> tracks = new ArrayList<String>();
        tracks.add("cd1");
        tracks.add("cd2");
        tracks.add("cd3");
        tracks.add("cd4");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
