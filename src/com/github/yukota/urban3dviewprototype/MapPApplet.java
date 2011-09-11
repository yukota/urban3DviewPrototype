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
        rotateY(map(mouseX, 0, width, 0, PI));
        rotateZ(map(mouseY, 0, height, 0, -PI));
       
        //人のモデルの作成
        Agent3D oneAgent = new Agent3D();
        oneAgent.display();
        
    }
    
 
public class Agent3D {

    private float height = 200;
    private float width= height*2/3;
    
    private float headSize = height/4;
    private float bodyHeight = height * 2 / 3;
    
    private float bodyWidth = width ;
    
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
        beginShape(TRIANGLE_FAN);
        
        //frame1
        vertex(0,0,0);
        vertex(bodyWidth/2, 0, bodyHeight);
        vertex(0, -frontWidth, bodyHeight);
        //frame4
        vertex(-bodyWidth/2, 0, bodyHeight);
        //frame5
        vertex(0, frontWidth, bodyHeight);
        
        vertex(bodyWidth/2, 0, bodyHeight);
        
        endShape(CLOSE);
        
        //上面の作成
            
        beginShape();
        vertex(bodyWidth/2, 0, bodyHeight);
        vertex(0, -frontWidth, bodyHeight);
        vertex(-bodyWidth/2, 0, bodyHeight);
        vertex(0, frontWidth, bodyHeight);
        endShape(CLOSE);
        
        noStroke();
        translate(0,0,bodyHeight+headSize);
        sphere(headSize);
        
        
        
    
    //胴体の描写
    
    }
}
   
    

}
