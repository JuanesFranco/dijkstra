package com.example.dijkstra.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class City {
    private String code;
    private String name;
    private float latitude;
    private float longitude;

}
