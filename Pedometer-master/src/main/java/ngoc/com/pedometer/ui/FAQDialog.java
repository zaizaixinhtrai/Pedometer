package ngoc.com.pedometer.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;

import ngoc.com.pedometer.R;
import ngoc.com.pedometer.common.PixelUtil;

/**
 * Created by M4800 on 11/1/2016.
 */

public class FAQDialog {

    public static FAQDialog getInstance() {
        return new FAQDialog();
    }

    public void show(Context context) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.faq_title);
        TextView tv = new TextView(context);
        tv.setPadding(PixelUtil.dpToPx(context, 15), PixelUtil.dpToPx(context, 10), PixelUtil.dpToPx(context, 15), PixelUtil.dpToPx(context, 10));
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.steps_are_not_saved_on_shutdown));
        sb.append("\n");
        sb.append("  ");
        sb.append(context.getString(R.string.you_probably_used_a_root));
        sb.append("\n");
        sb.append("\n");
        sb.append(context.getString(R.string.achievement_not_granted));
        sb.append("\n");
        sb.append("  ");
        sb.append(context.getString(R.string.achievements_are_granted_the_day));
        sb.append("\n");
        sb.append("\n");
        sb.append(context.getString(R.string.pebble_support));
        sb.append("\n");
        sb.append("  ");
        sb.append(context.getString(R.string.can_not_implement_pebble_support));

        tv.setText(sb.toString());
        builder.setView(tv);
        builder.setPositiveButton(android.R.string.ok,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(final DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.create().show();
    }
}
