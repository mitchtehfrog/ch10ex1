package murach.tags;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


/**
 *
 * @author mthompson31
 */
public class CurrentTimeTag extends TagSupport {
    @Override
  public int doStartTag() throws JspException {
    Calendar calendar = Calendar.getInstance();
    int hours = calendar.get(Calendar.HOUR_OF_DAY);
    int minutes = calendar.get(Calendar.MINUTE);
    //DateFormat shortDate= DateFormat.getDateInstance(DateFormat.HOUR1_FIELD);
    //String currentTimeFormatted = shortDate.format(currentTime);

    try {
      JspWriter out = pageContext.getOut();
      out.print(""+hours+":"+""+minutes);
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
    return SKIP_BODY;
  }
}
