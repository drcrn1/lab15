import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame{
    private TextField txt;
    private JButton but1;
    private JButton but2;
    int sum=0;

    public Main(){
        setBounds(400,400,350,300);
        setResizable(false);

        setLayout(new FlowLayout());

        txt = new TextField(String.valueOf(sum));
        txt.setEditable(false);
        add(txt);

        but1 = new JButton("+1");
        but2 = new JButton("-1");

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sum<3){
                    sum++;
                    txt.setText(String.valueOf(sum));
                }
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sum>-5){
                    sum--;
                    txt.setText(String.valueOf(sum));
                }
            }
        });

        add(but1);
        add(but2);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new Main();
    }
}