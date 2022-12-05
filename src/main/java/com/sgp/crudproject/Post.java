package com.sgp.crudproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Post {
    private int id;
    private String title;
    private String content;
}
