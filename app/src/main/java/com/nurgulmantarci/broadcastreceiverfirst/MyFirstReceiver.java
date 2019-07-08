package com.nurgulmantarci.broadcastreceiverfirst;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReceiver extends BroadcastReceiver {

    private static final String TAG=MyFirstReceiver.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"Birinci receiver'dan selamlar.. Thread adı:"+Thread.currentThread().getName());
//        String isim=intent.getStringExtra("ad");
        Toast.makeText(context, "Birinci receiver'dan selamlar", Toast.LENGTH_LONG).show();

      /*  try{
            Thread.sleep(15000);  //Sistemi 15 sn uyutursak program çöker.. çünkü receiverlar mainde çalıştığı için 10 sn fazla süren işlemler için uygun değildir.
        }catch (InterruptedException e){
            e.printStackTrace();
        }  */
    }
}
