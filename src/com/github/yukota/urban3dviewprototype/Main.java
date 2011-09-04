package com.github.yukota.urban3dviewprototype;

/**
 * ViewPrototype
 * @author YuK_Ota
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
    	UrbanController urbanController = new UrbanController();
    	//画面サイズHeight
    	int initHeight = 480;
    	//画面サイズWidth
    	int initWidth = 640;
    	
    	UrbanView urbanView = new UrbanView(urbanController, initWidth, initHeight);

    }

}
