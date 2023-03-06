package com.example.gototodos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "todos")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "description")
    private String description;
}
