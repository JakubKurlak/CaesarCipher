import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        EncryptionClass encryptionClass = new EncryptionClass();
        DecryptionClass decryptionClass = new DecryptionClass();

//        Scanner scanner = new Scanner(System.in);
//        String sentenceToBeEncodedFromConsole = scanner.next();
//        int shiftFromConsole = Integer.parseInt(scanner.next());

//        Please write sentenceToBeEncoded in English
        String sentenceToBeEncoded = "AbcDE fgHIJ klMnO pqRst UWyxz";
//        Please write shift less than 26
        int shift = 3;

        System.out.println(sentenceToBeEncoded);

        String encryptedSentence = encryptionClass.encryptionMethod(sentenceToBeEncoded, shift);
        System.out.println(encryptedSentence);

        String decryptedSentence = decryptionClass.decryptionMethod(encryptedSentence,shift);
//        String decryptedSentence = "Example decrypted sentences";
        System.out.println(decryptedSentence);
    }
}
