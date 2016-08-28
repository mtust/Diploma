package excecutor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tust on 28.08.2016.
 */
public abstract class BaseExcecutor {

    public abstract void init();

    public abstract void excecute();

    Map<String, Object> readParameter(){
        Map<String, Object> parameterMap = new HashMap<String, Object>();
        return parameterMap;
    }
}
