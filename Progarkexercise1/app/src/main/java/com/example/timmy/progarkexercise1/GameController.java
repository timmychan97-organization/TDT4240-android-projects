package com.example.timmy.progarkexercise1;


import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by timmy on 27/01/2019.
 */

public class GameController implements Runnable {
    public static GameController instance;
    public Handler handler;
    public ViewGroup gameView;
    private long mspf = 17; //58.8fps

    private ArrayList<GameObject> gameObjects = new ArrayList<>();


    public GameController(ViewGroup view, Handler handler){
        instance = this;
        this.handler = handler;
        this.gameView = view;
        Helicopter h = new Helicopter();
    }



    private float x = 0f;
    @Override
    public void run() {
        //System.out.println("Main loop");
        main(); //Main loop


        ImageView img = (ImageView) gameView.findViewById(R.id.imageView2);
        img.setX((x++ + x++));


        TextView tv = (TextView) MainActivity.rootView.findViewById(R.id.textView);
        tv.setText("Cool");

        handler.postDelayed(this, mspf);
    }

    public void main(){ //main loop
        //Update every Object
        for (GameObject obj : gameObjects){
            obj.Update();
        }
    }

    public void addGameObject(GameObject o){
        gameObjects.add(o);
    }

}
