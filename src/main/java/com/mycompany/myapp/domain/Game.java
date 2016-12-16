package com.mycompany.myapp.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A Game.
 */
@Entity
@Table(name = "game")
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "local_points")
    private Integer localPoints;

    @Column(name = "visitor_points")
    private Integer visitorPoints;

    @Column(name = "time_start")
    private ZonedDateTime timeStart;

    @Column(name = "time_finish")
    private ZonedDateTime timeFinish;

    @ManyToOne
    private Team gameLocalTeam;

    @ManyToOne
    private Team gameVisitorTeam;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLocalPoints() {
        return localPoints;
    }

    public Game localPoints(Integer localPoints) {
        this.localPoints = localPoints;
        return this;
    }

    public void setLocalPoints(Integer localPoints) {
        this.localPoints = localPoints;
    }

    public Integer getVisitorPoints() {
        return visitorPoints;
    }

    public Game visitorPoints(Integer visitorPoints) {
        this.visitorPoints = visitorPoints;
        return this;
    }

    public void setVisitorPoints(Integer visitorPoints) {
        this.visitorPoints = visitorPoints;
    }

    public ZonedDateTime getTimeStart() {
        return timeStart;
    }

    public Game timeStart(ZonedDateTime timeStart) {
        this.timeStart = timeStart;
        return this;
    }

    public void setTimeStart(ZonedDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public ZonedDateTime getTimeFinish() {
        return timeFinish;
    }

    public Game timeFinish(ZonedDateTime timeFinish) {
        this.timeFinish = timeFinish;
        return this;
    }

    public void setTimeFinish(ZonedDateTime timeFinish) {
        this.timeFinish = timeFinish;
    }

    public Team getGameLocalTeam() {
        return gameLocalTeam;
    }

    public Game gameLocalTeam(Team team) {
        this.gameLocalTeam = team;
        return this;
    }

    public void setGameLocalTeam(Team team) {
        this.gameLocalTeam = team;
    }

    public Team getGameVisitorTeam() {
        return gameVisitorTeam;
    }

    public Game gameVisitorTeam(Team team) {
        this.gameVisitorTeam = team;
        return this;
    }

    public void setGameVisitorTeam(Team team) {
        this.gameVisitorTeam = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Game game = (Game) o;
        if (game.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Game{" +
            "id=" + id +
            ", localPoints='" + localPoints + "'" +
            ", visitorPoints='" + visitorPoints + "'" +
            ", timeStart='" + timeStart + "'" +
            ", timeFinish='" + timeFinish + "'" +
            '}';
    }
}
