package com.Agriculture_Assisstant;

import javax.swing.*;
import java.awt.*;

public class Pesticide {
    public Pesticide() {
        JFrame pesticideFrame = new JFrame("Pesticide");

        JLabel pesticideTitleLabel = new JLabel("PESTICIDE"); pesticideFrame.add(pesticideTitleLabel);
        pesticideTitleLabel.setBounds(340, 20, 600, 80);
        pesticideTitleLabel.setFont(new Font("Cambria (Headings)", Font.BOLD, 38));
        pesticideTitleLabel.setBackground(Color.decode("#ff4d4d"));
        pesticideTitleLabel.setOpaque(true);
        pesticideTitleLabel.setForeground(Color.BLACK);
        pesticideTitleLabel.setHorizontalAlignment(JLabel.CENTER);
        pesticideTitleLabel.setVerticalAlignment(JLabel.CENTER);

        JLabel cropLabel = new JLabel("Choose Crop"); pesticideFrame.add(cropLabel);
        cropLabel.setBounds(100,120,150,25);
        cropLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,18));

        String[] cropList = {"Paddy", "Wheat"};
        JComboBox chooseCrop = new JComboBox(cropList); pesticideFrame.add(chooseCrop);
        chooseCrop.setBounds(250,120,150,25);
        chooseCrop.setFont(new Font("Calibri (Body)",Font.PLAIN,16));

        JButton show = new JButton("show"); pesticideFrame.add(show);
        show.setBounds(200,180,100,25);

        JButton fungicide = new JButton("FUNGICIDE"); pesticideFrame.add(fungicide);
        fungicide.setBounds(150,240,200,50);
        fungicide.setBackground(Color.decode("#dfe6e9"));
        fungicide.setFont(new Font("Calibri (Body)",Font.BOLD,16));
        fungicide.setVisible(false);
        JButton insecticide = new JButton("INSECTICIDE"); pesticideFrame.add(insecticide);
        insecticide.setBounds(150,312,200,50);
        insecticide.setBackground(Color.decode("#dfe6e9"));
        insecticide.setFont(new Font("Calibri (Body)",Font.BOLD,16));
        insecticide.setVisible(false);
        JButton herbicide = new JButton("HERBICIDE"); pesticideFrame.add(herbicide);
        herbicide.setBounds(150,384,200,50);
        herbicide.setBackground(Color.decode("#dfe6e9"));
        herbicide.setFont(new Font("Calibri (Body)",Font.BOLD,16));
        herbicide.setVisible(false);
        JButton plantGrowthRegulator = new JButton("PGR"); pesticideFrame.add(plantGrowthRegulator);
        plantGrowthRegulator.setBounds(150,466,200,50);
        plantGrowthRegulator.setBackground(Color.decode("#dfe6e9"));
        plantGrowthRegulator.setFont(new Font("Calibri (Body)",Font.BOLD,16));
        plantGrowthRegulator.setVisible(false);
        JButton bioFungicide = new JButton("BIO-FUNGICIDE"); pesticideFrame.add(bioFungicide);
        bioFungicide.setBounds(150,550,200,50);
        bioFungicide.setBackground(Color.decode("#dfe6e9"));
        bioFungicide.setFont(new Font("Calibri (Body)",Font.BOLD,16));
        bioFungicide.setVisible(false);

        JButton goToMenu = new JButton("menu"); pesticideFrame.add(goToMenu);
        goToMenu.setBounds(590,640,100,25);

        JTextArea information = new JTextArea();
        information.setFont(new Font("Calibri (body)",Font.PLAIN,16));
        information.setEditable(false);
        information.setWrapStyleWord(true);
        information.setLineWrap(true);

        JScrollPane scroll = new JScrollPane(information,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pesticideFrame.add(scroll);
        scroll.setVisible(false);
        scroll.setBounds(460,120,720,480);

        show.addActionListener(e -> {
            insecticide.setVisible(true);
            fungicide.setVisible(true);
            herbicide.setVisible(true);
            plantGrowthRegulator.setVisible(true);
            bioFungicide.setVisible(true);
        });

        insecticide.addActionListener(e -> {
            scroll.setVisible(true);
            if(chooseCrop.getSelectedItem().equals("Paddy")) {
                information.setText("\n" +
                        "Name Of The Pesticide : Acephate 75.00% SP\n" +
                        "Name Of The Pest        : Yellow stem borer, Leaf folder, Plant Hoppers, Green leaf hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 500.0-750.0\n" +
                        "\tFormulation (gm/ml)            –  666.0-1000.0\n" +
                        "\tDilution in Water (Liter)        –  300-500\n" +
                        "Waiting Period (days) :  15\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Acephate 97.00% DF\n" +
                        "Name Of The Pest        : Yellow stem borer, Leaf folder, Plant hoppers, Green leaf hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 727.50\n" +
                        "\tFormulation (gm/ml)            –  750.00\n" +
                        "\tDilution in Water (Liter)        –  500\n" +
                        "Waiting Period (days) : 21\n" +
                        "\n" +
                        "Name Of The Pesticide : Acetamiprid 20.00% SP\n" +
                        "Name Of The Pest        : Brown plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 10.00-20.00\n" +
                        "\tFormulation (gm/ml)            –  50.0-100.0\n" +
                        "\tDilution in Water (Liter)        –  500-600\n" +
                        "Waiting Period (days) :  07\n" +
                        "\n" +
                        "Name Of The Pesticide : Benfuracarb 03.00% GR\n" +
                        "Name Of The Pest      : Stem borer, Leaf folder, Brown plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 1000\n" +
                        "\tFormulation (gm/ml)           –  33000\n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) :  20\n" +
                        "\n" +
                        "Name Of The Pesticide : Bifenthrin 08.80% CS\n" +
                        "Name Of The Pest      : Stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 44.00\n" +
                        "\tFormulation (gm/ml)           –  500\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) :  21\n" +
                        "\n" +
                        "Name Of The Pesticide : Bifenthrin 10.00% EC\n" +
                        "Name Of The Pest      : Stem borer, Leaf folder, Green leaf hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 50.0\n" +
                        "\tFormulation (gm/ml)           –  500\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) :  21\n" +
                        "\n" +
                        "Name Of The Pesticide : Bromadiolone 00.25% CB\n" +
                        "Name Of The Pest      : Field Rat, Large Bandicota Indian house rat, Indian field mouse\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 0.005\n" +
                        "\tFormulation (gm/ml)           –  Nil\n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) :  Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Bromadiolone 00.005% RB\n" +
                        "Name Of The Pest      : Field Rat, Large Bandicota Indian house rat, Indian field mouse\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 0.005\n" +
                        "\tFormulation (gm/ml)           –  Nil\n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) :  Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Buprofezin 25.00% SC\n" +
                        "Name Of The Pest      : Whitefly Aphids, Jassids, Thrip\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 200.0\n" +
                        "\tFormulation (gm/ml)           –  800\n" +
                        "\tDilution in Water (Liter)     –  400-500\n" +
                        "Waiting Period (days) :  20\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Buprofezin 70.00% DF\n" +
                        "Name Of The Pest      : Brown plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 175\n" +
                        "\tFormulation (gm/ml)           –  250\n" +
                        "\tDilution in Water (Liter)     –  500\t\n" +
                        "Waiting Period (days) :  24\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Carbofuran 03.00% CG\n" +
                        "Name Of The Pest      : Brown plant hopper Gall midge, Stem borer, Green leaf hopper, Hispa\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 750.0\n" +
                        "\tFormulation (gm/ml)           –  25000\n" +
                        "\tDilution in Water (Liter)     –  Nil\t\n" +
                        "Waiting Period (days) :  Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Carbosulfan 06.00% Granules\n" +
                        "Name Of The Pest      : Stem borer, Gall midge, Green leaf hopper, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 1000.0\n" +
                        "\tFormulation (gm/ml)           –  16700\n" +
                        "\tDilution in Water (Liter)     –  Nil\t\n" +
                        "Waiting Period (days) :  37\n" +
                        "\n" +
                        "Name Of The Pesticide : Carbosulfan 25.00% EC\n" +
                        "Name Of The Pest      :  Green leaf hopper, White Back Plant Hopper, Brown plant hopper, Gall midge, Stem borer\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 200.0-250.0\n" +
                        "\tFormulation (gm/ml)           –  800-1000\n" +
                        "\tDilution in Water (Liter)     –  500-1000\t\n" +
                        "Waiting Period (days) :  14\n" +
                        "\n" +
                        "Name Of The Pesticide : Cartap Hydrochloride 04.00% Granules\n" +
                        "Name Of The Pest      :  Stem borer\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 750.0\n" +
                        "\tFormulation (gm/ml)           –  18750\n" +
                        "\tDilution in Water (Liter)     –  Nil\t\n" +
                        "Waiting Period (days) :  Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Cartap Hydrochloride 50.00% SP\n" +
                        "Name Of The Pest      :  Stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 500.0\n" +
                        "\tFormulation (gm/ml)           –  1000\n" +
                        "\tDilution in Water (Liter)     –  500-1000\t\n" +
                        "Waiting Period (days) :  Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Cartap Hydrochloride 75.00% SG\n" +
                        "Name Of The Pest      :  Yellow stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 318.75-375\n" +
                        "\tFormulation (gm/ml)           –  425-500\n" +
                        "\tDilution in Water (Liter)     –  250-500\t\n" +
                        "Waiting Period (days) : 35-89\n" +
                        "\n" +
                        "Name Of The Pesticide : Chlorantraniliprole 18.50% SC\n" +
                        "Name Of The Pest      :  Stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 30.0\n" +
                        "\tFormulation (gm/ml)           –  150.0\n" +
                        "\tDilution in Water (Liter)     –  500\t\n" +
                        "Waiting Period (days) : 47\n" +
                        "\n" +
                        "Name Of The Pesticide : Chlorantraniliprole 18.50% SC\n" +
                        "Name Of The Pest      :  Yellow stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 40.0\n" +
                        "\tFormulation (gm/ml)           –  10000\n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) : 53\n" +
                        "Name Of The Pesticide : Chlorpyrifos 10.00% Granules\n" +
                        "Name Of The Pest      :  Stem borer, Leaf folder, Gall midge\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 1000.0\n" +
                        "\tFormulation (gm/ml)           –  10000\n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) : 30\n" +
                        "\n" +
                        "Name Of The Pesticide : Chlorpyrifos 50.00% EC\n" +
                        "Name Of The Pest      :  Stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 375-400\n" +
                        "\tFormulation (gm/ml)           –  750-800 \n" +
                        "\tDilution in Water (Liter)     –  500-1000\n" +
                        "Waiting Period (days) : 15\n" +
                        "\n" +
                        "Name Of The Pesticide : Chlorpyrifos 01.50% DP\n" +
                        "Name Of The Pest      :  Stem borer, Green leaf hopper, Brown plant hopper, Leaf folder, Gall midge, Grass hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 375\n" +
                        "\tFormulation (gm/ml)           –  25000 \n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) : 07\n" +
                        "\n" +
                        "Name Of The Pesticide : Chromafenozide 80.00% WP\n" +
                        "Name Of The Pest      :  Brown plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 10.0-12.0\n" +
                        "\tFormulation (gm/ml)           –  20.0-24.0\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 12\n" +
                        "\n" +
                        "Name Of The Pesticide : Deltamethrin 11.00% w/w EC\n" +
                        "Name Of The Pest      :  Stem borer, Leaf folder, Green leaf hopper, Whorl maggot\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 15.00\n" +
                        "\tFormulation (gm/ml)           –  150.0\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 13\n" +
                        "\n" +
                        "Name Of The Pesticide : Deltamethrin 01.80% EC\n" +
                        "Name Of The Pest      :  Stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 10-12.50\n" +
                        "\tFormulation (gm/ml)           –  625-780\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 07\n" +
                        "\n" +
                        "Name Of The Pesticide : Dinotefuran 20.00% SG\n" +
                        "Name Of The Pest      :  Brown plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 30.0-40.0\n" +
                        "\tFormulation (gm/ml)           –  150-200\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 21\n" +
                        "\n" +
                        "Name Of The Pesticide : Ethofenoprox 10.00% EC\n" +
                        "Name Of The Pest      :  Brown plant hopper, Green leaf hopper, Stem borer, Leaf folder, Gall midge, Whorl maggot, White backed plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 50.0-75.0\n" +
                        "\tFormulation (gm/ml)           –  500-750\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 15\n" +
                        "\n" +
                        "Name Of The Pesticide : Fenobucarb (BPMC) 50.00% EC\n" +
                        "Name Of The Pest      :  Brown plant hopper, Green leaf hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 250-750 \n" +
                        "\tFormulation (gm/ml)           –  500-1500\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 30\n" +
                        "\n" +
                        "Name Of The Pesticide : Fenpropathrin 30.00% EC\n" +
                        "Name Of The Pest      :  Pink boll worm, Spotted boll worm, American boll worm, White fly\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 75.0-100.0\n" +
                        "\tFormulation (gm/ml)           –  250-340\n" +
                        "\tDilution in Water (Liter)     –  750-1000\n" +
                        "Waiting Period (days) : 14\n" +
                        "\n" +
                        "Name Of The Pesticide : Fipronil 05.00% SC\n" +
                        "Name Of The Pest      :  Stem borer, Brown plant hopper, Green leaf hopper, Rice leaf hopper, Rice Gall midge, Whorl maggot, White backed plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 50.0-75.0\n" +
                        "\tFormulation (gm/ml)           –  1000-1500\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 32\n" +
                        "\n" +
                        "Name Of The Pesticide : Fipronil 00.30% GR \n" +
                        "Name Of The Pest      :  Stem borer, Brown plant hopper, Green leaf hopper Rice leaf hopper, Rice gall midge, Whorl maggot, White backed plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 50.0-75.0\n" +
                        "\tFormulation (gm/ml)           –  16670-25000\n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) : 32\n" +
                        "\n" +
                        "Name Of The Pesticide : Imidacloprid 70.00% WG\n" +
                        "Name Of The Pest      :  Brown plant hoppers, White backed plant hoppers\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 21.0-24.5\n" +
                        "\tFormulation (gm/ml)           –  30-35\n" +
                        "\tDilution in Water (Liter)     – 300-375\n" +
                        "Waiting Period (days) : 07\n" +
                        "\n" +
                        "Name Of The Pesticide : Imidacloprid 48.00% FS\n" +
                        "Name Of The Pest      :  Thrips \n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 0.15\n" +
                        "\tFormulation (gm/ml)           –  0.25\n" +
                        "\tDilution in Water (Liter)     – Nil\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Imidacloprid 00.30% GR\n" +
                        "Name Of The Pest      :  Stem borer  \n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 0.045\n" +
                        "\tFormulation (gm/ml)           – 15.0 kg\n" +
                        "\tDilution in Water (Liter)     – Nil\n" +
                        "Waiting Period (days) : 26\n" +
                        "\n" +
                        "Name Of The Pesticide : Lambda-cyhalothrin 04.90% CS\n" +
                        "Name Of The Pest      :  Stem borer, Leaf folder\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 12.50\n" +
                        "\tFormulation (gm/ml)           – 250.0\n" +
                        "\tDilution in Water (Liter)     – 500\n" +
                        "Waiting Period (days) : 15\n" +
                        "\n" +
                        "Name Of The Pesticide : Lambda-cyhalothrin 02.50% EC\n" +
                        "Name Of The Pest      :  Leaf folder, Stem borer, Green leaf hopper, Gall midge, Hispa, Thrips\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 12.50\n" +
                        "\tFormulation (gm/ml)           – 500.0\n" +
                        "\tDilution in Water (Liter)     – 400-600\n" +
                        "Waiting Period (days) : 15\n" +
                        "\n" +
                        "Name Of The Pesticide : Malathion 05.00% DP\n" +
                        "Name Of The Pest      :  Rice Hispa\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 1250\n" +
                        "\tFormulation (gm/ml)           – 25000\n" +
                        "\tDilution in Water (Liter)     – Nil\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Monocrotophos 36.00% SL\n" +
                        "Name Of The Pest      :  Brown plant hopper, Yellow stem borer,\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 500.0\n" +
                        "\tFormulation (gm/ml)           – 1250\n" +
                        "\tDilution in Water (Liter)     – 500-1000\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Oxydemeton-methyl 25.00% EC\n" +
                        "Name Of The Pest      :  Blue leaf hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 125.0\n" +
                        "\tFormulation (gm/ml)           – 500\n" +
                        "\tDilution in Water (Liter)     – 500-1000\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Phenthoate 50.00% EC \n" +
                        "Name Of The Pest      :  Rice case worm\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 500.0\n" +
                        "\tFormulation (gm/ml)           – 1000\n" +
                        "\tDilution in Water (Liter)     – 500-1000\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Pymetrozine 50.00% WG\n" +
                        "Name Of The Pest      :  Brown plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 150.0\n" +
                        "\tFormulation (gm/ml)           – 300\n" +
                        "\tDilution in Water (Liter)     – 500\n" +
                        "Waiting Period (days) : 19\n" +
                        "\n" +
                        "Name Of The Pesticide : Quinalphos 25.00% Gel\n" +
                        "Name Of The Pest      :  Brown plant hopper, Leaf folder, Stem borer, Hispa \n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 250.0\n" +
                        "\tFormulation (gm/ml)           – 1000\n" +
                        "\tDilution in Water (Liter)     – 500-1000\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Quinalphos 20.00% AF\n" +
                        "Name Of The Pest      :  Brown plant hopper, Green leaf hopper, Leaf folder, Stem borer\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 250.0-300.0\n" +
                        "\tFormulation (gm/ml)           – 1250-1500\n" +
                        "\tDilution in Water (Liter)     – 750-1000\n" +
                        "Waiting Period (days) : 40\n" +
                        "\n" +
                        "Name Of The Pesticide : Thiacloprid 21.70% SC\n" +
                        "Name Of The Pest      :  Stem borer \n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 120.0\n" +
                        "\tFormulation (gm/ml)           – 500\n" +
                        "\tDilution in Water (Liter)     – 500\n" +
                        "Waiting Period (days) : 30\n" +
                        "\n" +
                        "Name Of The Pesticide : Thiamethoxam 70.00% WS\n" +
                        "Name Of The Pest      :  Thrips, Green leaf hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 105.0\n" +
                        "\tFormulation (gm/ml)           – 150\n" +
                        "Indication : Use as seed dresser at the time of sowing\n" +
                        "\n" +
                        "Name Of The Pesticide : Thiamethoxam 75.00% w/w SG\n" +
                        "Name Of The Pest      :  Green leaf hopper, Brown plant hopper\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (gm) – 113.0\n" +
                        "\tFormulation (gm/ml)           – 150\n" +
                        "\tDilution in Water (Liter)     – Dissolve in 500 ml water and mix with 20 kg sand/ha\n" +
                        "Waiting Period (days) : 60\n");
            }
            else if(chooseCrop.getSelectedItem().equals("Wheat")) {
                information.setText("Name Of The Pesticide : Bromadiolone 00.25% CB\n" +
                        "Name Of The Pest : Field Rat, Large Bandicota Indian house rat, Indian field mouse\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 0.005\n" +
                        "                 Formulation (gm/ml) – Nill\n" +
                        "                 Dilution in Water (Liter) – Nill\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Bromadiolone 00.005% RB\n" +
                        "Name Of The Pest : Indian Field mouse, Field Rat\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 0.005\n" +
                        "                 Formulation (gm/ml) – Nill\n" +
                        "                 Dilution in Water (Liter) – Nill\n" +
                        "Waiting Period (days) :  Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Carbofuran 03.00% CGe Of \n" +
                        "Name Of The Pest : Ear cockle nematode\n" +
                        "Dosage/ha : \n" +
                        "                 a.i (Active ingredients) (gm) – 3000.0 \n" +
                        "                 Formulation (gm/ml) – 10000 \n" +
                        "                 Dilution in Water (Litre) – Nill \n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Cypermethrin 10.00% EC\n" +
                        "Name Of The Pest : Shoot fly\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 50.00\n" +
                        "                 Formulation (gm/ml) –550\n" +
                        "                 Dilution in Water (Liter) – 500-800\n" +
                        "Waiting Period (days) : 14\n" +
                        "\n" +
                        "Name Of The Pesticide : Dichlorvos 76.00% EC\n" +
                        "Name Of The Pest : Caterpillar\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 500.0\n" +
                        "                 Formulation (gm/ml) –627.0\n" +
                        "                 Dilution in Water (Liter) – 500-1000\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Fipronil 00.30% GR\n" +
                        "Name Of The Pest : Termites\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 0.06\n" +
                        "                 Formulation (gm/ml) –20kg\n" +
                        "                 Dilution in Water (Liter) – Nill\n" +
                        "Waiting Period (days) : 91\n" +
                        "\n" +
                        "Name Of The Pesticide : Phorate 10.00% CG\n" +
                        "Name Of The Pest : Shoot fly\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 1875.0\n" +
                        "                 Formulation (gm/ml) –18750\n" +
                        "                 Dilution in Water (Liter) – Nill\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Thiamethoxam 30.00% FS\n" +
                        "Name Of The Pest : Termites\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 01.0\n" +
                        "                 Formulation (gm/ml) – 3.3 \n" +
                        "                 Dilution in Water (Liter) – Nill\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Thiamethoxam 70.00% WS\n" +
                        "Name Of The Pest : Termite, Aphids\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 121.0\n" +
                        "                 Formulation (gm/ml) – 175\n" +
                        "                 Dilution in Water (Liter) – Nill\n" +
                        "Waiting Period (days) : Nill\n");
            }
        });

        fungicide.addActionListener(e -> {
            scroll.setVisible(true);
            if(chooseCrop.getSelectedItem().equals("Paddy")) {
                information.setText("\n" + "" +
                        "Name Of The Pesticide : Aureofungin 46.15% w/v SP\n" +
                        "Name Of The Pest       : Blast, Brown leaf spot\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 500.0-750.0\n" +
                        "\tFormulation (g/ml)/%        –  0.005%\n" +
                        "\tDilution in Water (Liter)     –  500\n" +
                        "Waiting Period (days) : 30\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Captan 75% WP\n" +
                        "Name Of The Pest        : Leaf spot\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 750\n" +
                        "\tFormulation (g/ml) / %      –  1000 g\n" +
                        "\tDilution in Water (Liter)     –  750\n" +
                        "Waiting Period (days) :Nil\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Carbendazim 5% GR \n" +
                        "Name Of The Pest        : Brown leaf spot\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 0.62 kg\n" +
                        "\tFormulation (g/ml) / %      –  12.5 kg\n" +
                        "\tDilution in Water (Liter)     –  Nil\n" +
                        "Waiting Period (days) : Nil\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Carpropamid 27.8% SC\n" +
                        "Name Of The Pest : Blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 0.03%\n" +
                        "\tFormulation (g/ml) / % –  0.1%\n" +
                        "\tDilution in Water (Liter) –  300-500 depending upon crop stage\n" +
                        "Waiting Period (days) : Nil\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Copper Hydroxide 53.8% DF\n" +
                        "Name Of The Pest : False smut, Bacterial leaf blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 525\n" +
                        "\tFormulation (g/ml) / % –  1500\n" +
                        "\tDilution in Water (Liter) –  500\n" +
                        "Waiting Period (days) : 10\t\n" +
                        "\n" +
                        "Name Of The Pesticide : Difenoconazole 25% EC\n" +
                        "Name Of The Pest : Sheath blight \n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 0.0125% or 12.5g/100 ltr. water\n" +
                        "\tFormulation (g/ml) / % –  0.05% or 50 ml/100 ltr. water\n" +
                        "\tDilution in Water (Liter) –  500\n" +
                        "Waiting Period (days) : 25\n" +
                        "\n" +
                        "Name Of The Pesticide : Ediphenphos 50% EC\n" +
                        "Name Of The Pest : Blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 250-300\n" +
                        "\tFormulation (g/ml) / % –  500-600\n" +
                        "\tDilution in Water (Liter) – 750-1000\n" +
                        "Waiting Period (days) : 21\n" +
                        "\n" +
                        "Name Of The Pesticide : Flusilazole 40% EC\n" +
                        "Name Of The Pest : Sheath blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 120\n" +
                        "\tFormulation (g/ml) / % –  300 \n" +
                        "\tDilution in Water (Liter) – 500\n" +
                        "Waiting Period (days) : 24\n" +
                        "\n" +
                        "Name Of The Pesticide : Iprodione 50% WP\n" +
                        "Name Of The Pest : Alternaria blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 1125\n" +
                        "\tFormulation (g/ml) / % –  2250\n" +
                        "\tDilution in Water (Liter) – 750\n" +
                        "Waiting Period (days) : 35\t\n" +
                        "Name Of The Pesticide : Isoprothiolane 40% EC \n" +
                        "Name Of The Pest : Blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 300\n" +
                        "\tFormulation (g/ml) / % –  750\n" +
                        "\tDilution in Water (Liter) – 500-1000\n" +
                        "Waiting Period (days) : 60\n" +
                        "\n" +
                        "Name Of The Pesticide : Kasugamycin 3% SL\n" +
                        "Name Of The Pest : Blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 30-50\n" +
                        "\tFormulation (g/ml) / % –  1000-1500\n" +
                        "\tDilution in Water (Liter) – 750-1000\n" +
                        "Waiting Period (days) : 30\n" +
                        "\n" +
                        "Name Of The Pesticide : Kitazin 48% EC\n" +
                        "Name Of The Pest : Blast, Sheath blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 0.10% or 100 gram in 100 ltr. of water\n" +
                        "\tFormulation (g/ml) / % –  0.20% or 200 ml in 200 lit.of water\n" +
                        "\tDilution in Water (Liter) – As required depending upon crop stage and plant protection equipment used\n" +
                        "Waiting Period (days) : 15\n" +
                        "\n" +
                        "Name Of The Pesticide : Mancozeb 75% WP\n" +
                        "Name Of The Pest : Blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) –  1250-1500\n" +
                        "\tFormulation (g/ml) / % –  1500-2000\n" +
                        "\tDilution in Water (Liter) – 750\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Pencycuron 22.9% SC\n" +
                        "Name Of The Pest : Sheath blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) –  150-187.5\n" +
                        "\tFormulation (g/ml) / % –  600-750\n" +
                        "\tDilution in Water (Liter) – 500\n" +
                        "Waiting Period (days) : 69\n" +
                        "\n" +
                        "Name Of The Pesticide : Picoxystrobin 22.52% w/w SC\n" +
                        "Name Of The Pest : Rice blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) –  150\n" +
                        "\tFormulation (g/ml) / % –  600\n" +
                        "\tDilution in Water (Liter) – 500\n" +
                        "Waiting Period (days) : 12\n" +
                        "\n" +
                        "Name Of The Pesticide : Propiconazole 25% EC\n" +
                        "Name Of The Pest : Sheath blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) –  125\n" +
                        "\tFormulation (g/ml) / % –  500\n" +
                        "\tDilution in Water (Liter) – 750\n" +
                        "Waiting Period (days) : 30\n" +
                        "\n" +
                        "Name Of The Pesticide : Propineb 70% WP\n" +
                        "Name Of The Pest : Brown leaf spot and Narrow leaf spot\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) –  1050 to 1400\n" +
                        "\tFormulation (g/ml) / % –  1500 to 2000\n" +
                        "\tDilution in Water (Liter) – Use 500 Litre spray volume/hectare\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Pyraclostrobin 100 g/l CS\n" +
                        "Name Of The Pest : Blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) –  100\n" +
                        "\tFormulation (g/ml) / % –  1000\n" +
                        "\tDilution in Water (Liter) – 500\n" +
                        "Waiting Period (days) : 18\n" +
                        "\n" +
                        "Name Of The Pesticide : (Streptomycin Sulphate 90% + Tetracylin Hydrocloride 10%) SP\n" +
                        "Name Of The Pest : Bacteria l Leaf blight\n" +
                        "Dosage/ha :\n" +
                        "\tSeeds treatment: \n" +
                        "Prepare streptocycline 40 ppm solution and soak seeds for 12hours at room temperature before sowing\n" +
                        "Seedling treatment: \n" +
                        "Dip the seeding in streptocycline 40 to100 ppm solution. The antibiotic will be absorbed through the injured roots and penetrate the vascular bundles insides the seedlings.\n" +
                        "\tSpray: \n" +
                        "Spray streptocycline 100 to 150 ppm solution at early root stage. Second spray, if necessary before grain set\n" +
                        "Waiting Period (days) : Nil\n" +
                        "\n" +
                        "Name Of The Pesticide : Tebuconazole 25.9% EC\n" +
                        "Name Of The Pest : Blast, Sheath blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 0.1875 kg\n" +
                        "\tFormulation (g/ml) / % –  0.750 lit\n" +
                        "\tDilution in Water (Liter) – 500\n" +
                        "Waiting Period (days) : 1\n" +
                        "\n" +
                        "Name Of The Pesticide : Thifluzamide 24% SC\n" +
                        "Name Of The Pest : Sheath blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 90\n" +
                        "\tFormulation (g/ml) / % –  375 \n" +
                        "\tDilution in Water (Liter) – 500\n" +
                        "Waiting Period (days) : 28\n" +
                        "\n" +
                        "Name Of The Pesticide : Thiram 75% WS\n" +
                        "Name Of The Pest : Seed born disease\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 18.8-22.5\n" +
                        "\tFormulation (g/ml) / % –  25-30 \n" +
                        "\tDilution in Water (Liter) – 1\n" +
                        "Waiting Period (days) : 7-10\n" +
                        "\n" +
                        "Name Of The Pesticide : Tricyclazole 75% WP\n" +
                        "Name Of The Pest : Blast\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 225- 300\n" +
                        "\tFormulation (g/ml) / % –  300-400\n" +
                        "\tDilution in Water (Liter) – 500\n" +
                        "Waiting Period (days) : 30\n" +
                        "\n" +
                        "Name Of The Pesticide : Validamycin 3% L\n" +
                        "Name Of The Pest : Sheath Blight\n" +
                        "Dosage/ha :\n" +
                        "\ta.i (Active Ingredients) (g) – 60\n" +
                        "\tFormulation (g/ml) / % –  2000\n" +
                        "\tDilution in Water (Liter) – 750\n" +
                        "Waiting Period (days) : There should be no residue s on grains and straw of paddy 14 days before the harvest\n");
            }
            else if(chooseCrop.getSelectedItem().equals("Wheat")) {
                information.setText("\n" + "" +
                        "Name Of The Pesticide : Bitertanol 25% WP\n" +
                        "Name Of The Pest        : Karnal bunt\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) – 560 \n" +
                        "                 Formulation (gm)                – 2240\n" +
                        "                 Dilution in Water (Liter)       – 750\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Carbendazim 50% WP\n" +
                        "Name Of The Pest       : Loose smut\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) –1gm/kg seed\n" +
                        "                 Formulation                – 2 gm/kg seed\n" +
                        "                 Dilution in Water          – 1Lit./10 kg seed\n" +
                        "Waiting Period (days) : (wet slurry treatment)\n" +
                        "\n" +
                        "Name Of The Pesticide : Carboxin 75% WP\n" +
                        "Name Of The Pest       : Flag smut, Loose smut, Bunt\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 1.5 -1.875 gm/ kg seed\n" +
                        "        Formulation                – 2-2.5 gm/ kg seed\n" +
                        "        Dilution in Water         – Nill\n" +
                        "Waiting Period (days) : Only one time seed treatment required\n" +
                        "\n" +
                        "Name Of The Pesticide : Difenoconazole 3% WS\n" +
                        "Name Of The Pest : Loose smut\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 6.0\n" +
                        "        Formulation – 200\n" +
                        "        Dilution in Water– This is used as seed dresser\n" +
                        "Waiting Period (days) : This is used as seed dresser\n" +
                        "\n" +
                        "Name Of The Pesticide : Mancozeb 75% WP\n" +
                        "Name Of The Pest : Brown& black rust, Blight\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 1.125-1.5 kg\n" +
                        "        Formulation – 1.5-2kg\n" +
                        "        Dilution in Water– 750 Ltr\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Triticonazole 80 g/l + Pyraclostrobin 40 g/l (w/v) FS\n" +
                        "Name Of The Pest : Loose smut \n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 0.12\n" +
                        "        Formulation – 1.0\n" +
                        "        Dilution in Water– Sufficient to coat the seeds uniformly\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Pyraclostrobin 133 g/l + Epoxiconazole 50g/l SE\n" +
                        "Name Of The Pest : Yellow rust\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 137.25\n" +
                        "        Formulation – 750\n" +
                        "        Dilution in Water– 500\n" +
                        "Waiting Period (days) : 47\n" +
                        "\n" +
                        "Name Of The Pesticide : Picoxystrobin 7.05% + Propiconazole 11.7% SC\n" +
                        "Name Of The Pest : Yellow Rust (Puccinia striiformis sp.)\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 200\n" +
                        "        Formulation – 1000\n" +
                        "        Dilution in Water– 500\n" +
                        "Waiting Period (days) : 52\n" +
                        "\n" +
                        "Name Of The Pesticide : Imidacloprid 18.5% + Hexaconazole 1.5% FS\n" +
                        "Name Of The Pest : Smut, Rust, Termites, Aphids\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 37:3\n" +
                        "        Formulation – 200\n" +
                        "        Dilution in Water– Nill\n" +
                        "Waiting Period (days) : This is used as seed dresser.\n" +
                        "\n" +
                        "Name Of The Pesticide : Carbendazim 25%+ Mancozeb 50% WS\n" +
                        "Name Of The Pest : Loose smut\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – (7.5+15) to (8.75+17.5)\n" +
                        "        Formulation – 30-35\n" +
                        "        Dilution in Water–0.1\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Azoxystrobin 11% + Tebuconazole 18.3% w/w SC \n" +
                        "Name Of The Pest : Yellow Rust\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 82.5+137.25\n" +
                        "        Formulation – 750\n" +
                        "        Dilution in Water–500\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Azoxystrobin 18.2% + Difenoconazole 11.4% w/w SC\n" +
                        "Name Of The Pest : Rust & Powdery mildew\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 0.03% or 0.3 g/l\n" +
                        "        Formulation – 0.1% or 1 ml / Litre water\n" +
                        "        Dilution in Water–500\n" +
                        "Waiting Period (days) : 35\n" +
                        "\n" +
                        "Name Of The Pesticide : Azoxystrobin 18.2% w/w + Cyproconazole 7.3% w/w SC\n" +
                        "Name Of The Pest : Rust, Powdery mildew\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 0.26\n" +
                        "        Formulation – 01\n" +
                        "        Dilution in Water–500\n" +
                        "Waiting Period (days) : 50\n" +
                        "\n" +
                        "Name Of The Pesticide : Sulfosulfuran 75%+ Metsulfuron Methyl 5%WG\n" +
                        "Name Of The Pest : Phalaris minor, Chenopodium sp., Medicago denticulata, Coronopos dedymus, Rumex spp. Melilotus alba, Anagallis arvensis\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – (30+2)\n" +
                        "        Formulation – 40 gm\n" +
                        "        Dilution in Water– 250-500 + surfactant 1250 ml/ha\n" +
                        "Waiting Period (days) : 110\n" +
                        "\n" +
                        "Name Of The Pesticide : Pendimethalin 35% + Metribuzin 3.5% w/w SE\n" +
                        "Name Of The Pest : Canary grass (Phalaris minor), Wild Oat (Avena ludoviciana), Lamb's quarters (Chenopodium album), Field bindweed (Convolvulus arvensis), Swine Cress (Coronopus didymus), Burmuda grass (Cyanadon doctylon)\n" +
                        "Dosage/ha :\n" +
                        "        a.i (Active ingredients) – 875 +87.5 to 1050 + 105 gm\n" +
                        "        Formulation – 2.5-3.0\n" +
                        "        Dilution in Water– 500\n" +
                        "Waiting Period (days) : 123\n");
            }
        });

        herbicide.addActionListener(e -> {
            scroll.setVisible(true);
            if(chooseCrop.getSelectedItem().equals("Paddy")) {
                information.setText("\n" + "" +
                        "Name Of The Herbicide : Anilofos 30% EC\n" +
                        "Weed Species               : Echinochloa crusgalli, Echinochloa colonum , Cyperus difformis, Cyperus iria, Eclipta alba, Ischaemum rugosum,  Fimbristylis sp. Marsilea quadrifoliata\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 0.3-0.45 kg\n" +
                        "\tFormulation (g/ml)                  : 1-1.5 ltrs.\n" +
                        "Dilution in Water : 375-500\n" +
                        "Waiting  Period   : 30\n" +
                        "\n" +
                        "Name Of The Herbicide : Azimsulfuron 50% DF\n" +
                        "Weed Species: Enchinochloa colonum, E. crusgalli, Cyperus spp., Fimbristylis miliacea, Ludwigia parviflora, Eclipta alba, Bergia capensis, Marsilea quadrifoliata, Ammania baccifera, Sphenoclea zeylanica\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 35\n" +
                        "\tFormulation (g/ml) : 70\n" +
                        "Dilution in Water : 300 \n" +
                        "Waiting  Period : 59\n" +
                        "\n" +
                        "Name Of The Herbicide : Bensulfuron Methyl 60% DF\n" +
                        "Weed Species: Marsilea quadrifoliata Eclipta alba, Ammania baccifera Ludwigia parviflora Sphenoclea Zeylenica , Monochoria vaginalis , Alternanthera sessillis Cyperus iria , Cyperus difformis , Fimbristylis miliacea, Scirpus royeli \n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 60 \n" +
                        "\tFormulation (g/ml) : 100 gm\n" +
                        "Dilution in Water : 300 ltrs\n" +
                        "Waiting  Period : 88 \n" +
                        "\n" +
                        "Name Of The Herbicide : Bentazone 480 g/l SL\n" +
                        "Weed Species: Cyperus rotundus Cyperus diformis Ludwigia sps. Eclipla alba Echinocloa colanum Echinocloa crusgali\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 960 \n" +
                        "\tFormulation (g/ml) : 2000\n" +
                        "Dilution in Water : 500\n" +
                        "Waiting  Period : 71\n" +
                        "\n" +
                        "Name Of The Herbicide : Clomazone 50%EC\n" +
                        "Weed Species: Echinochloa crusgalli Echinochloa colonum Cyperus difformis Cyperus iria, Ludwigia parviflora ,Eclipta alba\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 0.4 - 0.5kg\n" +
                        "\tFormulation (g/ml) : 0.8-1.0 ltr\n" +
                        "Dilution in Water : 500-750\n" +
                        "Waiting  Period : 90\n" +
                        "\n" +
                        "Name Of The Herbicide : 2,4-D Ethyl Ester 38 % EC (having 2,4-D acid 34 % w/w)\n" +
                        "Weed Species: Echinochloa colonum, Echinochloa crusgalli\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 0.85 kg\n" +
                        "\tFormulation (g/ml) : 2.5 \n" +
                        "Dilution in Water : 400\n" +
                        "Waiting  Period : Nil\n" +
                        "\n" +
                        "Name Of The Herbicide : Ethoxysulfuron 15% WDG\n" +
                        "Weed Species: Fimbristylis miliacea Cyperus iria , Cyperus difformis, Scirpus sp., Eclypta alba, Marsilea quadrifoliata, Ammania baccifera, Monochoria vaginallis\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 12.5-15gm\n" +
                        "\tFormulation (g/ml) : 83.3- 100gm \n" +
                        "Dilution in Water : 500\n" +
                        "Waiting  Period : 110\n" +
                        "\n" +
                        "Name Of The Herbicide : Fenoxaprop-p-ethyl 9.3% w/w EC (9% w/v) \n" +
                        "Weed Species: Echinochloa crusgalli, Echinochloa colona\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 56.25 gm\n" +
                        "\tFormulation (g/ml) : 625 ml. (10-15 DAT)\n" +
                        "Dilution in Water : 300-375\n" +
                        "Waiting  Period : 70\n" +
                        "\n" +
                        "Name Of The Herbicide : Flucetosulfuron 10% WG \n" +
                        "Weed Species: Echinochloa colonum , Echinolchloa crusgalli, Digitaria sanguinalis,  Paspalum discichum, Paspalum scrobitulatum,  Leersia hexandra, Panicum repens,  Setaria glauca, Dinebra retroflexa, Cyprus difformis, Cyprus iria, Fimbristylis miliaceae,  Alternanthera, philoxeroides, Alternanthera sessilis, Marsilea quadrifolia, Ammania baccifera, Eclipta alba, Eclipta prostrate, Monochoria vaginalis, Lindernia ciliate, Ludwigia parviflora, Sphenoclea zeylanica, Commelina diffusa, Cyanotis axillaris\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 25\n" +
                        "\tFormulation (g/ml) : 250 \n" +
                        "Dilution in Water : 500\n" +
                        "Waiting  Period : 90\n" +
                        "\n" +
                        "Name Of The Herbicide : MCPA, Amine salt 40% WSC\n" +
                        "Weed Species: Cyperus rotundus, Impmoea reptans, Ammania baccifera, Lippia nodiflora, Alternanthera sp. Ludwigia parviflora, Marsilea quadrifoliata\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 0.8-2.0 kg\n" +
                        "\tFormulation (g/ml) : 2-5\n" +
                        "Dilution in Water : 400-600\n" +
                        "Waiting  Period : Nil\n" +
                        "\n" +
                        "Name Of The Herbicide : MCPA Orthosulfamuron 50% WG\n" +
                        "Weed Species: Echinocloa spp. (Barnyard grass), Cyperus spp. (Nut grass), Scirpus spp. Ludwigia parviflora (water crest), Fimbristylis spp. (Hoora grass), Rotala spp.\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 60-75\n" +
                        "\tFormulation (g/ml) : 150 (3 DAT)\n" +
                        "Dilution in Water : 500\n" +
                        "Waiting  Period : 65\n" +
                        "\n" +
                        "Name Of The Herbicide : Oxadiargyl 80% WP\n" +
                        "Weed Species: Echinochloa crusgalli E. Colonum, Cyperus iria, C. difformis, Eclipta alba, Ludwigia quadrifoliata\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 100\t\n" +
                        "\tFormulation (g/ml) : 125\n" +
                        "Dilution in Water : 500\n" +
                        "Waiting  Period : 97\n" +
                        "\n" +
                        "Name Of The Herbicide : Pretilachlor 37%EW\n" +
                        "Weed Species: Echinochloa crusgalli, Echinochloa colonum, Cyperus difformis, Cyperus iria, Digitaria sanguinalis, Fimbristylis miliacae, Eclipta alba, Ludwigia parviflora, Monochoria vaginalis.\n" +
                        " Dosage/ha :\n" +
                        "\ta.i. (Active Ingredients) (g/kg) : 0.60-0.75 kg\n" +
                        "\tFormulation (g/ml) : 1.5-1.875 ltrs.\n" +
                        "Dilution in Water : 500\n" +
                        "Waiting  Period : 90\n");
            }
            else if(chooseCrop.getSelectedItem().equals("Wheat")) {
                information.setText("\n" + "" +
                        "Name Of The Pesticide : Carfentrazone ethyl 40% DF\n" +
                        "Weed species: Chenopodium album, Melilotus Indica, Melilotus alba, Medicago denticulata, Lathyrus aphaca, Analgalis arvensis, Vicia sativa, Circium arvense, Rumex sp, Malwa sp. \n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 20gm\n" +
                        "                 Formulation (gm/ltr) – 50gm\n" +
                        "                 Dilution in Water (Litres) – 400\n" +
                        "Waiting Period (days) : 80\n" +
                        "\n" +
                        "Name Of The Pesticide : D Dimethyl Amine salt 58% SL\n" +
                        "Weed species: Leucas aspera, Chenopodium album, Vicia sativa, Argemone maxicana, Fimbristylis miliacea, Anagalis arvensis, Amaranthus spinosus\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 0.5-0.84 kg.\n" +
                        "                 Formulation (gm/ltr) – 0 0.625-1.0.86\n" +
                        "                 Dilution in Water (Litres) –500\n" +
                        "Waiting Period (days) : 90\n" +
                        "\n" +
                        "Name Of The Pesticide : Diclofop Methyl 28% EC\n" +
                        "Weed species: Avena fatua, Phalaris minor\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 0.7-1.0 kg\n" +
                        "                 Formulation (gm/ltr) – 2.5-3.5 ltr\n" +
                        "                 Dilution in Water (Litres) –500\n" +
                        "Waiting Period (days) : 90\n" +
                        "\n" +
                        "Name Of The Pesticide : Fenoxaprop-p-ethyl 10% EC \n" +
                        "Weed species: Phalaris Minor\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 100-120gm\n" +
                        "                 Formulation (gm/ltr) – 1.0-1.20 kg\n" +
                        "                 Dilution in Water (Litres) – 250-300\n" +
                        "Waiting Period (days) : 110\n" +
                        "\n" +
                        "Name Of The Pesticide : Flumioxazin 50% SC\n" +
                        "Weed species: Runnex spp., Medicago denticulate, Coronopus didymus, Chenopodium album, Phalaris minor, Avena fatua\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 125 g.a.i/ha\n" +
                        "                 Formulation (gm/ltr) – 250 ml/ha\n" +
                        "                 Dilution in Water (Litres) – 500\n" +
                        "Waiting Period (days) : 137\n" +
                        "\n" +
                        "Name Of The Pesticide : Isoproturon 50% WP\n" +
                        "Weed species: Phalaris minor Avena fatua Poa annua\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 1.0kg\n" +
                        "                 Formulation (gm/ltr) – 2.0\n" +
                        "                 Dilution in Water (Litres) – 750\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Isoproturon 75% WP\n" +
                        "Weed species: Phalaris minor Avena fatua Poa annua\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 1.0kg\n" +
                        "                 Formulation (gm/ltr) – 1.33 kg\n" +
                        "                 Dilution in Water (Litres) – 750\n" +
                        "Waiting Period (days) : 60\n" +
                        "\n" +
                        "Name Of The Pesticide : MCPA, Amine salt 40% WSC\n" +
                        "Weed species: Chenopodium album, Asphodelus tenuifolius Fumaria parviflora Carthamus oxyacantha Launea sp., Pluchia lanceolata, Melilotus indica, Vicia hirsuta, Lathyrus aphaca, Medicago denticulata, M. lupulina, Spergula arvensis, Argemone maxicana, Phyllathus niruri.\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 1.0 kg\n" +
                        "                 Formulation (gm/ltr) – 2.5\n" +
                        "                 Dilution in Water (Litres) – 300-600\n" +
                        "Waiting Period (days) : Nill\n" +
                        "\n" +
                        "Name Of The Pesticide : Methabenzthiazuron 70% WP\n" +
                        "Weed species: Phalaris minor, Avena fatua, Avena ludoviciana, Poa annua.\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) – 1.05-1.4kg\n" +
                        "                 Formulation (gm/ltr) – 1.5-2.0 kg\n" +
                        "                 Dilution in Water (Litres) – 700-1000\n" +
                        "Waiting Period (days) : 100\n" +
                        "\n" +
                        "Name Of The Pesticide : Methabenzthiazuron 70% WP\n" +
                        "Weed species: Polypogom monspliensis, Anagallis arvensis, Chenopodium album\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) --1.05-1.75kg\n" +
                        "                 Formulation (gm/ltr) – 2.0-2.5 kg\n" +
                        "                 Dilution in Water (Litres) – 700-1000\n" +
                        "Waiting Period (days) : 100\n" +
                        "\n" +
                        "Name Of The Pesticide : Methabenzthiazuron 70% WP\n" +
                        "Weed species: Phalaris minor, Avena fatua, Avena ludoviciana, Chenopodium album\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) -- 0.7-0.87 kg \n" +
                        "                 Formulation (gm/ltr) – 1.0-1.25 kg\n" +
                        "                 Dilution in Water (Litres) – 700-1000\n" +
                        "Waiting Period (days) : 100\n" +
                        "\n" +
                        "Name Of The Pesticide : Metribuzin 70% WP\n" +
                        "Weed species: Phalaris minor Chenopodium album Melilotus spp.\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) -- Medium soil-0.175kg Heavy soil - 0.21kg\n" +
                        "                 Formulation (gm/ltr) – 0.25 kg 0.30 kg\n" +
                        "                 Dilution in Water (Litres) – 500-750\n" +
                        "Waiting Period (days) : 120\n" +
                        "\n" +
                        "Name Of The Pesticide : Metsulfuron Methyl 20% WP\n" +
                        "Weed species: Chenopodium album, Melilotus indica, Lathyrus aphaca, Anagallis arvensis, Vicia sativa, Cirsium arvense.\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) -- 4 gm\n" +
                        "                 Formulation (gm/ltr) – 20 gm \n" +
                        "                 Dilution in Water (Litres) – 500-600 + Surfactant (Iso-Octyl PhenoxylPoloxethano l 12.5%)@ 500 ml/ha\n" +
                        "Waiting Period (days) : 80\n" +
                        "\n" +
                        "Name Of The Pesticide : Metsulfuron Methyl 20% WG\n" +
                        "Weed species: Chenopodium album Melilotus indioca Melilotus alba Lathyrus aphaca Anagalis arvensis Vicia sativa Rumex denticulate Convolvulus arvensis Meedicago denticulate\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) -- 4 gm\n" +
                        "                 Formulation (gm/ltr) – 20 gm \n" +
                        "                 Dilution in Water (Litres) – 500-600 + Surfactant (Iso-Octyl PhenoxylPoloxethano l 12.5%)@ 500 ml/ha\n" +
                        "Waiting Period (days) : 76\n" +
                        "\n" +
                        "Name Of The Pesticide : Pendimethalin 35% + Metribuzin 3.5% w/w SE\n" +
                        "Weed species: Canary grass (Phalaris minor), Wild Oat (Avena ludoviciana), Lamb's quarters (Chenopodium album), Field bindweed (Convolvulus arvensis), Swine Cress (Coronopus didymus), Burmuda grass (Cyanadon doctylon)\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) -- 875 +87.5 to 1050 + 105 gm\n" +
                        "                 Formulation (gm/ltr) – 2.5-3.0\n" +
                        "                 Dilution in Water (Litres) – 500 \n" +
                        "Waiting Period (days) : 123\n" +
                        "\n" +
                        "Name Of The Pesticide : Metsulfuron Methyl 10% + Carfentrazone ethyl 40% DF \n" +
                        "Weed species: Rumex dentatus Rumex spinosus Medicago denticulate Malva parviflora Lathyrus aphaca Chenopodium album Melilotus alba Melilotus indica Anagallis arvensis Solanum nigrum Vicia sativa Convolvulus arvensis \n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm/ Kg) -- 25\n" +
                        "Formulation (gm/ltr) –  50 \n" +
                        "Dilution in Water (Litres) – 300 \n" +
                        "Waiting Period (days) : 100\n");
            }
        });

        plantGrowthRegulator.addActionListener(e -> {
            scroll.setVisible(true);
                information.setText("\nName of the PGR : Gibberellic Acid 0.001%L\n" +
                        "Time of application : \n" +
                        "\tShort duration varieties 20- 25DAT\n" +
                        "\tMedium duration varieties 30-35 DAT\n" +
                        "\tLong duration varieties 40-45 DAT\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. Active Ingredients (ppm/g/%) : 0.018\n" +
                        "\tFormulation (ml/g/%) : 180\n" +
                        "Dilution in water : 450-500\n" +
                        "Waiting Period : Nil\n" +
                        "\n" +
                        "Name of the PGR : Gibberellic Acid 40% WSG \n" +
                        "Time of application : 20-25 Days After Transplanting \n" +
                        "Dosage/ha :\n" +
                        "\ta.i. Active Ingredients (ppm/g/%) : 20-25\n" +
                        "\tFormulation (ml/g/%) : 20-62.5\n" +
                        "Dilution in water : 500\n" +
                        "\n" +
                        "Waiting Period : Nil\n" +
                        "Time of application : At Panicle emergence \n" +
                        "Dosage/ha :\n" +
                        "\ta.i. Active Ingredients (ppm/g/%) : 20-25\n" +
                        "\tFormulation (ml/g/%) : 50-62.5\n" +
                        "Dilution in water : 500\n" +
                        "Waiting Period : Nil\n" +
                        "\n" +
                        "Name of the PGR : Triacontanol 0.05% EC \n" +
                        "Time of application : Three sprays at 25, 45 and 65 days after transplanting\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. Active Ingredients (ppm/g/%) 0.125\n" +
                        "\tFormulation (ml/g/%) : 0.25ltr\n" +
                        "Dilution in water : 400-500\n" +
                        "Waiting Period : Nil\n" +
                        "\n" +
                        "Name of the PGR : Triacontanol 0.05%w/w min. GR\n" +
                        "Time of application : Broadcast & mix the desired quantity of granules in soil 2-3 days before transplanting.\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. Active Ingredients (ppm/g/%) : 12.5\n" +
                        "\tFormulation (ml/g/%) : 25 kg\n" +
                        "Dilution in water : Nil\n" +
                        "Waiting Period : Nil\n" +
                        "\n" +
                        "Name of the PGR : Triacontanol 0.1% EW\n" +
                        "Time of application : Three sprays at 25, 45 and 65 days after transplanting.\n" +
                        "Dosage/ha :\n" +
                        "\ta.i. Active Ingredients (ppm/g/%) : 0.25 \n" +
                        "\tFormulation (ml/g/%) : 0.25 ltr.\n" +
                        "Dilution in water : 400-500\n" +
                        "Waiting Period : Nil");
        });

        bioFungicide.addActionListener(e -> {
            scroll.setVisible(true);
            if(chooseCrop.getSelectedItem().equals("Paddy")) {
                information.setText("\n" +
                        "Name of Bio-Fungicide : Pseudomonas fluorescens 2.0% AS\n" +
                        "Name of the disease   : Bacterial leaf blight (Xanthomonas oryzae pv. oryzae)\n" +
                        "\n\t\tSeedling Root Dip Treatment\n" +
                        "Dosage/ha :\n" +
                        "\ta.i.(Activated Ingredients) (g) : Nil\n" +
                        "\tFormulation (g/ml)/%             : 10 ml/litre of water\n" +
                        "Dilution in water (liter/ha) :  \n" +
                        "\tMix 10 ml of 3 Pseudomonas fluorescens 2.0% AS in one litre of water and dip the paddy seedling root for 30 minutes before transplanting followed by foliar application after 40-45 days of transplantation\n" +
                        "Waiting Period (Days)        : Nil\n" +
                        "\n\t\tFoliar Spray\n" +
                        "Dosage/ha :\n" +
                        "\ta.i.(Activated Ingredients) (g) : Nil\n" +
                        "\tFormulation (g/ml)/%            : 1.87-2.50 litre/ha\n" +
                        "Dilution in water (liter/ha) :  \n" +
                        "\tSuspend 1.87 to 2.50 litre of Pseudomonas fluorescens2.0% AS in 500 litre of water and spray uniformly after 40-45 days of transplantation over one hectare land 2-3 spray are required depending upon the disease incidence at interval of 10- 12 days using a hand operated Knapsack sprayer or power sprayer fitted with a hollow cone nozzle.\t\n" +
                        "Waiting Period (Days)        : Nil\n" +
                        "\n" +
                        "Name of Bio-Fungicide : Trichoderma viride 1.0% WP\n" +
                        "Name of the disease   : Sheath blight (Rhizoctonia solani)\n" +
                        "\n\t\tFoliar Spray\n" +
                        "Doseage/ha :\n" +
                        "\ta.i.(Activated Ingredients) (g) : Nil\n" +
                        "\tFormulation (g/ml)/%            : 5-10 gm/litre of water\n" +
                        "Dilution in water (liter/ha) :  \n" +
                        "\tMix 2.5 kg of Trichoderma - 14 viride 1.0% WP in 500 litres of water. Spray three times at 15 days interval uniformly over one hectare land 30 days after planting\t\n" +
                        "Waiting Period (Days)        : Nil\n" +
                        "\n" +
                        "Name of Bio-Fungicide : Bacillus subtilis 2.0% AS\n" +
                        "Name of the disease   : Bacterial leaf blight (Xanthomonas oryzae pv. oryzae)\n" +
                        "\n\t\tSeedling Root Dip Treatment\n" +
                        "Doseage/ha :\n" +
                        "\ta.i.(Activated Ingredients) (g) : Nil\n" +
                        "\tFormulation (g/ml)/%            : 10 ml/litre of water\n" +
                        "Dilution in water (liter/ha) :  \n" +
                        "\tMix 10 ml of Bacillus subtilis 2.0% AS in one litre of water and dip the paddy seedling root for 30 minutes before transplanting followed by foliar application.\t\n" +
                        "Waiting Period (Days)        : Nil\n" +
                        "\n\t\tFoliar Spray\n" +
                        "Doseage/ha :\n" +
                        "\ta.i.(Activated Ingredients) (g) : Nil\n" +
                        "\tFormulation (g/ml)/%            : 1.87-2.50 litre/ha\n" +
                        "Dilution in water (liter/ha) :  \n" +
                        "\tSuspend 1.87 to 2.50 litre of Bacillus subtilis 2.0% AS in 500 litre of water and spray uniformly after Nil 21 40-45 days of transplantation over one hectare land 2-3 spray are required depending upon the disease incidence at interval of 10- 12 days using a hand operated Knapsack sprayer or power sprayer fitted with a hollow cone nozzle. \n" +
                        "Waiting Period (Days)        : Nil\n" +
                        "\n" +
                        "Name of Bio-Fungicide : Trichoderma harzianum 2.0% AS\n" +
                        "Name of the disease   : Bakane (Foot rot) (Fusarium moniliforme) \n" +
                        "\n\t\tSeedling Root Dip Treatment\n" +
                        "Doseage/ha :\n" +
                        "\ta.i.(Activated Ingredients) (g) : Nil\n" +
                        "\tFormulation (g/ml)/%            : 30 ml/litre of wate\n" +
                        "Dilution in water (liter/ha) :  \n" +
                        "\tMix 30 ml of Trichoderma harzianum 2.0% AS in one litre of water and dip the paddy seedling root for 30 minutes before transplanting followed by Soil treatment. \n" +
                        "Waiting Period (Days)        : Nil\n" +
                        "\n\t\tSoil Treatment\n" +
                        "Doseage/ha :\n" +
                        "\ta.i.(Activated Ingredients) (g) : Nil\n" +
                        "\tFormulation (g/ml)/%            : 2.5 litre/ha \n" +
                        "Dilution in water (liter/ha) :  \n" +
                        "\tMix 2.5 litre of Trichoderma harzianum 2.0% AS with 100 kg of properly Nil 22 decomposed FYM and broadcast uniformly over a hectare of land prior to transplanting. \n" +
                        "Waiting Period (Days)        : Nil\n");
            }
            else if(chooseCrop.getSelectedItem().equals("Wheat")) {
                information.setText("\n" + "" +
                        "Name Of The Pesticide : Pseudomonas Fluorescens 1.75% WP\n" +
                        "Name Of The Pest        : Loose smut\n" +
                        "Dosage/ha :\n" +
                        "                 a.i (Active ingredients) (gm) –  Nill\n" +
                        "                 Formulation (gm/ml)            – 5\n" +
                        "                 Dilution in Water (Liter)        – 1000\n" +
                        "Waiting Period (days) : Nill\n");
            }
        });

        goToMenu.addActionListener(e -> {
            new Menu();
            pesticideFrame.dispose();
        });

        pesticideFrame.add(scroll);
        pesticideFrame.getContentPane().setBackground(Color.WHITE);
        pesticideFrame.setLayout(null);
        pesticideFrame.setVisible(true);
        pesticideFrame.setSize(1280,720);
        pesticideFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pesticide();
    }
}
