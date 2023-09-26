package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int ONE_BYTE = 1;
        final int ONE_KILOBYTE = 1 * 1024;
        final int ONE_MEGABYTE = 1 * 1024 * 1024;
        final int FIVE_MEGABYTES = 5 * 1024 * 1024;

        {
            Measure.write("binary_1B.bin", ONE_BYTE, false, Measure.FileType.BINARY);
            Measure.read("binary_1B.bin", false, Measure.FileType.BINARY);

            Measure.write("text_1B.txt", ONE_BYTE, false, Measure.FileType.TEXT);
            Measure.read("text_1B.txt", false, Measure.FileType.TEXT);

            Measure.write("text_1B.txt", ONE_BYTE, true, Measure.FileType.BINARY);
            Measure.read("text_1B.txt", true, Measure.FileType.BINARY);
        }

        {
            Measure.write("binary_1KB.bin", ONE_KILOBYTE, false, Measure.FileType.BINARY);
            Measure.read("binary_1KB.bin", false, Measure.FileType.BINARY);

            Measure.write("text_1KB.txt", ONE_KILOBYTE, false, Measure.FileType.TEXT);
            Measure.read("text_1KB.txt", false, Measure.FileType.TEXT);

            Measure.write("text_1KB.txt", ONE_KILOBYTE, true, Measure.FileType.BINARY);
            Measure.read("text_1KB.txt", true, Measure.FileType.BINARY);
        }

        {
            Measure.write("binary_1MB.bin", ONE_MEGABYTE, false, Measure.FileType.BINARY);
            Measure.read("binary_1MB.bin", false, Measure.FileType.BINARY);

            Measure.write("text_1MB.txt", ONE_MEGABYTE, false, Measure.FileType.TEXT);
            Measure.read("text_1MB.txt", false, Measure.FileType.TEXT);

            Measure.write("text_1MB.txt", ONE_MEGABYTE, true, Measure.FileType.BINARY);
            Measure.read("text_1MB.txt", true, Measure.FileType.BINARY);
        }

        {
            Measure.write("binary_5MB.bin", FIVE_MEGABYTES, false, Measure.FileType.BINARY);
            Measure.read("binary_5MB.bin", false, Measure.FileType.BINARY);

            Measure.write("text_5MB.txt", FIVE_MEGABYTES, false, Measure.FileType.TEXT);
            Measure.read("text_5MB.txt", false, Measure.FileType.TEXT);

            Measure.write("text_5MB.txt", FIVE_MEGABYTES, true, Measure.FileType.BINARY);
            Measure.read("text_5MB.txt", true, Measure.FileType.BINARY);
        }
    }
}
