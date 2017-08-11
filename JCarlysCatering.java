/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W5HW;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Lisa
 */
public class JCarlysCatering extends JFrame implements ItemListener, ActionListener {

    int price = 0;
    int count = 0;
    final int PRICE_PER_GUEST = 35;
    String entreeMenu = "";
    String sideDishMenu = "";
    String dessertMenu = "";

    Container con = getContentPane();
    
    GridLayout mainGrid = new GridLayout(6,1);
    GridLayout headerGrid = new GridLayout(1,2);

    JPanel headerPanel = new JPanel();
    JPanel guestsPanel = new JPanel();
    JPanel entreesPanel = new JPanel();
    JPanel sideDishesPanel = new JPanel();
    JPanel dessertsPanel = new JPanel();
    JPanel totalPricePanel = new JPanel();
    JPanel menuPanel = new JPanel();

    JLabel carlysHeaderLabel = new JLabel();
    JLabel guestsLabel = new JLabel("Enter number of guests:");
    JLabel selectionEntreeLabel = new JLabel("Choose one entree:");
    JLabel selectionSideDishesLabel = new JLabel("Choose two sides:");
    JLabel selectionDessertLabel = new JLabel("Choose one dessert:");
    JLabel totalPriceLabel = new JLabel("Total price: $");
    JLabel menuLabel = new JLabel("Menu includes: ");

    JButton submitButton = new JButton("Submit");

    JTextField guestsTextField = new JTextField(4);
    
    ButtonGroup entrees = new ButtonGroup();
    JCheckBox entree1 = new JCheckBox("Steak");
    JCheckBox entree2 = new JCheckBox("Chicken");
    JCheckBox entree3 = new JCheckBox("Fish");
    JCheckBox entree4 = new JCheckBox("Pasta");

    JCheckBox sideDish1 = new JCheckBox("Potatoes");
    JCheckBox sideDish2 = new JCheckBox("Beans");
    JCheckBox sideDish3 = new JCheckBox("Corn");
    JCheckBox sideDish4 = new JCheckBox("Salad");
    
    ButtonGroup desserts = new ButtonGroup();
    JCheckBox dessert1 = new JCheckBox("Cupcake");
    JCheckBox dessert2 = new JCheckBox("Sorbet");
    JCheckBox dessert3 = new JCheckBox("Brownie");

    public JCarlysCatering() {
        super("Carly's Catering");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        con.setLayout(mainGrid);

        headerPanel.add(carlysHeaderLabel);
        headerPanel.add(guestsLabel);
        headerPanel.add(guestsPanel);
        headerPanel.add(guestsTextField);
        headerPanel.add(submitButton);
        headerPanel.setLayout(headerGrid);
        con.add(headerPanel);

        guestsPanel.add(guestsLabel);
        guestsPanel.add(guestsTextField);
        guestsPanel.add(submitButton);
        
        entreesPanel.add(selectionEntreeLabel);
        entrees.add(entree1);
        entrees.add(entree2);
        entrees.add(entree3);
        entrees.add(entree4);
        entreesPanel.add(entree1);
        entreesPanel.add(entree2);
        entreesPanel.add(entree3);
        entreesPanel.add(entree4);
        con.add(entreesPanel);

        sideDishesPanel.add(selectionSideDishesLabel);
        sideDishesPanel.add(sideDish1);
        sideDishesPanel.add(sideDish2);
        sideDishesPanel.add(sideDish3);
        sideDishesPanel.add(sideDish4);
        con.add(sideDishesPanel);

        dessertsPanel.add(selectionDessertLabel);
        desserts.add(dessert1);
        desserts.add(dessert2);
        desserts.add(dessert3);
        dessertsPanel.add(dessert1);
        dessertsPanel.add(dessert2);
        dessertsPanel.add(dessert3);
        con.add(dessertsPanel);

        totalPricePanel.add(totalPriceLabel);
        con.add(totalPricePanel);

        menuPanel.add(menuLabel);
        con.add(menuPanel);

        submitButton.addActionListener(this);
        entree1.addItemListener(this);
        entree2.addItemListener(this);
        entree3.addItemListener(this);
        entree4.addItemListener(this);
        sideDish1.addItemListener(this);
        sideDish2.addItemListener(this);
        sideDish3.addItemListener(this);
        sideDish4.addItemListener(this);
        dessert1.addItemListener(this);
        dessert2.addItemListener(this);
        dessert3.addItemListener(this);

        headerPanel.setBackground(new Color(96, 83, 84));

        guestsPanel.setBackground(Color.RED);
        guestsLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        guestsTextField.setFont(new Font("Helvetica", Font.PLAIN, 15));

        submitButton.setFont(new Font("Helvetica", Font.PLAIN, 15));
        submitButton.setBackground(new Color(96, 83, 84));
        submitButton.setForeground(Color.WHITE);

        entreesPanel.setBackground(Color.ORANGE);
        selectionEntreeLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        entree1.setBackground(Color.ORANGE);
        entree1.setFont(new Font("Helvetica", Font.PLAIN, 15));
        entree2.setBackground(Color.ORANGE);
        entree2.setFont(new Font("Helvetica", Font.PLAIN, 15));
        entree3.setBackground(Color.ORANGE);
        entree3.setFont(new Font("Helvetica", Font.PLAIN, 15));
        entree4.setBackground(Color.ORANGE);
        entree4.setFont(new Font("Helvetica", Font.PLAIN, 15));

        sideDishesPanel.setBackground(Color.YELLOW);
        selectionSideDishesLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        sideDish1.setBackground(Color.YELLOW);
        sideDish1.setFont(new Font("Helvetica", Font.PLAIN, 15));
        sideDish2.setBackground(Color.YELLOW);
        sideDish2.setFont(new Font("Helvetica", Font.PLAIN, 15));
        sideDish3.setBackground(Color.YELLOW);
        sideDish3.setFont(new Font("Helvetica", Font.PLAIN, 15));
        sideDish4.setBackground(Color.YELLOW);
        sideDish4.setFont(new Font("Helvetica", Font.PLAIN, 15));

        dessertsPanel.setBackground(Color.GREEN);
        selectionDessertLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        dessert1.setBackground(Color.GREEN);
        dessert1.setFont(new Font("Helvetica", Font.PLAIN, 15));
        dessert2.setBackground(Color.GREEN);
        dessert2.setFont(new Font("Helvetica", Font.PLAIN, 15));
        dessert3.setBackground(Color.GREEN);
        dessert3.setFont(new Font("Helvetica", Font.PLAIN, 15));

        totalPricePanel.setBackground(Color.CYAN);
        totalPriceLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        totalPriceLabel.setForeground(Color.BLACK);
        menuPanel.setBackground(Color.MAGENTA);
        menuLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        menuLabel.setForeground(Color.BLACK);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        JCarlysLogoPanel logo = new JCarlysLogoPanel();
        logo.paint(g);
    }

