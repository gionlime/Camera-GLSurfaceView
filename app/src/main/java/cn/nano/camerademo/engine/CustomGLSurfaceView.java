package cn.nano.camerademo.engine;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class CustomGLSurfaceView extends GLSurfaceView {
    public CustomGLSurfaceView(Context context) {
        this(context, null);
    }

    public CustomGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPreview();
    }

    private void initPreview() {
        setEGLContextClientVersion(2);
    }
}
