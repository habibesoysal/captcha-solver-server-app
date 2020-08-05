package com.freelancer.catpcha.solver.gui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class Dashboard extends JFrame {

    Dashboard() {
        super("Server application");
        JLabel label = new JLabel("Server is up and running");
        label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        label.setBounds(20, 50, 450, 100);
        add(label);
        setSize(450, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
    }

}
