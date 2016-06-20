package com.example.seva.myexoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;

import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.TrackRenderer;

public class MainActivity extends AppCompatActivity {

    private SurfaceView surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        ExoPlayer.Factory.newInstance()
    }

    private void initViews() {
        surfaceView = (SurfaceView) findViewById(R.id.surface_view);
    }
}
