//import java.util.Arrays;

public class FilmManager {
    private String[] films = new String[0]; // создаём нулевой массив
    private int limit;

//---конструкторы---
    public FilmManager() { // конструктор без ввода лимита, по умолчанию 10
        limit = 10;
    }
    public FilmManager(int limit) { // конструктор с вводом параметра лимита
        this.limit = limit;
    }

// 1. Добавление нового фильма.
    public void add(String film){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

// 2. Вывод всех фильмов в порядке добавления (findAll)
    public String[] findAll(){ // конструктор
        return films;
    }

// 3. Вывод максимум лимит последних добавленных фильмов в обратном от добавления порядке (findLast)
    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

}