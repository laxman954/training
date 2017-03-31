import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CurrentTime extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {

    PrintWriter out = res.getWriter();

    Date date = new Date();
    DateFormat df = DateFormat.getInstance();

    String zone = req.getParameter("zone");
    if (zone != null) {
      TimeZone tz = TimeZone.getTimeZone(zone);
      df.setTimeZone(tz);
    }

    out.println(df.format(date));
  }
}