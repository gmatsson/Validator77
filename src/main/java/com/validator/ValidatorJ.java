package com.validator;

public class ValidatorJ {
    public boolean isRectangleEqual(RectangleJ rectA, RectangleJ rectB) {
        return (rectA.getWidth() == rectB.getWidth() && rectA.getHeight() == rectB.getHeight());
    }
}
