public class App {
    private String username;
    private String password;

    public App(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        return "admin".equals(username) && "123".equals(password);
    }

}
class Main {
    public static void main(String[] args) {
        App app = new App("admin", "123");
        boolean result = app.login();
        System.out.println("Login Result: " + result);
    }
}