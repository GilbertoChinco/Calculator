
package calculator;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends JFrame{
    public JPanel Panel;
    
    public GUI(){
        this.setSize(391, 600);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(390, 600));
        setMaximumSize(new Dimension(390, 600));
        setTitle("Calculator");
        InitializeComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void InitializeComponents(){
        setPanel();
        setButtons();
        setTextArea();
    }
    
    private void setPanel(){
        Panel = new JPanel();
        Panel.setLayout(null);
        this.getContentPane().add(Panel);
    }
    
    private void setButtons(){
        //Button 0
        JButton ButtonPlusMinus = new JButton("+/-");
        ButtonPlusMinus.setBounds(1, 510, 100, 50);
        ButtonPlusMinus.setEnabled(true);
        Panel.add(ButtonPlusMinus);
        
        //Button dot
        JButton ButtonDot = new JButton(".");
        ButtonDot.setBounds(203, 510, 100, 50);
        ButtonDot.setEnabled(true);
        Panel.add(ButtonDot);
        
        //Button 0
        JButton Button_0 = new JButton("0");
        Button_0.setBounds(102, 510, 100, 50);
        Button_0.setEnabled(true);
        Panel.add(Button_0);
        
        //Button 1
        JButton Button_1 = new JButton("1");
        Button_1.setBounds(1, 459, 100, 50);
        Button_1.setEnabled(true);
        Panel.add(Button_1);
        
        //Button 2
        JButton Button_2 = new JButton("2");
        Button_2.setBounds(102, 459, 100, 50);
        Button_2.setEnabled(true);
        Panel.add(Button_2);
        
        //Button 3
        JButton Button_3 = new JButton("3");
        Button_3.setBounds(203, 459, 100, 50);
        Button_3.setEnabled(true);
        Panel.add(Button_3);
        
        //Button 1
        JButton Button_4 = new JButton("4");
        Button_4.setBounds(1, 408, 100, 50);
        Button_4.setEnabled(true);
        Panel.add(Button_4);
        
        //Button 2
        JButton Button_5 = new JButton("5");
        Button_5.setBounds(102, 408, 100, 50);
        Button_5.setEnabled(true);
        Panel.add(Button_5);
        
        //Button 3
        JButton Button_6 = new JButton("6");
        Button_6.setBounds(203, 408, 100, 50);
        Button_6.setEnabled(true);
        Panel.add(Button_6);
        
        //Button 7
        JButton Button_7 = new JButton("7");
        Button_7.setBounds(1, 357, 100, 50);
        Button_7.setEnabled(true);
        Panel.add(Button_7);
        
        //Button 8
        JButton Button_8 = new JButton("8");
        Button_8.setBounds(102, 357, 100, 50);
        Button_8.setEnabled(true);
        Panel.add(Button_8);
        
        //Button 9
        JButton Button_9 = new JButton("9");
        Button_9.setBounds(203, 357, 100, 50);
        Button_9.setEnabled(true);
        Panel.add(Button_9);
        
        //Button Result
        JButton ButtonResult = new JButton("=");
        ButtonResult.setBounds(304, 510, 70, 50);
        ButtonResult.setEnabled(true);
        Panel.add(ButtonResult);
        
        //Button sum
        JButton ButtonSum = new JButton("+");
        ButtonSum.setBounds(304, 459, 70, 50);
        ButtonSum.setEnabled(true);
        Panel.add(ButtonSum);
        
        //Button diff
        JButton ButtonDiff = new JButton("-");
        ButtonDiff.setBounds(304, 408, 70, 50);
        ButtonDiff.setEnabled(true);
        Panel.add(ButtonDiff);
        
        //Button Product
        JButton ButtonProduct = new JButton("*");
        ButtonProduct.setBounds(304, 357, 70, 50);
        ButtonProduct.setEnabled(true);
        Panel.add(ButtonProduct);
        
        //Button sqrt
        JButton ButtonSqrt = new JButton("Sqrt");
        ButtonSqrt.setBounds(1, 306, 70, 50);
        ButtonSqrt.setEnabled(true);
        Panel.add(ButtonSqrt);
        
        //Button exp
        JButton ButtonExp = new JButton("Exp");
        ButtonExp.setBounds(72, 306, 70, 50);
        ButtonExp.setEnabled(true);
        Panel.add(ButtonExp);
        
        //Button C
        JButton ButtonC = new JButton("C");
        ButtonC.setBounds(143, 306, 70, 50);
        ButtonC.setEnabled(true);
        Panel.add(ButtonC);
        
        //Button Delete
        JButton ButtonCE = new JButton("CE");
        ButtonCE.setBounds(214, 306, 70, 50);
        ButtonCE.setEnabled(true);
        Panel.add(ButtonCE);
        
        //Button Delete
        JButton ButtonDelete = new JButton("Delete");
        ButtonDelete.setBounds(285, 306, 89, 50);
        ButtonDelete.setEnabled(true);
        Panel.add(ButtonDelete);
    }
    
    private void setTextArea(){
        JTextArea TextResult = new JTextArea();
        TextResult.setBounds(1, 250, 390, 50);
        Panel.add(TextResult);
    }
}
