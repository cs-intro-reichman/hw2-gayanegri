//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0].toUpperCase();
            int number = Integer.parseInt(args[1]);
            for (int c = 0; c < name.length(); c++) {
                char letter = name.charAt(c);
                String anLetters = "AEFHILMNORSX";
                if (anLetters.indexOf(letter) == -1) {
                        System.out.println("Give me a  " + letter + ": " + letter + "!");
                } else {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                }
                }
                System.out.println("What does that spell?");
                for (int n = 0; n < number;n++) {
                        System.out.println(name + "!!!");
                }
            } // Replace this comment with your code
        }

