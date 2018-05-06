package rikka.api.text.action;

import rikka.api.text.Text;

public abstract class ShiftClickAction<R> extends TextAction<R> {

    ShiftClickAction(R result) {
        super(result);
    }

    public void applyTo(Text.Builder builder) {
        builder.onShiftClick(this);
    }

    public static final class InsertText extends ShiftClickAction<String> {
        InsertText(String text) {
            super(text);
        }
    }
}
