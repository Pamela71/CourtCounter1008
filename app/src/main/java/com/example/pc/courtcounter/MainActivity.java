package com.example.pc.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {

    TextView scoreA;
    TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i(TAG,"onCreate: ");
        scoreA = findViewById(R.id.textView2);
        scoreB = findViewById(R.id.textView4);
    }
    @Override
    protected void onStart(){
        super.onStart();
        //Log.i(TAG,"onStart: ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        //Log.i(TAG,"onResume: ");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        //Log.i(TAG,"onRestart: ");
    }

    @Override
    protected void onPause(){
        super.onPause();
        //Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Log.i(TAG, "onStop: ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String scorea = ((TextView)findViewById(R.id.textView2)).getText().toString();
        String scoreb = ((TextView)findViewById(R.id.textView4)).getText().toString();

        //Log.i(TAG, "onSaveInstanceState: ");
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");
        //Log.i(TAG, "onRestoreInstanceState: ");
        ((TextView)findViewById(R.id.textView2)).setText(scorea);
        ((TextView)findViewById(R.id.textView4)).setText(scoreb);
    }

    public void aAdd1(View btn){
        Log.i("show","inc=0");
    }
    public void aAdd2(View btn){
        showScore(2,1);
    }
    public void aAdd3(View btn){
        showScore(3,1);
    }
    public void bAdd1(View btn){
        Log.i("show","inc=0");
    }
    public void bAdd2(View btn){
        showScore(2,2);
    }
    public void bAdd3(View btn){
        showScore(3,2);
    }

    public void resetOrz(View btn){
        Log.i("reset","0");
        scoreA.setText("0");
        scoreB.setText("0");
    }

    private void showScore(int inc, int tag){
        String oldScore;
        Log.i("show","inc=" + inc);
        if(tag == 1)    oldScore = (String)scoreA.getText();
        else    oldScore = (String)scoreB.getText();
        int newScore = Integer.parseInt(oldScore) + inc;
        if(tag == 1)    scoreA.setText("" + newScore);
        else scoreB.setText("" + newScore);
    }
}
