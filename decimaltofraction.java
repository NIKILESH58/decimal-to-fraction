import java.util.Scanner;
import java.text.DecimalFormat;
public class decimaltofraction
{
        public static void main(String[] args) 
        {
          DecimalFormat df = new DecimalFormat("#." + "0".repeat(2));
          Scanner in = new Scanner(System.in);
          double number =in.nextDouble();
          double roundednumber = Math.floor(number);
          int roundednumberint = (int)roundednumber;
          double pointvalues=number-roundednumber;
          String rounded = df.format(pointvalues);
          double result = Double.parseDouble(rounded);
          pointvalues=result;
          String string = Double.toString(pointvalues);
          long lengthofdecimals = string.length() - string.indexOf('.')-1;
          double denominator = Math.pow(10,lengthofdecimals);
          String withoutpoint=string.substring(2);
          long numerator=Long.parseLong(withoutpoint);
          long numeratorduplicate=numerator;
          long denominatorinlong = (new Double(denominator)).longValue();
          long denominatorduplicate=denominatorinlong;
          while (denominatorduplicate != 0) 
          {
          long temp = denominatorduplicate;
          denominatorduplicate = numeratorduplicate % denominatorduplicate;
          numeratorduplicate = temp;
          }
          long finalnumerator=numerator/numeratorduplicate;
          long finaldenominator=denominatorinlong/numeratorduplicate;
          System.out.println(+roundednumberint+" "+finalnumerator+"/"+finaldenominator);


        }
}
