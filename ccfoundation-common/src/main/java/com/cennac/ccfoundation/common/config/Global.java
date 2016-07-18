package com.cennac.ccfoundation.common.config;

/**
 * Created by Cennac on 2016/7/18.
 * 全局配置类
 */
public class Global {

    /**
     * 当前对象实例
     */
    private static Global global = new Global();

    /**
     * 获取当前对象实例
     */
    public static Global getInstance() {
        return global;
    }


    /**
     * 显示/隐藏
     */
    public static final String SHOW = "1";
    public static final String HIDE = "0";

    /**
     * 是/否
     */
    public static final String YES = "1";
    public static final String NO = "0";

    /**
     * 对/错
     */
    public static final String TRUE = "true";
    public static final String FALSE = "false";


}
