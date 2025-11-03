// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class PrintTo5 {
	public static void main(String[] args) {
		// Declares an int variable, and sets it to 0
        int i = 0;
        // כל עוד i קטן או שווה ל-5, המשך בלולאה
        while (i <= 5) {
            // הדפס את הערך הנוכחי של i, ואז עבור לשורה חדשה
            System.out.println(i);
            
            // הגדל את i ב-1, כדי להתקדם לעבר תנאי העצירה
            i = i + 1; // או בקיצור: i++;
        }
    }
}
