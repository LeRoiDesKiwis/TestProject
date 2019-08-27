package fr.emalios.rpggame.askers;

import java.util.Scanner;

public abstract class Asker<T> {

    protected Scanner scanner;

    public abstract T ask(String ask);

    public Asker(Scanner scanner){

        this.scanner = scanner;

    }

}
