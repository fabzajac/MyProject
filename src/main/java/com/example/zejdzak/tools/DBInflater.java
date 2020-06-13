package com.example.zejdzak.tools;

import com.example.zejdzak.model.Artist;
import com.example.zejdzak.model.Song;
import com.example.zejdzak.repositories.ArtistRepository;
import com.example.zejdzak.repositories.SongRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(SongRepository songRepository, ArtistRepository artistRepository) {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
    }

    private SongRepository songRepository;
    private ArtistRepository artistRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Artist KeigoHoashi1 = new Artist("Keigo1", "Hoashi1", "Keigol1");
        Song AmusementPark1 = new Song( "Amusement Park1", "Soundtracks", "1432458854459", "2017", "Keigo Hoashi");
        KeigoHoashi1.getSongs().add(AmusementPark1);
        AmusementPark1.getArtists().add(KeigoHoashi1);
        artistRepository.save(KeigoHoashi1);
        songRepository.save(AmusementPark1);

        Artist KeigoHoashi2 = new Artist("Keigo2", "Hoashi2", "Keigol2");
        Song AmusementPark2 = new Song( "Amusement Park2", "Soundtracks", "1432458854459", "2017", "Keigo Hoashi");
        KeigoHoashi2.getSongs().add(AmusementPark2);
        AmusementPark2.getArtists().add(KeigoHoashi2);
        artistRepository.save(KeigoHoashi2);
        songRepository.save(AmusementPark2);

        Artist KeigoHoashi3 = new Artist("Keigo3", "Hoashi3", "Keigol3");
        Song AmusementPark3 = new Song( "Amusement Park3", "Soundtracks", "1432458854459", "2017", "Keigo Hoashi");
        KeigoHoashi3.getSongs().add(AmusementPark3);
        AmusementPark3.getArtists().add(KeigoHoashi3);
        artistRepository.save(KeigoHoashi3);
        songRepository.save(AmusementPark3);
    }

}
