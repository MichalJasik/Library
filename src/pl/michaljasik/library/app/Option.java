package pl.michaljasik.library.app;

import pl.michaljasik.library.exception.NoSuchOptionException;

public enum Option {
    EXIT(0, "Wyjscie z programu"),
    ADDBOOK(1, "Dodanie nowej ksiazki"),
    ADDMAGAZINE(2, "Dodanie nowego magazynu"),
    PRINTBOOK(3, "Wyswietlenie dostepnych ksiazek"),
    PRINTMAGAZINE(4, "Wyswietlenie dostepnych magazynow");

    private final int value;
    private final String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createFromInt(int option) throws NoSuchOptionException {
        try{
            return Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new NoSuchOptionException("Brak opcji o id " + option);
        }

    }

}
