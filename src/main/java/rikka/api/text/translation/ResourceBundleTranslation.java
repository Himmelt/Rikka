package rikka.api.text.translation;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.function.Function;

import static com.google.common.base.Preconditions.checkNotNull;

public class ResourceBundleTranslation implements Translation {

    private final String key;
    private final Function<Locale, ResourceBundle> bundleFunction;

    public ResourceBundleTranslation(String key, Function<Locale, ResourceBundle> bundleFunction) {
        this.key = key;
        this.bundleFunction = bundleFunction;
    }

    @Override
    public String getId() {
        return this.key;
    }

    @Override
    public String get(Locale locale) {
        checkNotNull(locale, "locale");
        try {
            ResourceBundle bundle = this.bundleFunction.apply(locale);
            return bundle == null ? this.key : bundle.getString(this.key);
        } catch (MissingResourceException ex) {
            return this.key;
        }
    }

    @Override
    public String get(Locale locale, Object... args) {
        return String.format(locale, get(locale), args);
    }
}
