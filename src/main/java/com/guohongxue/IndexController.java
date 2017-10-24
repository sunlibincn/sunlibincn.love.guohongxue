package com.guohongxue;

import com.jfinal.core.Controller;

/**
 * Created by sunlibin on 17/8/27.
 */
public class IndexController extends Controller {

    public void index() {
        System.out.println(111111);
        render("love.html");
    }
}
