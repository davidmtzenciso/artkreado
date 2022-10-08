package com.elatusdev.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("author")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public final class Author {

    private Long authorId;
    private String name;
    private Category category;
    private String about;

}
