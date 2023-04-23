package com.miguel.chinook;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PlaylisttrackId implements Serializable {
    private static final long serialVersionUID = 3172482913123396112L;
    @NotNull
    @Column(name = "PlaylistId", nullable = false)
    private Integer playlistId;

    @NotNull
    @Column(name = "TrackId", nullable = false)
    private Integer trackId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PlaylisttrackId entity = (PlaylisttrackId) o;
        return Objects.equals(this.playlistId, entity.playlistId) &&
                Objects.equals(this.trackId, entity.trackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, trackId);
    }

}