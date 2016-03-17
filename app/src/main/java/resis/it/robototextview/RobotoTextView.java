package resis.it.robototextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import resis.it.robototextview.R;

public class RobotoTextView extends TextView {

    private static final String[] fonts = {
            "Roboto-Black",
            "Roboto-BlackItalic",
            "Roboto-Bold",
            "Roboto-BoldItalic",
            "Roboto-Italic",
            "Roboto-Light",
            "Roboto-LightItalic",
            "Roboto-Medium",
            "Roboto-MediumItalic",
            "Roboto-Regular",
            "Roboto-Thin",
            "Roboto-ThinItalic",
            "RobotoCondensed-Bold",
            "RobotoCondensed-BoldItalic",
            "RobotoCondensed-Italic",
            "RobotoCondensed-Light",
            "RobotoCondensed-LightItalic",
            "RobotoCondensed-Regular"
    };

    public RobotoTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public RobotoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public RobotoTextView(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RobotoTextView);
            int value = 0;
            if (a.hasValue(R.styleable.RobotoTextView_robotoFont)) {
                value = a.getInt(R.styleable.RobotoTextView_robotoFont, 0);
            }
            String fontName = fonts[value] + ".ttf";
            if (fontName != null) {
                Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + fontName);
                setTypeface(myTypeface);
            }
            a.recycle();
        }
    }
}
