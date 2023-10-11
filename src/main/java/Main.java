public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 987654";
        post.patronymic = "Иванович";
        post.phone = "+7 (777) 777-77-77";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 5;
        post.birthday.year = 2000;
    }
}