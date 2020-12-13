package com.virtusa.capitalization.view;

import com.virtusa.capitalization.manager.FindCharacter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Display {


    public static void main(String[] args) {

        try {
            FindCharacter findCharacter = new FindCharacter("src\\com\\virtusa\\capitalization\\manager\\TextFile.txt");

           String text= findCharacter.converToCapital();

           System.out.println(text);


        } catch (FileNotFoundException e) {
            System.out.println("File is cand find  ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Cant read this File  ");
            e.printStackTrace();
        }

    }

}
