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
        
        Runtime.getRuntime().addShutdownHook(new Shutdown());
        
        
    	UrbanController urbanController = new UrbanController();
    	//画面サイズHeight
    	int initHeight = 480;
    	//画面サイズWidth
    	int initWidth = 640;
    	
    	UrbanView urbanView = new UrbanView(urbanController, initWidth, initHeight);

    }

}

/**
 * 終了時処理.
 * @author YuK_Ota
 *
 */
class Shutdown extends Thread {
    public Shutdown(){
       super();
    }
    
    @Override
    public void run() {
       System.out.println("end process");
    }
    
}