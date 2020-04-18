public class DecryptionClass {
    public String decryptionMethod(String codedSentence, int shift) {
        String decodedSentence = "";

        char[] arrayOfCodedChars = new char[codedSentence.length()];
        char[] arrayOfDecodedChars = new char[codedSentence.length()];

        for (int i = 0; i < codedSentence.length(); i++) {
            arrayOfCodedChars[i] = codedSentence.charAt(i);
            // from 65 to 90 uppercase in ASCII
            // from 97 to 122 lowercase in ASCII
            if ((arrayOfCodedChars[i] >= 65 && arrayOfCodedChars[i] <= 90 - shift)
                    || (arrayOfCodedChars[i] >= 97 && arrayOfCodedChars[i] <= 122 - shift)) {
                int codedInt = arrayOfCodedChars[i] + shift;
                arrayOfDecodedChars[i] = (char) codedInt;

            } else if ((arrayOfCodedChars[i] >= 65 && arrayOfCodedChars[i] <= 90)
                    || (arrayOfCodedChars[i] >= 97 && arrayOfCodedChars[i] <= 122)) {

//              add 26 (number of letters in ASCII) so that the next letter is still a letter
                int codedInt = arrayOfCodedChars[i] - 26 + shift;
                arrayOfDecodedChars[i] = (char) codedInt;
            }
        }

        for (int i = 0; i < codedSentence.length(); i++) {
            decodedSentence = new StringBuilder(decodedSentence).append(Character.toString(arrayOfDecodedChars[i])).toString();
        }

        return decodedSentence;
    }
}