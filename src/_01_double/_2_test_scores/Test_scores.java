package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_scores {
	public static void main(String [] args) {
		
		String answer = JOptionPane.showInputDialog("What is your test score?");
		double score = Integer.parseInt(answer);
		
		if(score == 100) {
			JOptionPane.showMessageDialog(null, "Can you do my homework for me?");
		}
		else if(score < 100 && score >= 90) {
			JOptionPane.showMessageDialog(null, "Nice work!");
		}
		else if(score < 90 && score >= 80) {
			JOptionPane.showMessageDialog(null, "Pretty good!");
		}
		else if(score < 80 && score >= 70) {
			JOptionPane.showMessageDialog(null, "I think you can do better.");
		}
		else if(score < 70 && score >= 50) {
			JOptionPane.showMessageDialog(null, "There's always next time.");
		}
		else if(score < 50 && score > 0) {
			JOptionPane.showMessageDialog(null, "Did you even try!");
		}
		else if(score <= 0) {
			JOptionPane.showMessageDialog(null, ":(");
		}
		
	}

	
}
