public class MessageEncoderTest {

	public static void main(String[] args) {
		String testString;
		
		SubstitutionCipher aSub = new SubstitutionCipher(3);
		ShuffleCipher aShuffle = new ShuffleCipher(1); 
		
		testString = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		System.out.println("The unencoded message is: \t\t" + testString);
		System.out.println("The Substitution encoded message is: \t" + aSub.encode(testString));
		System.out.println("The Shuffle encoded message is: \t" + aShuffle.encode(testString));
	}

}