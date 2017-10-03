import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private Container cp;
    private JPanel jpnC =new JPanel(new GridLayout(6,1,3,3));
    private JTextArea jtaL = new JTextArea();
    private JTextArea jtaR = new JTextArea();
    private JScrollPane jspL=new JScrollPane(jtaL);
    private JScrollPane jspR=new JScrollPane(jtaR);
    private JTextField jtf=new JTextField();
    private JButton jbt1=new JButton("Example");
    private JButton jbt2=new JButton("Encrypt");
    private JButton jbt3=new JButton("Clear");
    private JButton jbt4=new JButton("Exit");
    private JLabel jlb=new JLabel("Key");
    private int count=0;
    public MainFrame(){
        init();
    }
    private  void init(){
        this.setBounds(150,200,500,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jpnC,BorderLayout.CENTER);
        cp.add(jspL,BorderLayout.WEST);
        cp.add(jspR,BorderLayout.EAST);
        jpnC.add(jbt1);
        jpnC.add(jbt2);
        jpnC.add(jlb);
        jlb.setHorizontalAlignment(JLabel.CENTER);
        jpnC.add(jtf);
        jpnC.add(jbt3);
        jpnC.add(jbt4);

        jtaL.setPreferredSize(new Dimension(200,400));
        jtaR.setPreferredSize(new Dimension(200,400));
        jtaL.setLineWrap(true);
        jtaR.setLineWrap(true);

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaL.setText("The curriculum provided by this department includes basic courses," +
                        " core curriculums, major programs and free electives giving the curriculum design richness and diversity." +
                        " Courses such as “Mobile and Internet Application”, “Semi-conductor Systems”," +
                        " “Big Data Analytics”, and “Artificial Intelligence” stand out and are highly practical. " +
                        "Students can choose courses depending on their interests or take courses from other departments " +
                        "to work towards a double major to develop their professional ability and second skill.");
            }
        });
        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char data[]=jtaL.getText().toCharArray();
                int len =data.length,key=Integer.parseInt(jtf.getText());
                for(int i=0;i<len;i++){
                    data[i] +=key;
                }
                jtaR.setText(new String(data));
            }
        });
        jbt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             jtaL.setText(" ");
            }
        });
        jbt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
