
package calculator;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
    public JPanel Panel;
    public JTextField TextResult;
    public JButton Button_0;
    public JButton Button_1;
    public JButton Button_2;
    public JButton Button_3;
    public JButton Button_4;
    public JButton Button_5;
    public JButton Button_6;
    public JButton Button_7;
    public JButton Button_8;
    public JButton Button_9;
    public JButton ButtonResult;
    public JButton ButtonSum;
    public JButton ButtonDiff;
    public JButton ButtonProduct;
    public JButton ButtonFrac;
    public JButton ButtonExp;
    public JButton ButtonSqrt;
    public JButton ButtonC;
    public JButton ButtonPlusMinus;
    public JButton ButtonDelete;
    public JButton ButtonDot;
    public double FirstNumber;
    public double SecondNumber;
    public int TypeOperation;
    
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
        setButtonsNumbers();
        setButtonsOperations();
        setTextArea();
        ActionNumbersButtons();
        ActionOperationsButtons();
    }
    
    private void setPanel(){
        Panel = new JPanel();
        Panel.setLayout(null);
        this.getContentPane().add(Panel);
    }
    
    private void setButtonsNumbers(){
        
        //Button 0
        Button_0 = new JButton("0");
        Button_0.setBounds(102, 510, 100, 50);
        Button_0.setEnabled(true);
        Panel.add(Button_0);
        
        //Button 1
        Button_1 = new JButton("1");
        Button_1.setBounds(1, 459, 100, 50);
        Button_1.setEnabled(true);
        Panel.add(Button_1);
        
        //Button 2
        Button_2 = new JButton("2");
        Button_2.setBounds(102, 459, 100, 50);
        Button_2.setEnabled(true);
        Panel.add(Button_2);
        
        //Button 3
        Button_3 = new JButton("3");
        Button_3.setBounds(203, 459, 100, 50);
        Button_3.setEnabled(true);
        Panel.add(Button_3);
        
        //Button 1
        Button_4 = new JButton("4");
        Button_4.setBounds(1, 408, 100, 50);
        Button_4.setEnabled(true);
        Panel.add(Button_4);
        
        //Button 2
        Button_5 = new JButton("5");
        Button_5.setBounds(102, 408, 100, 50);
        Button_5.setEnabled(true);
        Panel.add(Button_5);
        
        //Button 3
        Button_6 = new JButton("6");
        Button_6.setBounds(203, 408, 100, 50);
        Button_6.setEnabled(true);
        Panel.add(Button_6);
        
        //Button 7
        Button_7 = new JButton("7");
        Button_7.setBounds(1, 357, 100, 50);
        Button_7.setEnabled(true);
        Panel.add(Button_7);
        
        //Button 8
        Button_8 = new JButton("8");
        Button_8.setBounds(102, 357, 100, 50);
        Button_8.setEnabled(true);
        Panel.add(Button_8);
        
        //Button 9
        Button_9 = new JButton("9");
        Button_9.setBounds(203, 357, 100, 50);
        Button_9.setEnabled(true);
        Panel.add(Button_9);
        
    }
    
    private void setButtonsOperations(){
        //Button Result
        ButtonResult = new JButton("=");
        ButtonResult.setBounds(304, 510, 70, 50);
        ButtonResult.setEnabled(true);
        Panel.add(ButtonResult);
        
        //Button sum
        ButtonSum = new JButton("+");
        ButtonSum.setBounds(304, 459, 70, 50);
        ButtonSum.setEnabled(true);
        Panel.add(ButtonSum);
        
        //Button diff
        ButtonDiff = new JButton("-");
        ButtonDiff.setBounds(304, 408, 70, 50);
        ButtonDiff.setEnabled(true);
        Panel.add(ButtonDiff);
        
        //Button Product
        ButtonProduct = new JButton("*");
        ButtonProduct.setBounds(304, 357, 70, 50);
        ButtonProduct.setEnabled(true);
        Panel.add(ButtonProduct);
        
        //Button sqrt
        ButtonSqrt = new JButton("Sqrt");
        ButtonSqrt.setBounds(1, 306, 70, 50);
        ButtonSqrt.setEnabled(true);
        Panel.add(ButtonSqrt);
        
        //Button exp
        ButtonExp = new JButton("Exp");
        ButtonExp.setBounds(72, 306, 70, 50);
        ButtonExp.setEnabled(true);
        Panel.add(ButtonExp);
        
        //Button C
        ButtonC = new JButton("C");
        ButtonC.setBounds(143, 306, 70, 50);
        ButtonC.setEnabled(true);
        Panel.add(ButtonC);
        
        //Button Fraction
        ButtonFrac = new JButton("/");
        ButtonFrac.setBounds(214, 306, 70, 50);
        ButtonFrac.setEnabled(true);
        Panel.add(ButtonFrac);
        
        //Button Delete
        ButtonDelete = new JButton("Delete");
        ButtonDelete.setBounds(285, 306, 89, 50);
        ButtonDelete.setEnabled(true);
        Panel.add(ButtonDelete);
        
        //Button +/-
        ButtonPlusMinus = new JButton("+/-");
        ButtonPlusMinus.setBounds(1, 510, 100, 50);
        ButtonPlusMinus.setEnabled(true);
        Panel.add(ButtonPlusMinus);
        
        //Button dot
        ButtonDot = new JButton(".");
        ButtonDot.setBounds(203, 510, 100, 50);
        ButtonDot.setEnabled(true);
        Panel.add(ButtonDot);
    }
    
    private void setTextArea(){
        TextResult = new JTextField();
        TextResult.setBounds(1, 250, 370, 50);
        Panel.add(TextResult);
    }
    
    private void ActionNumbersButtons(){
        //Button 0
        ActionListener ALButton0 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_0.getText());
            }
        };
        Button_0.addActionListener(ALButton0);
        
        //Button 1
        ActionListener ALButton1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_1.getText());
            }
        };
        Button_1.addActionListener(ALButton1);
        
        //Button 2
        ActionListener ALButton2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_2.getText());
            }
        };
        Button_2.addActionListener(ALButton2);
        
        //Button 3
        ActionListener ALButton3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_3.getText());
            }
        };
        Button_3.addActionListener(ALButton3);
        
        //Button 4
        ActionListener ALButton4 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_4.getText());
            }
        };
        Button_4.addActionListener(ALButton4);
        
        //Button 5
        ActionListener ALButton5 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_5.getText());
            }
        };
        Button_5.addActionListener(ALButton5);
        
        //Button 6
        ActionListener ALButton6 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_6.getText());
            }
        };
        Button_6.addActionListener(ALButton6);
        
        //Button 7
        ActionListener ALButton7 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_7.getText());
            }
        };
        Button_7.addActionListener(ALButton7);
        
        //Button 8
        ActionListener ALButton8 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_8.getText());
            }
        };
        Button_8.addActionListener(ALButton8);
        
        //Button 9
        ActionListener ALButton9 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + Button_9.getText());
            }
        };
        Button_9.addActionListener(ALButton9);
        
        //Button Dot
        ActionListener ALButtonDot = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               TextResult.setText(TextResult.getText() + ButtonDot.getText());
            }
        };
        ButtonDot.addActionListener(ALButtonDot);
    }
    
    private void ActionOperationsButtons(){
        
        //Button Sum
        ActionListener ALButtonSum = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                TypeOperation = 1;
                FirstNumber = Double.parseDouble(TextResult.getText());
                TextResult.setText("");
            }
        };
        ButtonSum.addActionListener(ALButtonSum);
        
        //Button Diff
        ActionListener ALButtonDiff = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                TypeOperation = 2;
                FirstNumber = Double.parseDouble(TextResult.getText());
                TextResult.setText("");
            }
        };
        ButtonDiff.addActionListener(ALButtonDiff);
        
        //Button Product
        ActionListener ALButtonProduct = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                TypeOperation = 3;
                FirstNumber = Double.parseDouble(TextResult.getText());
                TextResult.setText("");
            }
        };
        ButtonProduct.addActionListener(ALButtonProduct);
        
        //Button Frac
        ActionListener ALButtonFrac = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                TypeOperation = 4;
                FirstNumber = Double.parseDouble(TextResult.getText());
                TextResult.setText("");
            }
        };
        ButtonFrac.addActionListener(ALButtonFrac);
        
        //Button Exp
        ActionListener ALButtonExp = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                TypeOperation = 5;
                FirstNumber = Double.parseDouble(TextResult.getText());
                TextResult.setText("");
            }
        };
        ButtonExp.addActionListener(ALButtonExp);
        
        //Button Sqrt
        ActionListener ALButtonSqrt = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                FirstNumber = Double.parseDouble(TextResult.getText());
                TextResult.setText(Double.toString(Math.sqrt(FirstNumber)));
            }
        };
        ButtonSqrt.addActionListener(ALButtonSqrt);
       
        
        //Button Result
        ActionListener ALButtonResult = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                double Result;
                SecondNumber = Double.parseDouble(TextResult.getText());
                switch(TypeOperation){
                    case 1:     //Sum
                        Result = FirstNumber + SecondNumber;
                        TextResult.setText(Double.toString(Result));
                        break;
                    case 2:     //Diff
                        Result = FirstNumber - SecondNumber;
                        TextResult.setText(Double.toString(Result));
                        break;
                    case 3:     //Diff
                        Result = FirstNumber * SecondNumber;
                        TextResult.setText(Double.toString(Result));
                        break;
                    case 4:
                        Result = FirstNumber / SecondNumber;
                        TextResult.setText(Double.toString(Result));
                        break;
                    case 5:
                        Result = Math.pow(FirstNumber, SecondNumber);
                        TextResult.setText(Double.toString(Result));
                        break;
                }
            }
        };
        ButtonResult.addActionListener(ALButtonResult);
        
        //Button C
        ActionListener ALButtonC = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                TextResult.setText("");
                FirstNumber = 0;
                SecondNumber = 0;
                TypeOperation = 0;
            }
        };
        ButtonC.addActionListener(ALButtonC);
        
        //Button Delete
        ActionListener ALButtonDelete = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                StringBuffer sb = new StringBuffer(TextResult.getText());
                sb.deleteCharAt(sb.length() - 1);
                TextResult.setText(sb.toString());
                
            }
        };
        ButtonDelete.addActionListener(ALButtonDelete);
    }
    
}
