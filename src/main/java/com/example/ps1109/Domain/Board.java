package com.example.ps1109.Domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Board {
    private String Artist;
    private String Title;
    private String ReleaseDate;
    private String Production;
    private Integer Cost;
}
