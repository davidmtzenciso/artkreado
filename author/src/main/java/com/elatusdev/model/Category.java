package com.elatusdev.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("category")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public final class Category {

    private Long categoryId;
    private String name;
    private String description;
    private Category parent;
}
