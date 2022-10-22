package ru.netology.poster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTestLimitTen {

    @Test
    public void shouldArrayLessThanTen() {

        PosterManager poster = new PosterManager();
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");
        poster.addFilm("film4");
        poster.addFilm("film5");
        poster.addFilm("film6");
        poster.addFilm("film7");
        poster.addFilm("film8");
        poster.addFilm("film9");

        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldArrayMoreThanTen() {

        PosterManager poster = new PosterManager();
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");
        poster.addFilm("film4");
        poster.addFilm("film5");
        poster.addFilm("film6");
        poster.addFilm("film7");
        poster.addFilm("film8");
        poster.addFilm("film9");
        poster.addFilm("film10");
        poster.addFilm("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldArrayIsEqualToTen() {

        PosterManager poster = new PosterManager();
        poster.addFilm("film1");
        poster.addFilm("film2");
        poster.addFilm("film3");
        poster.addFilm("film4");
        poster.addFilm("film5");
        poster.addFilm("film6");
        poster.addFilm("film7");
        poster.addFilm("film8");
        poster.addFilm("film9");
        poster.addFilm("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}