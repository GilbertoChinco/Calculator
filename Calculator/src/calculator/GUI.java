
package calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
    public JPanel Panel;
    public JTextField TextResult, TextOperation;
    public JButton Button_0, Button_1, Button_2, Button_3, Button_4;
    public JButton Button_5, Button_6, Button_7, Button_8, Button_9, ButtonDot;
    public JButton ButtonResult, ButtonSum, ButtonDiff, ButtonProduct, ButtonPlusMinus;
    public JButton ButtonFrac, ButtonExp, ButtonSqrt, ButtonC, ButtonDelete;
    public double FirstNumber, SecondNumber;
    public int TypeOperation;
    
    public GUI(){
        this.setSize(381, 389);
        setLocationRelativeTo(null);
        setResizable(false);
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
        Button_0.setBounds(102, 309, 100, 50);
        Button_0.setEnabled(true);
        Panel.add(Button_0);
        
        //Button 1
        Button_1 = new JButton("1");
        Button_1.setBounds(1, 258, 100, 50);
        Button_1.setEnabled(true);
        Panel.add(Button_1);
        
        //Button 2
        Button_2 = new JButton("2");
        Button_2.setBounds(102, 258, 100, 50);
        Button_2.setEnabled(true);
        Panel.add(Button_2);
        
        //Button 3
        Button_3 = new JButton("3");
        Button_3.setBounds(203, 258, 100, 50);
        Button_3.setEnabled(true);
        Panel.add(Button_3);
        
        //Button 1
        Button_4 = new JButton("4");
        Button_4.setBounds(1, 207, 100, 50);
        Button_4.setEnabled(true);
        Panel.add(Button_4);
        
        //Button 2
        Button_5 = new JButton("5");
        Button_5.setBounds(102, 207, 100, 50);
        Button_5.setEnabled(true);
        Panel.add(Button_5);
        
        //Button 3
        Button_6 = new JButton("6");
        Button_6.setBounds(203, 207, 100, 50);
        Button_6.setEnabled(true);
        Panel.add(Button_6);
        
        //Button 7
        Button_7 = new JButton("7");
        Button_7.setBounds(1, 156, 100, 50);
        Button_7.setEnabled(true);
        Panel.add(Button_7);
        
        //Button 8
        Button_8 = new JButton("8");
        Button_8.setBounds(102, 156, 100, 50);
        Button_8.setEnabled(true);
        Panel.add(Button_8);
        
        //Button 9
        Button_9 = new JButton("9");
        Button_9.setBounds(203, 156, 100, 50);
        Button_9.setEnabled(true);
        Panel.add(Button_9);
        
    }
    
    private void setButtonsOperations(){
        //Button Result
        ButtonResult = new JButton("=");
        ButtonResult.setBounds(304, 309, 70, 50);
        ButtonResult.setEnabled(true);
        Panel.add(ButtonResult);
        
        //Button sum
        ButtonSum = new JButton("+");
        ButtonSum.setBounds(304, 258, 70, 50);
        ButtonSum.setEnabled(true);
        Panel.add(ButtonSum);
        
        //Button diff
        ButtonDiff = new JButton("-");
        ButtonDiff.setBounds(304, 207, 70, 50);
        ButtonDiff.setEnabled(true);
        Panel.add(ButtonDiff);
        
        //Button Product
        ButtonProduct = new JButton("*");
        ButtonProduct.setBounds(304, 156, 70, 50);
        ButtonProduct.setEnabled(true);
        Panel.add(ButtonProduct);
        
        //Button sqrt
        ButtonSqrt = new JButton("Sqrt");
        ButtonSqrt.setBounds(1, 105, 70, 50);
        ButtonSqrt.setEnabled(true);
        Panel.add(ButtonSqrt);
        
        //Button exp
        ButtonExp = new JButton("Exp");
        ButtonExp.setBounds(72, 105, 70, 50);
        ButtonExp.setEnabled(true);
        Panel.add(ButtonExp);
        
        //Button C
        ButtonC = new JButton("C");
        ButtonC.setBounds(143, 105, 70, 50);
        ButtonC.setEnabled(true);
        Panel.add(ButtonC);
        
        //Button Fraction
        ButtonFrac = new JButton("/");
        ButtonFrac.setBounds(214, 105, 70, 50);
        ButtonFrac.setEnabled(true);
        Panel.add(ButtonFrac);
        
        //Button Delete
        ButtonDelete = new JButton("Delete");
        ButtonDelete.setBounds(285, 105, 89, 50);
        ButtonDelete.setEnabled(true);
        Panel.add(ButtonDelete);
        
        //Button +/-
        ButtonPlusMinus = new JButton("+/-");
        ButtonPlusMinus.setBounds(1, 309, 100, 50);
        ButtonPlusMinus.setEnabled(true);
        Panel.add(ButtonPlusMinus);
        
        //Button dot
        ButtonDot = new JButton(".");
        ButtonDot.setBounds(203, 309, 100, 50);
        ButtonDot.setEnabled(true);
        Panel.add(ButtonDot);
    }
    
    private void setTextArea(){
        TextResult = new JTextField();
        TextResult.setBounds(1, 4, 373, 50);
        Panel.add(TextResult);
        
        TextOperation = new JTextField();
        TextOperation.setBounds(1, 55, 373, 50);
        Panel.add(TextOperation);
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
                if(TextResult.getText().isEmpty() != true){
                    TypeOperation = 1;
                    FirstNumber = Double.parseDouble(TextResult.getText());
                    TextOperation.setText(TextResult.getText() + " " + ButtonSum.getText());
                    TextResult.setText("");
                }
                else{
                    TypeOperation = 0;
                }
            }
        };
        ButtonSum.addActionListener(ALButtonSum);
        
        //Button Diff
        ActionListener ALButtonDiff = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(TextResult.getText().isEmpty() != true){
                    TypeOperation = 2;
                    FirstNumber = Double.parseDouble(TextResult.getText());
                    TextOperation.setText(TextResult.getText() + " " + ButtonDiff.getText());
                    TextResult.setText("");
                }
                else{
                    TypeOperation = 0;
                }
            }
        };
        ButtonDiff.addActionListener(ALButtonDiff);
        
        //Button Product
        ActionListener ALButtonProduct = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(TextResult.getText().isEmpty() != true){
                    TypeOperation = 3;
                    FirstNumber = Double.parseDouble(TextResult.getText());
                    TextOperation.setText(TextResult.getText() + " " + ButtonProduct.getText());
                    TextResult.setText("");
                }
                else{
                    TypeOperation = 0;
                }
            }
        };
        ButtonProduct.addActionListener(ALButtonProduct);
        
        //Button Frac
        ActionListener ALButtonFrac = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(TextResult.getText().isEmpty() != true){
                    TypeOperation = 4;
                    FirstNumber = Double.parseDouble(TextResult.getText());
                    TextOperation.setText(TextResult.getText() + " " + ButtonFrac.getText());
                    TextResult.setText("");
                }
                else{
                    TypeOperation = 0;
                }
            }
        };
        ButtonFrac.addActionListener(ALButtonFrac);
        
        //Button Exp
        ActionListener ALButtonExp = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(TextResult.getText().isEmpty() != true){
                    TypeOperation = 5;
                    FirstNumber = Double.parseDouble(TextResult.getText());
                    TextOperation.setText(TextResult.getText() + " " + ButtonExp.getText());
                    TextResult.setText("");
                }
                else{
                    TypeOperation = 0;
                }
            }
        };
        ButtonExp.addActionListener(ALButtonExp);
        
        //Button Sqrt
        ActionListener ALButtonSqrt = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(TextResult.getText().isEmpty() != true){
                    FirstNumber = Double.parseDouble(TextResult.getText());
                    TextResult.setText(Double.toString(Math.sqrt(FirstNumber)));
                    TextOperation.setText(ButtonSqrt.getText() + "(" + FirstNumber + ")" + " = " + Double.toString(Math.sqrt(FirstNumber)));
                    TextResult.setText("");
                }
                else{
                    TypeOperation = 0;
                }
            }
        };
        ButtonSqrt.addActionListener(ALButtonSqrt);
       
        
        //Button Result
        ActionListener ALButtonResult = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(TextResult.getText().isEmpty() != true){
                    double Result;
                    SecondNumber = Double.parseDouble(TextResult.getText());
                    switch(TypeOperation){
                        case 1:     //Sum
                            Result = FirstNumber + SecondNumber;
                            TextResult.setText(Double.toString(Result));
                            TextOperation.setText(FirstNumber + " " + ButtonSum.getText() + " " + SecondNumber + " = " + Double.toString(Result));
                            break;
                        case 2:     //Diff
                            Result = FirstNumber - SecondNumber;
                            TextResult.setText(Double.toString(Result));
                            TextOperation.setText(FirstNumber + " " + ButtonDiff.getText() + " " + SecondNumber + " = " + Double.toString(Result));
                            break;
                        case 3:     //Product
                            Result = FirstNumber * SecondNumber;
                            TextResult.setText(Double.toString(Result));
                            TextOperation.setText(FirstNumber + " " + ButtonProduct.getText() + " " + SecondNumber + " = " + Double.toString(Result));
                            break;
                        case 4:  //frac
                            Result = FirstNumber / SecondNumber;
                            TextResult.setText(Double.toString(Result));
                            TextOperation.setText(FirstNumber + " " + ButtonFrac.getText() + " " + SecondNumber + " = " + Double.toString(Result));
                            break;
                        case 5:  //Exponent
                            Result = Math.pow(FirstNumber, SecondNumber);
                            TextResult.setText(Double.toString(Result));
                            TextOperation.setText(FirstNumber + " " + ButtonExp.getText() + " " + SecondNumber + " = " + Double.toString(Result));
                            break;
                    }
                    TextResult.setText("");
                }
                else{
                    TypeOperation = 0;
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
                if(TextResult.getText().isEmpty() != true){
                    StringBuffer sb = new StringBuffer(TextResult.getText());
                    sb.deleteCharAt(sb.length() - 1);
                    TextResult.setText(sb.toString());
                }
                else{
                    TypeOperation = 0;
                }
            }
        };
        ButtonDelete.addActionListener(ALButtonDelete);
    }
    
}
