package com.example.zejdzak.converters;

import com.example.zejdzak.commands.ArtistCommand;
import com.example.zejdzak.commands.SongCommand;
import com.example.zejdzak.model.Artist;
import com.example.zejdzak.model.Publisher;
import com.example.zejdzak.model.Song;
import com.example.zejdzak.repositories.ArtistRepository;
import com.example.zejdzak.repositories.PublisherRepository;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class ArtistCommandToArtist implements Converter<ArtistCommand, Artist> {

    @Synchronized
    @Nullable
    @Override
    public Artist convert(ArtistCommand source) {
        if (source == null) {
            return null;
        }

        final Artist artist = new Artist();
        artist.setFirstName(source.getFirstName());
        artist.setLastName(source.getLastName());
        artist.setNick(source.getNick());

        return artist;
    }
}
