import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class  InputInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, " +
                "номер телефона - цифры, пол - f/m ) : ");
        String input = scanner.nextLine();

        try {
            String[] data = input.split(" ");
            if (data.length != 6){
                throw new IllegalArgumentException("Количество данных не соответствует требуемому");
            }
            String lastName = data[0];
            String firstName = data[1];
            String midlName = data[2];
            Date dateOfBirth = ParseDate.parseDate(data[3]);
            int phoneNumber = Integer.parseInt(data[4]);
            char gender = GenderException.genderException(data[5]);

            System.out.println("Фамилия: " + lastName);
            System.out.println("Имя: " + firstName);
            System.out.println("Отчество: " + midlName);
            System.out.println("Дата рождения: " + FormatDate.formatDate(dateOfBirth));
            System.out.println("Номер телефона: " + phoneNumber);
            System.out.println("пол: " + gender);

            WriterInfo writerInfo = new WriterInfo();
            writerInfo.writeData(data, lastName);

        } catch (NumberFormatException e){
            System.err.println("Ошибка: Неверный формат телефона");
        } catch (IllegalArgumentException e){
            System.err.println("Ошибка: " + e.getMessage());
        } catch (ParseException e){
            System.err.println("Ошибка: Неверный формат даты");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Ошибка: Недостаточно данных");
        } catch (RuntimeException e){
            System.err.println("Ошибка: Пол не соответствует формату f/m ");
        }
    }
}