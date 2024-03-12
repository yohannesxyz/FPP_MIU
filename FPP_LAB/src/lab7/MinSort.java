package lab7;

public class MinSort {

	String sort(String s) {
		if (s == null || s.length() == 0)
			return s;
		int miniPos = minPos(s);
		char miniChar = s.charAt(miniPos);
		char zero = s.charAt(0);
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(miniPos, zero);
		sb.setCharAt(0, miniChar);

		return "" + miniChar + sort(sb.toString().substring(1));

	}

	int minPos(String s) {
		int pos = 0;
		char min = s.charAt(pos);
		for (int i = 1; i < s.length(); ++i) {
			if (s.charAt(i) < min) {
				pos = i;
				min = s.charAt(pos);
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
	}

}
