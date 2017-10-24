package com.guohongxue;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

/**
 * Created by sunlibin on 17/8/27.
 */
public class Config extends JFinalConfig {

    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }

    public void configRoute(Routes routes) {
        routes.add(new Routes() {
            @Override
            public void config() {
                setBaseViewPath("/WEB-INF/view");
                add("/", IndexController.class);
            }
        });
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {

    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
