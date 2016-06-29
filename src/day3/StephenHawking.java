package day3;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		// 2. ask the user for a sentence
		String Succ= JOptionPane.showInputDialog("rite a sentence nardo");
		// 3. call the speak method below and send it the sentence
		speak(Succ);
}

	void echo(String Succ){
		// 4. repeat steps 2 and 3 a lot of times
	System.out.println(Succ);
    System.out.println("Succ");
}
	/* Don’t change this…. */
	static void speak(String Succ) {
		try {
			Runtime.getRuntime().exec("say -v Alex " + Succ).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
