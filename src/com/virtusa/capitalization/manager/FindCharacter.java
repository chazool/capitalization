package com.virtusa.capitalization.manager;

import javafx.beans.binding.StringBinding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Character;

public class FindCharacter implements EnglishCharacter {

    public FindCharacter(String filePath) throws FileNotFoundException {

        this.fileReader = new FileReader(filePath);

    }

    private FileReader fileReader;

    @Override
    public char[] getCapitalLeters() throws IOException {

        // Create char array for the store in filterd Capital Later
        char[] capitalLaterArray = new char[0];

        int readingValue;
        // this wile loop create for read file
        while ((readingValue = fileReader.read()) != -1) {

            // this loop - for using  iterate the capital later char Arrray
            for (char later : englishLater) {
                // check  Capital lert and Read file Leters
                char selectedCharecter = (char) readingValue;
                if (later == selectedCharecter) {

                    int charArraySize = capitalLaterArray.length;
                    char[] temporaryCharArray = new char[charArraySize + 1];

                    if (charArraySize == 0) {
                        temporaryCharArray[0] = selectedCharecter;
                    } else {

                        for (int index = 0; index < charArraySize; index++) {

                            temporaryCharArray[index] = capitalLaterArray[index];
                        }
                        temporaryCharArray[charArraySize] = selectedCharecter;
                    }

                    capitalLaterArray = temporaryCharArray;

                    break;
                }
            }


        }

        fileReader.close();


        return capitalLaterArray;
    }


    public String converToCapital() throws IOException {

        String chapelizodText = "";
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String textLine;
        while ((textLine = bufferedReader.readLine()) != null) {

            // System.out.println(textLine);
            String line = "";
            for (String s : textLine.split(" ")) {
                String word = "";
                for (char c : s.toCharArray()) {
                    //  System.out.println(c);

                    for (char later : englishLater) {
                        if (c == later || c == Character.toLowerCase(later)) {
                            word = word + later;
                            break;
                        }
                    }
                }

                line = line + " " + word;

            }
            //System.out.println(line);
            chapelizodText = chapelizodText + "\n" + line;
        }
        return chapelizodText;
    }


}
