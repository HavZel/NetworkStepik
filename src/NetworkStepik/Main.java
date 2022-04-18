package NetworkStepik;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            InputStream stream = url.openStream();

            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = stream.read()) != -1) {
                if ((char) c == '<')
                    sb.append('\n');
                sb.append((char) c);
            }

            System.out.println(sb.toString());
        } catch(MalformedURLException e) { }
          catch(IOException e) { }
    }
}
