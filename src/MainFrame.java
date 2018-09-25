import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame  extends JFrame{
    public MainFrame() { init(); }

    private Container cp ;
    private JPanel jpl = new JPanel(new GridLayout(3,4));
    private JPasswordField jpf = new JPasswordField();
    private JButton jbnoutput = new JButton("送出");
    private JButton jbnExit = new JButton("Exit");
    private JButton jbn1 = new JButton("1");
    private JButton jbn2 = new JButton("2");
    private JButton jbn3 = new JButton("3");
    private JButton jbn4 = new JButton("4");
    private JButton jbn5 = new JButton("5");
    private JButton jbn6 = new JButton("6");
    private JButton jbn7 = new JButton("7");
    private JButton jbn8 = new JButton("8");
    private JButton jbn9 = new JButton("9");
    private JButton jbn0 = new JButton("0");
    private JLabel jlb = new JLabel(" ",SwingConstants.CENTER);










    private void init() {

        this.setBounds(850,50,1000,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(5,5));
        jpf.setFont(new Font(null,Font.BOLD,25));



        jbnoutput.setFont(new Font(null,Font.BOLD,25));
        jbnExit.setFont(new Font(null,Font.BOLD,25));



        jbn1.setFont(new Font(null,Font.BOLD,25));
                jbn1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(jpf.equals("")){
                            jpf.setText(jbn1.getText());
                        }
                        else {
                            jpf.setText(jpf.getText()+jbn1.getText());
                        }
            }


        });

        jbn2.setFont(new Font(null,Font.BOLD,25));
        jbn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn2.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn2.getText());
                }
            }


        });

        jbn3.setFont(new Font(null,Font.BOLD,25));
        jbn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn2.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn3.getText());
                }
            }


        });

        jbn4.setFont(new Font(null,Font.BOLD,25));
        jbn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn4.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn4.getText());
                }
            }


        });

        jbn5.setFont(new Font(null,Font.BOLD,25));
        jbn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn5.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn5.getText());
                }
            }


        });

        jbn6.setFont(new Font(null,Font.BOLD,25));
        jbn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn6.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn6.getText());
                }
            }


        });

        jbn7.setFont(new Font(null,Font.BOLD,25));
        jbn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn7.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn7.getText());
                }
            }


        });

        jbn8.setFont(new Font(null,Font.BOLD,25));
        jbn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn8.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn8.getText());
                }
            }


        });

        jbn9.setFont(new Font(null,Font.BOLD,25));
        jbn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn9.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn9.getText());
                }
            }


        });

        jbn0.setFont(new Font(null,Font.BOLD,25));
        jbn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jpf.equals("")){
                    jpf.setText(jbn0.getText());
                }
                else {
                    jpf.setText(jpf.getText()+jbn0.getText());
                }
            }


        });

        jbnoutput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jpf.getText().equals("23323456")){
                    jlb.setText("成功");
                }
                else{
                    jlb.setText("失敗了啦笨");
                }
            }
        });





        jlb.setFont(new Font(null,Font.BOLD,40));

        cp.add(jpf,BorderLayout.NORTH);
        cp.add(jpl,BorderLayout.CENTER);
        jpl.add(jbn1);
        jpl.add(jbn2);
        jpl.add(jbn3);
        jpl.add(jbn4);
        jpl.add(jbn5);
        jpl.add(jbn6);
        jpl.add(jbn7);
        jpl.add(jbn8);
        jpl.add(jbn9);
        jpl.add(jbn0);
        jpl.add(jbnoutput);
        jpl.add(jbnExit);
        cp.add(jlb,BorderLayout.SOUTH);




        jbnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
