package com.qualityhouse.course.ait.d_keyword_driven_testing.testdata;

import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.models.Book;
import lombok.Getter;

@Getter
public class BooksData {

    private Book autumnColors;
    private Book yellowFlowerSongs;
    private Book agileTechnologies;

    private Book miraclesOfNature;

    public BooksData() {
        initialize();
    }

    private void initialize() {
        initAutumnColors();
        initYellowFlowerSongs();
        initAgileTechnologies();
        initMiraclesOfNature();
    }

    private void initAutumnColors() {
        autumnColors = Book.builder()
                           .title("Autumn Colors")
                           .author("Diana Jones")
                           .category("Art")
                           .publisher("Nature Books Ltd.")
                           .isbn("55134124")
                           .price("12.99")
                           .number("6")
                           .build();
    }

    private void initYellowFlowerSongs() {
        yellowFlowerSongs = Book.builder()
                                .title("Yellow Flower Songs")
                                .author("Lilly Penny")
                                .category("Children’s books")
                                .publisher("Little World")
                                .isbn("622513423")
                                .price("4.99")
                                .number("8")
                                .build();
    }

    private void initAgileTechnologies() {
        agileTechnologies = Book.builder()
                                .title("Agile Technologies")
                                .author("William Nelson")
                                .category("Computers")
                                .publisher("Bit")
                                .isbn("5628423724")
                                .price("23.49")
                                .number("12")
                                .build();
    }

    private void initMiraclesOfNature() {
        miraclesOfNature = Book.builder()
                               .title("The miracles of the Nature")
                               .author("John Spenser")
                               .category("Science & nature")
                               .publisher("Nature Books Ltd.")
                               .isbn("12345678")
                               .price("11.99")
                               .number("14")
                               .build();
    }

}
