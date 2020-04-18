public class EncryptionClass {
    public String encryptionMethod(String sentenceToBeEncoded, int shift) {
        String codedSentence = "";

        char[] arrayOfOutputChars = new char[sentenceToBeEncoded.length()];
        char[] arrayOfCodedChars = new char[sentenceToBeEncoded.length()];

        for (int i = 0; i < sentenceToBeEncoded.length(); i++) {
            arrayOfOutputChars[i] = sentenceToBeEncoded.charAt(i);
            // from 65 to 90 uppercase in ASCII
            // from 97 to 122 lowercase in ASCII
            if ((arrayOfOutputChars[i] >= 65 + shift && arrayOfOutputChars[i] <= 90)
                    || (arrayOfOutputChars[i] >= 97 + shift && arrayOfOutputChars[i] <= 122)) {
                int codedInt = arrayOfOutputChars[i] - shift;
                arrayOfCodedChars[i] = (char) codedInt;

            } else if ((arrayOfOutputChars[i] >= 65 && arrayOfOutputChars[i] <= 90)
                    || (arrayOfOutputChars[i] >= 97 && arrayOfOutputChars[i] <= 122)) {

//              add 26 (number of letters in ASCII) so that the next letter is still a letter
                int codedInt = arrayOfOutputChars[i] + 26 - shift;
                arrayOfCodedChars[i] = (char) codedInt;
            }
        }

        for (int i = 0; i < sentenceToBeEncoded.length(); i++) {
            codedSentence = new StringBuilder(codedSentence).append(Character.toString(arrayOfCodedChars[i])).toString();
        }

        return codedSentence;
    }
}
