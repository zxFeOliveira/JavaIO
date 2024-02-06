package br.javaio;

import java.io.*;

public class UsingIO {

    private static final String MY_FILE ="C:"
            + File.separator + "Development"
            + File.separator + "Estudo"
            + File.separator + "UTFPR"
            + File.separator + "Java II"
            + File.separator + "io"
            + File.separator + "file-using-io.txt";
    public UsingIO() {
        try {
            whiteFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        readFile();
    }

    private void whiteFile() throws IOException {
        final File file = new File(MY_FILE);

        boolean fileIsCreated = false;

        if (!file.exists()){
            fileIsCreated = file.createNewFile();
        }

        if (fileIsCreated || file.exists()){
            final OutputStream output = new FileOutputStream(file);

            final String content = "Ola Mundo IO";

            output.write(content.getBytes("UTF-8"));
            output.close();
        }
    }
    private void readFile()  {

//        InputStream input = null;

//        try {
//            input = new FileInputStream(MY_FILE);
//
//            int content;
//
//            while ((content = input.read()) != -1){
//                System.out.print((char) content);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        } finally {
//            if (input != null) {
//                try {
//                    input.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

//        try (final InputStream input = new FileInputStream(MY_FILE)){
//            int content;
//            while ((content = input.read()) != -1){
//                System.out.print((char) content);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        try (final FileReader input = new FileReader(MY_FILE)){
            int content = input.read();
            while (content != -1){
                System.out.print((char) content);
                content = input.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new UsingIO();
    }
}
