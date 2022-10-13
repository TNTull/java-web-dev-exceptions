package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        System.out.println(Divide(1, 1));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        for (HashMap.Entry<String, String> entry  : studentFiles.entrySet()) {
            int grade = CheckFileExtension(entry.getValue());
            System.out.println(entry.getKey() + " " + entry.getValue() + " " + grade);
        }

    }

    public static int Divide(int x, int y)
    {
        // Write code here!

        if (y == 0) {
            try {
                throw new ArithmeticException("can't divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
           return x/y;

    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!

        if (fileName == null || fileName == "") {
            try {
                throw new FileNameException("no file name");
            } catch (FileNameException e) {
                e.printStackTrace();
            }
            return -1;
        }

        String extension = "";

        int index = fileName.lastIndexOf('.');
        if (index > 0) {
            extension = fileName.substring(index + 1);
        }
        if(extension.equals("java")) {
            return 1;
        } else {
            return 0;
        }
    }

}
