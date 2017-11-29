import javax.swing.JOptionPane;


public class Remarkable {
 public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Hello! What is your name? I'll tell you something remarkable about you!");
	    if (name.equalsIgnoreCase("Max")) {
		JOptionPane.showMessageDialog(null, "You are the programmer of this line of code!");
	    }
	      else if(name.equalsIgnoreCase("Victor")) {
		   JOptionPane.showMessageDialog(null, "Nice glasses!");
		}
		    else if(name.equalsIgnoreCase("Yasir")) {
		     JOptionPane.showMessageDialog(null, "Those are some nice shoes!");
		}
		      else if(name.equalsIgnoreCase("Emil")) {
		      JOptionPane.showMessageDialog(null, "Nice shirt!");
		}
		        else if(name.equalsIgnoreCase("Callum")) {
		        JOptionPane.showMessageDialog(null, "You were in my class last year!");
		}
		          else if(name.equalsIgnoreCase("Lauren")) {
		           JOptionPane.showMessageDialog(null, "Nice glasses!");
		}
		            else if(name.equalsIgnoreCase("Cruz")) {
			             JOptionPane.showMessageDialog(null, "Nice outfit!");
	    }
		                else {
			               JOptionPane.showMessageDialog(null, "Why are you even here???");
		}
	    }
	
	
        }

