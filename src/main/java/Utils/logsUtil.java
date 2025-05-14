package Utils;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logsUtil {

    private logsUtil(){
     super();
    }
    public static Logger logger(){
        return (Logger) LogManager.getLogger(Thread.currentThread().getStackTrace()[3].getClassName());
    }

public static void trace(String... message){
        logger().trace(String.join("",message));
}

    public static void info(String... message){
        logger().info(String.join("",message));
    }

    public static void error(String... message){
        logger().error(String.join("",message));
    }

    public static void warning(String... message){
        logger().warn(String.join("",message));
    }
}
