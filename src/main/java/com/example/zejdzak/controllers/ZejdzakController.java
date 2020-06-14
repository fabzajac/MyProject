package com.example.zejdzak.controllers;

import com.example.zejdzak.commands.ArtistCommand;
import com.example.zejdzak.converters.ArtistCommandToArtist;
import com.example.zejdzak.model.Artist;
import com.example.zejdzak.repositories.ArtistRepository;
import com.example.zejdzak.repositories.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class ZejdzakController {

    @RequestMapping(value = {"/"})
    public String getArtists() {
        return "index";
    }

}