package com.Agriculture_Assisstant;

import javax.swing.*;
import java.awt.*;


public class Fertilizer {
    public Fertilizer() {
        JFrame fertilizerFrame = new JFrame("Fertilizer");

        JLabel titleLabelFertilizer = new JLabel("FERTILIZER");
        fertilizerFrame.add(titleLabelFertilizer);
        titleLabelFertilizer.setBounds(340, 20, 600, 80);
        titleLabelFertilizer.setFont(new Font("Cambria (Headings)", Font.BOLD, 42));
        titleLabelFertilizer.setBackground(Color.decode("#badc58"));
        titleLabelFertilizer.setOpaque(true);
        titleLabelFertilizer.setForeground(Color.BLACK);
        titleLabelFertilizer.setHorizontalAlignment(JLabel.CENTER);
        titleLabelFertilizer.setVerticalAlignment(JLabel.CENTER);

        JLabel cropLabel = new JLabel("Crop");
        fertilizerFrame.add(cropLabel);
        cropLabel.setBounds(100, 120, 200, 25);
        cropLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
        JLabel areaLabel = new JLabel("Area (ha)");
        fertilizerFrame.add(areaLabel);
        areaLabel.setBounds(100, 150, 200, 25);
        areaLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
        JLabel typeLabel = new JLabel("Type");
        fertilizerFrame.add(typeLabel);
        typeLabel.setBounds(100, 180, 200, 25);
        typeLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));


        JTextField area = new JTextField();
        fertilizerFrame.add(area);
        area.setHorizontalAlignment(JTextField.CENTER);
        area.setBounds(300, 150, 200, 25);
        area.setFont(new Font("Calibri (Body)", Font.PLAIN, 16));

        String[] cropOption = {"Paddy", "Wheat"};
        JComboBox crop = new JComboBox(cropOption);
        fertilizerFrame.add(crop);
        crop.setBounds(300, 120, 200, 25);
        crop.setFont(new Font("Calibri (Body)", Font.PLAIN, 16));

        String[] typeOption = {"Irrigated", "Rainfed"};
        JComboBox type = new JComboBox(typeOption);
        fertilizerFrame.add(type);
        type.setAlignmentX(JComboBox.CENTER_ALIGNMENT);
        type.setBounds(300, 180, 200, 25);
        type.setFont(new Font("Calibri (Body)", Font.PLAIN, 16));

        JButton calculateButton = new JButton("Calculate");
        fertilizerFrame.add(calculateButton);
        calculateButton.setBounds(250, 220, 100, 25);
        JButton calculationLCCButton = new JButton("LCC");
        fertilizerFrame.add(calculationLCCButton);
        calculationLCCButton.setVisible(false);
        calculationLCCButton.setBounds(250, 520, 100, 25);

        calculateButton.addActionListener(e -> {
            try {
                double value = Double.parseDouble(area.getText());
            } catch (NumberFormatException ee) {
                JOptionPane.showMessageDialog(null, "Enter valid area");
            }
            if (area.getText().equals("") || Integer.parseInt(area.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Enter valid area");
            } else {
                double areaValue = Integer.parseInt(area.getText());
                JLabel nutrientsHeadingLabel = new JLabel("Nutrients (kg)");
                fertilizerFrame.add(nutrientsHeadingLabel);
                nutrientsHeadingLabel.setBounds(200, 260, 200, 25);
                nutrientsHeadingLabel.setHorizontalAlignment(JLabel.CENTER);
                nutrientsHeadingLabel.setFont(new Font("Calibri (Body)", Font.BOLD, 22));
                JLabel nitrogenLabel = new JLabel("Nitrogen (Avg)");
                fertilizerFrame.add(nitrogenLabel);
                nitrogenLabel.setBounds(100, 290, 200, 25);
                nitrogenLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                JLabel phosphorousLabel = new JLabel("Phosphorous (Avg)");
                fertilizerFrame.add(phosphorousLabel);
                phosphorousLabel.setBounds(100, 320, 200, 25);
                phosphorousLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                JLabel potassiumLabel = new JLabel("Potassium (Avg)");
                fertilizerFrame.add(potassiumLabel);
                potassiumLabel.setBounds(100, 350, 200, 25);
                potassiumLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                JLabel fertilizerHeadingLabel = new JLabel("Fertilizer (kg)");
                fertilizerFrame.add(fertilizerHeadingLabel);
                fertilizerHeadingLabel.setBounds(200, 390, 200, 25);
                fertilizerHeadingLabel.setHorizontalAlignment(JLabel.CENTER);
                fertilizerHeadingLabel.setFont(new Font("Calibri (Body)", Font.BOLD, 22));
                JLabel ureaLabel = new JLabel("Urea (Avg)");
                fertilizerFrame.add(ureaLabel);
                ureaLabel.setBounds(100, 420, 200, 25);
                ureaLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                JLabel dapLabel = new JLabel("DAP (Avg)");
                fertilizerFrame.add(dapLabel);
                dapLabel.setBounds(100, 450, 200, 25);
                dapLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                JLabel mopLabel = new JLabel("MOP (Avg)");
                fertilizerFrame.add(mopLabel);
                mopLabel.setBounds(100, 480, 200, 25);
                mopLabel.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));

                if (crop.getSelectedItem().equals("Paddy")) {
                    if (type.getSelectedItem().equals("Irrigated")) {
                        double nitrogenAsPerArea = 103 * areaValue;
                        double phosphorousAsPerArea = 33 * areaValue;
                        double potassiumAsPerArea = 19 * areaValue;
                        double ureaAsPerArea = 195 * areaValue;
                        double dapAsPerArea = 72 * areaValue;
                        double mopAsPerArea = 31 * areaValue;

                        JTextField nitrogen = new JTextField(Double.toString(nitrogenAsPerArea));
                        fertilizerFrame.add(nitrogen);
                        nitrogen.setBounds(300, 290, 200, 25);
                        nitrogen.setHorizontalAlignment(JTextField.CENTER);
                        nitrogen.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField phosphorous = new JTextField(Double.toString(phosphorousAsPerArea));
                        fertilizerFrame.add(phosphorous);
                        phosphorous.setBounds(300, 320, 200, 25);
                        phosphorous.setHorizontalAlignment(JTextField.CENTER);
                        phosphorous.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField potassium = new JTextField(Double.toString(potassiumAsPerArea));
                        fertilizerFrame.add(potassium);
                        potassium.setBounds(300, 350, 200, 25);
                        potassium.setHorizontalAlignment(JTextField.CENTER);
                        potassium.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField urea = new JTextField(Double.toString(ureaAsPerArea));
                        fertilizerFrame.add(urea);
                        urea.setBounds(300, 420, 200, 25);
                        urea.setHorizontalAlignment(JTextField.CENTER);
                        urea.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField dap = new JTextField(Double.toString(dapAsPerArea));
                        fertilizerFrame.add(dap);
                        dap.setBounds(300, 450, 200, 25);
                        dap.setHorizontalAlignment(JTextField.CENTER);
                        dap.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField mop = new JTextField(Double.toString(mopAsPerArea));
                        fertilizerFrame.add(mop);
                        mop.setBounds(300, 480, 200, 25);
                        mop.setHorizontalAlignment(JTextField.CENTER);
                        mop.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        calculationLCCButton.setVisible(true);
                    } else if (type.getSelectedItem().equals("Rainfed")) {
                        double nitrogenAsPerArea = 56 * areaValue;
                        double phosphorousAsPerArea = 14 * areaValue;
                        double potassiumAsPerArea = 6 * areaValue;
                        double ureaAsPerArea = 110 * areaValue;
                        double dapAsPerArea = 30 * areaValue;
                        double mopAsPerArea = 10 * areaValue;

                        JTextField nitrogen = new JTextField(Double.toString(nitrogenAsPerArea));
                        fertilizerFrame.add(nitrogen);
                        nitrogen.setBounds(300, 290, 200, 25);
                        nitrogen.setHorizontalAlignment(JTextField.CENTER);
                        nitrogen.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField phosphorous = new JTextField(Double.toString(phosphorousAsPerArea));
                        fertilizerFrame.add(phosphorous);
                        phosphorous.setBounds(300, 320, 200, 25);
                        phosphorous.setHorizontalAlignment(JTextField.CENTER);
                        phosphorous.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField potassium = new JTextField(Double.toString(potassiumAsPerArea));
                        fertilizerFrame.add(potassium);
                        potassium.setBounds(300, 350, 200, 25);
                        potassium.setHorizontalAlignment(JTextField.CENTER);
                        potassium.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField urea = new JTextField(Double.toString(ureaAsPerArea));
                        fertilizerFrame.add(urea);
                        urea.setBounds(300, 420, 200, 25);
                        urea.setHorizontalAlignment(JTextField.CENTER);
                        urea.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField dap = new JTextField(Double.toString(dapAsPerArea));
                        fertilizerFrame.add(dap);
                        dap.setBounds(300, 450, 200, 25);
                        dap.setHorizontalAlignment(JTextField.CENTER);
                        dap.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField mop = new JTextField(Double.toString(mopAsPerArea));
                        fertilizerFrame.add(mop);
                        mop.setBounds(300, 480, 200, 25);
                        mop.setHorizontalAlignment(JTextField.CENTER);
                        mop.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        calculationLCCButton.setVisible(true);
                    }
                } else if (crop.getSelectedItem().equals("Wheat")) {
                    if (type.getSelectedItem().equals("Irrigated")) {
                        double nitrogenAsPerArea = 105 * areaValue;
                        double phosphorousAsPerArea = 32 * areaValue;
                        double potassiumAsPerArea = 7 * areaValue;
                        double ureaAsPerArea = 202 * areaValue;
                        double dapAsPerArea = 70 * areaValue;
                        double mopAsPerArea = 11 * areaValue;

                        JTextField nitrogen = new JTextField(Double.toString(nitrogenAsPerArea));
                        fertilizerFrame.add(nitrogen);
                        nitrogen.setBounds(300, 290, 200, 25);
                        nitrogen.setHorizontalAlignment(JTextField.CENTER);
                        nitrogen.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField phosphorous = new JTextField(Double.toString(phosphorousAsPerArea));
                        fertilizerFrame.add(phosphorous);
                        phosphorous.setBounds(300, 320, 200, 25);
                        phosphorous.setHorizontalAlignment(JTextField.CENTER);
                        phosphorous.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField potassium = new JTextField(Double.toString(potassiumAsPerArea));
                        fertilizerFrame.add(potassium);
                        potassium.setBounds(300, 350, 200, 25);
                        potassium.setHorizontalAlignment(JTextField.CENTER);
                        potassium.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField urea = new JTextField(Double.toString(ureaAsPerArea));
                        fertilizerFrame.add(urea);
                        urea.setBounds(300, 420, 200, 25);
                        urea.setHorizontalAlignment(JTextField.CENTER);
                        urea.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField dap = new JTextField(Double.toString(dapAsPerArea));
                        fertilizerFrame.add(dap);
                        dap.setBounds(300, 450, 200, 25);
                        dap.setHorizontalAlignment(JTextField.CENTER);
                        dap.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField mop = new JTextField(Double.toString(mopAsPerArea));
                        fertilizerFrame.add(mop);
                        mop.setBounds(300, 480, 200, 25);
                        mop.setHorizontalAlignment(JTextField.CENTER);
                        mop.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        calculationLCCButton.setVisible(true);
                    } else if (type.getSelectedItem().equals("Rainfed")) {
                        double nitrogenAsPerArea = 55 * areaValue;
                        double phosphorousAsPerArea = 16 * areaValue;
                        double potassiumAsPerArea = 4 * areaValue;
                        double ureaAsPerArea = 106 * areaValue;
                        double dapAsPerArea = 34 * areaValue;
                        double mopAsPerArea = 6 * areaValue;

                        JTextField nitrogen = new JTextField(Double.toString(nitrogenAsPerArea));
                        fertilizerFrame.add(nitrogen);
                        nitrogen.setBounds(300, 290, 200, 25);
                        nitrogen.setHorizontalAlignment(JTextField.CENTER);
                        nitrogen.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField phosphorous = new JTextField(Double.toString(phosphorousAsPerArea));
                        fertilizerFrame.add(phosphorous);
                        phosphorous.setBounds(300, 320, 200, 25);
                        phosphorous.setHorizontalAlignment(JTextField.CENTER);
                        phosphorous.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField potassium = new JTextField(Double.toString(potassiumAsPerArea));
                        fertilizerFrame.add(potassium);
                        potassium.setBounds(300, 350, 200, 25);
                        potassium.setHorizontalAlignment(JTextField.CENTER);
                        potassium.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField urea = new JTextField(Double.toString(ureaAsPerArea));
                        fertilizerFrame.add(urea);
                        urea.setBounds(300, 420, 200, 25);
                        urea.setHorizontalAlignment(JTextField.CENTER);
                        urea.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField dap = new JTextField(Double.toString(dapAsPerArea));
                        fertilizerFrame.add(dap);
                        dap.setBounds(300, 450, 200, 25);
                        dap.setHorizontalAlignment(JTextField.CENTER);
                        dap.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        JTextField mop = new JTextField(Double.toString(mopAsPerArea));
                        fertilizerFrame.add(mop);
                        mop.setBounds(300, 480, 200, 25);
                        mop.setHorizontalAlignment(JTextField.CENTER);
                        mop.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
                        calculationLCCButton.setVisible(true);
                    }
                }
            }
        });

        calculationLCCButton.addActionListener(e -> {
            JLabel leaf1Label = new JLabel("Leaf 1");
            fertilizerFrame.add(leaf1Label);
            leaf1Label.setBounds(680, 320, 100, 25);
            leaf1Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf2Label = new JLabel("Leaf 2");
            fertilizerFrame.add(leaf2Label);
            leaf2Label.setBounds(680, 360, 100, 25);
            leaf2Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf3Label = new JLabel("Leaf 3");
            fertilizerFrame.add(leaf3Label);
            leaf3Label.setBounds(680, 400, 200, 25);
            leaf3Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf4Label = new JLabel("Leaf 4");
            fertilizerFrame.add(leaf4Label);
            leaf4Label.setBounds(680, 440, 200, 25);
            leaf4Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf5Label = new JLabel("Leaf 5");
            fertilizerFrame.add(leaf5Label);
            leaf5Label.setBounds(680, 480, 200, 25);
            leaf5Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf6Label = new JLabel("Leaf 6");
            fertilizerFrame.add(leaf6Label);
            leaf6Label.setBounds(980, 320, 200, 25);
            leaf6Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf7Label = new JLabel("Leaf 7");
            fertilizerFrame.add(leaf7Label);
            leaf7Label.setBounds(980, 360, 200, 25);
            leaf7Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf8Label = new JLabel("Leaf 8");
            fertilizerFrame.add(leaf8Label);
            leaf8Label.setBounds(980, 400, 200, 25);
            leaf8Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf9Label = new JLabel("Leaf 9");
            fertilizerFrame.add(leaf9Label);
            leaf9Label.setBounds(980, 440, 200, 25);
            leaf9Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JLabel leaf10Label = new JLabel("Leaf 10");
            fertilizerFrame.add(leaf10Label);
            leaf10Label.setBounds(980, 480, 200, 25);
            leaf10Label.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));

            JTextField leaf1 = new JTextField();
            fertilizerFrame.add(leaf1);
            leaf1.setBounds(780, 320, 100, 25);
            leaf1.setHorizontalAlignment(JTextField.CENTER);
            leaf1.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf2 = new JTextField();
            fertilizerFrame.add(leaf2);
            leaf2.setBounds(780, 360, 100, 25);
            leaf2.setHorizontalAlignment(JTextField.CENTER);
            leaf2.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf3 = new JTextField();
            fertilizerFrame.add(leaf3);
            leaf3.setBounds(780, 400, 100, 25);
            leaf3.setHorizontalAlignment(JTextField.CENTER);
            leaf3.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf4 = new JTextField();
            fertilizerFrame.add(leaf4);
            leaf4.setBounds(780, 440, 100, 25);
            leaf4.setHorizontalAlignment(JTextField.CENTER);
            leaf4.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf5 = new JTextField();
            fertilizerFrame.add(leaf5);
            leaf5.setBounds(780, 480, 100, 25);
            leaf5.setHorizontalAlignment(JTextField.CENTER);
            leaf5.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf6 = new JTextField();
            fertilizerFrame.add(leaf6);
            leaf6.setBounds(1080, 320, 100, 25);
            leaf6.setHorizontalAlignment(JTextField.CENTER);
            leaf6.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf7 = new JTextField();
            fertilizerFrame.add(leaf7);
            leaf7.setBounds(1080, 360, 100, 25);
            leaf7.setHorizontalAlignment(JTextField.CENTER);
            leaf7.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf8 = new JTextField();
            fertilizerFrame.add(leaf8);
            leaf8.setBounds(1080, 400, 100, 25);
            leaf8.setHorizontalAlignment(JTextField.CENTER);
            leaf8.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf9 = new JTextField();
            fertilizerFrame.add(leaf9);
            leaf9.setBounds(1080, 440, 100, 25);
            leaf9.setHorizontalAlignment(JTextField.CENTER);
            leaf9.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField leaf10 = new JTextField();
            fertilizerFrame.add(leaf10);
            leaf10.setBounds(1080, 480, 100, 25);
            leaf10.setHorizontalAlignment(JTextField.CENTER);
            leaf10.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
            JTextField average = new JTextField();
            fertilizerFrame.add(average);
            average.setVisible(false);
            average.setHorizontalAlignment(JTextField.CENTER);
            average.setBounds(680, 560, 500, 25);
            average.setFont(new Font("Calibri (Body)", Font.PLAIN, 16));

            JButton help = new JButton("Help");
            fertilizerFrame.add(help);
            help.setBounds(780, 520, 100, 25);
            JButton result = new JButton("Result");
            fertilizerFrame.add(result);
            result.setBounds(1080, 520, 100, 25);

            help.addActionListener(e1 -> {
                JFrame helpFrame = new JFrame("Help");

                JLabel helpTitleLabel = new JLabel("Help!");
                helpFrame.add(helpTitleLabel);
                helpTitleLabel.setBounds(200, 0, 300, 40);
                helpTitleLabel.setHorizontalAlignment(JLabel.CENTER);
                helpTitleLabel.setFont(new Font("calibri (body)", Font.BOLD, 28));

                JTextArea instruction = new JTextArea("Step1 :\n         Randomly select at least 10 disease-free rice plants or hills in a field, where plant population is uniform.\n"
                        + "\nStep2 :\n       Select the topmost, youngest, fully expanded leaf from each hill or plant. This part best reflects the N status of the plants and "
                        + "place the middle part of the leaf on the LCC and compare its color with the color panels. Do not detach or destroy the leaf.\n"
                        + "\nStep3 :\n       Measure the leaf color under the shade of your body. Direct sunlight affects leaf color readings and "
                        + "if possible, the same person should read the LCC at the same time of the day (8-10 AM or 2-4 PM), every time. "
                        + "If the color of a rice leaf is in between two shades, take the average of the two values as the reading. For example, if the color is in between 3 and 4, the reading should be 3.5.\n"
                        + "\nStep4 :\n      Enter the values obtained in selected 10 leaves in the text box given.\n"
                        + "\nNote :\n         Use the LCC once every 7−10 days starting from the beginning of tillering. Continue this process up to 5−10 days after panicle initiation.");
                helpFrame.add(instruction);
                instruction.setBounds(50, 50, 600, 500);
                instruction.setEditable(false);
                instruction.setFont(new Font("calibri (body)", Font.PLAIN, 16));
                instruction.setVisible(true);
                instruction.setLineWrap(true);
                instruction.setWrapStyleWord(true);

                helpFrame.setLayout(null);
                helpFrame.getContentPane().setBackground(Color.WHITE);
                helpFrame.setSize(700, 600);
                helpFrame.setVisible(true);
                helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            });

            if (crop.getSelectedItem().equals("Paddy")) {
                ImageIcon paddyLCC = new ImageIcon("D:\\study materials\\2nd year\\3rd sem\\Java SWE1007\\Project\\Agriculture Assistance\\LCC Rice.png");
                JLabel paddyLCCLabel = new JLabel(paddyLCC);
                fertilizerFrame.add(paddyLCCLabel);
                paddyLCCLabel.setBounds(640, 110, 600, 200);
            } else if (crop.getSelectedItem().equals("Wheat")) {
                ImageIcon wheatIcon = new ImageIcon("D:\\study materials\\2nd year\\3rd sem\\Java SWE1007\\Project\\Agriculture Assistance\\LCC Wheat.png");
                JLabel wheatLCCLabel = new JLabel(wheatIcon);
                fertilizerFrame.add(wheatLCCLabel);
                wheatLCCLabel.setBounds(640, 110, 600, 200);
            }
            result.addActionListener(e2 -> {
                try {
                    double value = Double.parseDouble(leaf1.getText());
                } catch (NumberFormatException ee) {
                    if (leaf1.getText().equals("") || Integer.parseInt(leaf1.getText()) <= 0)

                        JOptionPane.showMessageDialog(null, "Enter valid value for leaf 1");
                }
                try {
                    double value = Double.parseDouble(leaf2.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 2");
                }
                try {
                    double value = Double.parseDouble(leaf3.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 3");
                }
                try {
                    double value = Double.parseDouble(leaf4.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 4");
                }
                try {
                    double value = Double.parseDouble(leaf5.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 5");
                }
                try {
                    double value = Double.parseDouble(leaf6.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 6");
                }
                try {
                    double value = Double.parseDouble(leaf7.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 7");
                }
                try {
                    double value = Double.parseDouble(leaf8.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 8");
                }
                try {
                    double value = Double.parseDouble(leaf9.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 9");
                }
                try {
                    double value = Double.parseDouble(leaf10.getText());
                } catch (NumberFormatException ee) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 10");
                }
                if (leaf1.getText().equals("") || Integer.parseInt(leaf1.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 1");
                } else if (leaf2.getText().equals("") || Integer.parseInt(leaf2.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 2");
                } else if (leaf3.getText().equals("") || Integer.parseInt(leaf3.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 3");
                } else if (leaf4.getText().equals("") || Integer.parseInt(leaf4.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 4");
                } else if (leaf5.getText().equals("") || Integer.parseInt(leaf5.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 5");
                } else if (leaf6.getText().equals("") || Integer.parseInt(leaf6.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 6");
                } else if (leaf7.getText().equals("") || Integer.parseInt(leaf7.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 7");
                } else if (leaf8.getText().equals("") || Integer.parseInt(leaf8.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 8");
                } else if (leaf9.getText().equals("") || Integer.parseInt(leaf9.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 9");
                } else if (leaf10.getText().equals("") || Integer.parseInt(leaf10.getText()) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter valid value for leaf 10");
                } else {
                    double leaf1Value = Double.parseDouble(leaf1.getText());
                    double leaf2Value = Double.parseDouble(leaf2.getText());
                    double leaf3Value = Double.parseDouble(leaf3.getText());
                    double leaf4Value = Double.parseDouble(leaf4.getText());
                    double leaf5Value = Double.parseDouble(leaf5.getText());
                    double leaf6Value = Double.parseDouble(leaf6.getText());
                    double leaf7Value = Double.parseDouble(leaf7.getText());
                    double leaf8Value = Double.parseDouble(leaf8.getText());
                    double leaf9Value = Double.parseDouble(leaf9.getText());
                    double leaf10Value = Double.parseDouble(leaf10.getText());
                    double averageValue = (leaf1Value + leaf2Value + leaf3Value + leaf4Value + leaf5Value + leaf6Value + leaf7Value + leaf8Value + leaf9Value + leaf10Value) / 10;
                    average.setVisible(true);
                    if (crop.getSelectedItem().equals("Paddy")) {
                        if (averageValue < 3) {
                            average.setText("Nitrogen is insufficient, top dressing needed");
                        } else {
                            average.setText("Nitrogen is sufficient");
                        }
                    } else if (crop.getSelectedItem().equals("Wheat")) {
                        if (averageValue < 4) {
                            average.setText("Nitrogen is insufficient, top dressing needed");
                        } else {
                            average.setText("Nitrogen is sufficient");
                        }
                    }
                }
            });
        });

        JButton goToMenu = new JButton("menu");
        fertilizerFrame.add(goToMenu);
        goToMenu.setBounds(590, 600, 100, 25);

        goToMenu.addActionListener(e3 -> {
            new Menu();
            fertilizerFrame.dispose();
        });

        fertilizerFrame.setLayout(null);
        fertilizerFrame.getContentPane().setBackground(Color.WHITE);
        fertilizerFrame.setVisible(true);
        fertilizerFrame.setSize(1280, 720);
        fertilizerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Fertilizer();
    }
}
