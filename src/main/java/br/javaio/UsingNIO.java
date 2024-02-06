package br.javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class UsingNIO {

    private static final String MY_FILE ="C:"
            + File.separator + "Development"
            + File.separator + "Estudo"
            + File.separator + "UTFPR"
            + File.separator + "Java II"
            + File.separator + "io"
            + File.separator + "file-using-io.txt";

    public UsingNIO() {
        try {
            writeFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        readFile();
    }

    private void writeFile() throws IOException {

        final RandomAccessFile file = new RandomAccessFile(MY_FILE,"rw");
        final FileChannel fileChannel = file.getChannel();

    }
    private void readFile() {
    }


    public static void main(String[] args) {
        new UsingNIO();
    }
}
