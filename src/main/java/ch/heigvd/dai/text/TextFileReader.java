package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.FileReader;
import java.io.IOException;

public class TextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        try (FileReader fileReader = new FileReader(filename)) {
            while ((fileReader.read()) != -1) {}
        }
    }
}
