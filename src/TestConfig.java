import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

/**
 * Created by luzhijie on 2017/8/7.
 */
public class TestConfig  extends JFinalConfig {

    //启动jetty服务器
    public static void main(String[] args) {
        JFinal.start("web", 80, "/");

    }

    /**
     * 常量配置web
     * @param me
     */
    @Override
    public void configConstant(Constants me) {

    }

    /**
     * 路由设置
     * @param me
     */
    @Override
    public void configRoute(Routes me) {
        me.add("/", BlogController.class);
    }

    /**
     * 网页模板引擎
     * @param me
     */
    @Override
    public void configEngine(Engine me) {
        me.addSharedFunction("/WEB-INF/jsp/_login.html");
    }

    /**
     * 插件配置
     * @param me
     */
    @Override
    public void configPlugin(Plugins me) {

    }

    /**
     * 全局拦截器
     * @param me
     */
    @Override
    public void configInterceptor(Interceptors me) {

    }

    /**
     * 扩展操作配置//不知道干啥的
     * @param me
     */
    @Override
    public void configHandler(Handlers me) {

    }
}
