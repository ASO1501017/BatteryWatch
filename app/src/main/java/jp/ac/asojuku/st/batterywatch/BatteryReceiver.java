package jp.ac.asojuku.st.batterywatch;

import android.app.PendingIntent;
import android.content.Intent;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
/**
 * Created by Kasumi on 2016/11/18.
 */
public class BatteryReceiver extends BroadcastReceiver{

    @Override
    public void onReceiver(Context context, Intent receivedIntent){

        int notification = receivedIntent.getIntExtra("notificationId",0);
        NotificationManager myNotification = (NotificationManager) context.getSystemService(
                Context.NOTIFICATION_SERVICE);
        Intent bootIntent = new Intent(context, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context,0,bootIntent,0);
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentText("バッテリー残量が７９％になりました。")
                .setWhen()
                .setPriority(Notification.PRIORITY_HIGH)
                

    }
}
