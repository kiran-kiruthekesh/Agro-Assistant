package com.Agriculture_Assisstant;

import javax.swing.*;
import java.awt.*;

public class Menu {
    public Menu() {
        JFrame menuFrame = new JFrame("Menu");

        JLabel menuLabel = new JLabel("MENU"); menuFrame.add(menuLabel);
        menuLabel.setBounds(200,0,200,80);
        menuLabel.setOpaque(true);
        menuLabel.setBackground(Color.BLACK);
        menuLabel.setForeground(Color.WHITE);
        menuLabel.setHorizontalAlignment(JLabel.CENTER);
        menuLabel.setFont(new Font("Cambria (heading)",Font.BOLD,20));

        JButton information = new JButton("INFORMATION"); menuFrame.add(information);
        information.setBounds(100,100,150,150);
        information.setBackground(Color.decode("#fffa65"));
        information.setFont(new Font("Cambria (body)",Font.BOLD,16));
        JButton irrigation = new JButton("IRRIGATION"); menuFrame.add(irrigation);
        irrigation.setBounds(350,100,150,150);
        irrigation.setBackground(Color.decode("#74b9ff"));
        irrigation.setFont(new Font("Cambria (body)",Font.BOLD,16));
        JButton fertilizer = new JButton("FERTILIZER"); menuFrame.add(fertilizer);
        fertilizer.setBounds(100,350,150,150);
        fertilizer.setBackground(Color.decode("#badc58"));
        fertilizer.setFont(new Font("Cambria (body)",Font.BOLD,16));
        JButton pesticide = new JButton("PESTICIDE"); menuFrame.add(pesticide);
        pesticide.setBounds(350,350,150,150);
        pesticide.setBackground(Color.decode("#ff4d4d"));
        pesticide.setFont(new Font("Cambria (body)",Font.BOLD,16));

        information.addActionListener(e -> {
            new GeneralInformation();
            menuFrame.dispose();
        });
        irrigation.addActionListener(e -> {
            new Irrigation();
            menuFrame.dispose();
        });
        fertilizer.addActionListener(e -> {
            new Fertilizer();
            menuFrame.dispose();
        });
        pesticide.addActionListener(e -> {
            new Pesticide();
            menuFrame.dispose();
        });

        menuFrame.setLayout(null);
        menuFrame.getContentPane().setBackground(Color.WHITE);
        menuFrame.setSize(600,600);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setVisible(true);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Menu();
    }
}
