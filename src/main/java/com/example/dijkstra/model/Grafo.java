package com.example.dijkstra.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data

public class Grafo {
    private List<Vertice> vertices;
    private List<Arista> aristas;
    private boolean direccion;
}


