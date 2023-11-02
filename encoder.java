import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text="", MC = "ON", IC = "OFF", INL = "OFF";
        boolean looping = true;
        int geser=0;
        while (looping) {
            System.out.println("\nWelcome to my encoder!");
            System.out.println("Program ini meng-encode text alfabet.");
            System.out.printf("1. Maintain case \t\t\t %s\n", MC);
            System.out.printf("2. Ignore case \t\t\t\t %s\n", IC);
            System.out.printf("3. Include non-letter \t\t\t %s\n", INL);
            System.out.printf("4. Input text \t\t\t\n");
            System.out.printf("9. Exit\n");
            System.out.printf("Pilihan anda? ");
            int input = in.nextInt();
            if (input == 1) {
                MC = "ON";
                IC = "OFF";
            }
            if(input==2){
                MC = "OFF";
                IC = "ON";
            }
            if(input ==3){
                if (INL.equals("ON")) {INL = "OFF";}
                    else {INL = "ON";}
            }
            if (input == 4) {
                in.nextLine();
                System.out.print("Masukkan text untuk diencode: ");
                text = in.nextLine();
                System.out.print("Jumlah geser (integer): ");
                geser = in.nextInt();
                System.out.print("Encoded text: ");
                
                if (MC.equals("ON") && INL.equals("OFF")) {
                    for (int i = 0; i < text.length(); i++) {
                        char ch = text.charAt(i);
                        if (Character.isLetter(ch)) {
                            int dasar = Character.isUpperCase(ch) ? 65 : 97;
                            int ASCII = (int) ch - dasar;
                            ASCII = (ASCII + geser) % 26;
                            char output = (char) (ASCII + dasar);
                            System.out.print(output);
                        } else {
                            System.out.print(ch);
                        }
                    }
                }
                if(MC.equals("ON") && INL.equals("ON")) {
                    for (int i = 0; i < text.length(); i++) {
                        char ch = text.charAt(i);
                        if (Character.isLetter(ch)) {
                            int dasar = Character.isUpperCase(ch) ? 65 : 97;
                            int ASCII = (int) ch - dasar;
                            ASCII = (ASCII + geser) % 26;
                            char output = (char) (ASCII + dasar);
                            System.out.print(output);
                        } else {
                            int ASCII = (int) ch ;
                            ASCII +=geser;
                            char output = (char) ASCII;
                            System.out.print(output);
                        }
                    }
                }
                if (IC.equals("ON") && INL.equals("OFF")) {
                    String textLC = text.toLowerCase();
                    for (int i = 0; i < textLC.length(); i++) {
                        char ch = textLC.charAt(i);
                        if (Character.isLetter(ch)) {
                            int dasar = Character.isUpperCase(ch) ? 97 : 97;
                            int ASCII = (int) ch - dasar;
                            ASCII = (ASCII + geser) % 26;
                            char output = (char) (ASCII + dasar);
                            System.out.print(output);
                        } else {
                            System.out.print(ch);
                        }
                    }
                }
                if (IC.equals("ON") && INL.equals("ON")) {
                    String textLC = text.toLowerCase();
                    for (int i = 0; i < textLC.length(); i++) {
                        char ch = textLC.charAt(i);
                        if (Character.isLetter(ch)) {
                            int dasar = Character.isUpperCase(ch) ? 97 : 97;
                            int ASCII = (int) ch - dasar;
                            ASCII = (ASCII + geser) % 26;
                            char output = (char) (ASCII + dasar);
                            System.out.print(output);
                        } else {
                            int ASCII = (int) ch ;
                            ASCII +=geser;
                            char output = (char) ASCII;
                            System.out.print(output);
                        }
                    }
                }
            }
            if (input==9){
                looping = false;
            }
            }
        }
    }

