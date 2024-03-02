package com.medico.community.medicocommunity.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "student")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

//    @Column(name = "created_at", nullable = false, updatable = false)
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at", nullable = false)
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private LocalDateTime updatedAt;


}
