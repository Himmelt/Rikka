package rikka.api.text.action;

import com.google.common.base.MoreObjects;
import rikka.api.text.TextElement;

import javax.annotation.Nullable;

import static com.google.common.base.Preconditions.checkNotNull;

public abstract class TextAction<R> implements TextElement {

    protected final R result;

    protected TextAction(R result) {
        this.result = checkNotNull(result, "result");
    }

    public final R getResult() {
        return this.result;
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TextAction<?> that = (TextAction<?>) o;
        return this.result.equals(that.result);
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return MoreObjects.toStringHelper(this)
                .addValue(this.result)
                .toString();
    }

}
