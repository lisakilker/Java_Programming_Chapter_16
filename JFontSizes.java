/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Lisa
 */
public class JFontSizes extends JFrame {

    String message;
    Font fontSize;
    int x = 20;
    int y = 50;

    public JFontSizes() {
        setTitle("JFrame Font Sizes");
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 6; i <= 20; i++) {
            fontSize = new Font("Courier", Font.PLAIN, i);
            message = "Can you hear me now?" + i;

            g.setFont(fontSize);
            g.drawString(message, x, y);
            y += 28;
        }
    }

    public static void main(String[] args) {
        JFontSizes frame = new JFontSizes();
    }
}
