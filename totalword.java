package practice;

/*import java.util.*;
public class totalword {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		int count =0;
		for(int i=0;i<str.length();i++) {
			count++;
		}
		System.out.println(count);
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]=='a' || ch[i]=='e'  || ch[i]=='i' || ch[i]== 'o' || ch[i]=='u' ) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}*/

/*char ch[] = str.toCharArray() ;
for(int i=0;i<ch.length;i++) {
	//System.out.print(ch[i]);
	if(ch[i]=='a' || ch[i]=='e'  || ch[i]=='i' || ch[i]== 'o' || ch[i]=='u' ) {
		count++;
	}
}
System.out.println(count);*/


import java.util.Scanner;

public class totalword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // count words in the sentence
        int wordCount = sentence.split("\\s+").length;

        // count vowels in each word and total vowels in sentence
        int totalVowels = 0;
        for (String word : sentence.split("\\s+")) {
            int vowelCount = 0;
            for (char c : word.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                    totalVowels++;
                }
            }
            System.out.printf("Word \"%s\" contains %d vowels.\n", word, vowelCount);
        }
        System.out.printf("Total number of vowels in the sentence: %d\n", totalVowels);
        System.out.printf("Number of words in the sentence: %d\n", wordCount);
    }
}
