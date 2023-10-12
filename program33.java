import java.awt.*;
class a {
    public static void main(String[] args) {
        Frame f1= new Frame("youtube");
        Button b1 = new Button("ok");
        Button b2 = new Button("byee");
        Button b3 = new Button("bobby");
        f1.setLayout(null);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        b1.setBounds(550, 200, 100, 400);
    b2.setBounds(650, 200, 100, 400);
    b3.setBounds(750, 200, 100, 400);
        b1.setBackground(Color.cyan);
        b2.setBackground(Color.yellow);
b3.setBackground(Color.pink);
        f1.setBackground(Color.black);

        f1.setVisible(true);
    }
}