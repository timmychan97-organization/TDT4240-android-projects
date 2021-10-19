package com.example.timmy.progarkexercise1;

public abstract class GameObject {
    public GameObject(){
        GameController.instance.addGameObject(this);
    }
    public abstract void Update();
}
