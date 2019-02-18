package exam.ex01;

public class StringEquals {

	public static void main(String[] args) {
			String str1 = "abcd";
			String str2 = "abcd";
			String str3 = new String("abcd");
			System.out.println(str1 == str2);
			System.out.println(str1 == str3);
			System.out.println(str1.equals(str3));
			System.out.println(str1 == "abcd");
			System.out.println(str3 == "abcd");

		}
	}

