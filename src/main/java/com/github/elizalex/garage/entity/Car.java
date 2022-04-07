package com.github.elizalex.garage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;

    @Column(name = "car_brand")
    private String brand;

    @Column(name = "car_color")
    private String color;

    @Column(name = "car_year")
    private int year;

    @Column(name = "car_mileage")
    private int mileage;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "usedBy" )
    private List<Detail> installed_detail;

}
