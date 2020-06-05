package model;

import java.util.HashSet;
import java.util.Set;

public class Artist {
    private String firstName;
    private String lastName;
    private String nick;
    private Set<Song> songs = new HashSet<>();

    public Artist(String firstName, String lastName, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
    }

    public Artist() {
    }

    @Override
    public String toString() {
        return "Artist{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nick='" + nick + '\'' +
                ", songs=" + songs +
                '}';
    }
}
