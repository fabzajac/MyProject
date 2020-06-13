package com.example.zejdzak.repositories;
import com.example.zejdzak.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
