// שם הקובץ צריך להיות: Demo0.java

public class Demo0 { // שם המחלקה תוקן להסרת ה'.java'
    public static void main(String[] args) {
        // Declares an int variable, and sets it to 0
        int i = 0;
        // כל עוד i קטן או שווה ל-5, המשך בלולאה
        while (i <= 5) {
            // הדפס את הערך הנוכחי של i, ואז עבור לשורה חדשה
            System.out.println(i);
            // הגדל את i ב-1, כדי להתקדם לעבר תנאי העצירה
            i++; // או בקיצור: i++;
        }
        System.out.println("Done");
    }
}
    
