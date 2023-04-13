package com.example.dijkstra.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Arista {
        private int weight;
        private String origin;
        private String destiny;
    }
