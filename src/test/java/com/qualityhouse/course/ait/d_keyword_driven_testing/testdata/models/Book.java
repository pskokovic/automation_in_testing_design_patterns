package com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String category;
    private String isbn;
    private String price;
    private String number;
}
