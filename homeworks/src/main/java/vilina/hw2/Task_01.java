package vilina.hw2;

// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia”

public class Task_01 {

    public static void main(String[] args) {
        StringBuilder StrBuilder = new StringBuilder("select * from students where ");
        String filter = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";

        String filer2 = filter.replace("\"", "")
                .replace("{", "")
                .replace("}", "")
                .replace(" ", "");

        String[] strArray = filer2.split(",");

        for (String s : strArray) {
            if (!s.contains("null")) {
                StrBuilder.append(s.split(":")[0])
                        .append(" = ").append('\'')
                        .append(s.split(":")[1])
                        .append('\'').append(" and ");
            }
        }
        StrBuilder.replace(StrBuilder.length() - 5, StrBuilder.length(), "");
        System.out.println(StrBuilder);
    }
}
