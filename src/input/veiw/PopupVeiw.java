package input.veiw;

import javax.swing.JOptionPane;
public class PopupVeiw
{
    public void showResponse(String wordsFromSomewhere)
    {
    	JOptionPane.showMessageDialog(null,wordsFromSomewhere);    	
    }
    
    public String grabAnswer(String stuff)
    {
    	String answer="";
    	answer=JOptionPane.showInputDialog(null,stuff);
    	
    	return answer;
    }
}
