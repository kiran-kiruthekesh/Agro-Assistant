package com.Agriculture_Assisstant;

import javax.swing.*;
import java.awt.*;

public class GeneralInformation {
    public GeneralInformation() {
        JFrame infoFrame = new JFrame("Get Information");

        JLabel infoTitleLabel = new JLabel("GENERAL INFORMATION"); infoFrame.add(infoTitleLabel);
        infoTitleLabel.setBounds(340, 20, 600, 80);
        infoTitleLabel.setFont(new Font("Cambria (Headings)", Font.BOLD, 38));
        infoTitleLabel.setBackground(Color.decode("#fffa65"));
        infoTitleLabel.setOpaque(true);
        infoTitleLabel.setForeground(Color.BLACK);
        infoTitleLabel.setHorizontalAlignment(JLabel.CENTER);
        infoTitleLabel.setVerticalAlignment(JLabel.CENTER);

        JLabel cropLabel = new JLabel("Choose Crop"); infoFrame.add(cropLabel);
        cropLabel.setBounds(440,110,100,25);
        cropLabel.setFont(new Font("Calibri (Body)",Font.PLAIN,16));

        String[] cropList = {"Paddy", "Wheat"};
        JComboBox chooseCrop = new JComboBox(cropList); infoFrame.add(chooseCrop);
        chooseCrop.setBounds(540,110,100,25);
        chooseCrop.setFont(new Font("Calibri (Body)",Font.PLAIN,16));

        JButton show = new JButton("show"); infoFrame.add(show);
        show.setBounds(740,110,100,25);

        JButton goToMenu = new JButton("menu"); infoFrame.add(goToMenu);
        goToMenu.setBounds(590,640,100,25);

        JTextArea information = new JTextArea();
        information.setFont(new Font("Calibri (body)",Font.PLAIN,18));
        information.setEditable(false);
        information.setWrapStyleWord(true);
        information.setLineWrap(true);

        JScrollPane scroll = new JScrollPane(information,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        infoFrame.add(scroll);
        scroll.setBounds(140,150,1000,475);

        show.addActionListener(e -> {
            if(chooseCrop.getSelectedItem().equals("Paddy")) {
                information.setText("About Rice :\n" +
                        "       Oryza Sativa, it is believed, is associated with wet, humid climate, though it is not a tropical plant. It is probably a descendent of wild grass that was most likely cultivated in the foothills of the far Eastern Himalayas. Another school of thought believes that the rice plant may have originated in southern India, then spread to the north of the country and then onwards to China. It then arrived in Korea, the Philippines (about 2000 B. C.) and then Japan and Indonesia (about 1000 B. C.).\n" +
                        "The journey of rice around the world has been slow, but once it took root it stayed and became a major agriculture and economic product for the people. In the Indian subcontinent more than a quarter of the cultivated land is given to rice (20011-12). It is a very essential part of the daily meal in the southern and eastern parts of India. In the northern and central parts of the subcontinent, where wheat is frequently eaten, rice holds its own and is cooked daily as well as on festivals and special occasions.\n" +
                        "\nHistory of Rice in India :\n" +
                        "       India is an important centre of rice cultivation. The rice is cultivated on the largest areas in India. Historians believe that while the indica variety of rice was first domesticated in the area covering the foothills of the Eastern Himalayas (i.e. north-eastern India), stretching through Burma, Thailand, Laos, Vietnam and Southern China, the japonica variety was domesticated from wild rice in southern China which was introduced to India. Perennial wild rice still grow in Assam and Nepal. It seems to have appeared around 1400 BC in southern India after its domestication in the northern plains. It then spread to all the fertile alluvial plains watered by rivers. Some says that the word rice is derived from the Tamil word arisi.\n" +
                        "\nClimatic Requirements :\n" +
                        "       In India rice is grown under widely varying conditions of altitude and climate. Rice cultivation in India extends from 8 to35ºN latitude and from sea level to as high as 3000 meters. Rice cropLabel needs a hot and humid climate. It is best suited to regions which have high humidity, prolonged sunshine and an assured supply of water. The average temperature required throughout the life period of the cropLabel ranges from 21 to 37º C. Maximum temp which the cropLabel can tolerate 400C to 42 0C.\n" +
                        "\nNutritional value of Rice :\n" +
                        "       Rice is a nutritional staple food which provides instant energy as its most important component is carbohydrate (starch). On the other hand, rice is poor in nitrogenous substances with average composition of these substances being only 8 per cent and fat content or lipids only negligible, i.e., 1per cent and due to this reason it is considered as a complete food for eating. Rice flour is rich in starch and is used for making various food materials. It is also used in some instances by brewers to make alcoholic malt. Likewise, rice straw mixed with other materials is used to produce porcelain, glass and pottery. Rice is also used in manufacturing of paper pulp and livestock bedding.\n" +
                        "The variability of composition and characteristics of rice is really broad and depends on variety and environmental conditions under which the cropLabel is grown. In husked rice, protein content ranges in between 7per cent to 12per cent. The use of nitrogen fertilizers increases the percentage content of some amino acids.\n" +
                        "\nMedicinal Value :\n" +
                        "       The immense diversity of rice germplasm is a rich source for many rice based products and is also used for treating many health related maladies such as indigestion, diabetes, arthritis, paralysis, epilepsy and give strength to pregnant and lactating mothers. Ancient Ayurvedic literature testify the medicinal and curative properties of different types of rice grown in India. Medicinal rice varieties like Kanthi Banko (Chhattisgarh), Meher, Saraiphul & Danwar (Orissa), Atikaya & Kari Bhatta (Karnataka), are very common in India. Few varieties cultivated in restricted pockets of Kerala for their medical properties e.g. Chennellu, Kunjinellu, Erumakkari & Karuthachembavu etc.\n");
            }
            else if(chooseCrop.getSelectedItem().equals("Wheat")) {
                information.setText("About Wheat\n" +
                        "       Wheat is the main cereal cropLabel in India. The total area under the cropLabel is about 29.8 million hectares in the country. The production of wheat in the country has increased significantly from 75.81 million MT in 2006-07 to an all time record high of 94.88 million MT in 2011-12. The productivity of wheat which was 2602 kg/hectare in 2004-05 has increased to 3140 kg/hectare in 2011-12. The major increase in the productivity of wheat has been observed in the states of Haryana, Punjab and Uttar Pradesh. Higher area coverage is reported from MP in recent years.\n" +
                        "\n     Indian wheat is largely a soft/medium hard, medium protein, white bread wheat, somewhat similar to U.S. hard white wheat. Wheat grown in central and western India is typically hard, with high protein and high gluten content. India also produces around 1.0-1.2 million tons of durum wheat, mostly in the state of Madhya Pradesh. Most Indian durum is not marketed separately due to segregation problems in the market yards. However, some quantities are purchased by the private trade at a price premium, mainly for processing of higher value/branded products.\n" +
                        "\n     The production and productivity of Wheat cropLabel were quite low, when India became independent in 1947. The production of Wheat was only 6.46 million tonnes and productivity was merely 663 kg per hectare during 1950-51, which was not sufficient to feed the Indian population. The Country used to import Wheat in large quantities for fulfilling the needs of our people from many countries like USA under PL-480. The reasons of low production and productivity of Wheat at that time was (a) the tall growing plant habit resulting in lodging, when grown under fertile soils, (b) the poor tillering and low sink capacity of the varieties used, (c) higher susceptibility to diseases, (d) the higher sensitivity to thermo & photo variations, etc., resulting in poor adaptability, and (e) longer cropLabel duration resulting in a long exposure of plants to the climatic variations and insect pest / disease attacks.\n" +
                        "\n     The Government of India appointed a commission in 1961 to assess the feasibility of increasing the cropLabel productivity under prevailing Indian ecological conditions. As result of various steps taken by Govt. of India, the Wheat scenario in our country has completely changed. In the post Independence era, country used to import Wheat for our needs but due to bumper increase in the production and productivity of Wheat in the 'Green Revolution' period in late sixties, our country became self dependent in Wheat production. At present, country is producing much more excess Wheat than the requirement and Godowns are over-flooded with Wheat.\n");
            }
        });

        goToMenu.addActionListener(e -> {
            new Menu();
            infoFrame.dispose();
        });

        infoFrame.setLayout(null);
        infoFrame.getContentPane().setBackground(Color.WHITE);
        infoFrame.setVisible(true);
        infoFrame.setSize(1280,720);
        infoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static void main(String[] args) {
        new GeneralInformation();
    }
}

