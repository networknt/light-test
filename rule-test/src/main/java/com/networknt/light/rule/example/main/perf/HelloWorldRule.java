package com.networknt.light.rule.example.main.perf;

import com.networknt.light.rule.AbstractRule;
import com.networknt.light.rule.Rule;
import com.networknt.light.util.ServiceLocator;

import java.util.*;

/**
 * Created by steve on 02/02/15.
 */
public class HelloWorldRule extends AbstractRule implements Rule {
    public boolean execute (Object ...objects) throws Exception {
        Map<String, Object> inputMap = (Map<String, Object>) objects[0];
        inputMap.put("result", "{\"message\": \"Hello World1\"}");
        return true;
    }
}
