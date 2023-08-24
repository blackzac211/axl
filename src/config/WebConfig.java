package config;

public class WebConfig {
    public static int SERVICE_MODE = 1;   //운영=1, 개발=0

    public final static String AXL_WSDL = "file:/axl/schema/11.0/AXLAPI.wsdl"; 
    public final static String RIS_WSDL = "file:/ris/RISService70.wsdl";

    //public final static String AXL_WSDL = "file:/D:/source/cucm-scheduler/axl/schema/11.0/AXLAPI.wsdl";
    //public final static String RIS_WSDL = "file:/D:/source/cucm-scheduler/ris/RISService70.wsdl";
}
