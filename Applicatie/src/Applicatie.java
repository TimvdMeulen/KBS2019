import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Applicatie extends JFrame implements ActionListener{
    private JButton jbbestand;
    private JLabel jlkosten;
    private JLabel jlbeschikbaarheid;
    private JButton jbberekenKosten;
    private JTextField Tx;
    private JTextField Ty;
    private ArrayList<Component> Componenten;
//    private JButton
    Panel Panel = new Panel();

    public Applicatie(){
        setTitle("Infrastructuur Applicatie");
        setSize(800,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //bestand button
        jbbestand = new JButton("Bestand");
        add(jbbestand);
        //jbbestand.addActionListener(this);
        jbbestand.setPreferredSize(new Dimension(150,50));
        jbbestand.setAlignmentX(LEFT_ALIGNMENT);

        jlkosten = new JLabel("Kosten: ");
        add(jlkosten);
        jlkosten.setPreferredSize(new Dimension(200,50));

        jlbeschikbaarheid = new JLabel("Beschikbaarheid: ");
        add(jlbeschikbaarheid);
        jlbeschikbaarheid.setPreferredSize(new Dimension(200,50));

        jbberekenKosten = new JButton("Bereken Kosten");
        add(jbberekenKosten);
        String[] types = { "DBServer","Webserver", "Loadbalancer    ","Firewall"};

        final JList<String> cb = new JList<>(types);
        add(cb);
//        cb.ad
        jbberekenKosten.setPreferredSize(new Dimension(200,50));

        add(Panel);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

    }
}