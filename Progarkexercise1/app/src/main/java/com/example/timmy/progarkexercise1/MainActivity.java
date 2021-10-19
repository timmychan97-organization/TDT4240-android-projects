package com.example.timmy.progarkexercise1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    public static ViewGroup rootView;
    private GameController game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.findViewById(android.R.id.content)).getChildAt(0);
        rootView = viewGroup;
        Handler gameHandler = new Handler();
        game = new GameController(viewGroup, gameHandler);
        gameHandler.postDelayed(game,50); //run the gameController.run() after 50ms. Which starts the game
    }
}
