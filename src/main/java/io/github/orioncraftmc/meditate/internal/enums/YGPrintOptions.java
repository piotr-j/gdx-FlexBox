package io.github.orioncraftmc.meditate.internal.enums;


public enum YGPrintOptions {
    YGPrintOptionsLayout(1),
    YGPrintOptionsStyle(2),
    YGPrintOptionsChildren(4);

    private final int value;

    YGPrintOptions(int value) {
        this.value = value;
    }

    public static  YGPrintOptions forValue(int value) {
        for ( YGPrintOptions options : values()) {
            if (options.value == value) {
                return options;
            }
        }

        return null;
    }

    public int getValue() {
        return value;
    }
}
