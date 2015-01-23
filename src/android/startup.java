// tba

package io.yeet.cordova.android.startup;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootUpReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
                Intent i = new Intent(context);  
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);  
        }

}