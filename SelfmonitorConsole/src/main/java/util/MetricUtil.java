package util;

import java.util.Arrays;

/**
 *
 * @author vojtech
 */
public class MetricUtil {

    public static final String[] subsystemKeywords = {
        "subsystem",
        "deployment",
        "deployment-overlay",
        "socket-binding-group",
        "core-service",
        "interface",
        "system-property",
        "extension",
        "path"
    };
    
    public static String getSubsystemName(String metricId){
        String[] parts = metricId.split("_");
        if(Arrays.asList(subsystemKeywords).contains(parts[0])){
            return parts[0] + "_" + parts[1];
        }
        else{
            return "";
        }
    }
    
    public static String toEqualSign(String source){
        return "";
    }
    
    public static String toUnderscoreSign(String source){
        return "";
    }
    
}
