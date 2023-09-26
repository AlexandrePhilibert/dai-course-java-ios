package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        try (
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))
        ) {
            while(bufferedReader.read() != -1) {}
        }
    }
}
