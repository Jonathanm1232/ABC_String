package org.example;

import javax.swing.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a string to match: ");
        System.out.println(With.Contains(input));
        System.out.println(With.Something(input));

    }
}