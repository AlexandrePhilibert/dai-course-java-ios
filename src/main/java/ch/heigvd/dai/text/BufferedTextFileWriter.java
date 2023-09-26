package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTextFileWriter implements Writable {
    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try (
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))
        ) {
            for (int i = 0; i < sizeInBytes; i++) {
                bufferedWriter.write('t');
            }
        }
    }
}
