package SingleResponsibility;

/**
 * Этот класс имеет 2 зоны ответственности:
 * 1. Имеет только один экземпляр
 * 2. Работа с пользователями
 */
public class SingletonUserRepository {

    // Имеет только один экземпляр
    private static SingletonUserRepository instance;

    public static SingletonUserRepository getInstance() {
        if (instance == null) {
            instance = new SingletonUserRepository();
        }
        return instance;
    }

    private SingletonUserRepository() {
    }
    //-----------------------------

    // Работа с пользователями
    public String[] getUsers() {
        return new String[] {"user1", "user2", "user3"};
    }

    public void addUser(String user) {
        System.out.println("Adding user: " + user);
    }
    //----------------------------
}
