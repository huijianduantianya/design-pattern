package com.jxufe.observer.test;

import com.jxufe.observer.mouseevent.Mouse;
import com.jxufe.observer.mouseevent.MouseEventCallback;
import com.jxufe.observer.mouseevent.MouseEventType;

import java.lang.reflect.Method;

public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        mouse.addLisenter(MouseEventType.ON_CLICK,callback);

        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();


    }
}