    public static void main(String[] args) {
        JCarlysCatering jCarlysCatering = new JCarlysCatering();
        jCarlysCatering.setSize(640, 400);
        jCarlysCatering.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        Object source = a.getSource();

        if (source == submitButton) {
            try {
                price = Integer.parseInt(guestsTextField.getText()) * PRICE_PER_GUEST;
            } catch (Exception b) {
                price = 0;
            }
            totalPriceLabel.setText("Total price: $" + price);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent c) {
        Object source = c.getSource();
        int select = c.getStateChange();

        if (source == entree1) {
            if (select == ItemEvent.SELECTED) {
                entreeMenu = "Steak" + ", ";
            }
        }
        if (source == entree2) {
            if (select == ItemEvent.SELECTED) {
                entreeMenu = "Chicken" + ", ";
            }
        }
        if (source == entree3) {
            if (select == ItemEvent.SELECTED) {
                entreeMenu = "Fish" + ", ";
            }
        }
        if (source == entree4) {
            if (select == ItemEvent.SELECTED) {
                entreeMenu = "Pasta" + ", ";
            }
        }

        if (source == sideDish1 || source == sideDish2 || source == sideDish3 || source == sideDish4) {
            if (select == ItemEvent.SELECTED) {
                count++;
            } else {
                count--;
            }
            sideDishMenu = "";
            if (count <= 2) {
                if (sideDish1.isSelected()) {
                    sideDishMenu += "Potatoes" + ", ";
                }
                if (sideDish2.isSelected()) {
                    sideDishMenu += "Beans" + ", ";
                }
                if (sideDish3.isSelected()) {
                    sideDishMenu += "Corn" + ", ";
                }
                if (sideDish4.isSelected()) {
                    sideDishMenu += "Salad" + ", ";
                }
            } else {
                sideDish1.setSelected(false);
                sideDish2.setSelected(false);
                sideDish3.setSelected(false);
                sideDish4.setSelected(false);
            }
        }

        if (source == dessert1) {
            if (select == ItemEvent.SELECTED) {
                dessertMenu = "Cupcake";
            }
        }
        if (source == dessert2) {
            if (select == ItemEvent.SELECTED) {
                dessertMenu = "Sorbet";
            }
        }
        if (source == dessert3) {
            if (select == ItemEvent.SELECTED) {
                dessertMenu = "Brownie";
            }
        }
        menuLabel.setText("Menu includes: " + entreeMenu + sideDishMenu + dessertMenu);
    }
}
