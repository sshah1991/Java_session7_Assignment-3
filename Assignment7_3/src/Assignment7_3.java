public class Assignment7_3 {
	public static void main(String[] args) {
		// Define value to a string variable var1
		String var1 = "my first line";
		String var2 = "Hello! This is my first line of the story.";
		
		//populate the strings into array
		char[] arr1 = var1.toCharArray();
		char[] arr2 = var2.toCharArray();

		if (check(arr1, arr2))
			System.out.println("String found");
		else
			System.out.println("String not found");
	}

	public static boolean check(char[] arr1, char[] arr2) {
		int str1Len = arr1.length;
		int str2Len = arr2.length;

		for (int i = 0; i < str2Len; i++) {
			
			if (arr1[0] == arr2[i]) {
				// if first character found in str2 then proceed
				int count = 0;
				// check if the remaining characters of str1 are matching with
				
				for (int j = 0; j < str1Len; j++) {
					if (arr1[j] == arr2[i]) {
						i++;
						// keep counting the no of matches in str2
						count++;
					}
				}
				// If count of matches is same as length of the str1 means the
				// entire str1 is present in str2
				if (count == str1Len) {
					return true;
				}
			}
		}
		return false;
	}
}