package com.artuno.ballpaddle;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Artuno on 1/30/2017.
 */

public class BgmService extends Service {

        private static final String TAG = null;
        MediaPlayer player;
        public IBinder onBind(Intent arg0) {

            return null;
        }
        @Override
        public void onCreate() {
            super.onCreate();
            player = MediaPlayer.create(this, R.raw.bgm);
            player.setLooping(true); // Set looping
            player.setVolume(80,80);
            Toast.makeText(this, "fuck this shit", Toast.LENGTH_SHORT).show();


        }
        public int onStartCommand(Intent intent, int flags, int startId) {
            super.onStart(intent, startId);
            player.start();
            return START_STICKY;
        }

        public void onStart(Intent intent, int startId) {
            player.start();
        }
        public IBinder onUnBind(Intent arg0) {
            // TO DO Auto-generated method
            return null;
        }

        public void onStop() {

        }
        public void onPause() {

        }
        @Override
        public void onDestroy() {
            //player.stop();
            //player.release();
        }

        @Override
        public void onLowMemory() {

        }

}
