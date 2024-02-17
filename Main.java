import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        String binaryMessage = toBinary(message);

        System.out.println("Binary representation of '" + message + "': " + binaryMessage);

        String originalMessage = fromBinary(binaryMessage);
        System.out.println("Original message: " + originalMessage);

        sc.close();
    }

    public static String toBinary(String message) {
        StringBuilder binary = new StringBuilder();

        for (char c : message.toCharArray()) {
            binary.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }

        return binary.toString();
    }

    public static String fromBinary(String binaryString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < binaryString.length(); i += 8) {
            String binaryChar = binaryString.substring(i, Math.min(i + 8, binaryString.length()));
            result.append((char) Integer.parseInt(binaryChar, 2));
        }

        return result.toString();
    }
}
