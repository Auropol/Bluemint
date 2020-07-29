package me.auropol.bluemint.console;

import me.auropol.bluemint.util.RandStream;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class ConsoleInitializer {
    public static void init() {
        String cyan = "\033[0;96m";
        String yellow = "\033[0;93m";
        JTextArea area = new JTextArea();
        area.setOpaque(true);
        area.setBackground(Color.BLACK);
        area.setFont(Font.getFont(Font.DIALOG));
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        int iInput = input.nextInt();
        if(in.contains("§execute color")) {
            in = in.replace("§", "§" + cyan) + in.replace("execute", "execute" + yellow);
            System.out.println(RandStream.generateRandomColor().getRGB());
        }

    }
}
