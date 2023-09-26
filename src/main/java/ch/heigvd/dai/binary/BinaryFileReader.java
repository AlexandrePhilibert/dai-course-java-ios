package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(filename)) {
            int c;
            while ((c = inputStream.read()) != -1) {}
        }
    }
}
