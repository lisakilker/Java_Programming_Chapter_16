/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author Lisa
 */
public class JCarlysLogoPanel extends JFrame {
    String logo = "Carly's Catering";
    String motto = "It's a piece of cake!";
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        
        Font logoFont = new Font("Comic Sans MS", Font.PLAIN, 30);
        Font mottoFont = new Font("Comic Sans MS", Font.ITALIC, 14);
        
        GradientPaint gp = new GradientPaint(100, 70, new Color(68, 255, 245), 150, 150, new Color(68, 117, 255), true);
        g2D.setPaint(gp);
        g2D.setFont(logoFont);
        g2D.drawString(logo, 15, 64);
        
        g2D.setPaint(new Color(68,255,245));
        g2D.setFont(mottoFont);
        g2D.drawString(motto, 80, 80);
  
        GradientPaint gp2 = new GradientPaint(100, 100, new Color(255, 5, 171), 150, 150, Color.WHITE, true);
        g2D.setPaint(gp2);
        g2D.fillArc(200,7,100,100,340,40);
    }
}
