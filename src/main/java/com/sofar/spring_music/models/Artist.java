package com.sofar.spring_music.models;

import jakarta.persistence.*;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String song;

    // Getters e Setters
    public Long getId() { 
      return id; 
    }
    public void setId(Long id) { 
      this.id = id; 
    }

    public String getName() { 
      return name; 
    }
    public void setName(String name) { 
      this.name = name; 
    }

    public String getGenre() { 
      return genre; 
    }
    public void setGenre(String genre) { 
      this.genre = genre; 
    }

    public String getSong() { 
      return song; 
    }
    public void setSong(String song) { 
      this.song = song; 
    }
}