package io.github.winter.boot.test;

public final class Test6<T> {
    /**
     * 主键
     */
    private final String id;

    private final T name;

    public Test6(String id, T name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public T getName() {
        return name;
    }

}
