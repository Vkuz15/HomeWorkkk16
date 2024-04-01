public class Main {
    public static void main(String[] args) {
        try {
            check("java_student_go", "G154_ft_154R", "G154_ft_154R");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("не верные входные данные: " + exception.getMessage());
        }
    }

    private static void check(String login, String password, String confrmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[a-zA-Z0-9_]{1,20}")) {
            throw new WrongLoginException("Логин не соответствует условиям");
        }
        if (!password.matches("[a-zA-Z0-9_]{1,20}")) {
            throw new WrongPasswordException("Пароль не соответствует условиям");
        }
        if (!confrmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}