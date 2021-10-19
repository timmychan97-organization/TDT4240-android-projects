package com.example.timmy.progarkexercise1;

import android.media.Image;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Vector;

public class Helicopter extends GameObject {

    private ImageView img;
    private Vector2 direction;
    private float speed = 1f;

    public Helicopter(){
        super();
        createSprite();
        direction = randomDirection();
        speed = (float)(Math.random()* 2f + 2f);
    }


    public Vector2 randomDirection(){
        double rad = Math.random() * 2.0 * Math.PI;
        return new Vector2((float)Math.cos(rad),(float) Math.sin(rad));
    }

    @Override
    public void Update(){
        img.setX(img.getX() + direction.x*speed);
        img.setY(img.getY() + direction.y*speed);
    }


    private void moveRandomly(){

    }
    private void createSprite(){
        ImageView imageView = new ImageView(MainActivity.rootView.getContext());
        imageView.setImageResource(R.drawable.attackhelicopter);
        //setting image position
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        MainActivity.rootView.addView(imageView);
        img = imageView;
        System.out.println("Width:" + img.getWidth());
    }
}
