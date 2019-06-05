import java.util.*;

class Chuck {

    public static void main(String args[]) {

        //get data
        Scanner in = new Scanner(System.in);
        String incomingMessage = in.nextLine();
        System.err.println("Incoming message: " + incomingMessage);

        char[] message = incomingMessage.toCharArray();

        //convert data into binary format
        StringBuilder binary = new StringBuilder();
        for(char c : message) {
            String binaryMessage = Integer.toBinaryString(c);
            //for non-letters
            while(binaryMessage.length() <= 6) {
                binaryMessage = '0' + binaryMessage;
            }
            binary.append(binaryMessage);
        }
        //convert to unary and print to console
        System.err.println("Binary: " + binary.toString());

        int i = 0;
        char currentChar;
        StringBuilder chuckBuilder = new StringBuilder();

        while(i < binary.length()) {
            //for "0"
            if(binary.charAt(i) == '0') {
                chuckBuilder.append("00 ");
                currentChar = '0';
            }
            else {
                //for "1"
                chuckBuilder.append("0 ");
                currentChar = '1';
            }
            //put currentChar length instead of binary
            while(binary.charAt(i) == currentChar) {
                System.err.println("Symbol#" + i);
                //printing 0 while symbols are the same as 1 or 0 in binary char array
                chuckBuilder.append("0");
                i++;

                if(i >= binary.length()) {
                    System.err.println("The last symbol");
                    break;
                }
            }
            if(i < binary.length()) {
                chuckBuilder.append(" ");
                System.err.println("append ");

            }
            System.err.println("Chuck's message: " + chuckBuilder.toString());

        }
        in.close();
        //result
        System.out.println(chuckBuilder.toString());
    }
}