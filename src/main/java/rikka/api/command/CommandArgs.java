package rikka.api.command;

public final class CommandArgs {

    private final String[] args;
    private final int length;
    private int current;

    public CommandArgs(String[] args) {
        this.args = args;
        this.length = this.args == null ? 0 : this.args.length;
        this.current = 0;
    }

    public CommandArgs(String args) {
        this(args == null ? null : args.split(" "));
    }

    public boolean empty() {
        return current >= length;
    }

    public boolean notEmpty() {
        return current < length;
    }

    public CommandArgs next() {
        if (current < length) current++;
        return this;
    }

    public CommandArgs revert() {
        if (current > 0) current--;
        return this;
    }

    public int size() {
        return length - current;
    }

    public String first() {
        if (current >= length) return "";
        return args[current];
    }

    public String get(int index) {
        if (current + index >= length) return "";
        return args[current + index];
    }

}
