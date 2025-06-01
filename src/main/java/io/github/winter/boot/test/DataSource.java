package io.github.winter.boot.test;

import java.io.Serializable;

/**
 * Data Source Name
 *
 * @author changebooks@qq.com
 */
public final class DataSource implements Serializable {
    /**
     * 域名或Ip、数据库名、参数
     * jdbc:mysql://127.0.0.1:3306/database?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai&useAffectedRows=true&allowMultiQueries=true&connectTimeout=3000&socketTimeout=10000
     */
    private final String url;

    /**
     * 用户名
     */
    private final String username;

    /**
     * 密码
     */
    private final String password;

    public DataSource(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    private DataSource() {
        this.url = null;
        this.username = null;
        this.password = null;
    }

    @Override
    public String toString() {
        String url = getUrl();
        String username = getUsername();
        String password = getPassword();
        return "{\"url\": \"%s\", \"username\": \"%s\", \"password\": \"%s\"}".formatted(url, username, password);
    }

    public String getUrl() {
        return url != null ? url : "";
    }

    public String getUsername() {
        return username != null ? username : "";
    }

    public String getPassword() {
        return password != null ? password : "";
    }

}
