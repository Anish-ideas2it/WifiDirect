package com.ideas2it.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import com.ideas2it.wi_fidirect.R;

/**
 * Created by i2i-s3 on 4/11/15.
 */
public class AppUtil {

    public static void AlertDialog(final Context ctx, String title, String msg, DialogInterface.OnClickListener callBack, String... buttonNames){
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);

        // Setting Dialog Title
        builder.setTitle(title);

        // Setting Dialog Message
        builder.setMessage(msg);

        // Setting Negative "NO" Button
        builder.setNegativeButton(buttonNames[1], new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke NO event
                dialog.cancel();
            }
        });

        // Setting Positive "Yes" Button
        builder.setPositiveButton(buttonNames[0], callBack);
                // Showing Alert Message
                builder.show();
    }

}
