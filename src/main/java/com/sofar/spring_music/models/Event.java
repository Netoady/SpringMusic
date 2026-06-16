package com.sofar.spring_music.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String location;

    // Getters e Setters
    public Long getId() { 
      return id; 
    }
    public void setId(Long id) { 
      this.id = id; 
    }

    public String getNome() { 
      return nome; 
    }
    public void setNome(String nome) { 
      this.nome = nome; 
    }

    public LocalDate getDate() { 
      return date; 
    }
    public void setDate(LocalDate date) { 
      this.date = date; 
    }

    public String getLocation() { 
      return location; 
    }
    public void setLocation(String location) { 
      this.location = location; 
    }
}