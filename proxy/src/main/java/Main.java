public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");

        Library library = new Library();
        library.createDocument(user1, 1, "not protected", false);
        library.createDocument(user1, 2, "protected user1", true);
        library.createDocument(user2, 3, "protected user2", true);

        System.out.println(library.getDocument(1).getContent(user2));
        System.out.println(library.getDocument(2).getContent(user2));
        System.out.println(library.getDocument(3).getContent(user2));
    }
}
