package views;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    private static CardLayout cardLayout;
    private static JPanel cardPanel;
    
    private final RegisterPage registerPage;
    private final LoginPage loginPage;
    private final Page1 page1;
    private final Page2 page2;
    private final Page3 page3;
    private final Page4 page4;
    private final Page5 page5;
    
    public Application(){
        setTitle("Unexpected outcomes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(320, 200));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        
        this.registerPage = new RegisterPage(this);
        this.loginPage = new LoginPage(this);
        this.page1 = new Page1(this);
        this.page2 = new Page2(this);
        this.page3 = new Page3(this);
        this.page4 = new Page4(this);
        this.page5 = new Page5(this);

        cardPanel.add(registerPage, "Register Page");
        cardPanel.add(loginPage, "Login Page");
        cardPanel.add(page1, "Page 1");
        cardPanel.add(page2, "Page 2");
        cardPanel.add(page3, "Page 3");
        cardPanel.add(page4, "Page 4");
        cardPanel.add(page5, "Page 5");
        getContentPane().add(cardPanel);
    }
    
    public void showPage(String pageName) {
        cardLayout.show(cardPanel, pageName);
    }
    
    public Page1 getPage1() {
        return this.page1;
    }
}
