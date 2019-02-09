package com.check.main.data;

public class Constant {
    public static final String WEB_URL = "http://kosankoding.co.id";
    public static final String WEB_URL_API = WEB_URL + "/ta/api/public/";
    public static final String CREATE = "create/";

    public static final String GET_TRANSITION = WEB_URL_API + "transition/";
    public static final String GET_DAILY = WEB_URL_API + "daily/";
    public static final String GET_MONTHLY = WEB_URL_API + "monthly/";

    public static final String CREATE_TRANSITION = GET_TRANSITION + CREATE;
    public static final String CREATE_DAILY = GET_DAILY + CREATE;
    public static final String CREATE_MONTHLY = GET_MONTHLY + CREATE;
}