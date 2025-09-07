package Utilities;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
private final Map<String,Object> scenrioContext = new HashMap<String, Object>();
public void set(String string,Object Obj) {
	scenrioContext.put(string, Obj);
}

public <T> T get(String key,Class<T> clazz){
	return clazz.cast(scenrioContext.get(key));
}
}
