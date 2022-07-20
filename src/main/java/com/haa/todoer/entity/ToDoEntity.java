package com.haa.todoer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TODO_NOTES")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER")
    private String user;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TARGET_DATE")
    private Date targetDate;

    @Column(name = "IS_DONE")
    private boolean isDone;

}
