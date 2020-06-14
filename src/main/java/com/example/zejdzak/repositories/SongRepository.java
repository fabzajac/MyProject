package com.example.zejdzak.repositories;

import com.example.zejdzak.model.Artist;
import com.example.zejdzak.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> getAllByArtistsIsContaining(Artist artist);
}