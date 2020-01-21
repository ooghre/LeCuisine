package com.example.lecuisine.Presentation;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.example.lecuisine.R;

public class AppUtil {
    public static AlertDialog displayAlert(Context context, int stringId)
    {
        return displayAlert(context, context.getString(stringId), null, null);
    }

    public static AlertDialog displayAlert(Context context, String message)
    {
        return displayAlert(context, message, null, null);
    }

    public static AlertDialog displayAlert(Context context, String message, String title, DialogInterface.OnClickListener positiveButtonListener)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setMessage(message)
                .setPositiveButton(R.string.ok, positiveButtonListener);

        if (title != null)
        {
            builder.setTitle(title);
        }

        AlertDialog dialog = builder.create();
        dialog.show();

        return dialog;
    }

    public static AlertDialog displayError(Context context, int stringId)
    {
        return displayAlert(context, context.getString(stringId), context.getString(R.string.error), null);
    }
}

