package com.artuno.ballpaddle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.io.IOException;

/**
 * Created by Artuno on 1/29/2017.
 */

public class MainMenu extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);
        Intent intent = new Intent(this, BgmService.class);
        startService(intent);

    }


    //Button btPlay = (Button)findViewById(R.id.btnPlay);

    public void goToGame(View view){

        Intent intent = new Intent(MainMenu.this,BreakoutGame.class);
        intent.putExtra("zz",true);
        startActivity(intent);

    }

    public void controls(View view){
        Intent in = new Intent(MainMenu.this,About.class);
        in.putExtra("zz",true);
        startActivity(in);
    }

}
