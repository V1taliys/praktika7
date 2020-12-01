
package serialization_java1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable {

    public static void main(String[] args) {
        Holodilnik[] type = new Holodilnik[2];//массив техники

        texnika Holodilnik = new texnika(300, "Nazvanie Holodilnika", true);
        Holodilnik LG = new Holodilnik(400, "LG", true);
        Holodilnik.settypeOfHolodilnik(LG);
        type[0] = Holodilnik;
        type[1] = LG;


        try {
            // Сброс данных объекта staff в файл (сериализация данных)
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("texnika.dat"));
            out.writeObject(type);
            out.close();

            // Чтение сериализованных данных из файла в объект (десериализация данных)
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("texnika.dat"));
            Holodilnik[] newType = (Holodilnik[]) in.readObject(); // Новый список
            in.close();

            // Вывод на экран массива объектов newStaff
            for (Holodilnik e : newType) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
