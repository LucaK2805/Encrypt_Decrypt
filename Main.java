public class Main {
    public static void main(String[] args) {
        String s = "Hallo Herr Müller!";
        String x = "aKurHül!";

        String verschluesselt = encrypt(s, x);
        System.out.println("Verschlüsselter String: " + verschluesselt);

        String entschluesselt = decrypt(verschluesselt, x);
        System.out.println("Entschlüsselter String: " + entschluesselt);
    }

    public static String encrypt(String s, String x) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int index = x.indexOf(c);
            if (index != -1) {
                if (index == x.length() - 1) {
                    result.append(x.charAt(0));
                } else {
                    result.append(x.charAt(index + 1));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String decrypt(String s, String x) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int index = x.indexOf(c);
            if (index != -1) {
                if (index == 0) {
                    result.append(x.charAt(x.length() - 1));
                } else {
                    result.append(x.charAt(index - 1));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
