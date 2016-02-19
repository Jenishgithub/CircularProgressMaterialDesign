package com.example.crossoovernepal.circularprogressmaterialdesign;

import android.animation.TimeInterpolator;

/**
 * Created by CrossoOverNepal on 2/19/2016.
 */
public class EaseInOutCubicInterpolator implements TimeInterpolator {

    @Override
    public float getInterpolation(float input) {
        if ((input *= 2) < 1.0f) {
            return 0.5f * input * input * input;
        }
        input -= 2;
        return 0.5f * input * input * input + 1;
    }

}
