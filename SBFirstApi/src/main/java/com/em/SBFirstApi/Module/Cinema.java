package com.em.SBFirstApi.Module;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String movieName;
    @Column(nullable = false)
    private int ticketCount;
    private String classType;
    private LocalDateTime date;
}
