package com.smartwaste.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "area_name")
    private String areaName;
    private double latitude;
    private double longitude;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}