package com.miguel.chinook;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "artist")
public class Artist {
    @Id
    @Column(name = "ArtistId", nullable = false)
    private Integer id;

    @Size(max = 120)
    @Column(name = "Name", length = 120)
    private String name;

}