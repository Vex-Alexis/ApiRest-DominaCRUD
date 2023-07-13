package com.application.rest.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.apachecommons.CommonsLog;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fabricante")
public class Maker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_fabricante")
    private String name;
}
