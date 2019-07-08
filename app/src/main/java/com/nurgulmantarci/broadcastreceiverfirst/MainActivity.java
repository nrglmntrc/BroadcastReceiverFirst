package com.nurgulmantarci.broadcastreceiverfirst;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcastMessage(View view) {
      // Intent intent= new Intent(context,MyFirstReceiver.class);
//        intent.putExtra("ad","Nurgül");

        Intent intent=new Intent("my.custom.action.name");
        sendBroadcast(intent);
    }


    //inner class
    public static class MysecondReceiver extends BroadcastReceiver{
        private final String TAG=MysecondReceiver.class.getSimpleName();


        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i(TAG,"Inner Receiver");
            Toast.makeText(context, "Inner Receiverdan", Toast.LENGTH_SHORT).show();
        }
    }
}
