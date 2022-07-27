package com.haa.todoer.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ToDo {
    private int id;
    private String user;
    private String description;
    private Date targetDate;
    private boolean isDone;
}
