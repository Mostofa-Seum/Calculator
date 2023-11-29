import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(350, 575);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Mode");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        frame.getContentPane().add(BorderLayout.NORTH, mb);

        JPanel panel = new JPanel();
        panel.setBounds(50, 30, 40, 100);
        panel.setBackground (Color.black); 
        frame.add(panel);

        JLabel label = new JLabel("Input Value");
        label.setForeground(Color.white);
        Font font = new Font("Arial", Font.BOLD, 14);
        label.setFont(font);

        label.setBounds(25, 0, 80, 30);
        panel.add(label);

        JTextField text = new JTextField(25);
        text.setBounds(50, 80, 60, 80);
        panel.add(text);

        JButton clearBtn = new JButton("CLR");
        clearBtn.setBackground(new Color(255, 80, 80)); 
        clearBtn.setForeground(Color.green);
        JButton eraseBtn = new JButton("DEL");
        eraseBtn.setBackground(new Color(255, 165, 0));
        eraseBtn.setForeground(Color.black);
        JButton percentBtn = new JButton("%");
        JButton divideBtn = new JButton("÷");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton multiplyBtn = new JButton("×");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton subtractBtn = new JButton("-");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton addBtn = new JButton("+");
        JButton btn0 = new JButton("0");
        JButton decimalBtn = new JButton(".");
        JButton equalsBtn = new JButton("=");

        clearBtn.setPreferredSize(new Dimension(50, 35));
        eraseBtn.setPreferredSize(new Dimension(50, 35));
        percentBtn.setPreferredSize(new Dimension(50, 35));
        divideBtn.setPreferredSize(new Dimension(50, 35));
        btn7.setPreferredSize(new Dimension(50, 40));
        btn8.setPreferredSize(new Dimension(50, 40));
        btn9.setPreferredSize(new Dimension(50, 40));
        multiplyBtn.setPreferredSize(new Dimension(50, 35));
        btn4.setPreferredSize(new Dimension(50, 40));
        btn5.setPreferredSize(new Dimension(50, 40));
        btn6.setPreferredSize(new Dimension(50, 40));
        subtractBtn.setPreferredSize(new Dimension(45, 35));
        btn1.setPreferredSize(new Dimension(50, 40));
        btn2.setPreferredSize(new Dimension(50, 40));
        btn3.setPreferredSize(new Dimension(50, 40));
        addBtn.setPreferredSize(new Dimension(45, 80));
        btn0.setPreferredSize(new Dimension(50,40));
        decimalBtn.setPreferredSize(new Dimension(50 ,40 ));


        panel.add(clearBtn);
        panel.add(eraseBtn);
        panel.add(percentBtn);
        panel.add(divideBtn);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(multiplyBtn);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(subtractBtn);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(addBtn);
        panel.add(btn0);
        panel.add(decimalBtn);
        panel.add(equalsBtn);

        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 28, 32));

        frame.setVisible(true);
    }
}
