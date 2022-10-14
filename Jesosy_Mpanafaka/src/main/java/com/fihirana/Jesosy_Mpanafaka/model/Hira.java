package com.fihirana.Jesosy_Mpanafaka.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Hira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private int range;

    private String type;

    private String category;

    @Column(nullable = false)
    private String song;

    private String chorus;
}
