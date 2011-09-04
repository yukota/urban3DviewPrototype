package com.github.yukota.urban3dviewprototype;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import processing.core.PApplet;

public class UrbanView {
    
    private int frameHeight;
    private int frameWidth;

    public UrbanView(UrbanController urbanController, int initWidth,
            int initHeight) {
        this.initView();
    }
    
    private void initView() {
        JFrame frame =  new JFrame();
        frame.setLayout(new BorderLayout());
        
        PApplet mapPApplet = new MapPApplet();
        frame.add(mapPApplet, BorderLayout.CENTER);
        mapPApplet.init();
        
        
        frame.setSize(frameHeight, frameWidth);
        frame.setVisible(true);
    }

}
