import config.Database;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("my_database", "root", "", "localhost", "3306");
        database.setup();
//        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
//        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
//        TodoListView todoListView = new TodoListTerminalView(todoListService);
//        todoListView.run();
    }
}