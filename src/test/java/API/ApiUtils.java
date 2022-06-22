package API;

import Utils.LogUtils;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ApiUtils extends LogUtils {

    protected static Response response;
    protected static JSONObject body;
    protected static String uri;
    protected static Map<String, String> headers = new HashMap<>();
    protected static Map<String, String> params= new HashMap<>();
    protected static String Token;

 public void log(String verbo) {

     super.logInfo("****** Dados Enviados no Request ******");
     super.logInfo(verbo + " " + uri);
     super.logInfo("Body: \n" + body);
     super.logInfo("Headers: " + headers);
     super.logInfo("Params: " + params);

     super.logInfo("****** Dados Recebidos  ******");
     super.logInfo("Status code: " + response.statusCode());
     super.logInfo("Payload recebido: \n" + response.asPrettyString());
     super.logInfo("Tempo de respostas: " + response.timeIn(TimeUnit.MILLISECONDS));

 }
}
