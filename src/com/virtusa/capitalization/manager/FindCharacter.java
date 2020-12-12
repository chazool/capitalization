package com.virtusa.capitalization.manager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindCharacter implements Character {

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
            for (char later : capitalLater) {
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
                        temporaryCharArray[charArraySize ] = selectedCharecter;
                    }

                    capitalLaterArray = temporaryCharArray;

                    break;
                }
            }


        }

        fileReader.close();


        return capitalLaterArray;
    }
}
