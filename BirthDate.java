import javax.swing.JOptionPane;

public class BirthDate {
	public static void main(String [] args){
		int reply = JOptionPane.showConfirmDialog(null,"Would you like to know what day you were born?", "Choose One", JOptionPane.YES_NO_OPTION);
	    if (reply == JOptionPane.YES_OPTION) //Start if statement for yes to int reply.
	    {
	      String yearString = JOptionPane.showInputDialog(null,"Enter the year of your birthday:");
	      int year = Integer.parseInt(yearString);//take the year and convert into an integer.
	      String lastTwo = yearString.substring(2, 4);
	      //String almost = JOptionPane.showInputDialog(null,"Enter the last two digits of your birth year (e.g. For 1982 it would be 82):");
	      int alm = Integer.parseInt(lastTwo);
	      String lastOne = yearString.substring(3, 4);
	      //String last = JOptionPane.showInputDialog(null,"Enter the last digit in your birth year (e.g. For 1982 it would be 2):");
	      int year1 = Integer.parseInt(lastOne);
	      String monthString = JOptionPane.showInputDialog(null,"Enter the month of your birthday (1-12):");
	      int month = Integer.parseInt(monthString);//take the month and convert into an integer.
	      String dayString = JOptionPane.showInputDialog(null,"Enter the day of your birthday (1-31):");
	      int day = Integer.parseInt(dayString);//take the day and convert into an integer.
	      int answer = 0;
	      
	      //Start adding to the answer depending on month and day.
	      if (month == 1)//January
	      {
	        answer = day + 6;
	      }
	      else if(month == 2)//February
	      {
	        answer = day + 2;
	      }
	      else if(month == 3)//March
	      {
	        answer = day + 2;
	      }
	      else if(month == 4)//April
	      {
	        answer = day + 5;
	      }
	      else if(month == 5)//May
	      {
	        answer = day + 0;
	      }
	      else if(month == 6)//June
	      {
	        answer = day + 3;
	      }
	      else if(month == 7)//July
	      {
	        answer = day + 5;
	      }
	      else if(month == 8)//August
	      {
	        answer = day + 1;
	      }
	      else if(month == 9)//September
	      {
	        answer = day + 4;
	      }
	      else if(month == 10)//October
	      {
	        answer = day + 6;
	      }
	      else if(month == 11)//November
	      {
	        answer = day + 2;
	      }
	      else if(month == 12)//December
	      {
	        answer = day + 4;
	      } 
	      
	      
	      //Continue adding to answer depending on range of the year
	      if (1900 <= year && year <= 1909);//1900-1909
	      {
	        answer = answer + 1;
	      }
	      if (1910 <= year && year <= 1919);//1910-1919
	      {
	        answer = answer + 6;
	      }
	      if (1920 <= year && year <= 1929);//1920-1929
	      {
	        answer = answer + 5;
	      }
	      if (1930 <= year && year <= 1939);//1930-1939
	      {
	        answer = answer + 3;
	      }
	      if (1940 <= year && year <= 1949);//1940-1949
	      {
	        answer = answer + 2;
	      }
	      if (1950 <= year && year <= 1959);//1950-1959
	      {
	        answer = answer + 0;
	      }
	      if (1960 <= year && year <= 1969);//1960-1969
	      {
	        answer = answer + 6;
	      }
	      if (1970 <= year && year <= 1979);//1970-1979
	      {
	        answer = answer + 4;
	      }
	      if (1980 <= year && year <= 1989);//1980-1989
	      {
	        answer = answer + 3;
	      }
	      if (1990 <= year && year <= 1999);//1990-1999
	      {
	        answer = answer + 1;
	      }
	      if (2000 <= year && year <= 2009);//2000-2009
	      {
	        answer = answer + 0;
	      }
	      if (2010 <= year && year <= 2019);//2010-2019
	      {
	        answer = answer + 5;
	      }
	      
	      //Add last digit of the year to answer
	      answer = answer + year1;
	      
	      //Depending on wether they year is even or odd add a certain thing
	      if (alm % 2 == 0)
	      {
	        if (year1 == 4)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 5)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 6)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 7)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 8)
	        {
	          answer = answer + 2;
	        }
	        else if(year1 == 9)
	        {
	          answer = answer + 2;
	        }
	      }
	      else
	      {
	        if (year1 == 2)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 3)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 4)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 5)
	        {
	          answer = answer + 1;
	        }
	        else if(year1 == 6)
	        {
	          answer = answer + 2;
	        }
	        else if(year1 == 7)
	        {
	          answer = answer + 2;
	        }
	        else if(year1 == 8)
	        {
	          answer = answer + 2;
	        }
	        else if(year1 == 9)
	        {
	          answer = answer + 2;
	        }
	      }
	      
	      answer = answer % 7;
	      System.out.println(answer);
	      if (answer == 1)
	      {
	        JOptionPane.showMessageDialog(null,"You were born on a Monday!");
	      }
	      else if(answer == 2)
	      {
	        JOptionPane.showMessageDialog(null,"You were born on a Tuesday!");
	      }
	      else if(answer == 3)
	      {
	        JOptionPane.showMessageDialog(null,"You were born on a Wednesday!");
	      }
	      else if(answer == 4)
	      {
	        JOptionPane.showMessageDialog(null,"You were born on a Thursday!");
	      }
	      else if(answer == 5)
	      {
	        JOptionPane.showMessageDialog(null,"You were born on a Friday!");
	      }
	      else if(answer == 6)
	      {
	        JOptionPane.showMessageDialog(null,"You were born on a Saturday!");
	      }
	      else if(answer == 0)
	      {
	        JOptionPane.showMessageDialog(null,"You were born on a Sunday!");
	      }
	    }
	    if (reply == JOptionPane.NO_OPTION)
	    {
	      System.exit(0);
	    }
	}
}