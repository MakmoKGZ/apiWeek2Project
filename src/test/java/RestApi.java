import java.net.http.HttpResponse;

public class RestApi {

    HttpResponse<String> httpResponse = Unirest.get(“<some_url>/<endpoint>?param1=value1&param2=value2”)
            .header("header1", header1)
       .header("header2", header2);
       .asString();
System.out.println( httpResponse.getHeaders().get("Content-Type"));
}
