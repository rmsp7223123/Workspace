package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MbjScanner {
	private InputStream in;
	private BufferedReader br;

	public MbjScanner(InputStream in) {
//		this.in = in;
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String nextLine() {
		String inputdata;
		try {
			inputdata = br.readLine();
			return inputdata;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public int nextInt() {
		int inputdata1;
		int inputdata2 = -1;
		try {
			inputdata1 = Integer.parseInt(br.readLine());
			return inputdata1;
		} catch (Exception e) {
			return inputdata2;
		}
	}

}
