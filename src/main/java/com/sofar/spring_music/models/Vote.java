package com.sofar.spring_music.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_artist", nullable = false)
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "id_event", nullable = false)
    private Event event;

    @Column(name = "vote_date", nullable = false)
    private LocalDateTime voteDate;

    // Getters e Setters
    public Long getId() { 
      return id; 
    }
    public void setId(Long id) { 
      this.id = id; 
    }

    public User getUser() { 
      return user; 
    }
    public void setUser(User user) { 
      this.user = user; 
    }

    public Artist getArtist() { 
      return artist; 
    }
    public void setArtist(Artist artist) { 
      this.artist = artist; 
    }

    public Event getEvent() { 
      return event; 
    }
    public void setEvent(Event event) { 
      this.event = event; 
    }

    public LocalDateTime getVoteDate() { 
      return voteDate; 
    }
    public void setVoteDate(LocalDateTime voteDate) { 
      this.voteDate = voteDate; 
    }
}