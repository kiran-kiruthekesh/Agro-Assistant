package com.Agriculture_Assisstant;

import jaco.mp3.player.MP3Player;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Irrigation {
    double durationValue;
    public Irrigation() {
        JFrame irrigationFrame = new JFrame("Irrigation");

        JLabel irrigationTitleLabel = new JLabel("IRRIGATION"); irrigationFrame.add(irrigationTitleLabel);
        irrigationTitleLabel.setBounds(20, 20, 560, 80);
        irrigationTitleLabel.setFont(new Font("Cambria (Headings)", Font.BOLD, 28));
        irrigationTitleLabel.setBackground(Color.decode("#74b9ff"));
        irrigationTitleLabel.setOpaque(true);
        irrigationTitleLabel.setForeground(Color.BLACK);
        irrigationTitleLabel.setHorizontalAlignment(JLabel.CENTER);
        irrigationTitleLabel.setVerticalAlignment(JLabel.CENTER);

        JLabel cropLabel = new JLabel("Choose Crop"); irrigationFrame.add(cropLabel);
        cropLabel.setBounds(100,120,200,25);
        cropLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        JLabel areaLabel = new JLabel("Area (ha)"); irrigationFrame.add(areaLabel);
        areaLabel.setBounds(100,150,200,25);
        areaLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        JLabel soilTypeLabel = new JLabel("Soil Type"); irrigationFrame.add(soilTypeLabel);
        soilTypeLabel.setBounds(100,180,200,25);
        soilTypeLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        JLabel varietyLabel = new JLabel("Variety"); irrigationFrame.add(varietyLabel);
        varietyLabel.setBounds(100,210,200,25);
        varietyLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        JLabel seasonLabel = new JLabel("Season"); irrigationFrame.add(seasonLabel);
        seasonLabel.setBounds(100,240,200,25);
        seasonLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        JLabel irrigationDepthLabel = new JLabel("Irrigation depth (mm)"); irrigationFrame.add(irrigationDepthLabel);
        irrigationDepthLabel.setBounds(100,270,200,25);
        irrigationDepthLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));
        JLabel irrigationRateLabel = new JLabel("Irriation rate (mm/hr)"); irrigationFrame.add(irrigationRateLabel);
        irrigationRateLabel.setBounds(100,300,200,25);
        irrigationRateLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));

        JTextField area = new JTextField(); irrigationFrame.add(area);
        area.setHorizontalAlignment(JTextField.CENTER);
        area.setBounds(300,150,150,25);
        area.setFont(new Font("Calibri (Body)",Font.PLAIN,16));
        JTextField irrigationDepth = new JTextField(); irrigationFrame.add(irrigationDepth);
        irrigationDepth.setBounds(300,270,150,25);
        irrigationDepth.setHorizontalAlignment(JTextField.CENTER);
        irrigationDepth.setFont(new Font("Calibri (Body)",Font.PLAIN,16));
        JTextField irrigationRate = new JTextField(); irrigationFrame.add(irrigationRate);
        irrigationRate.setBounds(300,300,150,25);
        irrigationRate.setHorizontalAlignment(JTextField.CENTER);
        irrigationRate.setFont(new Font("Calibri (Body)",Font.PLAIN,16));

        String[] cropList = {"Paddy", "Wheat"};
        JComboBox chooseCrop = new JComboBox(cropList); irrigationFrame.add(chooseCrop);
        chooseCrop.setBounds(300,120,150,25);
        chooseCrop.setFont(new Font("Calibri (Body)",Font.PLAIN,16));
        String[] soilTypeList = {"Loamy", "Clay"};
        JComboBox chooseSoilType = new JComboBox(soilTypeList); irrigationFrame.add(chooseSoilType);
        chooseSoilType.setBounds(300,180,150,25);
        chooseSoilType.setFont(new Font("Calibri (Body)",Font.PLAIN,16));
        String[] varietyList = {"Short", "Medium", "Long"};
        JComboBox chooseVariety = new JComboBox(varietyList); irrigationFrame.add(chooseVariety);
        chooseVariety.setBounds(300,210,150,25);
        chooseVariety.setFont(new Font("Calibri (Body)",Font.PLAIN,16));
        String[] seasonList = {"Summer", "Winter"};
        JComboBox chooseSeason = new JComboBox(seasonList); irrigationFrame.add(chooseSeason);
        chooseSeason.setBounds(300,240,150,25);
        chooseSeason.setFont(new Font("Calibri (Body)",Font.PLAIN,16));

        JButton calculateButton = new JButton("Calculate"); irrigationFrame.add(calculateButton);
        calculateButton.setBounds(250,350,100,25);
        JButton goToMenu = new JButton("menu"); irrigationFrame.add(goToMenu);
        goToMenu.setBounds(250,600,100,25);

        JButton remainder = new JButton("remainder"); irrigationFrame.add(remainder);
        remainder.setBounds(250,550,100,25);
        remainder.setVisible(false);

        calculateButton.addActionListener(e -> {
            try {
                double value = Double.parseDouble(area.getText());
            } catch (NumberFormatException ee) {
                JOptionPane.showMessageDialog(null, "Enter valid area");
            }
            try {
                double value = Double.parseDouble(irrigationDepth.getText());
            } catch (NumberFormatException ee) {
                JOptionPane.showMessageDialog(null, "Enter valid Irrigation depth");
            }
            try {
                double value = Double.parseDouble(irrigationRate.getText());
            } catch (NumberFormatException ee) {
                JOptionPane.showMessageDialog(null, "Enter valid Irrigation Rate");
            }
            if(area.getText().equals("") || Integer.parseInt(area.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Enter valid area");
            }
            else if(irrigationDepth.getText().equals("") || Integer.parseInt(irrigationDepth.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Enter valid Irrigation depth");
            }
            else if(irrigationRate.getText().equals("") || Integer.parseInt(irrigationRate.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Enter valid Irrigation Rate");
            }
            else {
                JLabel volumeLabel = new JLabel("Quantity (m3/ha or lit)");
                irrigationFrame.add(volumeLabel);
                volumeLabel.setBounds(100, 400, 200, 25);
                irrigationFrame.add(volumeLabel);
                volumeLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                JLabel durationLabel = new JLabel("Duration (hours or mins)");
                irrigationFrame.add(durationLabel);
                durationLabel.setBounds(100, 430, 200, 25);
                durationLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                JLabel frequencyLabel = new JLabel("Frequency");
                irrigationFrame.add(frequencyLabel);
                frequencyLabel.setBounds(100,460,200,25);
                frequencyLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));

                JTextField volume = new JTextField();
                irrigationFrame.add(volume);
                volume.setBounds(300, 400, 200, 25);
                volume.setHorizontalAlignment(JTextField.CENTER);
                volume.setFont(new Font("Calibri (Body)", Font.PLAIN, 16));
                JTextField duration = new JTextField();
                irrigationFrame.add(duration);
                duration.setBounds(300, 430, 200, 25);
                duration.setHorizontalAlignment(JTextField.CENTER);
                duration.setFont(new Font("Calibri (Body)", Font.PLAIN, 16));
                JTextArea frequency = new JTextArea();
                irrigationFrame.add(frequency);
                frequency.setLineWrap(true);
                frequency.setWrapStyleWord(true);
                frequency.setFont(new Font("Calibri (Body)", Font.PLAIN, 14));
                frequency.setBounds(300,460,200,50);

                double areaValue = Double.parseDouble(area.getText());
                double irrigationRateValue = Double.parseDouble(irrigationRate.getText());
                double irrigationDepthValue = Double.parseDouble(irrigationDepth.getText());
                double volumeValue = Double.parseDouble(String.format("%.2f", (irrigationDepthValue / 1000) * areaValue * 10000));
                durationValue = Double.parseDouble(String.format("%.2f", (irrigationDepthValue / irrigationRateValue)));
                volume.setText(Double.toString(volumeValue) + " or " + Double.toString(volumeValue * 1000));
                duration.setText(Double.toString(durationValue) + " or " + (Double.toString(durationValue * 60)));

                if(chooseCrop.getSelectedItem().equals("Paddy")) {
                    if(chooseSoilType.getSelectedItem().equals("Loamy")) {
                        if(chooseSeason.getSelectedItem().equals("Summer")) {
                            frequency.setText("Once in a day");
                        }
                        else if(chooseSeason.getSelectedItem().equals("Winter")) {
                            frequency.setText("Once in 3 days");
                        }
                    }
                    else if(chooseSoilType.getSelectedItem().equals("Clay")) {
                        if(chooseSeason.getSelectedItem().equals("Summer")) {
                            frequency.setText("Just before/immediately after disappearance");
                        }
                        else if(chooseSeason.getSelectedItem().equals("Winter")) {
                            frequency.setText("Once in 1 - 2 days");
                        }
                    }
                }
                else if(chooseCrop.getSelectedItem().equals("Wheat")) {
                    if (chooseSoilType.getSelectedItem().equals("Loamy")) {
                        if(chooseSeason.getSelectedItem().equals("Summer")) {
                            frequency.setText("Once in a day");
                        }
                        else if(chooseSeason.getSelectedItem().equals("Winter")) {
                            frequency.setText("Once in 2 days");
                        }
                    }
                    else if (chooseSoilType.getSelectedItem().equals("Clay")) {
                        if(chooseSeason.getSelectedItem().equals("Summer")) {
                            frequency.setText("After disappearance of water");
                        }
                        else if(chooseSeason.getSelectedItem().equals("Winter")) {
                            frequency.setText("Once in 1 - 3 days");
                        }
                    }
                }
                remainder.setVisible(true);
            }
        });

        remainder.addActionListener(e ->  {
            JFrame remainderFrame = new JFrame("Remainder");

            JButton start = new JButton("START"); remainderFrame.add(start);
            start.setBounds(100,100,100,50);
            start.setBackground(Color.GREEN);
            JButton stop = new JButton("Stop"); remainderFrame.add(stop);
            stop.setBounds(100,100,100,50);
            stop.setBackground(Color.RED);
            stop.setVisible(false);
            MP3Player alarm = new MP3Player(new File("C:\\Users\\HP\\Downloads\\alarm.mpeg"));
            start.addActionListener(e1 -> {
                //Proper alarm code
              /*  try {
                    TimeUnit.MINUTES.sleep(Math.round(durationValue * 60));
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                */
                // Trial alarm
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                remainderFrame.setVisible(true);
                alarm.play();
                start.setVisible(false);
            });
            stop.setVisible(true);
            stop.addActionListener(e2 -> {
                alarm.stop();
                remainderFrame.dispose();
            });

            remainderFrame.setLayout(null);
            remainderFrame.getContentPane().setBackground(Color.WHITE);
            remainderFrame.setSize(300,300);
            remainderFrame.setLocationRelativeTo(null);
            remainderFrame.setVisible(true);
            remainderFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            remainderFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    remainderFrame.setExtendedState(JFrame.ICONIFIED);
                }
            });
        });

        goToMenu.addActionListener(e3 -> {
            new Menu();
            irrigationFrame.dispose();
        });

        irrigationFrame.setLayout(null);
        irrigationFrame.getContentPane().setBackground(Color.decode("#fafafa"));
        irrigationFrame.setSize(600,720);
        irrigationFrame.setLocationRelativeTo(null);
        irrigationFrame.setVisible(true);
        irrigationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Irrigation();
    }
}
