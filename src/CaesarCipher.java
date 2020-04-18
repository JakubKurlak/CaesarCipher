public class CaesarCipher {
    public static void main(String[] args) {
        String wynik = upperCase("Mdnxe", 3);
        System.out.println(wynik);
    }

    static String upperCase(String str, int index) {
        char[] tablica = new char[str.length()];
        char[] tablica2 = new char[str.length()];
        String upcase = "";

        for (int i = 0; i < str.length(); i++) {
            tablica[i] = str.charAt(i);
            int k = tablica[i] - index;
            tablica2[i]= (char) k;
        }
        for (int i = 0; i < str.length(); i++) {
            String zmiennaPomocnicza = Character.toString(tablica2[i]);
            upcase += zmiennaPomocnicza;
        }
        return upcase;
    }
}
