/*
* File: FileWriter.java
* Author: Kövesdi Ákos
* Copyright: 2025, Kövesdi Ákos
* Group: Szoft I-N
* Date: 2025-05-26
* Github: https://github.com/Akreez/
* Licenc: MIT
*/
package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void WriteFile(String line){
        try {
            tryWriteFile(line);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void tryWriteFile(String line) throws IOException{
        FileWriter fw = new FileWriter("adat.txt", true);
        fw.write(line);
        fw.write("\n");
        fw.close();
    }
}
