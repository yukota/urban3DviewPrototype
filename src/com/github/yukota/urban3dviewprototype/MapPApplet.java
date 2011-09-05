package com.github.yukota.urban3dviewprototype;

import processing.core.PApplet;

public class MapPApplet extends PApplet {
    
    @Override
    public void setup() {
        size(640, 480,P3D);
    }
    
    /**
     * 描画
     */
    @Override
    public void draw() {
        //背景色
        background(0);
        //default ambientlight,directional light
        lights();
        //中心地に平行移動
        translate(320,240);
        rotateX(10);
        
        Agent3D oneAgent = new Agent3D();
        oneAgent.display();
        
        //人のモデルの作成
        
        
        
//        box(100);
    }
    
 
public class Agent3D {

    private float height = 200;
    private float width= height*2/3;
    
    private float headSize = height/3;
    private float bodyHeight = height * 2 / 3;
    
    private float bodyWidht = width ;
    
    private float frontWidth = width/2;
    /**
     * コンストラクタ
     */
    public Agent3D() {
        
    }
    
    
    public void display() {
    /*
     * Draw Agent
     */
        
    //頭の描写
       // sphere(headSize);
    //胴体の描写
        fill(0,0,255);
        beginShape();
        
        //frame1
        vertex(0,0,0);
        vertex(bodyWidht/2, 0, bodyHeight);
        vertex(0, -frontWidth, bodyHeight);
        vertex(-bodyWidht/2, 0, bodyHeight);
        
        
        
        endShape(CLOSE);
        
            
        
        
    
    //胴体の描写
    
    }
}
   
    

}
