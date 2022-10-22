package ru.netology.poster;
public class PosterManager {

    private String[] films = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];

        }
        temp[temp.length - 1] = film;
        films = temp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int finalLimit;
        if (films.length < limit) {
            finalLimit = films.length;
        } else {
            finalLimit = limit;
        }

        String[] temp = new String[finalLimit];
        for (int i = 0; i < finalLimit; i++) {
            temp[i] = films[films.length - 1 - i];
        }
        return temp;
    }
}