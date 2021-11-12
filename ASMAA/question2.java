import java.util.Scanneras;
class question2 {
    public static void main(String[] args) {
        System.out.println("word game");
        System.out.println("Fill out the story");
        System.out.print("enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("how old are you");
        int age = input.nextInt();
        System.out.println("what city were you born ");
        String city = input.nextLine();
        System.out.println("which college did you finish");
        String college = input.nextLine();
        System.out.println("what is your profession");
        String profession = input.nextLine();
        System.out.println("what is your favorate animal");
        String animal = input.nextLine();
        System.out.println("there once was a person" + name + "who lived in city" + city + "at the age of" + age + "went to college" + college + "graduated and went to work as" + profession + "adopted animal" + animal + "named" + petname + "they both lived happily ever after");
    }
}
