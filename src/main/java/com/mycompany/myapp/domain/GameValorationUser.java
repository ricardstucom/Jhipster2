package com.mycompany.myapp.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A GameValorationUser.
 */
@Entity
@Table(name = "game_valoration_user")
public class GameValorationUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "timestamp")
    private ZonedDateTime timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public GameValorationUser rating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public GameValorationUser timestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameValorationUser gameValorationUser = (GameValorationUser) o;
        if (gameValorationUser.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, gameValorationUser.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "GameValorationUser{" +
            "id=" + id +
            ", rating='" + rating + "'" +
            ", timestamp='" + timestamp + "'" +
            '}';
    }
}
