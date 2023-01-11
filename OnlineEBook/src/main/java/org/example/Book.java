package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    String BookName;
    String AuthorName;
    String BookType;
    Integer BookPublishedYear;
    String BookLanguage;
}
