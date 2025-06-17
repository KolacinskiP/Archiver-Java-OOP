package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Performs all console actions
 */
public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    /**
     *  Prints a string on the console
     * @param message string to be printed on the console
     */
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    /**
     *  Reads a <b>String</b> from the console
     * @return String read from console
     * @throws IOException
     */
    public static String readString() throws IOException {
        String text = bis.readLine();
        return text;
    }

    /**
     *  Reads an <b>integer</b> from the console
     * @return Integer read from console
     * @throws IOException
     */
    public static int readInt() throws IOException {
        String text = readString();
        return Integer.parseInt(text.trim());
    }
}