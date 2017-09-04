import com.jfinal.core.Controller;

/**
 * Created by luzhijie on 2017/8/7.
 */
public class BlogController extends Controller {
    public void  index(){
//        render("/WEB-INF/jsp/login.jsp");
        render("index.html");
    }
}
