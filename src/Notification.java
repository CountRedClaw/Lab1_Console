import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

import java.util.Optional;
import java.util.Scanner;

public class Notification/* implements Runnable*/ {

    /**
     * Консольное приложение - дичь, варианты "отложить" и "завершить" сделать не удалось т.к. в main постоянно работает scanner
     * @param task
     * @param str Доп. инфа
     */
    public static boolean showNotification(Task task, String str) {
        System.out.println(str);
        System.out.println("Событие: " + task.getName() + " " + task.getTime());

        if (str.equals("")) {       // Если вызывается из TaskWrapperа, то str пустой и надо спросить "отложить или нет"
            System.out.println("Отложить на одну минуту?    y - (yes), n - (no)");
            Main.global = false;
            Scanner in = new Scanner(System.in);
            //while (true) {
                String res = in.nextLine();
                if (res.matches(".*y.*")) {
                    return true;
                } else //if (res.matches(".*n")) {
                {return false;
                }
            //}
        }
        return false;
    }
}
