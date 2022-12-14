package com.linkstart.api.model.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    private DiscordUser discordUser;

    @NotNull
    private String name;

    @NotNull
    private String url;

    private Date created_at;

    @Override
    public String toString() {
        return "TODO";
    }
}
