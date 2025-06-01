package io.github.winter.boot.test;

import java.io.Serializable;

/**
 * 日志
 *
 * @author changebooks@qq.com
 */
public final class Log implements Serializable {
    /**
     * 主键
     */
    private final String id;

    /**
     * 编码
     */
    private final String code;

    /**
     * 内容
     */
    private final String message;

    public Log() {
        this.id = null;
        this.code = null;
        this.message = null;
    }

    public Log(String id) {
        this.id = id;
        this.code = null;
        this.message = null;
    }

    public Log(String code, String message) {
        this.id = null;
        this.code = code;
        this.message = message;
    }

    public Log(String id, String code, String message) {
        this.id = id;
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        String id = getId();
        String code = getCode();
        String message = getMessage();
        return "{\"id\": \"%s\", \"code\": \"%s\", \"message\": \"%s\"}".formatted(id, code, message);
    }

    public String getId() {
        return id != null ? id : "";
    }

    public String getCode() {
        return code != null ? code : "";
    }

    public String getMessage() {
        return message != null ? message : "";
    }

}
