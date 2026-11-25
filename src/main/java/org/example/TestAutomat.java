package org.example;

public class TestWordAutomaton {

    public String process(String input) {

        String state = "S";

        for (char c : input.toCharArray()) {

            switch (state) {

                case "S":
                    if (c == 'T') {
                        state = "1";
                    }
                    break;

                case "1":
                    if (c == 'E') {
                        state = "2";
                    } else if (c == 'T') {
                        state = "1";
                    } else {
                        state = "S";
                    }
                    break;

                case "2":
                    if (c == 'S') {
                        state = "3";
                    } else if (c == 'T') {
                        state = "1";
                    } else {
                        state = "S";
                    }
                    break;

                case "3":
                    if (c == 'T') {
                        state = "F";
                    } else {
                        state = "S";
                    }
                    break;

                case "F":
                    break;
            }
        }

        return state;
    }
}

