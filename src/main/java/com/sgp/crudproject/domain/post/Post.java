package com.sgp.crudproject.domain.post;

import com.sgp.crudproject.domain.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Getter @Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Post extends BaseEntity {
    private String title;
    private String content;
}
